package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowsInformationProtectionDesktopApp extends WindowsInformationProtectionApp {
  // The binary name.
  var binaryName: js.UndefOr[String] = js.native
  // The high binary version.
  var binaryVersionHigh: js.UndefOr[String] = js.native
  // The lower binary version.
  var binaryVersionLow: js.UndefOr[String] = js.native
}

object WindowsInformationProtectionDesktopApp {
  @scala.inline
  def apply(): WindowsInformationProtectionDesktopApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsInformationProtectionDesktopApp]
  }
  @scala.inline
  implicit class WindowsInformationProtectionDesktopAppOps[Self <: WindowsInformationProtectionDesktopApp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBinaryName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binaryName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBinaryName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binaryName")(js.undefined)
        ret
    }
    @scala.inline
    def withBinaryVersionHigh(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binaryVersionHigh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBinaryVersionHigh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binaryVersionHigh")(js.undefined)
        ret
    }
    @scala.inline
    def withBinaryVersionLow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binaryVersionLow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBinaryVersionLow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binaryVersionLow")(js.undefined)
        ret
    }
  }
  
}

