package typingsSlinky.jointjs.mod.highlighters

import typingsSlinky.jointjs.mod.attributes.NativeSVGAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrokeHighlighterArguments extends js.Object {
  var attrs: js.UndefOr[NativeSVGAttributes] = js.native
  var padding: js.UndefOr[Double] = js.native
  var rx: js.UndefOr[Double] = js.native
  var ry: js.UndefOr[Double] = js.native
}

object StrokeHighlighterArguments {
  @scala.inline
  def apply(): StrokeHighlighterArguments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrokeHighlighterArguments]
  }
  @scala.inline
  implicit class StrokeHighlighterArgumentsOps[Self <: StrokeHighlighterArguments] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttrs(value: NativeSVGAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attrs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttrs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attrs")(js.undefined)
        ret
    }
    @scala.inline
    def withPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(js.undefined)
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
  }
  
}

