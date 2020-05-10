package typingsSlinky.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoScalingGroupNamesType extends js.Object {
  /**
    * The names of the Auto Scaling groups. Each name can be a maximum of 1600 characters. By default, you can only specify up to 50 names. You can optionally increase this limit using the MaxRecords parameter. If you omit this parameter, all Auto Scaling groups are described.
    */
  var AutoScalingGroupNames: js.UndefOr[typingsSlinky.awsSdk.autoscalingMod.AutoScalingGroupNames] = js.native
  /**
    * The maximum number of items to return with this call. The default value is 50 and the maximum value is 100.
    */
  var MaxRecords: js.UndefOr[typingsSlinky.awsSdk.autoscalingMod.MaxRecords] = js.native
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[XmlString] = js.native
}

object AutoScalingGroupNamesType {
  @scala.inline
  def apply(): AutoScalingGroupNamesType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoScalingGroupNamesType]
  }
  @scala.inline
  implicit class AutoScalingGroupNamesTypeOps[Self <: AutoScalingGroupNamesType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoScalingGroupNames(value: AutoScalingGroupNames): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoScalingGroupNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoScalingGroupNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoScalingGroupNames")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxRecords(value: MaxRecords): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxRecords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxRecords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxRecords")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: XmlString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
  }
  
}

