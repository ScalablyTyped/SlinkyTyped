package typingsSlinky.qiniuJs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtentInfo extends /* key */ StringDictionary[ExtentInfoValue] {
  var DateTime: ExtentInfoValue = js.native
  var ExposureBiasValue: ExtentInfoValue = js.native
  var ExposureTime: ExtentInfoValue = js.native
  var ISOSpeedRatings: ExtentInfoValue = js.native
  var Model: ExtentInfoValue = js.native
  var ResolutionUnit: ExtentInfoValue = js.native
}

object ExtentInfo {
  @scala.inline
  def apply(
    DateTime: ExtentInfoValue,
    ExposureBiasValue: ExtentInfoValue,
    ExposureTime: ExtentInfoValue,
    ISOSpeedRatings: ExtentInfoValue,
    Model: ExtentInfoValue,
    ResolutionUnit: ExtentInfoValue
  ): ExtentInfo = {
    val __obj = js.Dynamic.literal(DateTime = DateTime.asInstanceOf[js.Any], ExposureBiasValue = ExposureBiasValue.asInstanceOf[js.Any], ExposureTime = ExposureTime.asInstanceOf[js.Any], ISOSpeedRatings = ISOSpeedRatings.asInstanceOf[js.Any], Model = Model.asInstanceOf[js.Any], ResolutionUnit = ResolutionUnit.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtentInfo]
  }
  @scala.inline
  implicit class ExtentInfoOps[Self <: ExtentInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDateTime(value: ExtentInfoValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExposureBiasValue(value: ExtentInfoValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExposureBiasValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExposureTime(value: ExtentInfoValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExposureTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withISOSpeedRatings(value: ExtentInfoValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ISOSpeedRatings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModel(value: ExtentInfoValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResolutionUnit(value: ExtentInfoValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResolutionUnit")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

