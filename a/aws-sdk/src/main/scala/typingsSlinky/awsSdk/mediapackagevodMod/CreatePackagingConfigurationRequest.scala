package typingsSlinky.awsSdk.mediapackagevodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePackagingConfigurationRequest extends js.Object {
  var CmafPackage: js.UndefOr[typingsSlinky.awsSdk.mediapackagevodMod.CmafPackage] = js.native
  var DashPackage: js.UndefOr[typingsSlinky.awsSdk.mediapackagevodMod.DashPackage] = js.native
  var HlsPackage: js.UndefOr[typingsSlinky.awsSdk.mediapackagevodMod.HlsPackage] = js.native
  /**
    * The ID of the PackagingConfiguration.
    */
  var Id: string = js.native
  var MssPackage: js.UndefOr[typingsSlinky.awsSdk.mediapackagevodMod.MssPackage] = js.native
  /**
    * The ID of a PackagingGroup.
    */
  var PackagingGroupId: string = js.native
}

object CreatePackagingConfigurationRequest {
  @scala.inline
  def apply(Id: string, PackagingGroupId: string): CreatePackagingConfigurationRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], PackagingGroupId = PackagingGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePackagingConfigurationRequest]
  }
  @scala.inline
  implicit class CreatePackagingConfigurationRequestOps[Self <: CreatePackagingConfigurationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPackagingGroupId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PackagingGroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCmafPackage(value: CmafPackage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CmafPackage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCmafPackage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CmafPackage")(js.undefined)
        ret
    }
    @scala.inline
    def withDashPackage(value: DashPackage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DashPackage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDashPackage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DashPackage")(js.undefined)
        ret
    }
    @scala.inline
    def withHlsPackage(value: HlsPackage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HlsPackage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHlsPackage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HlsPackage")(js.undefined)
        ret
    }
    @scala.inline
    def withMssPackage(value: MssPackage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MssPackage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMssPackage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MssPackage")(js.undefined)
        ret
    }
  }
  
}

