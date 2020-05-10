package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventCategoriesMessage extends js.Object {
  /**
    * A list of EventCategoriesMap data types.
    */
  var EventCategoriesMapList: js.UndefOr[typingsSlinky.awsSdk.rdsMod.EventCategoriesMapList] = js.native
}

object EventCategoriesMessage {
  @scala.inline
  def apply(): EventCategoriesMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventCategoriesMessage]
  }
  @scala.inline
  implicit class EventCategoriesMessageOps[Self <: EventCategoriesMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEventCategoriesMapList(value: EventCategoriesMapList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventCategoriesMapList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventCategoriesMapList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventCategoriesMapList")(js.undefined)
        ret
    }
  }
  
}

