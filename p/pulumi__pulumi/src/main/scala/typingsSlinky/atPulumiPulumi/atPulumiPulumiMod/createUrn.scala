package typingsSlinky.atPulumiPulumi.atPulumiPulumiMod

import typingsSlinky.atPulumiPulumi.outputMod.Input
import typingsSlinky.atPulumiPulumi.resourceMod.URN
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi", "createUrn")
@js.native
object createUrn extends js.Object {
  def apply(name: Input[String], `type`: Input[String]): typingsSlinky.atPulumiPulumi.outputMod.Output[String] = js.native
  def apply(name: Input[String], `type`: Input[String], parent: Input[URN]): typingsSlinky.atPulumiPulumi.outputMod.Output[String] = js.native
  def apply(name: Input[String], `type`: Input[String], parent: Input[URN], project: String): typingsSlinky.atPulumiPulumi.outputMod.Output[String] = js.native
  def apply(name: Input[String], `type`: Input[String], parent: Input[URN], project: String, stack: String): typingsSlinky.atPulumiPulumi.outputMod.Output[String] = js.native
  def apply(
    name: Input[String],
    `type`: Input[String],
    parent: typingsSlinky.atPulumiPulumi.resourceMod.Resource
  ): typingsSlinky.atPulumiPulumi.outputMod.Output[String] = js.native
  def apply(
    name: Input[String],
    `type`: Input[String],
    parent: typingsSlinky.atPulumiPulumi.resourceMod.Resource,
    project: String
  ): typingsSlinky.atPulumiPulumi.outputMod.Output[String] = js.native
  def apply(
    name: Input[String],
    `type`: Input[String],
    parent: typingsSlinky.atPulumiPulumi.resourceMod.Resource,
    project: String,
    stack: String
  ): typingsSlinky.atPulumiPulumi.outputMod.Output[String] = js.native
}

