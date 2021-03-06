package typingsSlinky.pubnub

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  /* static member */
  @scala.inline
  def CATEGORIES_ : typingsSlinky.pubnub.mod.Categories = typingsSlinky.pubnub.mod.^.asInstanceOf[js.Dynamic].selectDynamic("CATEGORIES").asInstanceOf[typingsSlinky.pubnub.mod.Categories]
  @scala.inline
  def CATEGORIES__=(x: typingsSlinky.pubnub.mod.Categories): scala.Unit = typingsSlinky.pubnub.mod.^.asInstanceOf[js.Dynamic].updateDynamic("CATEGORIES")(x.asInstanceOf[js.Any])
  
  type Callback[ResponseType] = js.Function2[
    /* status */ typingsSlinky.pubnub.mod.PubnubStatus, 
    /* response */ ResponseType, 
    scala.Unit
  ]
  
  type DeleteObjectResponse = typingsSlinky.pubnub.mod.ObjectsResponse[scala.Null]
  
  type DeleteSpaceResponse = typingsSlinky.pubnub.mod.ObjectsResponse[scala.Null]
  
  type DeleteUserResponse = typingsSlinky.pubnub.mod.ObjectsResponse[scala.Null]
  
  type GetAllChannelMetadataResponse[Custom /* <: typingsSlinky.pubnub.mod.ObjectCustom */] = typingsSlinky.pubnub.mod.PagedObjectsResponse[typingsSlinky.pubnub.mod.ChannelMetadataObject[Custom]]
  
  type GetAllUUIDMetadataResponse[Custom /* <: typingsSlinky.pubnub.mod.ObjectCustom */] = typingsSlinky.pubnub.mod.PagedObjectsResponse[typingsSlinky.pubnub.mod.UUIDMetadataObject[Custom]]
  
  type GetChannelMetadataResponse[Custom /* <: typingsSlinky.pubnub.mod.ObjectCustom */] = typingsSlinky.pubnub.mod.ObjectsResponse[typingsSlinky.pubnub.mod.ChannelMetadataObject[Custom]]
  
  type GetMembersResponse = typingsSlinky.pubnub.mod.PagedObjectsResponse[typingsSlinky.pubnub.mod.ObjectData]
  
  type GetMembershipsResponse = typingsSlinky.pubnub.mod.PagedObjectsResponse[typingsSlinky.pubnub.mod.ObjectData]
  
  type GetSpaceResponse = typingsSlinky.pubnub.mod.ObjectsResponse[typingsSlinky.pubnub.mod.SpaceData]
  
  type GetSpacesResponse = typingsSlinky.pubnub.mod.PagedObjectsResponse[typingsSlinky.pubnub.mod.SpaceData]
  
  type GetUUIDMetadataResponse[Custom /* <: typingsSlinky.pubnub.mod.ObjectCustom */] = typingsSlinky.pubnub.mod.ObjectsResponse[typingsSlinky.pubnub.mod.UUIDMetadataObject[Custom]]
  
  type GetUserResponse = typingsSlinky.pubnub.mod.ObjectsResponse[typingsSlinky.pubnub.mod.UserData]
  
  type GetUsersResponse = typingsSlinky.pubnub.mod.ObjectsResponse[js.Array[typingsSlinky.pubnub.mod.UserData]]
  
  type ManageChannelMembersResponse[MembershipCustom /* <: typingsSlinky.pubnub.mod.ObjectCustom */, UUIDCustom /* <: typingsSlinky.pubnub.mod.ObjectCustom */] = typingsSlinky.pubnub.mod.PagedObjectsResponse[typingsSlinky.pubnub.mod.UUIDMembershipObject[MembershipCustom, UUIDCustom]]
  
  type ManageMembershipsResponse[MembershipCustom /* <: typingsSlinky.pubnub.mod.ObjectCustom */, ChannelCustom /* <: typingsSlinky.pubnub.mod.ObjectCustom */] = typingsSlinky.pubnub.mod.PagedObjectsResponse[
    typingsSlinky.pubnub.mod.ChannelMembershipObject[MembershipCustom, ChannelCustom]
  ]
  
  // partial but everything can be null (even with strictNullChecks)
  type Nullable[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? T[P] | null}
    */ typingsSlinky.pubnub.pubnubStrings.Nullable with org.scalablytyped.runtime.TopLevel[T]
  
  /* static member */
  @scala.inline
  def OPERATIONS_ : typingsSlinky.pubnub.mod.Operations = typingsSlinky.pubnub.mod.^.asInstanceOf[js.Dynamic].selectDynamic("OPERATIONS").asInstanceOf[typingsSlinky.pubnub.mod.Operations]
  @scala.inline
  def OPERATIONS__=(x: typingsSlinky.pubnub.mod.Operations): scala.Unit = typingsSlinky.pubnub.mod.^.asInstanceOf[js.Dynamic].updateDynamic("OPERATIONS")(x.asInstanceOf[js.Any])
  
  // Objects v2
  // Object
  type ObjectCustom = org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Boolean]
  
  // PubnubData was renamed to MessageEvent, keep old name for backwards compatibility
  type PubnubData = typingsSlinky.pubnub.mod.MessageEvent
  
  type RemoveChannelMetadataResponse = typingsSlinky.pubnub.mod.ObjectsResponse[js.Object]
  
  type RemoveUUIDMetadataResponse = typingsSlinky.pubnub.mod.ObjectsResponse[js.Object]
  
  type SetChannelMetadataResponse[Custom /* <: typingsSlinky.pubnub.mod.ObjectCustom */] = typingsSlinky.pubnub.mod.ObjectsResponse[typingsSlinky.pubnub.mod.ChannelMetadataObject[Custom]]
  
  type SetUUIDMetadataResponse[Custom /* <: typingsSlinky.pubnub.mod.ObjectCustom */] = typingsSlinky.pubnub.mod.ObjectsResponse[typingsSlinky.pubnub.mod.UUIDMetadataObject[Custom]]
  
  type StatusCallback = js.Function1[/* status */ typingsSlinky.pubnub.mod.PubnubStatus, scala.Unit]
  
  /* static member */
  @scala.inline
  def generateUUID(): java.lang.String = typingsSlinky.pubnub.mod.^.asInstanceOf[js.Dynamic].applyDynamic("generateUUID")().asInstanceOf[java.lang.String]
  
  /* static member */
  @scala.inline
  def notificationPayload(title: java.lang.String, body: java.lang.String): typingsSlinky.pubnub.mod.NotificationsPayload = (typingsSlinky.pubnub.mod.^.asInstanceOf[js.Dynamic].applyDynamic("notificationPayload")(title.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.pubnub.mod.NotificationsPayload]
}
