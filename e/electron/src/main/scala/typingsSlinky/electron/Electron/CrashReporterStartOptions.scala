package typingsSlinky.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CrashReporterStartOptions extends js.Object {
  var companyName: String = js.native
  /**
    * Directory to store the crashreports temporarily (only used when the crash
    * reporter is started via process.crashReporter.start).
    */
  var crashesDirectory: js.UndefOr[String] = js.native
  /**
    * An object you can define that will be sent along with the report. Only string
    * properties are sent correctly. Nested objects are not supported and the property
    * names and values must be less than 64 characters long.
    */
  var extra: js.UndefOr[Extra] = js.native
  /**
    * Default is false.
    */
  var ignoreSystemCrashHandler: js.UndefOr[Boolean] = js.native
  /**
    * Defaults to app.getName().
    */
  var productName: js.UndefOr[String] = js.native
  /**
    * URL that crash reports will be sent to as POST.
    */
  var submitURL: String = js.native
  /**
    * Whether crash reports should be sent to the server Default is true.
    */
  var uploadToServer: js.UndefOr[Boolean] = js.native
}

object CrashReporterStartOptions {
  @scala.inline
  def apply(companyName: String, submitURL: String): CrashReporterStartOptions = {
    val __obj = js.Dynamic.literal(companyName = companyName.asInstanceOf[js.Any], submitURL = submitURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrashReporterStartOptions]
  }
  @scala.inline
  implicit class CrashReporterStartOptionsOps[Self <: CrashReporterStartOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompanyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("companyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubmitURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submitURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCrashesDirectory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crashesDirectory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrashesDirectory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crashesDirectory")(js.undefined)
        ret
    }
    @scala.inline
    def withExtra(value: Extra): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extra")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtra: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extra")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreSystemCrashHandler(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreSystemCrashHandler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreSystemCrashHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreSystemCrashHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withProductName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productName")(js.undefined)
        ret
    }
    @scala.inline
    def withUploadToServer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadToServer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUploadToServer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadToServer")(js.undefined)
        ret
    }
  }
  
}

