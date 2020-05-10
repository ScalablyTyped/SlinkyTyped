package typingsSlinky.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoPropertyMoreSetting extends js.Object {
  def GetDefaultValue(): Double = js.native
  def GetIfAuto(): Boolean = js.native
  def GetMaxValue(): Double = js.native
  def GetMinValue(): Double = js.native
  def GetSteppingDelta(): Double = js.native
}

object VideoPropertyMoreSetting {
  @scala.inline
  def apply(
    GetDefaultValue: () => Double,
    GetIfAuto: () => Boolean,
    GetMaxValue: () => Double,
    GetMinValue: () => Double,
    GetSteppingDelta: () => Double
  ): VideoPropertyMoreSetting = {
    val __obj = js.Dynamic.literal(GetDefaultValue = js.Any.fromFunction0(GetDefaultValue), GetIfAuto = js.Any.fromFunction0(GetIfAuto), GetMaxValue = js.Any.fromFunction0(GetMaxValue), GetMinValue = js.Any.fromFunction0(GetMinValue), GetSteppingDelta = js.Any.fromFunction0(GetSteppingDelta))
    __obj.asInstanceOf[VideoPropertyMoreSetting]
  }
  @scala.inline
  implicit class VideoPropertyMoreSettingOps[Self <: VideoPropertyMoreSetting] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetDefaultValue(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetDefaultValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetIfAuto(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetIfAuto")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMaxValue(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetMaxValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMinValue(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetMinValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSteppingDelta(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetSteppingDelta")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

