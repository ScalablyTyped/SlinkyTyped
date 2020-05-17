package typingsSlinky.jointjs.mod.Vectorizer

import typingsSlinky.jointjs.mod.g.PlainRect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoundedRect extends PlainRect {
  var `bottom-rx`: js.UndefOr[Double] = js.native
  var `bottom-ry`: js.UndefOr[Double] = js.native
  var rx: js.UndefOr[Double] = js.native
  var ry: js.UndefOr[Double] = js.native
  var `top-rx`: js.UndefOr[Double] = js.native
  var `top-ry`: js.UndefOr[Double] = js.native
}

object RoundedRect {
  @scala.inline
  def apply(height: Double, width: Double, x: Double, y: Double): RoundedRect = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoundedRect]
  }
  @scala.inline
  implicit class RoundedRectOps[Self <: RoundedRect] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withBottom-rx`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottom-rx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBottom-rx`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottom-rx")(js.undefined)
        ret
    }
    @scala.inline
    def `withBottom-ry`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottom-ry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBottom-ry`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottom-ry")(js.undefined)
        ret
    }
    @scala.inline
    def withRx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRx: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rx")(js.undefined)
        ret
    }
    @scala.inline
    def withRy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ry")(js.undefined)
        ret
    }
    @scala.inline
    def `withTop-rx`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top-rx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutTop-rx`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top-rx")(js.undefined)
        ret
    }
    @scala.inline
    def `withTop-ry`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top-ry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutTop-ry`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top-ry")(js.undefined)
        ret
    }
  }
  
}

