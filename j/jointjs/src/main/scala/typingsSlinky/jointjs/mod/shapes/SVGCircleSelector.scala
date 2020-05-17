package typingsSlinky.jointjs.mod.shapes

import typingsSlinky.jointjs.mod.attributes.SVGCircleAttributes
import typingsSlinky.jointjs.mod.dia.Cell.Selectors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGCircleSelector extends Selectors {
  var circle: js.UndefOr[SVGCircleAttributes] = js.native
}

object SVGCircleSelector {
  @scala.inline
  def apply(): SVGCircleSelector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SVGCircleSelector]
  }
  @scala.inline
  implicit class SVGCircleSelectorOps[Self <: SVGCircleSelector] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCircle(value: SVGCircleAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCircle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circle")(js.undefined)
        ret
    }
  }
  
}

