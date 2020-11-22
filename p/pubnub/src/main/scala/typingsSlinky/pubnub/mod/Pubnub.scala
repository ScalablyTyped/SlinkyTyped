package typingsSlinky.pubnub.mod

import typingsSlinky.pubnub.anon.DataMessageAction
import typingsSlinky.pubnub.anon.GetAllChannelMetadata
import typingsSlinky.pubnub.anon.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pubnub extends js.Object {
  
  def addListener(params: ListenerParameters): Unit = js.native
  
  /**
    * deprecated: For objects v2, use objects.setChannelMembers
    */
  def addMembers(params: MembersInputParameters): js.Promise[GetMembersResponse] = js.native
  /**
    * deprecated: For objects v2, use objects.setChannelMembers
    */
  def addMembers(params: MembersInputParameters, callback: Callback[GetMembersResponse]): Unit = js.native
  
  def addMessageAction(params: AddMessageActionParameters): js.Promise[DataMessageAction] = js.native
  // message actions
  def addMessageAction(params: AddMessageActionParameters, callback: Callback[DataMessageAction]): Unit = js.native
  
  var channelGroups: ChannelGroups = js.native
  
  /**
    * deprecated: For objects v2, use objects.setChannelMetadata
    */
  def createSpace(params: SpaceInputParameters): js.Promise[GetSpaceResponse] = js.native
  /**
    * deprecated: For objects v2, use objects.setChannelMetadata
    */
  def createSpace(params: SpaceInputParameters, callback: Callback[GetSpaceResponse]): Unit = js.native
  
  /**
    * deprecated: For objects v2, use objects.setUUIDMetadata
    */
  def createUser(params: UserInputParameters): js.Promise[GetUserResponse] = js.native
  // objects v1
  /**
    * deprecated: For objects v2, use objects.setUUIDMetadata
    */
  def createUser(params: UserInputParameters, callback: Callback[GetUserResponse]): Unit = js.native
  
  def decrypt(data: String): js.Any = js.native
  def decrypt(data: String, customCipherKey: js.UndefOr[scala.Nothing], options: CryptoParameters): js.Any = js.native
  def decrypt(data: String, customCipherKey: String): js.Any = js.native
  def decrypt(data: String, customCipherKey: String, options: CryptoParameters): js.Any = js.native
  def decrypt(data: js.Object): js.Any = js.native
  def decrypt(data: js.Object, customCipherKey: js.UndefOr[scala.Nothing], options: CryptoParameters): js.Any = js.native
  def decrypt(data: js.Object, customCipherKey: String): js.Any = js.native
  def decrypt(data: js.Object, customCipherKey: String, options: CryptoParameters): js.Any = js.native
  
  def deleteFile(params: FileInputParameters): js.Promise[DeleteFileResponse] = js.native
  def deleteFile(params: FileInputParameters, callback: StatusCallback): Unit = js.native
  
  def deleteMessages(params: DeleteMessagesParameters): js.Promise[Unit] = js.native
  def deleteMessages(params: DeleteMessagesParameters, callback: StatusCallback): Unit = js.native
  
  /**
    * deprecated: For objects v2, use objects.removeChannelMetadata
    */
  def deleteSpace(spaceId: String): js.Promise[DeleteSpaceResponse] = js.native
  /**
    * deprecated: For objects v2, use objects.removeChannelMetadata
    */
  def deleteSpace(spaceId: String, callback: Callback[DeleteSpaceResponse]): Unit = js.native
  
  /**
    * deprecated: For objects v2, use objects.removeUUIDMetadata
    */
  def deleteUser(userId: String): js.Promise[DeleteUserResponse] = js.native
  /**
    * deprecated: For objects v2, use objects.removeUUIDMetadata
    */
  def deleteUser(userId: String, callback: Callback[DeleteUserResponse]): Unit = js.native
  
  def downloadFile(params: DownloadFileParameters): js.Promise[_] = js.native
  def downloadFile(params: DownloadFileParameters, callback: Callback[_]): Unit = js.native
  
  // utilities
  def encrypt(data: String): String = js.native
  def encrypt(data: String, customCipherKey: js.UndefOr[scala.Nothing], options: CryptoParameters): String = js.native
  def encrypt(data: String, customCipherKey: String): String = js.native
  def encrypt(data: String, customCipherKey: String, options: CryptoParameters): String = js.native
  
  def fetchMessages(params: FetchMessagesParameters): js.Promise[FetchMessagesResponse] = js.native
  def fetchMessages(params: FetchMessagesParameters, callback: Callback[FetchMessagesResponse]): Unit = js.native
  
  def fire(params: FireParameters): js.Promise[PublishResponse] = js.native
  def fire(params: FireParameters, callback: Callback[PublishResponse]): Unit = js.native
  
  def getFileUrl(params: FileInputParameters): String = js.native
  
  def getFilterExpression(): String = js.native
  
  /**
    * deprecated: For objects v2, use objects.getChannelMembers
    */
  def getMembers(params: GetMembersParameters): js.Promise[GetMembersResponse] = js.native
  /**
    * deprecated: For objects v2, use objects.getChannelMembers
    */
  def getMembers(params: GetMembersParameters, callback: Callback[GetMembersResponse]): Unit = js.native
  
  /**
    * deprecated: For objects v2, use objects.getMemberships
    */
  def getMemberships(params: GetMembershipsParameters): js.Promise[GetMembershipsResponse] = js.native
  /**
    * deprecated: For objects v2, use objects.getMemberships
    */
  def getMemberships(params: GetMembershipsParameters, callback: Callback[GetMembershipsResponse]): Unit = js.native
  
  def getMessageActions(params: GetMessageActionsParameters): js.Promise[GetMessageActionsResponse] = js.native
  def getMessageActions(params: GetMessageActionsParameters, callback: Callback[GetMessageActionsResponse]): Unit = js.native
  
  /**
    * deprecated: For objects v2, use objects.getChannelMetadata
    */
  def getSpace(params: GetSpaceParameters): js.Promise[GetSpaceResponse] = js.native
  /**
    * deprecated: For objects v2, use objects.getChannelMetadata
    */
  def getSpace(params: GetSpaceParameters, callback: Callback[GetSpaceResponse]): Unit = js.native
  
  /**
    * deprecated: For objects v2, use objects.getAllChannelMetadata
    */
  def getSpaces(params: GetObjectsParameters): js.Promise[GetSpacesResponse] = js.native
  /**
    * deprecated: For objects v2, use objects.getAllChannelMetadata
    */
  def getSpaces(params: GetObjectsParameters, callback: Callback[GetSpacesResponse]): Unit = js.native
  
  def getState(params: GetStateParameters): js.Promise[GetStateResponse] = js.native
  def getState(params: GetStateParameters, callback: Callback[GetStateResponse]): Unit = js.native
  
  def getUUID(): String = js.native
  
  /**
    * deprecated: For objects v2, use objects.getUUIDMetadata
    */
  def getUser(params: GetUserParameters): js.Promise[GetUserResponse] = js.native
  /**
    * deprecated: For objects v2, use objects.getUUIDMetadata
    */
  def getUser(params: GetUserParameters, callback: Callback[GetUserResponse]): Unit = js.native
  
  /**
    * deprecated: For objects v2, use objects.getAllUUIDMetadata
    */
  def getUsers(params: GetObjectsParameters): js.Promise[GetUsersResponse] = js.native
  /**
    * deprecated: For objects v2, use objects.getAllUUIDMetadata
    */
  def getUsers(params: GetObjectsParameters, callback: Callback[GetUsersResponse]): Unit = js.native
  
  def grant(params: GrantParameters): js.Promise[Unit] = js.native
  // access manager
  def grant(params: GrantParameters, callback: StatusCallback): Unit = js.native
  
  def hereNow(params: HereNowParameters): js.Promise[HereNowResponse] = js.native
  // presence
  def hereNow(params: HereNowParameters, callback: Callback[HereNowResponse]): Unit = js.native
  
  def history(params: HistoryParameters): js.Promise[HistoryResponse] = js.native
  // history
  def history(params: HistoryParameters, callback: Callback[HistoryResponse]): Unit = js.native
  
  /**
    * deprecated: For objects v2, use objects.setMemberships
    */
  def joinSpaces(params: MembershipsInputParameters): js.Promise[GetMembershipsResponse] = js.native
  /**
    * deprecated: For objects v2, use objects.setMemberships
    */
  def joinSpaces(params: MembershipsInputParameters, callback: Callback[GetMembershipsResponse]): Unit = js.native
  
  /**
    * deprecated: For objects v2, use objects.removeMemberships
    */
  def leaveSpaces(params: LeaveSpacesParameters): js.Promise[GetMembershipsResponse] = js.native
  /**
    * deprecated: For objects v2, use objects.removeMemberships
    */
  def leaveSpaces(params: LeaveSpacesParameters, callback: Callback[GetMembershipsResponse]): Unit = js.native
  
  def listFiles(params: ListFilesParameters): js.Promise[ListFilesResponse] = js.native
  // files
  def listFiles(params: ListFilesParameters, callback: Callback[ListFilesResponse]): Unit = js.native
  
  def messageCounts(params: MessageCountsParameters): js.Promise[MessageCountsResponse] = js.native
  def messageCounts(params: MessageCountsParameters, callback: Callback[MessageCountsResponse]): Unit = js.native
  
  // objects v2
  var objects: GetAllChannelMetadata = js.native
  
  def publish(params: PublishParameters): js.Promise[PublishResponse] = js.native
  // publish
  def publish(params: PublishParameters, callback: Callback[PublishResponse]): Unit = js.native
  
  def publishFile(params: PublishFileParameters): js.Promise[PublishFileResponse] = js.native
  def publishFile(params: PublishFileParameters, callback: Callback[PublishFileResponse]): Unit = js.native
  
  var push: Push = js.native
  
  def reconnect(): Unit = js.native
  
  def removeListener(params: ListenerParameters): Unit = js.native
  
  /**
    * deprecated: For objects v2, use objects.removeChannelMembers
    */
  def removeMembers(params: RemoveMembersParameters): js.Promise[GetMembersResponse] = js.native
  /**
    * deprecated: For objects v2, use objects.removeChannelMembers
    */
  def removeMembers(params: RemoveMembersParameters, callback: Callback[GetMembersResponse]): Unit = js.native
  
  def removeMessageAction(params: RemoveMessageActionParameters): js.Promise[`0`] = js.native
  def removeMessageAction(params: RemoveMessageActionParameters, callback: Callback[`0`]): Unit = js.native
  
  def sendFile(params: SendFileParameters): js.Promise[SendFileResponse] = js.native
  def sendFile(params: SendFileParameters, callback: Callback[SendFileResponse]): Unit = js.native
  
  def setAuthKey(authKey: String): Unit = js.native
  
  def setFilterExpression(filterExpression: String): Unit = js.native
  
  def setState(params: SetStateParameters): js.Promise[SetStateResponse] = js.native
  def setState(params: SetStateParameters, callback: Callback[SetStateResponse]): Unit = js.native
  
  def setUUID(uuid: String): Unit = js.native
  
  def signal(params: SignalParameters): js.Promise[SignalResponse] = js.native
  def signal(params: SignalParameters, callback: Callback[SignalResponse]): Unit = js.native
  
  def stop(): Unit = js.native
  
  // subscriptions
  def subscribe(params: SubscribeParameters): Unit = js.native
  
  def time(): js.Promise[FetchTimeResponse] = js.native
  def time(callback: Callback[FetchTimeResponse]): Unit = js.native
  
  def unsubscribe(params: UnsubscribeParameters): Unit = js.native
  
  def unsubscribeAll(): Unit = js.native
  
  /**
    * deprecated: removed in objects v2
    */
  def updateMembers(params: MembersInputParameters): js.Promise[GetMembersResponse] = js.native
  /**
    * deprecated: removed in objects v2
    */
  def updateMembers(params: MembersInputParameters, callback: Callback[GetMembersResponse]): Unit = js.native
  
  /**
    * deprecated: removed in objects v2
    */
  def updateMemberships(params: MembershipsInputParameters): js.Promise[GetMembershipsResponse] = js.native
  /**
    * deprecated: removed in objects v2
    */
  def updateMemberships(params: MembershipsInputParameters, callback: Callback[GetMembershipsResponse]): Unit = js.native
  
  /**
    * deprecated: For objects v2, use objects.setChannelMetadata
    */
  def updateSpace(params: SpaceInputParameters): js.Promise[GetSpaceResponse] = js.native
  /**
    * deprecated: For objects v2, use objects.setChannelMetadata
    */
  def updateSpace(params: SpaceInputParameters, callback: Callback[GetSpaceResponse]): Unit = js.native
  
  /**
    * deprecated: For objects v2, use objects.setUUIDMetadata
    */
  def updateUser(params: UserInputParameters): js.Promise[GetUserResponse] = js.native
  /**
    * deprecated: For objects v2, use objects.setUUIDMetadata
    */
  def updateUser(params: UserInputParameters, callback: Callback[GetUserResponse]): Unit = js.native
  
  def whereNow(params: WhereNowParameters): js.Promise[WhereNowResponse] = js.native
  def whereNow(params: WhereNowParameters, callback: Callback[WhereNowResponse]): Unit = js.native
}
