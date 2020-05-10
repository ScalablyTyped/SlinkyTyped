package typingsSlinky.gapiYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonItems extends js.Object {
  /**
    * The list of promoted items in the order that they will display across different playbacks to the same viewer.
    */
  var items: js.Array[AnonType] = js.native
  /**
    * The position object encapsulates information about the spatial position within the video where the promoted item will be displayed.
    */
  var position: AnonCornerPosition = js.native
  /**
    * The timing object encapsulates information about the temporal position within the video when the promoted item will be displayed.
    */
  var timing: AnonOffsetMs = js.native
}

object AnonItems {
  @scala.inline
  def apply(items: js.Array[AnonType], position: AnonCornerPosition, timing: AnonOffsetMs): AnonItems = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], timing = timing.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonItems]
  }
  @scala.inline
  implicit class AnonItemsOps[Self <: AnonItems] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[AnonType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: AnonCornerPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTiming(value: AnonOffsetMs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timing")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

