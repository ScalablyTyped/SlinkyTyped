package typingsSlinky.expo.screenOrientationTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrientationChangeEvent extends js.Object {
  var orientationInfo: OrientationInfo
  var orientationLock: OrientationLock
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOrientationInfo(value: OrientationInfo): Self = this.set("orientationInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrientationLock(value: OrientationLock): Self = this.set("orientationLock", value.asInstanceOf[js.Any])
  }
  
}

