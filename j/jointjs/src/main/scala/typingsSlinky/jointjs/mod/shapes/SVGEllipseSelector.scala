package typingsSlinky.jointjs.mod.shapes

import typingsSlinky.jointjs.mod.attributes.SVGEllipseAttributes
import typingsSlinky.jointjs.mod.dia.Cell.Selectors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGEllipseSelector extends Selectors {
  var ellipse: js.UndefOr[SVGEllipseAttributes] = js.native
}

object SVGEllipseSelector {
  @scala.inline
  def apply(): SVGEllipseSelector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SVGEllipseSelector]
  }
  @scala.inline
  implicit class SVGEllipseSelectorOps[Self <: SVGEllipseSelector] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEllipse(value: SVGEllipseAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ellipse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEllipse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ellipse")(js.undefined)
        ret
    }
  }
  
}

