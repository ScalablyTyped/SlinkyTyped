package typingsSlinky.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlatformDescription extends js.Object {
  /**
    * The custom AMIs supported by the platform.
    */
  var CustomAmiList: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.CustomAmiList] = js.native
  /**
    * The date when the platform was created.
    */
  var DateCreated: js.UndefOr[js.Date] = js.native
  /**
    * The date when the platform was last updated.
    */
  var DateUpdated: js.UndefOr[js.Date] = js.native
  /**
    * The description of the platform.
    */
  var Description: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.Description] = js.native
  /**
    * The frameworks supported by the platform.
    */
  var Frameworks: js.UndefOr[PlatformFrameworks] = js.native
  /**
    * Information about the maintainer of the platform.
    */
  var Maintainer: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.Maintainer] = js.native
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
    * The category of the platform.
    */
  var PlatformCategory: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.PlatformCategory] = js.native
  /**
    * The name of the platform.
    */
  var PlatformName: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.PlatformName] = js.native
  /**
    * The AWS account ID of the person who created the platform.
    */
  var PlatformOwner: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.PlatformOwner] = js.native
  /**
    * The status of the platform.
    */
  var PlatformStatus: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.PlatformStatus] = js.native
  /**
    * The version of the platform.
    */
  var PlatformVersion: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.PlatformVersion] = js.native
  /**
    * The programming languages supported by the platform.
    */
  var ProgrammingLanguages: js.UndefOr[PlatformProgrammingLanguages] = js.native
  /**
    * The name of the solution stack used by the platform.
    */
  var SolutionStackName: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.SolutionStackName] = js.native
  /**
    * The additions supported by the platform.
    */
  var SupportedAddonList: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.SupportedAddonList] = js.native
  /**
    * The tiers supported by the platform.
    */
  var SupportedTierList: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.SupportedTierList] = js.native
}

object PlatformDescription {
  @scala.inline
  def apply(): PlatformDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlatformDescription]
  }
  @scala.inline
  implicit class PlatformDescriptionOps[Self <: PlatformDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomAmiList(value: CustomAmiList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomAmiList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomAmiList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomAmiList")(js.undefined)
        ret
    }
    @scala.inline
    def withDateCreated(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DateCreated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateCreated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DateCreated")(js.undefined)
        ret
    }
    @scala.inline
    def withDateUpdated(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DateUpdated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateUpdated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DateUpdated")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: Description): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withFrameworks(value: PlatformFrameworks): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Frameworks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrameworks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Frameworks")(js.undefined)
        ret
    }
    @scala.inline
    def withMaintainer(value: Maintainer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Maintainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaintainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Maintainer")(js.undefined)
        ret
    }
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
    def withPlatformName(value: PlatformName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlatformName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatformName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlatformName")(js.undefined)
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
    def withPlatformVersion(value: PlatformVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlatformVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatformVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlatformVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withProgrammingLanguages(value: PlatformProgrammingLanguages): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProgrammingLanguages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgrammingLanguages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProgrammingLanguages")(js.undefined)
        ret
    }
    @scala.inline
    def withSolutionStackName(value: SolutionStackName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SolutionStackName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSolutionStackName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SolutionStackName")(js.undefined)
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

