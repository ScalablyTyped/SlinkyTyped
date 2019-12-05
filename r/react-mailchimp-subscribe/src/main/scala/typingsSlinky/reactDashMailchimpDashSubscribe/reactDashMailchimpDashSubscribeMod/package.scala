package typingsSlinky.reactDashMailchimpDashSubscribe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashMailchimpDashSubscribeMod {
  import slinky.core.ReactComponentClass

  type DefaultFormFields = EmailFormFields
  type FormHooks[FormFields] = SubscribeArg[FormFields] with (ResponseArgs | PendingArgs)
  type MailchimpSubscribe[FormFields] = ReactComponentClass[Props[FormFields]]
}
