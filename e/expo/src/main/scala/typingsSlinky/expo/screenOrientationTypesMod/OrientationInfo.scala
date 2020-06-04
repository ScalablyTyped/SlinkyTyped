package typingsSlinky.expo.screenOrientationTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrientationInfo extends js.Object {
  var horizontalSizeClass: js.UndefOr[SizeClassIOS] = js.undefined
  var orientation: Orientation
  var verticalSizeClass: js.UndefOr[SizeClassIOS] = js.undefined
}

object OrientationInfo {
  @scala.inline
  def apply(orientation: Orientation): OrientationInfo = {
    val __obj = js.Dynamic.literal(orientation = orientation.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrientationInfo]
  }
  @scala.inline
  implicit class OrientationInfoOps[Self <: OrientationInfo] (val x: Self) extends AnyVal {
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
    def setOrientation(value: Orientation): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def setHorizontalSizeClass(value: SizeClassIOS): Self = this.set("horizontalSizeClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizontalSizeClass: Self = this.set("horizontalSizeClass", js.undefined)
    @scala.inline
    def setVerticalSizeClass(value: SizeClassIOS): Self = this.set("verticalSizeClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalSizeClass: Self = this.set("verticalSizeClass", js.undefined)
  }
  
}

