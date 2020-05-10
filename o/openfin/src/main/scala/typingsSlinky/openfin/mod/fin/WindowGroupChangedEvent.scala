package typingsSlinky.openfin.mod.fin

import typingsSlinky.openfin.openfinStrings.`group-changed`
import typingsSlinky.openfin.openfinStrings.disband
import typingsSlinky.openfin.openfinStrings.join
import typingsSlinky.openfin.openfinStrings.leave
import typingsSlinky.openfin.openfinStrings.merge
import typingsSlinky.openfin.openfinStrings.nothing
import typingsSlinky.openfin.openfinStrings.source
import typingsSlinky.openfin.openfinStrings.target
import typingsSlinky.openfin.openfinStrings.window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowGroupChangedEvent extends WindowBaseEvent {
  /**
    * Which group array the window that the event listener was registered on is included in:
    * 'source' The window is included in sourceGroup.
    * 'target' The window is included in targetGroup.
    * 'nothing' The window is not included in sourceGroup nor targetGroup.
    */
  var memberOf: source | target | nothing = js.native
  /**
    * The reason this event was triggered.
    * 'leave' A window has left the group due to a leave or merge with group.
    * 'join' A window has joined the group.
    * 'merge' Two groups have been merged together.
    * 'disband' There are no other windows in the group.
    */
  var reason: leave | join | merge | disband = js.native
  /**
    * All the windows in the group the sourceWindow originated from.
    */
  var sourceGroup: js.Array[WindowOfGroupInfo] = js.native
  /**
    * The UUID of the application the sourceWindow belongs to The source window is the window in which (merge/join/leave)group(s) was called.
    */
  var sourceWindowAppUuid: String = js.native
  /**
    * the name of the sourcewindow.The source window is the window in which(merge / join / leave) group(s) was called.
    */
  var sourceWindowName: String = js.native
  /**
    * All the windows in the group the targetWindow orginated from
    */
  var targetGroup: js.Array[WindowOfGroupInfo] = js.native
  /**
    * The UUID of the application the targetWindow belongs to. The target window is the window that was passed into (merge/join) group(s).
    */
  var targetWindowAppUuid: String = js.native
  /**
    * The name of the targetWindow. The target window is the window that was passed into (merge/join) group(s).
    */
  var targetWindowName: String = js.native
  @JSName("type")
  var type_WindowGroupChangedEvent: `group-changed` = js.native
}

object WindowGroupChangedEvent {
  @scala.inline
  def apply(
    memberOf: source | target | nothing,
    name: String,
    reason: leave | join | merge | disband,
    sourceGroup: js.Array[WindowOfGroupInfo],
    sourceWindowAppUuid: String,
    sourceWindowName: String,
    targetGroup: js.Array[WindowOfGroupInfo],
    targetWindowAppUuid: String,
    targetWindowName: String,
    topic: window,
    `type`: `group-changed`,
    uuid: String
  ): WindowGroupChangedEvent = {
    val __obj = js.Dynamic.literal(memberOf = memberOf.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], sourceGroup = sourceGroup.asInstanceOf[js.Any], sourceWindowAppUuid = sourceWindowAppUuid.asInstanceOf[js.Any], sourceWindowName = sourceWindowName.asInstanceOf[js.Any], targetGroup = targetGroup.asInstanceOf[js.Any], targetWindowAppUuid = targetWindowAppUuid.asInstanceOf[js.Any], targetWindowName = targetWindowName.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowGroupChangedEvent]
  }
  @scala.inline
  implicit class WindowGroupChangedEventOps[Self <: WindowGroupChangedEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMemberOf(value: source | target | nothing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memberOf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReason(value: leave | join | merge | disband): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceGroup(value: js.Array[WindowOfGroupInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceWindowAppUuid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceWindowAppUuid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceWindowName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceWindowName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetGroup(value: js.Array[WindowOfGroupInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetWindowAppUuid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetWindowAppUuid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetWindowName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetWindowName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: `group-changed`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

