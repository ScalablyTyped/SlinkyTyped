package typingsSlinky.jointjs.mod.shapes.erd

import typingsSlinky.jointjs.mod.attributes.SVGEllipseAttributes
import typingsSlinky.jointjs.mod.attributes.SVGTextAttributes
import typingsSlinky.jointjs.mod.dia.Cell.Selectors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EllipsoidSelectors extends Selectors {
  @JSName(".body")
  var Dotbody: js.UndefOr[SVGEllipseAttributes] = js.native
  @JSName(".label")
  var Dotlabel: js.UndefOr[SVGEllipseAttributes] = js.native
  var text: js.UndefOr[SVGTextAttributes] = js.native
}

object EllipsoidSelectors {
  @scala.inline
  def apply(): EllipsoidSelectors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EllipsoidSelectors]
  }
  @scala.inline
  implicit class EllipsoidSelectorsOps[Self <: EllipsoidSelectors] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDotbody(value: SVGEllipseAttributes): Self = {
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
    def withDotlabel(value: SVGEllipseAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(".label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDotlabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(".label")(js.undefined)
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

