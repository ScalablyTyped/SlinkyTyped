package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsersAddEmailsParams extends js.Object {
  /**
    * Adds one or more email addresses to your GitHub account. Must contain at least one email address. **Note:** Alternatively, you can pass a single email address or an `array` of emails addresses directly, but we recommend that you pass an object using the `emails` key.
    */
  var emails: js.Array[String] = js.native
}

object UsersAddEmailsParams {
  @scala.inline
  def apply(emails: js.Array[String]): UsersAddEmailsParams = {
    val __obj = js.Dynamic.literal(emails = emails.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsersAddEmailsParams]
  }
  @scala.inline
  implicit class UsersAddEmailsParamsOps[Self <: UsersAddEmailsParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmails(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emails")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

