package typingsSlinky.pubnub.mod

import typingsSlinky.pubnub.anon.DataChannel
import typingsSlinky.pubnub.anon.DataChannelMetadataObject
import typingsSlinky.pubnub.anon.DataEventType
import typingsSlinky.pubnub.anon.DataId
import typingsSlinky.pubnub.anon.DataIdEvent
import typingsSlinky.pubnub.anon.DataUuid
import org.scalablytyped.runtime.StObject
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
trait ObjectsEvent[UUIDCustom /* <: ObjectCustom */, ChannelCustom /* <: ObjectCustom */, MembershipCustom /* <: ObjectCustom */] extends StObject
object ObjectsEvent {
  
  @scala.inline
  def RemoveChannelMetadataEvent(channel: String, message: DataIdEvent, timetoken: Double): typingsSlinky.pubnub.mod.RemoveChannelMetadataEvent = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timetoken = timetoken.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.pubnub.mod.RemoveChannelMetadataEvent]
  }
  
  @scala.inline
  def RemoveMembershipEvent(channel: String, message: DataUuid, timetoken: Double): typingsSlinky.pubnub.mod.RemoveMembershipEvent = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timetoken = timetoken.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.pubnub.mod.RemoveMembershipEvent]
  }
  
  @scala.inline
  def RemoveUUIDMetadataEvent(channel: String, message: DataId, timetoken: Double): typingsSlinky.pubnub.mod.RemoveUUIDMetadataEvent = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timetoken = timetoken.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.pubnub.mod.RemoveUUIDMetadataEvent]
  }
  
  @scala.inline
  def SetChannelMetadataEvent[ChannelCustom /* <: ObjectCustom */](channel: String, message: DataChannelMetadataObject[ChannelCustom], timetoken: Double): typingsSlinky.pubnub.mod.SetChannelMetadataEvent[ChannelCustom] = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timetoken = timetoken.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.pubnub.mod.SetChannelMetadataEvent[ChannelCustom]]
  }
  
  @scala.inline
  def SetMembershipEvent[MembershipCustom /* <: ObjectCustom */](channel: String, message: DataChannel[MembershipCustom], timetoken: Double): typingsSlinky.pubnub.mod.SetMembershipEvent[MembershipCustom] = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timetoken = timetoken.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.pubnub.mod.SetMembershipEvent[MembershipCustom]]
  }
  
  @scala.inline
  def SetUUIDMetadataEvent[UUIDCustom /* <: ObjectCustom */](channel: String, message: DataEventType[UUIDCustom], timetoken: Double): typingsSlinky.pubnub.mod.SetUUIDMetadataEvent[UUIDCustom] = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timetoken = timetoken.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.pubnub.mod.SetUUIDMetadataEvent[UUIDCustom]]
  }
}
