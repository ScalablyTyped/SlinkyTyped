package typingsSlinky.jointjs.mod.shapes.logic

import typingsSlinky.jointjs.mod.attributes.SVGCircleAttributes
import typingsSlinky.jointjs.mod.attributes.SVGPathAttributes
import typingsSlinky.jointjs.mod.attributes.SVGRectAttributes
import typingsSlinky.jointjs.mod.attributes.SVGTextAttributes
import typingsSlinky.jointjs.mod.dia.Cell.Selectors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GateSelectors extends Selectors {
  @JSName(".body")
  var Dotbody: js.UndefOr[SVGRectAttributes] = js.native
  @JSName(".wire")
  var Dotwire: js.UndefOr[SVGPathAttributes] = js.native
  var circle: js.UndefOr[SVGCircleAttributes] = js.native
  var text: js.UndefOr[SVGTextAttributes] = js.native
}

object GateSelectors {
  @scala.inline
  def apply(): GateSelectors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GateSelectors]
  }
  @scala.inline
  implicit class GateSelectorsOps[Self <: GateSelectors] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDotbody(value: SVGRectAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(".body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDotbody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(".body")(js.undefined)
        ret
    }
    @scala.inline
    def withDotwire(value: SVGPathAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(".wire")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDotwire: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(".wire")(js.undefined)
        ret
    }
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
    @scala.inline
    def withText(value: SVGTextAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
  }
  
}

