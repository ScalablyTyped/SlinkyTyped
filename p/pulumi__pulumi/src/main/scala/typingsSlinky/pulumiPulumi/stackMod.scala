package typingsSlinky.pulumiPulumi

import typingsSlinky.pulumiPulumi.anon.Init
import typingsSlinky.pulumiPulumi.outputMod.Inputs
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.ComponentResource
import typingsSlinky.pulumiPulumi.resourceMod.ResourceTransformation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stackMod {
  
  @JSImport("@pulumi/pulumi/runtime/stack", "getStackResource")
  @js.native
  def getStackResource(): js.UndefOr[Stack] = js.native
  
  @JSImport("@pulumi/pulumi/runtime/stack", "registerStackTransformation")
  @js.native
  def registerStackTransformation(t: ResourceTransformation): Unit = js.native
  
  @JSImport("@pulumi/pulumi/runtime/stack", "rootPulumiStackTypeName")
  @js.native
  val rootPulumiStackTypeName: /* "pulumi:pulumi:Stack" */ String = js.native
  
  @JSImport("@pulumi/pulumi/runtime/stack", "runInPulumiStack")
  @js.native
  def runInPulumiStack(init: js.Function0[js.Promise[_]]): js.Promise[js.UndefOr[Inputs]] = js.native
  
  /**
    * Stack is the root resource for a Pulumi stack. Before invoking the `init` callback, it registers itself as the root
    * resource with the Pulumi engine.
    */
  @js.native
  trait Stack extends ComponentResource[Inputs] {
    
    /**
      * runInit invokes the given init callback with this resource set as the root resource. The return value of init is
      * used as the stack's output properties.
      *
      * @param init The callback to run in the context of this Pulumi stack
      */
    def initialize(args: Init): js.Promise[Inputs] = js.native
    
    /**
      * The outputs of this stack, if the `init` callback exited normally.
      */
    val outputs: Output_[Inputs] = js.native
  }
}
