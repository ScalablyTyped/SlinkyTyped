package typingsSlinky.awsSdkClientPinpointBrowser.typesSegmentDemographicsMod

import typingsSlinky.awsSdkClientPinpointBrowser.typesSetDimensionMod.UnmarshalledSetDimension
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledSegmentDemographics extends SegmentDemographics {
  /**
    * The app version criteria for the segment.
    */
  @JSName("AppVersion")
  var AppVersion_UnmarshalledSegmentDemographics: js.UndefOr[UnmarshalledSetDimension] = js.native
  /**
    * The channel criteria for the segment.
    */
  @JSName("Channel")
  var Channel_UnmarshalledSegmentDemographics: js.UndefOr[UnmarshalledSetDimension] = js.native
  /**
    * The device type criteria for the segment.
    */
  @JSName("DeviceType")
  var DeviceType_UnmarshalledSegmentDemographics: js.UndefOr[UnmarshalledSetDimension] = js.native
  /**
    * The device make criteria for the segment.
    */
  @JSName("Make")
  var Make_UnmarshalledSegmentDemographics: js.UndefOr[UnmarshalledSetDimension] = js.native
  /**
    * The device model criteria for the segment.
    */
  @JSName("Model")
  var Model_UnmarshalledSegmentDemographics: js.UndefOr[UnmarshalledSetDimension] = js.native
  /**
    * The device platform criteria for the segment.
    */
  @JSName("Platform")
  var Platform_UnmarshalledSegmentDemographics: js.UndefOr[UnmarshalledSetDimension] = js.native
}

object UnmarshalledSegmentDemographics {
  @scala.inline
  def apply(): UnmarshalledSegmentDemographics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledSegmentDemographics]
  }
  @scala.inline
  implicit class UnmarshalledSegmentDemographicsOps[Self <: UnmarshalledSegmentDemographics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppVersion(value: UnmarshalledSetDimension): Self = {
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
    def withChannel(value: UnmarshalledSetDimension): Self = {
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
    def withDeviceType(value: UnmarshalledSetDimension): Self = {
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
    def withMake(value: UnmarshalledSetDimension): Self = {
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
    def withModel(value: UnmarshalledSetDimension): Self = {
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
    def withPlatform(value: UnmarshalledSetDimension): Self = {
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

