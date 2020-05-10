package typingsSlinky.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PagePositions extends js.Object {
  var borderBoxCenter: Position = js.native
  var selection: Position = js.native
}

object PagePositions {
  @scala.inline
  def apply(borderBoxCenter: Position, selection: Position): PagePositions = {
    val __obj = js.Dynamic.literal(borderBoxCenter = borderBoxCenter.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any])
    __obj.asInstanceOf[PagePositions]
  }
  @scala.inline
  implicit class PagePositionsOps[Self <: PagePositions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBorderBoxCenter(value: Position): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderBoxCenter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelection(value: Position): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

