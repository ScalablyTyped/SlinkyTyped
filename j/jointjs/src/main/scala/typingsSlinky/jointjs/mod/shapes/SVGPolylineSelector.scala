package typingsSlinky.jointjs.mod.shapes

import typingsSlinky.jointjs.mod.attributes.SVGPolylineAttributes
import typingsSlinky.jointjs.mod.dia.Cell.Selectors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGPolylineSelector extends Selectors {
  var polyline: js.UndefOr[SVGPolylineAttributes] = js.native
}

object SVGPolylineSelector {
  @scala.inline
  def apply(): SVGPolylineSelector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SVGPolylineSelector]
  }
  @scala.inline
  implicit class SVGPolylineSelectorOps[Self <: SVGPolylineSelector] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPolyline(value: SVGPolylineAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polyline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolyline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polyline")(js.undefined)
        ret
    }
  }
  
}

