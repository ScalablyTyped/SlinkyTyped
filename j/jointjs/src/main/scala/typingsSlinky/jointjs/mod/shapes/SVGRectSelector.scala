package typingsSlinky.jointjs.mod.shapes

import typingsSlinky.jointjs.mod.attributes.SVGRectAttributes
import typingsSlinky.jointjs.mod.dia.Cell.Selectors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGRectSelector extends Selectors {
  var rect: js.UndefOr[SVGRectAttributes] = js.native
}

object SVGRectSelector {
  @scala.inline
  def apply(): SVGRectSelector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SVGRectSelector]
  }
  @scala.inline
  implicit class SVGRectSelectorOps[Self <: SVGRectSelector] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRect(value: SVGRectAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rect")(js.undefined)
        ret
    }
  }
  
}

