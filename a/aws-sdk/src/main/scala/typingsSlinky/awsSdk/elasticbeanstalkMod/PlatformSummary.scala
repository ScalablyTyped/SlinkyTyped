package typingsSlinky.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlatformSummary extends js.Object {
  /**
    * The operating system used by the platform.
    */
  var OperatingSystemName: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.OperatingSystemName] = js.native
  /**
    * The version of the operating system used by the platform.
    */
  var OperatingSystemVersion: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.OperatingSystemVersion] = js.native
  /**
    * The ARN of the platform.
    */
  var PlatformArn: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.PlatformArn] = js.native
  /**
    * The category of platform.
    */
  var PlatformCategory: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.PlatformCategory] = js.native
  /**
    * The AWS account ID of the person who created the platform.
    */
  var PlatformOwner: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.PlatformOwner] = js.native
  /**
    * The status of the platform. You can create an environment from the platform once it is ready.
    */
  var PlatformStatus: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.PlatformStatus] = js.native
  /**
    * The additions associated with the platform.
    */
  var SupportedAddonList: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.SupportedAddonList] = js.native
  /**
    * The tiers in which the platform runs.
    */
  var SupportedTierList: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.SupportedTierList] = js.native
}

object PlatformSummary {
  @scala.inline
  def apply(): PlatformSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlatformSummary]
  }
  @scala.inline
  implicit class PlatformSummaryOps[Self <: PlatformSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOperatingSystemName(value: OperatingSystemName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OperatingSystemName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperatingSystemName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OperatingSystemName")(js.undefined)
        ret
    }
    @scala.inline
    def withOperatingSystemVersion(value: OperatingSystemVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OperatingSystemVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperatingSystemVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OperatingSystemVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withPlatformArn(value: PlatformArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlatformArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatformArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlatformArn")(js.undefined)
        ret
    }
    @scala.inline
    def withPlatformCategory(value: PlatformCategory): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlatformCategory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatformCategory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlatformCategory")(js.undefined)
        ret
    }
    @scala.inline
    def withPlatformOwner(value: PlatformOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlatformOwner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatformOwner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlatformOwner")(js.undefined)
        ret
    }
    @scala.inline
    def withPlatformStatus(value: PlatformStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlatformStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatformStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlatformStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportedAddonList(value: SupportedAddonList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportedAddonList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportedAddonList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportedAddonList")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportedTierList(value: SupportedTierList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportedTierList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportedTierList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportedTierList")(js.undefined)
        ret
    }
  }
  
}

