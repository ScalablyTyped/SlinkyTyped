package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Windows10SecureAssessmentConfiguration extends DeviceConfiguration {
  // Indicates whether or not to allow the app from printing during the test.
  var allowPrinting: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to allow screen capture capability during a test.
  var allowScreenCapture: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to allow text suggestions during the test.
  var allowTextSuggestion: js.UndefOr[Boolean] = js.native
  /**
    * The account used to configure the Windows device for taking the test. The user can be a domain account (domain/user),
    * an AAD account (username@tenant.com) or a local account (username).
    */
  var configurationAccount: js.UndefOr[String] = js.native
  /**
    * Url link to an assessment that's automatically loaded when the secure assessment browser is launched. It has to be a
    * valid Url (http[s]://msdn.microsoft.com/).
    */
  var launchUri: js.UndefOr[String] = js.native
}

object Windows10SecureAssessmentConfiguration {
  @scala.inline
  def apply(): Windows10SecureAssessmentConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Windows10SecureAssessmentConfiguration]
  }
  @scala.inline
  implicit class Windows10SecureAssessmentConfigurationOps[Self <: Windows10SecureAssessmentConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowPrinting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowPrinting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowPrinting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowPrinting")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowScreenCapture(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowScreenCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowScreenCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowScreenCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowTextSuggestion(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowTextSuggestion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowTextSuggestion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowTextSuggestion")(js.undefined)
        ret
    }
    @scala.inline
    def withConfigurationAccount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configurationAccount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigurationAccount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configurationAccount")(js.undefined)
        ret
    }
    @scala.inline
    def withLaunchUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launchUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLaunchUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launchUri")(js.undefined)
        ret
    }
  }
  
}

