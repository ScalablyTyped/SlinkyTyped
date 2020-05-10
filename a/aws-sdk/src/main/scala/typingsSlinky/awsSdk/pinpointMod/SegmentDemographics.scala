package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SegmentDemographics extends js.Object {
  /**
    * The app version criteria for the segment.
    */
  var AppVersion: js.UndefOr[SetDimension] = js.native
  /**
    * The channel criteria for the segment.
    */
  var Channel: js.UndefOr[SetDimension] = js.native
  /**
    * The device type criteria for the segment.
    */
  var DeviceType: js.UndefOr[SetDimension] = js.native
  /**
    * The device make criteria for the segment.
    */
  var Make: js.UndefOr[SetDimension] = js.native
  /**
    * The device model criteria for the segment.
    */
  var Model: js.UndefOr[SetDimension] = js.native
  /**
    * The device platform criteria for the segment.
    */
  var Platform: js.UndefOr[SetDimension] = js.native
}

object SegmentDemographics {
  @scala.inline
  def apply(): SegmentDemographics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SegmentDemographics]
  }
  @scala.inline
  implicit class SegmentDemographicsOps[Self <: SegmentDemographics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppVersion(value: SetDimension): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AppVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AppVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withChannel(value: SetDimension): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Channel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Channel")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceType(value: SetDimension): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceType")(js.undefined)
        ret
    }
    @scala.inline
    def withMake(value: SetDimension): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Make")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMake: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Make")(js.undefined)
        ret
    }
    @scala.inline
    def withModel(value: SetDimension): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Model")(js.undefined)
        ret
    }
    @scala.inline
    def withPlatform(value: SetDimension): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Platform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Platform")(js.undefined)
        ret
    }
  }
  
}

