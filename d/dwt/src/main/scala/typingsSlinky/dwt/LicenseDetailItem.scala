package typingsSlinky.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Details for each license
  */
@js.native
trait LicenseDetailItem extends js.Object {
  val Browser: String = js.native
  val EnumLicenseType: String = js.native
  val ExpireDate: String = js.native
  val LicenseType: String = js.native
  val OS: String = js.native
  val Trial: String = js.native
  val Version: String = js.native
}

object LicenseDetailItem {
  @scala.inline
  def apply(
    Browser: String,
    EnumLicenseType: String,
    ExpireDate: String,
    LicenseType: String,
    OS: String,
    Trial: String,
    Version: String
  ): LicenseDetailItem = {
    val __obj = js.Dynamic.literal(Browser = Browser.asInstanceOf[js.Any], EnumLicenseType = EnumLicenseType.asInstanceOf[js.Any], ExpireDate = ExpireDate.asInstanceOf[js.Any], LicenseType = LicenseType.asInstanceOf[js.Any], OS = OS.asInstanceOf[js.Any], Trial = Trial.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[LicenseDetailItem]
  }
  @scala.inline
  implicit class LicenseDetailItemOps[Self <: LicenseDetailItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBrowser(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Browser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnumLicenseType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnumLicenseType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpireDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpireDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLicenseType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LicenseType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOS(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrial(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Trial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

