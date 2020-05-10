package typingsSlinky.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElementAnimateOptionPos extends ElementAnimateOptionsBase {
  /** A position to which the elements will be animated. */
  var position: js.UndefOr[Position] = js.native
}

object ElementAnimateOptionPos {
  @scala.inline
  def apply(): ElementAnimateOptionPos = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElementAnimateOptionPos]
  }
  @scala.inline
  implicit class ElementAnimateOptionPosOps[Self <: ElementAnimateOptionPos] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPosition(value: Position): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
  }
  
}

