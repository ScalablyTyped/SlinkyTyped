package typingsSlinky.expo.screenOrientationTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlatformOrientationInfo extends js.Object {
  var screenOrientationArrayIOS: js.UndefOr[js.Array[Orientation]] = js.native
  var screenOrientationConstantAndroid: js.UndefOr[Double] = js.native
  var screenOrientationLockWeb: js.UndefOr[WebOrientationLock] = js.native
}

object PlatformOrientationInfo {
  @scala.inline
  def apply(): PlatformOrientationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlatformOrientationInfo]
  }
  @scala.inline
  implicit class PlatformOrientationInfoOps[Self <: PlatformOrientationInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScreenOrientationArrayIOS(value: js.Array[Orientation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenOrientationArrayIOS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScreenOrientationArrayIOS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenOrientationArrayIOS")(js.undefined)
        ret
    }
    @scala.inline
    def withScreenOrientationConstantAndroid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenOrientationConstantAndroid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScreenOrientationConstantAndroid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenOrientationConstantAndroid")(js.undefined)
        ret
    }
    @scala.inline
    def withScreenOrientationLockWeb(value: WebOrientationLock): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenOrientationLockWeb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScreenOrientationLockWeb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenOrientationLockWeb")(js.undefined)
        ret
    }
  }
  
}

