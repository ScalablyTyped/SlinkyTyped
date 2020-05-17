package typingsSlinky.openfin.windowMod

import typingsSlinky.openfin.anon.AppUuid
import typingsSlinky.openfin.eventsBaseMod.WindowEvent
import typingsSlinky.openfin.openfinStrings.disband
import typingsSlinky.openfin.openfinStrings.join
import typingsSlinky.openfin.openfinStrings.leave
import typingsSlinky.openfin.openfinStrings.merge
import typingsSlinky.openfin.openfinStrings.nothing
import typingsSlinky.openfin.openfinStrings.source
import typingsSlinky.openfin.openfinStrings.target
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowGroupChanged[Topic, Type] extends WindowEvent[Topic, Type] {
  var memberOf: source | target | nothing = js.native
  var reason: leave | join | merge | disband = js.native
  var sourceGroup: js.Array[AppUuid] = js.native
  var sourceWindowAppUuid: String = js.native
  var sourceWindowName: String = js.native
  var targetGroup: js.Array[AppUuid] = js.native
  var targetWindowAppUuid: String = js.native
  var targetWindowName: String = js.native
}

object WindowGroupChanged {
  @scala.inline
  def apply[Topic, Type](
    memberOf: source | target | nothing,
    name: String,
    reason: leave | join | merge | disband,
    sourceGroup: js.Array[AppUuid],
    sourceWindowAppUuid: String,
    sourceWindowName: String,
    targetGroup: js.Array[AppUuid],
    targetWindowAppUuid: String,
    targetWindowName: String,
    topic: Topic,
    `type`: Type,
    uuid: String
  ): WindowGroupChanged[Topic, Type] = {
    val __obj = js.Dynamic.literal(memberOf = memberOf.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], sourceGroup = sourceGroup.asInstanceOf[js.Any], sourceWindowAppUuid = sourceWindowAppUuid.asInstanceOf[js.Any], sourceWindowName = sourceWindowName.asInstanceOf[js.Any], targetGroup = targetGroup.asInstanceOf[js.Any], targetWindowAppUuid = targetWindowAppUuid.asInstanceOf[js.Any], targetWindowName = targetWindowName.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowGroupChanged[Topic, Type]]
  }
  @scala.inline
  implicit class WindowGroupChangedOps[Self[topic, `type`] <: WindowGroupChanged[topic, `type`], Topic, Type] (val x: Self[Topic, Type]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Topic, Type] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Topic, Type]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Topic, Type]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Topic, Type]) with Other]
    @scala.inline
    def withMemberOf(value: source | target | nothing): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memberOf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReason(value: leave | join | merge | disband): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceGroup(value: js.Array[AppUuid]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceWindowAppUuid(value: String): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceWindowAppUuid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceWindowName(value: String): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceWindowName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetGroup(value: js.Array[AppUuid]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetWindowAppUuid(value: String): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetWindowAppUuid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetWindowName(value: String): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetWindowName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

