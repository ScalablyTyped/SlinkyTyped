package typingsSlinky.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceQuotas extends js.Object {
  /**
    * The quota for applications in the AWS account.
    */
  var ApplicationQuota: js.UndefOr[ResourceQuota] = js.native
  /**
    * The quota for application versions in the AWS account.
    */
  var ApplicationVersionQuota: js.UndefOr[ResourceQuota] = js.native
  /**
    * The quota for configuration templates in the AWS account.
    */
  var ConfigurationTemplateQuota: js.UndefOr[ResourceQuota] = js.native
  /**
    * The quota for custom platforms in the AWS account.
    */
  var CustomPlatformQuota: js.UndefOr[ResourceQuota] = js.native
  /**
    * The quota for environments in the AWS account.
    */
  var EnvironmentQuota: js.UndefOr[ResourceQuota] = js.native
}

object ResourceQuotas {
  @scala.inline
  def apply(): ResourceQuotas = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceQuotas]
  }
  @scala.inline
  implicit class ResourceQuotasOps[Self <: ResourceQuotas] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationQuota(value: ResourceQuota): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationQuota")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationQuota: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationQuota")(js.undefined)
        ret
    }
    @scala.inline
    def withApplicationVersionQuota(value: ResourceQuota): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationVersionQuota")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationVersionQuota: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationVersionQuota")(js.undefined)
        ret
    }
    @scala.inline
    def withConfigurationTemplateQuota(value: ResourceQuota): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigurationTemplateQuota")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigurationTemplateQuota: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigurationTemplateQuota")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomPlatformQuota(value: ResourceQuota): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomPlatformQuota")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomPlatformQuota: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomPlatformQuota")(js.undefined)
        ret
    }
    @scala.inline
    def withEnvironmentQuota(value: ResourceQuota): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnvironmentQuota")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvironmentQuota: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnvironmentQuota")(js.undefined)
        ret
    }
  }
  
}

