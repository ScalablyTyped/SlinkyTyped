package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyInstanceMetadataOptionsResult extends js.Object {
  /**
    * The ID of the instance.
    */
  var InstanceId: js.UndefOr[String] = js.native
  /**
    * The metadata options for the instance.
    */
  var InstanceMetadataOptions: js.UndefOr[InstanceMetadataOptionsResponse] = js.native
}

object ModifyInstanceMetadataOptionsResult {
  @scala.inline
  def apply(): ModifyInstanceMetadataOptionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyInstanceMetadataOptionsResult]
  }
  @scala.inline
  implicit class ModifyInstanceMetadataOptionsResultOps[Self <: ModifyInstanceMetadataOptionsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstanceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceId")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceMetadataOptions(value: InstanceMetadataOptionsResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceMetadataOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceMetadataOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceMetadataOptions")(js.undefined)
        ret
    }
  }
  
}

