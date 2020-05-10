package typingsSlinky.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerGroup extends js.Object {
  /**
    * Name of a server group.
    */
  var name: js.UndefOr[ServerGroupName] = js.native
  /**
    * Identifier of a server group.
    */
  var serverGroupId: js.UndefOr[ServerGroupId] = js.native
  /**
    * List of servers belonging to a server group.
    */
  var serverList: js.UndefOr[ServerList] = js.native
}

object ServerGroup {
  @scala.inline
  def apply(): ServerGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerGroup]
  }
  @scala.inline
  implicit class ServerGroupOps[Self <: ServerGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: ServerGroupName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withServerGroupId(value: ServerGroupId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverGroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerGroupId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverGroupId")(js.undefined)
        ret
    }
    @scala.inline
    def withServerList(value: ServerList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverList")(js.undefined)
        ret
    }
  }
  
}

