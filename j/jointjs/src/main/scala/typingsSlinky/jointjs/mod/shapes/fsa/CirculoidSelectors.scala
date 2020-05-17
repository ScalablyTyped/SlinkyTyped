package typingsSlinky.jointjs.mod.shapes.fsa

import typingsSlinky.jointjs.mod.attributes.SVGCircleAttributes
import typingsSlinky.jointjs.mod.dia.Cell.Selectors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CirculoidSelectors extends Selectors {
  @JSName(".inner")
  var Dotinner: js.UndefOr[SVGCircleAttributes] = js.native
  @JSName(".outer")
  var Dotouter: js.UndefOr[SVGCircleAttributes] = js.native
}

object CirculoidSelectors {
  @scala.inline
  def apply(): CirculoidSelectors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CirculoidSelectors]
  }
  @scala.inline
  implicit class CirculoidSelectorsOps[Self <: CirculoidSelectors] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDotinner(value: SVGCircleAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(".inner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDotinner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(".inner")(js.undefined)
        ret
    }
    @scala.inline
    def withDotouter(value: SVGCircleAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(".outer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDotouter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(".outer")(js.undefined)
        ret
    }
  }
  
}

