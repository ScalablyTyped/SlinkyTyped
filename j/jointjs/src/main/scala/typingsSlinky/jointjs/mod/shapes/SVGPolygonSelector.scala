package typingsSlinky.jointjs.mod.shapes

import typingsSlinky.jointjs.mod.attributes.SVGPolygonAttributes
import typingsSlinky.jointjs.mod.dia.Cell.Selectors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGPolygonSelector extends Selectors {
  var polygon: js.UndefOr[SVGPolygonAttributes] = js.native
}

object SVGPolygonSelector {
  @scala.inline
  def apply(): SVGPolygonSelector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SVGPolygonSelector]
  }
  @scala.inline
  implicit class SVGPolygonSelectorOps[Self <: SVGPolygonSelector] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPolygon(value: SVGPolygonAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polygon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolygon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polygon")(js.undefined)
        ret
    }
  }
  
}

