package typingsSlinky.pulumiPulumi.mod

import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Unwrap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/pulumi", "output")
@js.native
object output extends js.Object {
  
  def apply[T](): typingsSlinky.pulumiPulumi.outputMod.Output_[Unwrap[js.UndefOr[T]]] = js.native
  def apply[T](`val`: Input[T]): typingsSlinky.pulumiPulumi.outputMod.Output_[Unwrap[T]] = js.native
}
