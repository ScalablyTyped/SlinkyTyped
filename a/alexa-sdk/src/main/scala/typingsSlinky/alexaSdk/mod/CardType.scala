package typingsSlinky.alexaSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.alexaSdk.alexaSdkStrings.Standard
  - typingsSlinky.alexaSdk.alexaSdkStrings.Simple
  - typingsSlinky.alexaSdk.alexaSdkStrings.LinkAccount
  - typingsSlinky.alexaSdk.alexaSdkStrings.AskForPermissionsConsent
*/
trait CardType extends js.Object

object CardType {
  @scala.inline
  def AskForPermissionsConsent: typingsSlinky.alexaSdk.alexaSdkStrings.AskForPermissionsConsent = this.cast("AskForPermissionsConsent")
  @scala.inline
  def LinkAccount: typingsSlinky.alexaSdk.alexaSdkStrings.LinkAccount = this.cast("LinkAccount")
  @scala.inline
  def Simple: typingsSlinky.alexaSdk.alexaSdkStrings.Simple = this.cast("Simple")
  @scala.inline
  def Standard: typingsSlinky.alexaSdk.alexaSdkStrings.Standard = this.cast("Standard")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

