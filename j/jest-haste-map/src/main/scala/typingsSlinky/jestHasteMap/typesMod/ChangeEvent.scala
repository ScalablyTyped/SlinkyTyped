package typingsSlinky.jestHasteMap.typesMod

import typingsSlinky.jestHasteMap.hasteFSMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangeEvent extends js.Object {
  var eventsQueue: EventsQueue = js.native
  var hasteFS: default = js.native
  var moduleMap: typingsSlinky.jestHasteMap.moduleMapMod.default = js.native
}

object ChangeEvent {
  @scala.inline
  def apply(
    eventsQueue: EventsQueue,
    hasteFS: default,
    moduleMap: typingsSlinky.jestHasteMap.moduleMapMod.default
  ): ChangeEvent = {
    val __obj = js.Dynamic.literal(eventsQueue = eventsQueue.asInstanceOf[js.Any], hasteFS = hasteFS.asInstanceOf[js.Any], moduleMap = moduleMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeEvent]
  }
  @scala.inline
  implicit class ChangeEventOps[Self <: ChangeEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEventsQueue(value: EventsQueue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventsQueue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasteFS(value: default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasteFS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModuleMap(value: typingsSlinky.jestHasteMap.moduleMapMod.default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleMap")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

