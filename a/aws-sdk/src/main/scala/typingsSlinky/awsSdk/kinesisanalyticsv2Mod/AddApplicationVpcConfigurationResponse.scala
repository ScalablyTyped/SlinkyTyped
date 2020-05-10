package typingsSlinky.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddApplicationVpcConfigurationResponse extends js.Object {
  /**
    * The ARN of the application.
    */
  var ApplicationARN: js.UndefOr[ResourceARN] = js.native
  /**
    * Provides the current application version. Kinesis Data Analytics updates the ApplicationVersionId each time you update the application. 
    */
  var ApplicationVersionId: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.ApplicationVersionId] = js.native
  /**
    * The parameters of the new VPC configuration.
    */
  var VpcConfigurationDescription: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.VpcConfigurationDescription] = js.native
}

object AddApplicationVpcConfigurationResponse {
  @scala.inline
  def apply(): AddApplicationVpcConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddApplicationVpcConfigurationResponse]
  }
  @scala.inline
  implicit class AddApplicationVpcConfigurationResponseOps[Self <: AddApplicationVpcConfigurationResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationARN(value: ResourceARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationARN")(js.undefined)
        ret
    }
    @scala.inline
    def withApplicationVersionId(value: ApplicationVersionId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationVersionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationVersionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationVersionId")(js.undefined)
        ret
    }
    @scala.inline
    def withVpcConfigurationDescription(value: VpcConfigurationDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcConfigurationDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcConfigurationDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcConfigurationDescription")(js.undefined)
        ret
    }
  }
  
}

