package typingsSlinky.expo.screenOrientationTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrientationInfo extends js.Object {
  var horizontalSizeClass: js.UndefOr[SizeClassIOS] = js.native
  var orientation: Orientation = js.native
  var verticalSizeClass: js.UndefOr[SizeClassIOS] = js.native
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
    def withOrientation(value: Orientation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHorizontalSizeClass(value: SizeClassIOS): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalSizeClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontalSizeClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalSizeClass")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalSizeClass(value: SizeClassIOS): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalSizeClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalSizeClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalSizeClass")(js.undefined)
        ret
    }
  }
  
}

