package typingsSlinky.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDeviceInstanceRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the device instance.
    */
  var arn: AmazonResourceName = js.native
  /**
    * An array of strings that you want to associate with the device instance.
    */
  var labels: js.UndefOr[InstanceLabels] = js.native
  /**
    * The ARN of the profile that you want to associate with the device instance.
    */
  var profileArn: js.UndefOr[AmazonResourceName] = js.native
}

object UpdateDeviceInstanceRequest {
  @scala.inline
  def apply(arn: AmazonResourceName): UpdateDeviceInstanceRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDeviceInstanceRequest]
  }
  @scala.inline
  implicit class UpdateDeviceInstanceRequestOps[Self <: UpdateDeviceInstanceRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: AmazonResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabels(value: InstanceLabels): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(js.undefined)
        ret
    }
    @scala.inline
    def withProfileArn(value: AmazonResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfileArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileArn")(js.undefined)
        ret
    }
  }
  
}

