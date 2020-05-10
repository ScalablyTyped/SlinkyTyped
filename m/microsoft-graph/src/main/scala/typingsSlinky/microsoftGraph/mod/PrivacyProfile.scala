package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrivacyProfile extends js.Object {
  // A valid smtp email address for the privacy statement contact. Not required.
  var contactEmail: js.UndefOr[String] = js.native
  /**
    * A valid URL format that begins with http:// or https://. Maximum length is 255 characters. The URL that directs to the
    * company's privacy statement. Not required.
    */
  var statementUrl: js.UndefOr[String] = js.native
}

object PrivacyProfile {
  @scala.inline
  def apply(): PrivacyProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrivacyProfile]
  }
  @scala.inline
  implicit class PrivacyProfileOps[Self <: PrivacyProfile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContactEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contactEmail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContactEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contactEmail")(js.undefined)
        ret
    }
    @scala.inline
    def withStatementUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statementUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatementUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statementUrl")(js.undefined)
        ret
    }
  }
  
}

