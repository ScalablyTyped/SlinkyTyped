package typingsSlinky.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeveloperInfo extends js.Object {
  /**
    * The name of the developer.
    */
  var DeveloperName: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.DeveloperName] = js.native
  /**
    * The email of the developer.
    */
  var Email: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.Email] = js.native
  /**
    * The URL of the privacy policy.
    */
  var PrivacyPolicy: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.PrivacyPolicy] = js.native
  /**
    * The website of the developer.
    */
  var Url: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.Url] = js.native
}

object DeveloperInfo {
  @scala.inline
  def apply(): DeveloperInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeveloperInfo]
  }
  @scala.inline
  implicit class DeveloperInfoOps[Self <: DeveloperInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeveloperName(value: DeveloperName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeveloperName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeveloperName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeveloperName")(js.undefined)
        ret
    }
    @scala.inline
    def withEmail(value: Email): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Email")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivacyPolicy(value: PrivacyPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrivacyPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivacyPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrivacyPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: Url): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Url")(js.undefined)
        ret
    }
  }
  
}

