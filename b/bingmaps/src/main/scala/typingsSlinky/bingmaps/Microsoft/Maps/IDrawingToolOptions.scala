package typingsSlinky.bingmaps.Microsoft.Maps

import typingsSlinky.bingmaps.Microsoft.Maps.DrawingTools.DrawingBarAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDrawingToolOptions extends js.Object {
  /** Set of buttons to show in the drawing bar */
  var drawingBarActions: js.UndefOr[DrawingBarAction] = js.native
}

object IDrawingToolOptions {
  @scala.inline
  def apply(): IDrawingToolOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDrawingToolOptions]
  }
  @scala.inline
  implicit class IDrawingToolOptionsOps[Self <: IDrawingToolOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDrawingBarActions(value: DrawingBarAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawingBarActions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrawingBarActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawingBarActions")(js.undefined)
        ret
    }
  }
  
}

