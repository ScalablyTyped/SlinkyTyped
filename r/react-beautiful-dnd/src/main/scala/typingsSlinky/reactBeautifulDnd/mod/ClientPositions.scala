package typingsSlinky.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientPositions extends js.Object {
  // the current center of the item
  var borderBoxCenter: Position = js.native
  // how far the item has moved from its original position
  var offset: Position = js.native
  // where the user initially selected
  // This point is not used to calculate the impact of a dragging item
  // It is used to calculate the offset from the initial selection point
  var selection: Position = js.native
}

object ClientPositions {
  @scala.inline
  def apply(borderBoxCenter: Position, offset: Position, selection: Position): ClientPositions = {
    val __obj = js.Dynamic.literal(borderBoxCenter = borderBoxCenter.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientPositions]
  }
  @scala.inline
  implicit class ClientPositionsOps[Self <: ClientPositions] (val x: Self) extends AnyVal {
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
    def withOffset(value: Position): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
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

