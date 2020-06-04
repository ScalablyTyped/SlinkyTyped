package typingsSlinky.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CrashReporterStartOptions extends js.Object {
  var companyName: String
  /**
    * Directory to store the crashreports temporarily (only used when the crash
    * reporter is started via process.crashReporter.start).
    */
  var crashesDirectory: js.UndefOr[String] = js.undefined
  /**
    * An object you can define that will be sent along with the report. Only string
    * properties are sent correctly. Nested objects are not supported and the property
    * names and values must be less than 64 characters long.
    */
  var extra: js.UndefOr[Extra] = js.undefined
  /**
    * Default is false.
    */
  var ignoreSystemCrashHandler: js.UndefOr[Boolean] = js.undefined
  /**
    * Defaults to app.getName().
    */
  var productName: js.UndefOr[String] = js.undefined
  /**
    * URL that crash reports will be sent to as POST.
    */
  var submitURL: String
  /**
    * Whether crash reports should be sent to the server Default is true.
    */
  var uploadToServer: js.UndefOr[Boolean] = js.undefined
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCompanyName(value: String): Self = this.set("companyName", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubmitURL(value: String): Self = this.set("submitURL", value.asInstanceOf[js.Any])
    @scala.inline
    def setCrashesDirectory(value: String): Self = this.set("crashesDirectory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCrashesDirectory: Self = this.set("crashesDirectory", js.undefined)
    @scala.inline
    def setExtra(value: Extra): Self = this.set("extra", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtra: Self = this.set("extra", js.undefined)
    @scala.inline
    def setIgnoreSystemCrashHandler(value: Boolean): Self = this.set("ignoreSystemCrashHandler", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreSystemCrashHandler: Self = this.set("ignoreSystemCrashHandler", js.undefined)
    @scala.inline
    def setProductName(value: String): Self = this.set("productName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductName: Self = this.set("productName", js.undefined)
    @scala.inline
    def setUploadToServer(value: Boolean): Self = this.set("uploadToServer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUploadToServer: Self = this.set("uploadToServer", js.undefined)
  }
  
}

