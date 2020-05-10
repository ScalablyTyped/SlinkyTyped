package typingsSlinky.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Technology Targeting.
  */
@js.native
trait SchemaTechnologyTargeting extends js.Object {
  /**
    * Browsers that this ad targets. For each browser either set
    * browserVersionId or dartId along with the version numbers. If both are
    * specified, only browserVersionId will be used. The other fields are
    * populated automatically when the ad is inserted or updated.
    */
  var browsers: js.UndefOr[js.Array[SchemaBrowser]] = js.native
  /**
    * Connection types that this ad targets. For each connection type only id
    * is required. The other fields are populated automatically when the ad is
    * inserted or updated.
    */
  var connectionTypes: js.UndefOr[js.Array[SchemaConnectionType]] = js.native
  /**
    * Mobile carriers that this ad targets. For each mobile carrier only id is
    * required, and the other fields are populated automatically when the ad is
    * inserted or updated. If targeting a mobile carrier, do not set targeting
    * for any zip codes.
    */
  var mobileCarriers: js.UndefOr[js.Array[SchemaMobileCarrier]] = js.native
  /**
    * Operating system versions that this ad targets. To target all versions,
    * use operatingSystems. For each operating system version, only id is
    * required. The other fields are populated automatically when the ad is
    * inserted or updated. If targeting an operating system version, do not set
    * targeting for the corresponding operating system in operatingSystems.
    */
  var operatingSystemVersions: js.UndefOr[js.Array[SchemaOperatingSystemVersion]] = js.native
  /**
    * Operating systems that this ad targets. To target specific versions, use
    * operatingSystemVersions. For each operating system only dartId is
    * required. The other fields are populated automatically when the ad is
    * inserted or updated. If targeting an operating system, do not set
    * targeting for operating system versions for the same operating system.
    */
  var operatingSystems: js.UndefOr[js.Array[SchemaOperatingSystem]] = js.native
  /**
    * Platform types that this ad targets. For example, desktop, mobile, or
    * tablet. For each platform type, only id is required, and the other fields
    * are populated automatically when the ad is inserted or updated.
    */
  var platformTypes: js.UndefOr[js.Array[SchemaPlatformType]] = js.native
}

object SchemaTechnologyTargeting {
  @scala.inline
  def apply(): SchemaTechnologyTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTechnologyTargeting]
  }
  @scala.inline
  implicit class SchemaTechnologyTargetingOps[Self <: SchemaTechnologyTargeting] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBrowsers(value: js.Array[SchemaBrowser]): Self = {
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
    def withConnectionTypes(value: js.Array[SchemaConnectionType]): Self = {
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
    def withMobileCarriers(value: js.Array[SchemaMobileCarrier]): Self = {
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
    def withOperatingSystemVersions(value: js.Array[SchemaOperatingSystemVersion]): Self = {
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
    def withOperatingSystems(value: js.Array[SchemaOperatingSystem]): Self = {
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
    def withPlatformTypes(value: js.Array[SchemaPlatformType]): Self = {
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

