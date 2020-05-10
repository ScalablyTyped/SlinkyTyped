package typingsSlinky.officeJsPreview.Visio.Interfaces

import typingsSlinky.officeJsPreview.Visio.Highlight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ShapeView object, for use in "shapeView.set({ ... })". */
@js.native
trait ShapeViewUpdateData extends js.Object {
  /**
    *
    * Represents the highlight around the shape.
    *
    * [Api set:  1.1]
    */
  var highlight: js.UndefOr[Highlight] = js.native
}

object ShapeViewUpdateData {
  @scala.inline
  def apply(): ShapeViewUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShapeViewUpdateData]
  }
  @scala.inline
  implicit class ShapeViewUpdateDataOps[Self <: ShapeViewUpdateData] (val x: Self) extends AnyVal {
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

