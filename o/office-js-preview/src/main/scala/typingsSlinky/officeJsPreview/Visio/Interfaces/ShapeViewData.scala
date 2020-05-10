package typingsSlinky.officeJsPreview.Visio.Interfaces

import typingsSlinky.officeJsPreview.Visio.Highlight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "shapeView.toJSON()". */
@js.native
trait ShapeViewData extends js.Object {
  /**
    *
    * Represents the highlight around the shape.
    *
    * [Api set:  1.1]
    */
  var highlight: js.UndefOr[Highlight] = js.native
}

object ShapeViewData {
  @scala.inline
  def apply(): ShapeViewData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShapeViewData]
  }
  @scala.inline
  implicit class ShapeViewDataOps[Self <: ShapeViewData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHighlight(value: Highlight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlight")(js.undefined)
        ret
    }
  }
  
}

