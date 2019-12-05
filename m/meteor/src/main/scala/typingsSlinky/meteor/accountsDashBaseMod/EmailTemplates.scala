package typingsSlinky.meteor.accountsDashBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmailTemplates extends js.Object {
  var enrollAccount: typingsSlinky.meteor.accountsDashBaseMod.EmailFields
  var from: String
  var headers: js.UndefOr[typingsSlinky.meteor.accountsDashBaseMod.Header] = js.undefined
  var resetPassword: typingsSlinky.meteor.accountsDashBaseMod.EmailFields
  var siteName: String
  var verifyEmail: typingsSlinky.meteor.accountsDashBaseMod.EmailFields
}

object EmailTemplates {
  @scala.inline
  def apply(
    enrollAccount: typingsSlinky.meteor.accountsDashBaseMod.EmailFields,
    from: String,
    resetPassword: typingsSlinky.meteor.accountsDashBaseMod.EmailFields,
    siteName: String,
    verifyEmail: typingsSlinky.meteor.accountsDashBaseMod.EmailFields,
    headers: typingsSlinky.meteor.accountsDashBaseMod.Header = null
  ): EmailTemplates = {
    val __obj = js.Dynamic.literal(enrollAccount = enrollAccount.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], resetPassword = resetPassword.asInstanceOf[js.Any], siteName = siteName.asInstanceOf[js.Any], verifyEmail = verifyEmail.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailTemplates]
  }
}

