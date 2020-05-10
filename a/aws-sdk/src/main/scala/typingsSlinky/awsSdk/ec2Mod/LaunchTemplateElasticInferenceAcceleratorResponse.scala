package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchTemplateElasticInferenceAcceleratorResponse extends js.Object {
  /**
    *  The number of elastic inference accelerators to attach to the instance.  Default: 1
    */
  var Count: js.UndefOr[Integer] = js.native
  /**
    *  The type of elastic inference accelerator. The possible values are eia1.medium, eia1.large, and eia1.xlarge. 
    */
  var Type: js.UndefOr[String] = js.native
}

object LaunchTemplateElasticInferenceAcceleratorResponse {
  @scala.inline
  def apply(): LaunchTemplateElasticInferenceAcceleratorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplateElasticInferenceAcceleratorResponse]
  }
  @scala.inline
  implicit class LaunchTemplateElasticInferenceAcceleratorResponseOps[Self <: LaunchTemplateElasticInferenceAcceleratorResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCount(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Count")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(js.undefined)
        ret
    }
  }
  
}

