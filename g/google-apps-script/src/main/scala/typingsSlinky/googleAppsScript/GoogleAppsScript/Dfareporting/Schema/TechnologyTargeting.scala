package typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TechnologyTargeting extends js.Object {
  var browsers: js.UndefOr[js.Array[Browser]] = js.native
  var connectionTypes: js.UndefOr[js.Array[ConnectionType]] = js.native
  var mobileCarriers: js.UndefOr[js.Array[MobileCarrier]] = js.native
  var operatingSystemVersions: js.UndefOr[js.Array[OperatingSystemVersion]] = js.native
  var operatingSystems: js.UndefOr[js.Array[OperatingSystem]] = js.native
  var platformTypes: js.UndefOr[js.Array[PlatformType]] = js.native
}

object TechnologyTargeting {
  @scala.inline
  def apply(): TechnologyTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TechnologyTargeting]
  }
  @scala.inline
  implicit class TechnologyTargetingOps[Self <: TechnologyTargeting] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBrowsers(value: js.Array[Browser]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browsers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrowsers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browsers")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectionTypes(value: js.Array[ConnectionType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withMobileCarriers(value: js.Array[MobileCarrier]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobileCarriers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMobileCarriers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobileCarriers")(js.undefined)
        ret
    }
    @scala.inline
    def withOperatingSystemVersions(value: js.Array[OperatingSystemVersion]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operatingSystemVersions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperatingSystemVersions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operatingSystemVersions")(js.undefined)
        ret
    }
    @scala.inline
    def withOperatingSystems(value: js.Array[OperatingSystem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operatingSystems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperatingSystems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operatingSystems")(js.undefined)
        ret
    }
    @scala.inline
    def withPlatformTypes(value: js.Array[PlatformType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platformTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatformTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platformTypes")(js.undefined)
        ret
    }
  }
  
}

