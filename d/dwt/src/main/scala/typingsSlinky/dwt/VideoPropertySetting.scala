package typingsSlinky.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoPropertySetting extends js.Object {
  def GetIfAuto(): Boolean = js.native
  def GetValue(): Double = js.native
}

object VideoPropertySetting {
  @scala.inline
  def apply(GetIfAuto: () => Boolean, GetValue: () => Double): VideoPropertySetting = {
    val __obj = js.Dynamic.literal(GetIfAuto = js.Any.fromFunction0(GetIfAuto), GetValue = js.Any.fromFunction0(GetValue))
    __obj.asInstanceOf[VideoPropertySetting]
  }
  @scala.inline
  implicit class VideoPropertySettingOps[Self <: VideoPropertySetting] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetIfAuto(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetIfAuto")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetValue(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetValue")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

