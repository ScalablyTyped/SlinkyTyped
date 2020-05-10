package typingsSlinky.reactNativeChartsWrapper

import typingsSlinky.reactNativeChartsWrapper.mod.Color
import typingsSlinky.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.BL_TR
import typingsSlinky.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.BOTTOM_TOP
import typingsSlinky.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.BR_TL
import typingsSlinky.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.LEFT_RIGHT
import typingsSlinky.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.RIGHT_LEFT
import typingsSlinky.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.TL_BR
import typingsSlinky.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.TOP_BOTTOM
import typingsSlinky.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.TR_BL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAngle extends js.Object {
  var angle: js.UndefOr[Double] = js.native
  var colors: js.UndefOr[js.Array[Color]] = js.native
  var orientation: js.UndefOr[
    TOP_BOTTOM | TR_BL | RIGHT_LEFT | BR_TL | BOTTOM_TOP | BL_TR | LEFT_RIGHT | TL_BR
  ] = js.native
  var positions: js.UndefOr[js.Array[Double]] = js.native
}

object AnonAngle {
  @scala.inline
  def apply(): AnonAngle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAngle]
  }
  @scala.inline
  implicit class AnonAngleOps[Self <: AnonAngle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angle")(js.undefined)
        ret
    }
    @scala.inline
    def withColors(value: js.Array[Color]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(js.undefined)
        ret
    }
    @scala.inline
    def withOrientation(value: TOP_BOTTOM | TR_BL | RIGHT_LEFT | BR_TL | BOTTOM_TOP | BL_TR | LEFT_RIGHT | TL_BR): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(js.undefined)
        ret
    }
    @scala.inline
    def withPositions(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPositions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positions")(js.undefined)
        ret
    }
  }
  
}

