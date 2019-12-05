package typingsSlinky.atPulumiPulumi.atPulumiPulumiMod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.atPulumiPulumi.outputMod.Input
import typingsSlinky.atPulumiPulumi.outputMod.OutputConstructor
import typingsSlinky.atPulumiPulumi.outputMod.Unwrap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi", "Output")
@js.native
object Output extends TopLevel[OutputConstructor]

@JSImport("@pulumi/pulumi", "output")
@js.native
object output extends js.Object {
  def apply[T](): typingsSlinky.atPulumiPulumi.outputMod.Output[Unwrap[js.UndefOr[T]]] = js.native
  def apply[T](`val`: Input[T]): typingsSlinky.atPulumiPulumi.outputMod.Output[Unwrap[T]] = js.native
}

