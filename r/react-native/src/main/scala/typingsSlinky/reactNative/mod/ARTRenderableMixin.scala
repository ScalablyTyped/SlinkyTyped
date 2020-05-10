package typingsSlinky.reactNative.mod

import typingsSlinky.reactNative.reactNativeStrings.bevel
import typingsSlinky.reactNative.reactNativeStrings.butt
import typingsSlinky.reactNative.reactNativeStrings.miter
import typingsSlinky.reactNative.reactNativeStrings.round
import typingsSlinky.reactNative.reactNativeStrings.square
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ARTRenderableMixin extends ARTNodeMixin {
  var fill: js.UndefOr[String] = js.native
  var stroke: js.UndefOr[String] = js.native
  var strokeCap: js.UndefOr[butt | square | round] = js.native
  var strokeDash: js.UndefOr[js.Array[Double]] = js.native
  var strokeJoin: js.UndefOr[bevel | miter | round] = js.native
  var strokeWidth: js.UndefOr[Double] = js.native
}

object ARTRenderableMixin {
  @scala.inline
  def apply(): ARTRenderableMixin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ARTRenderableMixin]
  }
  @scala.inline
  implicit class ARTRenderableMixinOps[Self <: ARTRenderableMixin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFill(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(js.undefined)
        ret
    }
    @scala.inline
    def withStroke(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStroke: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeCap(value: butt | square | round): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeCap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeCap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeCap")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeDash(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeDash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeDash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeDash")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeJoin(value: bevel | miter | round): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeJoin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeJoin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeJoin")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeWidth")(js.undefined)
        ret
    }
  }
  
}

