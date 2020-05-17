package typingsSlinky.jointjs.mod.shapes.uml

import typingsSlinky.jointjs.mod.attributes.SVGCircleAttributes
import typingsSlinky.jointjs.mod.dia.Cell.Selectors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndStateSelectors extends Selectors {
  @JSName("circle.inner")
  var circleDotinner: js.UndefOr[SVGCircleAttributes] = js.native
  @JSName("circle.outer")
  var circleDotouter: js.UndefOr[SVGCircleAttributes] = js.native
}

object EndStateSelectors {
  @scala.inline
  def apply(): EndStateSelectors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndStateSelectors]
  }
  @scala.inline
  implicit class EndStateSelectorsOps[Self <: EndStateSelectors] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCircleDotinner(value: SVGCircleAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circle.inner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCircleDotinner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circle.inner")(js.undefined)
        ret
    }
    @scala.inline
    def withCircleDotouter(value: SVGCircleAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circle.outer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCircleDotouter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circle.outer")(js.undefined)
        ret
    }
  }
  
}

