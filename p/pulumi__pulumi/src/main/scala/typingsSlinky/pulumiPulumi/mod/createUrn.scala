package typingsSlinky.pulumiPulumi.mod

import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.URN
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/pulumi", "createUrn")
@js.native
object createUrn extends js.Object {
  
  def apply(name: Input[String], `type`: Input[String]): typingsSlinky.pulumiPulumi.outputMod.Output_[String] = js.native
  def apply(
    name: Input[String],
    `type`: Input[String],
    parent: js.UndefOr[Input[URN]],
    project: js.UndefOr[scala.Nothing],
    stack: String
  ): typingsSlinky.pulumiPulumi.outputMod.Output_[String] = js.native
  def apply(name: Input[String], `type`: Input[String], parent: js.UndefOr[Input[URN]], project: String): typingsSlinky.pulumiPulumi.outputMod.Output_[String] = js.native
  def apply(
    name: Input[String],
    `type`: Input[String],
    parent: js.UndefOr[Input[URN]],
    project: String,
    stack: String
  ): typingsSlinky.pulumiPulumi.outputMod.Output_[String] = js.native
  def apply(name: Input[String], `type`: Input[String], parent: Input[URN]): typingsSlinky.pulumiPulumi.outputMod.Output_[String] = js.native
  def apply(
    name: Input[String],
    `type`: Input[String],
    parent: typingsSlinky.pulumiPulumi.resourceMod.Resource
  ): typingsSlinky.pulumiPulumi.outputMod.Output_[String] = js.native
  def apply(
    name: Input[String],
    `type`: Input[String],
    parent: typingsSlinky.pulumiPulumi.resourceMod.Resource,
    project: js.UndefOr[scala.Nothing],
    stack: String
  ): typingsSlinky.pulumiPulumi.outputMod.Output_[String] = js.native
  def apply(
    name: Input[String],
    `type`: Input[String],
    parent: typingsSlinky.pulumiPulumi.resourceMod.Resource,
    project: String
  ): typingsSlinky.pulumiPulumi.outputMod.Output_[String] = js.native
  def apply(
    name: Input[String],
    `type`: Input[String],
    parent: typingsSlinky.pulumiPulumi.resourceMod.Resource,
    project: String,
    stack: String
  ): typingsSlinky.pulumiPulumi.outputMod.Output_[String] = js.native
}
