package typingsSlinky.pubnub.mod

import typingsSlinky.pubnub.anon.DataChannel
import typingsSlinky.pubnub.anon.DataChannelMetadataObject
import typingsSlinky.pubnub.anon.DataEventType
import typingsSlinky.pubnub.anon.DataId
import typingsSlinky.pubnub.anon.DataIdEvent
import typingsSlinky.pubnub.anon.DataUuid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def SetUUIDMetadataEvent[UUIDCustom /* <: ObjectCustom */, ChannelCustom /* <: ObjectCustom */, MembershipCustom /* <: ObjectCustom */](channel: String, message: DataEventType[UUIDCustom], timetoken: Double): ObjectsEvent[UUIDCustom, ChannelCustom, MembershipCustom] = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timetoken = timetoken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectsEvent[UUIDCustom, ChannelCustom, MembershipCustom]]
  }
  
  @scala.inline
  def RemoveChannelMetadataEvent[UUIDCustom /* <: ObjectCustom */, ChannelCustom /* <: ObjectCustom */, MembershipCustom /* <: ObjectCustom */](channel: String, message: DataIdEvent, timetoken: Double): ObjectsEvent[UUIDCustom, ChannelCustom, MembershipCustom] = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timetoken = timetoken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectsEvent[UUIDCustom, ChannelCustom, MembershipCustom]]
  }
  
  @scala.inline
  def SetMembershipEvent[UUIDCustom /* <: ObjectCustom */, ChannelCustom /* <: ObjectCustom */, MembershipCustom /* <: ObjectCustom */](channel: String, message: DataChannel[MembershipCustom], timetoken: Double): ObjectsEvent[UUIDCustom, ChannelCustom, MembershipCustom] = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timetoken = timetoken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectsEvent[UUIDCustom, ChannelCustom, MembershipCustom]]
  }
  
  @scala.inline
  def RemoveMembershipEvent[UUIDCustom /* <: ObjectCustom */, ChannelCustom /* <: ObjectCustom */, MembershipCustom /* <: ObjectCustom */](channel: String, message: DataUuid, timetoken: Double): ObjectsEvent[UUIDCustom, ChannelCustom, MembershipCustom] = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timetoken = timetoken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectsEvent[UUIDCustom, ChannelCustom, MembershipCustom]]
  }
  
  @scala.inline
  def RemoveUUIDMetadataEvent[UUIDCustom /* <: ObjectCustom */, ChannelCustom /* <: ObjectCustom */, MembershipCustom /* <: ObjectCustom */](channel: String, message: DataId, timetoken: Double): ObjectsEvent[UUIDCustom, ChannelCustom, MembershipCustom] = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timetoken = timetoken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectsEvent[UUIDCustom, ChannelCustom, MembershipCustom]]
  }
  
  @scala.inline
  def SetChannelMetadataEvent[UUIDCustom /* <: ObjectCustom */, ChannelCustom /* <: ObjectCustom */, MembershipCustom /* <: ObjectCustom */](channel: String, message: DataChannelMetadataObject[ChannelCustom], timetoken: Double): ObjectsEvent[UUIDCustom, ChannelCustom, MembershipCustom] = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timetoken = timetoken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectsEvent[UUIDCustom, ChannelCustom, MembershipCustom]]
  }
}
