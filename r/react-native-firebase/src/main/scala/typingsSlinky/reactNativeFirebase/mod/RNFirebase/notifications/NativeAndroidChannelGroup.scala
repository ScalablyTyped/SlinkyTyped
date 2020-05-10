package typingsSlinky.reactNativeFirebase.mod.RNFirebase.notifications

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NativeAndroidChannelGroup extends js.Object {
  // Android API >= 28
  var channels: Unit | js.Array[NativeAndroidChannel] = js.native
  // Android API >= 28
  var description: String | Unit = js.native
  var groupId: String = js.native
  var name: String = js.native
}

object NativeAndroidChannelGroup {
  @scala.inline
  def apply(
    channels: Unit | js.Array[NativeAndroidChannel],
    description: String | Unit,
    groupId: String,
    name: String
  ): NativeAndroidChannelGroup = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], groupId = groupId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeAndroidChannelGroup]
  }
  @scala.inline
  implicit class NativeAndroidChannelGroupOps[Self <: NativeAndroidChannelGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChannels(value: Unit | js.Array[NativeAndroidChannel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

