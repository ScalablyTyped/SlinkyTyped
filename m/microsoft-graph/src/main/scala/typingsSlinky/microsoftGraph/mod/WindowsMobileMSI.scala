package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowsMobileMSI extends MobileLobApp {
  // The command line.
  var commandLine: js.UndefOr[String] = js.native
  /**
    * A boolean to control whether the app's version will be used to detect the app after it is installed on a device. Set
    * this to true for Windows Mobile MSI Line of Business (LoB) apps that use a self update feature.
    */
  var ignoreVersionDetection: js.UndefOr[Boolean] = js.native
  // The product code.
  var productCode: js.UndefOr[String] = js.native
  // The product version of Windows Mobile MSI Line of Business (LoB) app.
  var productVersion: js.UndefOr[String] = js.native
}

object WindowsMobileMSI {
  @scala.inline
  def apply(): WindowsMobileMSI = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsMobileMSI]
  }
  @scala.inline
  implicit class WindowsMobileMSIOps[Self <: WindowsMobileMSI] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommandLine(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commandLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommandLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commandLine")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreVersionDetection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreVersionDetection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreVersionDetection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreVersionDetection")(js.undefined)
        ret
    }
    @scala.inline
    def withProductCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productCode")(js.undefined)
        ret
    }
    @scala.inline
    def withProductVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productVersion")(js.undefined)
        ret
    }
  }
  
}

