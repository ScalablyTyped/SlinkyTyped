package typingsSlinky.pubnub.anon

import typingsSlinky.pubnub.mod.Callback
import typingsSlinky.pubnub.mod.GetAllChannelMetadataResponse
import typingsSlinky.pubnub.mod.GetAllMetadataParameters
import typingsSlinky.pubnub.mod.GetAllUUIDMetadataResponse
import typingsSlinky.pubnub.mod.GetChannelMembersParameters
import typingsSlinky.pubnub.mod.GetChannelMetadataParameters
import typingsSlinky.pubnub.mod.GetChannelMetadataResponse
import typingsSlinky.pubnub.mod.GetMembershipsParametersv2
import typingsSlinky.pubnub.mod.GetUUIDMetadataParameters
import typingsSlinky.pubnub.mod.GetUUIDMetadataResponse
import typingsSlinky.pubnub.mod.ManageChannelMembersResponse
import typingsSlinky.pubnub.mod.ManageMembershipsResponse
import typingsSlinky.pubnub.mod.ObjectCustom
import typingsSlinky.pubnub.mod.RemoveChannelMembersParameters
import typingsSlinky.pubnub.mod.RemoveChannelMetadataParameters
import typingsSlinky.pubnub.mod.RemoveChannelMetadataResponse
import typingsSlinky.pubnub.mod.RemoveMembershipsParameters
import typingsSlinky.pubnub.mod.RemoveUUIDMetadataParameters
import typingsSlinky.pubnub.mod.RemoveUUIDMetadataResponse
import typingsSlinky.pubnub.mod.SetChannelMembersParameters
import typingsSlinky.pubnub.mod.SetChannelMetadataParameters
import typingsSlinky.pubnub.mod.SetChannelMetadataResponse
import typingsSlinky.pubnub.mod.SetMembershipsParameters
import typingsSlinky.pubnub.mod.SetUUIDMetadataParameters
import typingsSlinky.pubnub.mod.SetUUIDMetadataResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAllChannelMetadata extends StObject {
  
  def getAllChannelMetadata[Custom /* <: ObjectCustom */](): js.Promise[GetAllChannelMetadataResponse[Custom]] = js.native
  def getAllChannelMetadata[Custom /* <: ObjectCustom */](callback: Callback[GetAllChannelMetadataResponse[Custom]]): Unit = js.native
  def getAllChannelMetadata[Custom /* <: ObjectCustom */](params: GetAllMetadataParameters): js.Promise[GetAllChannelMetadataResponse[Custom]] = js.native
  def getAllChannelMetadata[Custom /* <: ObjectCustom */](params: GetAllMetadataParameters, callback: Callback[GetAllChannelMetadataResponse[Custom]]): Unit = js.native
  
  def getAllUUIDMetadata[Custom /* <: ObjectCustom */](): js.Promise[GetAllUUIDMetadataResponse[Custom]] = js.native
  def getAllUUIDMetadata[Custom /* <: ObjectCustom */](callback: Callback[GetAllUUIDMetadataResponse[Custom]]): Unit = js.native
  def getAllUUIDMetadata[Custom /* <: ObjectCustom */](params: GetAllMetadataParameters): js.Promise[GetAllUUIDMetadataResponse[Custom]] = js.native
  def getAllUUIDMetadata[Custom /* <: ObjectCustom */](params: GetAllMetadataParameters, callback: Callback[GetAllUUIDMetadataResponse[Custom]]): Unit = js.native
  
  def getChannelMembers[MembershipCustom /* <: ObjectCustom */, UUIDCustom /* <: ObjectCustom */](params: GetChannelMembersParameters): js.Promise[ManageChannelMembersResponse[MembershipCustom, UUIDCustom]] = js.native
  def getChannelMembers[MembershipCustom /* <: ObjectCustom */, UUIDCustom /* <: ObjectCustom */](
    params: GetChannelMembersParameters,
    callback: Callback[ManageChannelMembersResponse[MembershipCustom, UUIDCustom]]
  ): Unit = js.native
  
  def getChannelMetadata[Custom /* <: ObjectCustom */](params: GetChannelMetadataParameters): js.Promise[GetChannelMetadataResponse[Custom]] = js.native
  def getChannelMetadata[Custom /* <: ObjectCustom */](params: GetChannelMetadataParameters, callback: Callback[GetChannelMetadataResponse[Custom]]): Unit = js.native
  
  def getMemberships[MembershipCustom /* <: ObjectCustom */, ChannelCustom /* <: ObjectCustom */](): js.Promise[ManageMembershipsResponse[MembershipCustom, ChannelCustom]] = js.native
  // Memberships
  def getMemberships[MembershipCustom /* <: ObjectCustom */, ChannelCustom /* <: ObjectCustom */](callback: Callback[ManageMembershipsResponse[MembershipCustom, ChannelCustom]]): Unit = js.native
  def getMemberships[MembershipCustom /* <: ObjectCustom */, ChannelCustom /* <: ObjectCustom */](params: GetMembershipsParametersv2): js.Promise[ManageMembershipsResponse[MembershipCustom, ChannelCustom]] = js.native
  def getMemberships[MembershipCustom /* <: ObjectCustom */, ChannelCustom /* <: ObjectCustom */](
    params: GetMembershipsParametersv2,
    callback: Callback[ManageMembershipsResponse[MembershipCustom, ChannelCustom]]
  ): Unit = js.native
  
  def getUUIDMetadata[Custom /* <: ObjectCustom */](): js.Promise[GetUUIDMetadataResponse[Custom]] = js.native
  def getUUIDMetadata[Custom /* <: ObjectCustom */](callback: Callback[GetUUIDMetadataResponse[Custom]]): Unit = js.native
  def getUUIDMetadata[Custom /* <: ObjectCustom */](params: GetUUIDMetadataParameters): js.Promise[GetUUIDMetadataResponse[Custom]] = js.native
  def getUUIDMetadata[Custom /* <: ObjectCustom */](params: GetUUIDMetadataParameters, callback: Callback[GetUUIDMetadataResponse[Custom]]): Unit = js.native
  
  def removeChannelMembers[MembershipCustom /* <: ObjectCustom */, UUIDCustom /* <: ObjectCustom */](params: RemoveChannelMembersParameters): js.Promise[ManageChannelMembersResponse[MembershipCustom, UUIDCustom]] = js.native
  def removeChannelMembers[MembershipCustom /* <: ObjectCustom */, UUIDCustom /* <: ObjectCustom */](
    params: RemoveChannelMembersParameters,
    callback: Callback[ManageChannelMembersResponse[MembershipCustom, UUIDCustom]]
  ): Unit = js.native
  
  def removeChannelMetadata(params: RemoveChannelMetadataParameters): js.Promise[RemoveChannelMetadataResponse] = js.native
  def removeChannelMetadata(params: RemoveChannelMetadataParameters, callback: Callback[RemoveChannelMetadataResponse]): Unit = js.native
  
  def removeMemberships[MembershipCustom /* <: ObjectCustom */, ChannelCustom /* <: ObjectCustom */](params: RemoveMembershipsParameters): js.Promise[ManageMembershipsResponse[MembershipCustom, ChannelCustom]] = js.native
  def removeMemberships[MembershipCustom /* <: ObjectCustom */, ChannelCustom /* <: ObjectCustom */](
    params: RemoveMembershipsParameters,
    callback: Callback[ManageMembershipsResponse[MembershipCustom, ChannelCustom]]
  ): Unit = js.native
  
  def removeUUIDMetadata(): js.Promise[RemoveUUIDMetadataResponse] = js.native
  def removeUUIDMetadata(callback: Callback[RemoveUUIDMetadataResponse]): Unit = js.native
  def removeUUIDMetadata(params: RemoveUUIDMetadataParameters): js.Promise[RemoveUUIDMetadataResponse] = js.native
  def removeUUIDMetadata(params: RemoveUUIDMetadataParameters, callback: Callback[RemoveUUIDMetadataResponse]): Unit = js.native
  
  def setChannelMembers[MembershipCustom /* <: ObjectCustom */, UUIDCustom /* <: ObjectCustom */](params: SetChannelMembersParameters[MembershipCustom]): js.Promise[ManageChannelMembersResponse[MembershipCustom, UUIDCustom]] = js.native
  def setChannelMembers[MembershipCustom /* <: ObjectCustom */, UUIDCustom /* <: ObjectCustom */](
    params: SetChannelMembersParameters[MembershipCustom],
    callback: Callback[ManageChannelMembersResponse[MembershipCustom, UUIDCustom]]
  ): Unit = js.native
  
  def setChannelMetadata[Custom /* <: ObjectCustom */](params: SetChannelMetadataParameters[Custom]): js.Promise[SetChannelMetadataResponse[Custom]] = js.native
  // Channel Metadata
  def setChannelMetadata[Custom /* <: ObjectCustom */](
    params: SetChannelMetadataParameters[Custom],
    callback: Callback[SetChannelMetadataResponse[Custom]]
  ): Unit = js.native
  
  def setMemberships[MembershipCustom /* <: ObjectCustom */, ChannelCustom /* <: ObjectCustom */](params: SetMembershipsParameters[ChannelCustom]): js.Promise[ManageMembershipsResponse[MembershipCustom, ChannelCustom]] = js.native
  def setMemberships[MembershipCustom /* <: ObjectCustom */, ChannelCustom /* <: ObjectCustom */](
    params: SetMembershipsParameters[ChannelCustom],
    callback: Callback[ManageMembershipsResponse[MembershipCustom, ChannelCustom]]
  ): Unit = js.native
  
  def setUUIDMetadata[Custom /* <: ObjectCustom */](params: SetUUIDMetadataParameters[Custom]): js.Promise[SetUUIDMetadataResponse[Custom]] = js.native
  // UUID metadata
  def setUUIDMetadata[Custom /* <: ObjectCustom */](params: SetUUIDMetadataParameters[Custom], callback: Callback[SetUUIDMetadataResponse[Custom]]): Unit = js.native
}
