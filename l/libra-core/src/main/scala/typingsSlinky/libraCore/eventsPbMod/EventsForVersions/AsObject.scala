package typingsSlinky.libraCore.eventsPbMod.EventsForVersions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsObject extends js.Object {
  var eventsForVersionList: js.Array[typingsSlinky.libraCore.eventsPbMod.EventsList.AsObject] = js.native
}

object AsObject {
  @scala.inline
  def apply(eventsForVersionList: js.Array[typingsSlinky.libraCore.eventsPbMod.EventsList.AsObject]): AsObject = {
    val __obj = js.Dynamic.literal(eventsForVersionList = eventsForVersionList.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
  @scala.inline
  implicit class AsObjectOps[Self <: AsObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEventsForVersionList(value: js.Array[typingsSlinky.libraCore.eventsPbMod.EventsList.AsObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventsForVersionList")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

