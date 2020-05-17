package typingsSlinky.activexLibreoffice.com_.sun.star.awt

import typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies an event occurred to an item of a menu, a list box etc. */
@js.native
trait ItemEvent extends EventObject {
  /** specifies which item is newly highlighted. */
  var Highlighted: Double = js.native
  /** specifies the id of the item. */
  var ItemId: Double = js.native
  /** specifies which item is newly selected. */
  var Selected: Double = js.native
}

object ItemEvent {
  @scala.inline
  def apply(Highlighted: Double, ItemId: Double, Selected: Double, Source: XInterface): ItemEvent = {
    val __obj = js.Dynamic.literal(Highlighted = Highlighted.asInstanceOf[js.Any], ItemId = ItemId.asInstanceOf[js.Any], Selected = Selected.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemEvent]
  }
  @scala.inline
  implicit class ItemEventOps[Self <: ItemEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHighlighted(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Highlighted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ItemId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelected(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Selected")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

