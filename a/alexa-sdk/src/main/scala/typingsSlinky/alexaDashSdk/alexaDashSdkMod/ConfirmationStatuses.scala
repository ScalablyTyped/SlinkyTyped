package typingsSlinky.alexaDashSdk.alexaDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.alexaDashSdk.alexaDashSdkStrings.NONE
  - typings.alexaDashSdk.alexaDashSdkStrings.DENIED
  - typings.alexaDashSdk.alexaDashSdkStrings.CONFIRMED
*/
trait ConfirmationStatuses extends js.Object

object ConfirmationStatuses {
  @scala.inline
  def CONFIRMED: typingsSlinky.alexaDashSdk.alexaDashSdkStrings.CONFIRMED = this.cast("CONFIRMED")
  @scala.inline
  def DENIED: typingsSlinky.alexaDashSdk.alexaDashSdkStrings.DENIED = this.cast("DENIED")
  @scala.inline
  def NONE: typingsSlinky.alexaDashSdk.alexaDashSdkStrings.NONE = this.cast("NONE")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

