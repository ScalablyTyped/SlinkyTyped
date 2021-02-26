package typingsSlinky.pulumiPulumi

import typingsSlinky.pulumiPulumi.outputMod.Inputs
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.queryableMod.ResolvedResource
import typingsSlinky.pulumiPulumi.resourceMod.Resource
import typingsSlinky.pulumiPulumi.resourceMod.ResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.URN
import typingsSlinky.pulumiQuery.interfacesMod.AsyncQueryable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object runtimeResourceMod {
  
  @JSImport("@pulumi/pulumi/runtime/resource", "listResourceOutputs")
  @js.native
  def listResourceOutputs[U /* <: Resource */](): AsyncQueryable[ResolvedResource[U]] = js.native
  @JSImport("@pulumi/pulumi/runtime/resource", "listResourceOutputs")
  @js.native
  def listResourceOutputs[U /* <: Resource */](typeFilter: js.UndefOr[scala.Nothing], stackName: String): AsyncQueryable[ResolvedResource[U]] = js.native
  @JSImport("@pulumi/pulumi/runtime/resource", "listResourceOutputs")
  @js.native
  def listResourceOutputs[U /* <: Resource */](typeFilter: js.Function1[/* o */ js.Any, /* is U */ Boolean]): AsyncQueryable[ResolvedResource[U]] = js.native
  @JSImport("@pulumi/pulumi/runtime/resource", "listResourceOutputs")
  @js.native
  def listResourceOutputs[U /* <: Resource */](typeFilter: js.Function1[/* o */ js.Any, /* is U */ Boolean], stackName: String): AsyncQueryable[ResolvedResource[U]] = js.native
  
  @JSImport("@pulumi/pulumi/runtime/resource", "readResource")
  @js.native
  def readResource(res: Resource, t: String, name: String, props: Inputs, opts: ResourceOptions): Unit = js.native
  
  @JSImport("@pulumi/pulumi/runtime/resource", "registerResource")
  @js.native
  def registerResource(
    res: Resource,
    t: String,
    name: String,
    custom: Boolean,
    remote: Boolean,
    newDependency: js.Function1[/* urn */ URN, Resource],
    props: Inputs,
    opts: ResourceOptions
  ): Unit = js.native
  
  @JSImport("@pulumi/pulumi/runtime/resource", "registerResourceOutputs")
  @js.native
  def registerResourceOutputs(res: Resource, outputs: js.Promise[Inputs]): Unit = js.native
  @JSImport("@pulumi/pulumi/runtime/resource", "registerResourceOutputs")
  @js.native
  def registerResourceOutputs(res: Resource, outputs: Inputs): Unit = js.native
  @JSImport("@pulumi/pulumi/runtime/resource", "registerResourceOutputs")
  @js.native
  def registerResourceOutputs(res: Resource, outputs: Output_[Inputs]): Unit = js.native
}
