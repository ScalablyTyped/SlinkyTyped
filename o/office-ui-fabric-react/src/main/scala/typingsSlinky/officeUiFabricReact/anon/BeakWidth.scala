package typingsSlinky.officeUiFabricReact.anon

import typingsSlinky.officeUiFabricReact.officeUiFabricReactNumbers.`12`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BeakWidth extends js.Object {
  var beakWidth: Double = js.native
  var directionalHint: `12` = js.native
  var doNotLayer: Boolean = js.native
  var gapSpace: Double = js.native
  var setInitialFocus: Boolean = js.native
}

object BeakWidth {
  @scala.inline
  def apply(
    beakWidth: Double,
    directionalHint: `12`,
    doNotLayer: Boolean,
    gapSpace: Double,
    setInitialFocus: Boolean
  ): BeakWidth = {
    val __obj = js.Dynamic.literal(beakWidth = beakWidth.asInstanceOf[js.Any], directionalHint = directionalHint.asInstanceOf[js.Any], doNotLayer = doNotLayer.asInstanceOf[js.Any], gapSpace = gapSpace.asInstanceOf[js.Any], setInitialFocus = setInitialFocus.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeakWidth]
  }
  @scala.inline
  implicit class BeakWidthOps[Self <: BeakWidth] (val x: Self) extends AnyVal {
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
    def withDirectionalHint(value: `12`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directionalHint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDoNotLayer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doNotLayer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGapSpace(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gapSpace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetInitialFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setInitialFocus")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

