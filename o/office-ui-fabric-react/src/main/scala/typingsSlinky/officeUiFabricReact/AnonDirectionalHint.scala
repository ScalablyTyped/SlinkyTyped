package typingsSlinky.officeUiFabricReact

import typingsSlinky.officeUiFabricReact.officeUiFabricReactNumbers.`7`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDirectionalHint extends js.Object {
  var beakWidth: Double = js.native
  var directionalHint: `7` = js.native
  var gapSpace: Double = js.native
  var isBeakVisible: Boolean = js.native
  var minPagePadding: Double = js.native
  var preventDismissOnLostFocus: Boolean = js.native
  var preventDismissOnResize: Boolean = js.native
  var preventDismissOnScroll: Boolean = js.native
}

object AnonDirectionalHint {
  @scala.inline
  def apply(
    beakWidth: Double,
    directionalHint: `7`,
    gapSpace: Double,
    isBeakVisible: Boolean,
    minPagePadding: Double,
    preventDismissOnLostFocus: Boolean,
    preventDismissOnResize: Boolean,
    preventDismissOnScroll: Boolean
  ): AnonDirectionalHint = {
    val __obj = js.Dynamic.literal(beakWidth = beakWidth.asInstanceOf[js.Any], directionalHint = directionalHint.asInstanceOf[js.Any], gapSpace = gapSpace.asInstanceOf[js.Any], isBeakVisible = isBeakVisible.asInstanceOf[js.Any], minPagePadding = minPagePadding.asInstanceOf[js.Any], preventDismissOnLostFocus = preventDismissOnLostFocus.asInstanceOf[js.Any], preventDismissOnResize = preventDismissOnResize.asInstanceOf[js.Any], preventDismissOnScroll = preventDismissOnScroll.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDirectionalHint]
  }
  @scala.inline
  implicit class AnonDirectionalHintOps[Self <: AnonDirectionalHint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBeakWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beakWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirectionalHint(value: `7`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directionalHint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGapSpace(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gapSpace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsBeakVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBeakVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinPagePadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minPagePadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreventDismissOnLostFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDismissOnLostFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreventDismissOnResize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDismissOnResize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreventDismissOnScroll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDismissOnScroll")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

