package typingsSlinky.expo.screenOrientationTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlatformOrientationInfo extends js.Object {
  var screenOrientationArrayIOS: js.UndefOr[js.Array[Orientation]] = js.undefined
  var screenOrientationConstantAndroid: js.UndefOr[Double] = js.undefined
  var screenOrientationLockWeb: js.UndefOr[WebOrientationLock] = js.undefined
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setScreenOrientationArrayIOSVarargs(value: Orientation*): Self = this.set("screenOrientationArrayIOS", js.Array(value :_*))
    @scala.inline
    def setScreenOrientationArrayIOS(value: js.Array[Orientation]): Self = this.set("screenOrientationArrayIOS", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScreenOrientationArrayIOS: Self = this.set("screenOrientationArrayIOS", js.undefined)
    @scala.inline
    def setScreenOrientationConstantAndroid(value: Double): Self = this.set("screenOrientationConstantAndroid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScreenOrientationConstantAndroid: Self = this.set("screenOrientationConstantAndroid", js.undefined)
    @scala.inline
    def setScreenOrientationLockWeb(value: WebOrientationLock): Self = this.set("screenOrientationLockWeb", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScreenOrientationLockWeb: Self = this.set("screenOrientationLockWeb", js.undefined)
  }
  
}

