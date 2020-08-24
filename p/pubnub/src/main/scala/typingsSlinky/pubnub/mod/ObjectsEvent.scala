package typingsSlinky.pubnub.mod

import typingsSlinky.pubnub.anon.DataChannel
import typingsSlinky.pubnub.anon.DataChannelMetadataObject
import typingsSlinky.pubnub.anon.DataEventType
import typingsSlinky.pubnub.anon.DataId
import typingsSlinky.pubnub.anon.DataIdEvent
import typingsSlinky.pubnub.anon.DataUuid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.pubnub.mod.SetUUIDMetadataEvent[UUIDCustom]
  - typingsSlinky.pubnub.mod.RemoveUUIDMetadataEvent
  - typingsSlinky.pubnub.mod.SetChannelMetadataEvent[ChannelCustom]
  - typingsSlinky.pubnub.mod.RemoveChannelMetadataEvent
  - typingsSlinky.pubnub.mod.SetMembershipEvent[MembershipCustom]
  - typingsSlinky.pubnub.mod.RemoveMembershipEvent
*/
trait ObjectsEvent[UUIDCustom /* <: ObjectCustom */, ChannelCustom /* <: ObjectCustom */, MembershipCustom /* <: ObjectCustom */] extends js.Object

object ObjectsEvent {
  @scala.inline
  def SetUUIDMetadataEvent[/* <: typingsSlinky.pubnub.mod.ObjectCustom */ UUIDCustom, /* <: typingsSlinky.pubnub.mod.ObjectCustom */ ChannelCustom, /* <: typingsSlinky.pubnub.mod.ObjectCustom */ MembershipCustom](channel: String, message: DataEventType[UUIDCustom], timetoken: Double): ObjectsEvent[UUIDCustom, ChannelCustom, MembershipCustom] = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timetoken = timetoken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectsEvent[UUIDCustom, ChannelCustom, MembershipCustom]]
  }
  @scala.inline
  def RemoveChannelMetadataEvent[/* <: typingsSlinky.pubnub.mod.ObjectCustom */ UUIDCustom, /* <: typingsSlinky.pubnub.mod.ObjectCustom */ ChannelCustom, /* <: typingsSlinky.pubnub.mod.ObjectCustom */ MembershipCustom](channel: String, message: DataIdEvent, timetoken: Double): ObjectsEvent[UUIDCustom, ChannelCustom, MembershipCustom] = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timetoken = timetoken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectsEvent[UUIDCustom, ChannelCustom, MembershipCustom]]
  }
  @scala.inline
  def SetMembershipEvent[/* <: typingsSlinky.pubnub.mod.ObjectCustom */ UUIDCustom, /* <: typingsSlinky.pubnub.mod.ObjectCustom */ ChannelCustom, /* <: typingsSlinky.pubnub.mod.ObjectCustom */ MembershipCustom](channel: String, message: DataChannel[MembershipCustom], timetoken: Double): ObjectsEvent[UUIDCustom, ChannelCustom, MembershipCustom] = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timetoken = timetoken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectsEvent[UUIDCustom, ChannelCustom, MembershipCustom]]
  }
  @scala.inline
  def RemoveMembershipEvent[/* <: typingsSlinky.pubnub.mod.ObjectCustom */ UUIDCustom, /* <: typingsSlinky.pubnub.mod.ObjectCustom */ ChannelCustom, /* <: typingsSlinky.pubnub.mod.ObjectCustom */ MembershipCustom](channel: String, message: DataUuid, timetoken: Double): ObjectsEvent[UUIDCustom, ChannelCustom, MembershipCustom] = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timetoken = timetoken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectsEvent[UUIDCustom, ChannelCustom, MembershipCustom]]
  }
  @scala.inline
  def RemoveUUIDMetadataEvent[/* <: typingsSlinky.pubnub.mod.ObjectCustom */ UUIDCustom, /* <: typingsSlinky.pubnub.mod.ObjectCustom */ ChannelCustom, /* <: typingsSlinky.pubnub.mod.ObjectCustom */ MembershipCustom](channel: String, message: DataId, timetoken: Double): ObjectsEvent[UUIDCustom, ChannelCustom, MembershipCustom] = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timetoken = timetoken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectsEvent[UUIDCustom, ChannelCustom, MembershipCustom]]
  }
  @scala.inline
  def SetChannelMetadataEvent[/* <: typingsSlinky.pubnub.mod.ObjectCustom */ UUIDCustom, /* <: typingsSlinky.pubnub.mod.ObjectCustom */ ChannelCustom, /* <: typingsSlinky.pubnub.mod.ObjectCustom */ MembershipCustom](channel: String, message: DataChannelMetadataObject[ChannelCustom], timetoken: Double): ObjectsEvent[UUIDCustom, ChannelCustom, MembershipCustom] = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timetoken = timetoken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectsEvent[UUIDCustom, ChannelCustom, MembershipCustom]]
  }
}

