package typingsSlinky.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AmiDistributionConfiguration extends js.Object {
  /**
    *  The tags to apply to AMIs distributed to this Region. 
    */
  var amiTags: js.UndefOr[TagMap] = js.native
  /**
    *  The description of the distribution configuration. 
    */
  var description: js.UndefOr[NonEmptyString] = js.native
  /**
    *  Launch permissions can be used to configure which AWS accounts can use the AMI to launch instances. 
    */
  var launchPermission: js.UndefOr[LaunchPermissionConfiguration] = js.native
  /**
    *  The name of the distribution configuration. 
    */
  var name: js.UndefOr[AmiNameString] = js.native
}

object AmiDistributionConfiguration {
  @scala.inline
  def apply(): AmiDistributionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AmiDistributionConfiguration]
  }
  @scala.inline
  implicit class AmiDistributionConfigurationOps[Self <: AmiDistributionConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAmiTags(value: TagMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amiTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmiTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amiTags")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withLaunchPermission(value: LaunchPermissionConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launchPermission")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLaunchPermission: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launchPermission")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: AmiNameString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
  }
  
}

