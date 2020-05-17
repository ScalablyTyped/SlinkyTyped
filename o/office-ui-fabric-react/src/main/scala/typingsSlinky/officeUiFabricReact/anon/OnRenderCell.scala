package typingsSlinky.officeUiFabricReact.anon

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnRenderCell extends js.Object {
  var renderedWindowsAhead: Double = js.native
  var renderedWindowsBehind: Double = js.native
  var startIndex: Double = js.native
  def onRenderCell(item: js.Any, index: Double, containsFocus: Boolean): ReactElement = js.native
}

object OnRenderCell {
  @scala.inline
  def apply(
    onRenderCell: (js.Any, Double, Boolean) => ReactElement,
    renderedWindowsAhead: Double,
    renderedWindowsBehind: Double,
    startIndex: Double
  ): OnRenderCell = {
    val __obj = js.Dynamic.literal(onRenderCell = js.Any.fromFunction3(onRenderCell), renderedWindowsAhead = renderedWindowsAhead.asInstanceOf[js.Any], renderedWindowsBehind = renderedWindowsBehind.asInstanceOf[js.Any], startIndex = startIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnRenderCell]
  }
  @scala.inline
  implicit class OnRenderCellOps[Self <: OnRenderCell] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnRenderCell(value: (js.Any, Double, Boolean) => ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderCell")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withRenderedWindowsAhead(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderedWindowsAhead")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderedWindowsBehind(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderedWindowsBehind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startIndex")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

