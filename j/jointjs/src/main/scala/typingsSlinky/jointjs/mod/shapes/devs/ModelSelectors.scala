package typingsSlinky.jointjs.mod.shapes.devs

import typingsSlinky.jointjs.mod.attributes.SVGRectAttributes
import typingsSlinky.jointjs.mod.attributes.SVGTextAttributes
import typingsSlinky.jointjs.mod.dia.Cell.Selectors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelSelectors extends Selectors {
  @JSName(".body")
  var Dotbody: js.UndefOr[SVGRectAttributes] = js.native
  @JSName(".label")
  var Dotlabel: js.UndefOr[SVGTextAttributes] = js.native
}

object ModelSelectors {
  @scala.inline
  def apply(): ModelSelectors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelSelectors]
  }
  @scala.inline
  implicit class ModelSelectorsOps[Self <: ModelSelectors] (val x: Self) extends AnyVal {
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
    def withDotlabel(value: SVGTextAttributes): Self = {
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
  }
  
}

