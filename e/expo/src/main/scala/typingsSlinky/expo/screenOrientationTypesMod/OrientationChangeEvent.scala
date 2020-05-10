package typingsSlinky.expo.screenOrientationTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrientationChangeEvent extends js.Object {
  var orientationInfo: OrientationInfo = js.native
  var orientationLock: OrientationLock = js.native
}

object OrientationChangeEvent {
  @scala.inline
  def apply(orientationInfo: OrientationInfo, orientationLock: OrientationLock): OrientationChangeEvent = {
    val __obj = js.Dynamic.literal(orientationInfo = orientationInfo.asInstanceOf[js.Any], orientationLock = orientationLock.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrientationChangeEvent]
  }
  @scala.inline
  implicit class OrientationChangeEventOps[Self <: OrientationChangeEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOrientationInfo(value: OrientationInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientationInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrientationLock(value: OrientationLock): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientationLock")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

