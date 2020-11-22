package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.directThreadBroadcastMediaOptionsMod.DirectThreadBroadcastPhotoOptions
import typingsSlinky.instagramPrivateApi.directThreadBroadcastMediaOptionsMod.DirectThreadBroadcastPhotoStoryOptions
import typingsSlinky.instagramPrivateApi.directThreadBroadcastMediaOptionsMod.DirectThreadBroadcastVideoOptions
import typingsSlinky.instagramPrivateApi.directThreadBroadcastMediaOptionsMod.DirectThreadBroadcastVideoStoryOptions
import typingsSlinky.instagramPrivateApi.directThreadBroadcastMediaOptionsMod.DirectThreadBroadcastVoiceOptions
import typingsSlinky.instagramPrivateApi.directThreadBroadcastReelOptionsMod.DirectThreadBroadcastReelOptions
import typingsSlinky.instagramPrivateApi.directThreadRepositoryAddUserResponseMod.DirectThreadRepositoryAddUserResponseRootObject
import typingsSlinky.instagramPrivateApi.directThreadRepositoryBroadcastResponseMod.DirectThreadRepositoryBroadcastResponsePayload
import typingsSlinky.instagramPrivateApi.directThreadRepositoryBroadcastResponseMod.DirectThreadRepositoryBroadcastResponseRootObject
import typingsSlinky.instagramPrivateApi.directThreadRepositoryUpdateTitleResponseMod.DirectThreadRepositoryUpdateTitleResponseRootObject
import typingsSlinky.instagramPrivateApi.repositoryMod.Repository
import typingsSlinky.instagramPrivateApi.statusResponseMod.StatusResponse
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("instagram-private-api/dist/entities/direct-thread.entity", JSImport.Namespace)
@js.native
object directThreadEntityMod extends js.Object {
  
  @js.native
  class DirectThreadEntity () extends Repository {
    
    def addUser(userIds: js.Array[Double | String]): js.Promise[DirectThreadRepositoryAddUserResponseRootObject] = js.native
    
    var broadcast: js.Any = js.native
    
    def broadcastLink(link_text: String, link_urls: js.Array[String]): js.Promise[
        DirectThreadRepositoryBroadcastResponseRootObject | DirectThreadRepositoryBroadcastResponsePayload
      ] = js.native
    
    def broadcastPhoto(options: DirectThreadBroadcastPhotoOptions): js.Promise[
        DirectThreadRepositoryBroadcastResponseRootObject | DirectThreadRepositoryBroadcastResponsePayload
      ] = js.native
    
    def broadcastPost(mediaId: String): js.Promise[
        DirectThreadRepositoryBroadcastResponseRootObject | DirectThreadRepositoryBroadcastResponsePayload
      ] = js.native
    
    def broadcastProfile(id: String): js.Promise[
        DirectThreadRepositoryBroadcastResponseRootObject | DirectThreadRepositoryBroadcastResponsePayload
      ] = js.native
    def broadcastProfile(id: Double): js.Promise[
        DirectThreadRepositoryBroadcastResponseRootObject | DirectThreadRepositoryBroadcastResponsePayload
      ] = js.native
    
    def broadcastReel(options: DirectThreadBroadcastReelOptions): js.Promise[
        DirectThreadRepositoryBroadcastResponseRootObject | DirectThreadRepositoryBroadcastResponsePayload
      ] = js.native
    
    def broadcastStory(input: DirectThreadBroadcastPhotoStoryOptions): js.Promise[_] = js.native
    def broadcastStory(input: DirectThreadBroadcastVideoStoryOptions): js.Promise[_] = js.native
    def broadcastStory(input: Buffer): js.Promise[_] = js.native
    
    def broadcastText(text: String): js.Promise[
        DirectThreadRepositoryBroadcastResponseRootObject | DirectThreadRepositoryBroadcastResponsePayload
      ] = js.native
    
    def broadcastUserStory(options: DirectThreadBroadcastReelOptions): js.Promise[
        DirectThreadRepositoryBroadcastResponseRootObject | DirectThreadRepositoryBroadcastResponsePayload
      ] = js.native
    
    def broadcastVideo(options: DirectThreadBroadcastVideoOptions): js.Promise[
        DirectThreadRepositoryBroadcastResponseRootObject | DirectThreadRepositoryBroadcastResponsePayload
      ] = js.native
    
    def broadcastVoice(options: DirectThreadBroadcastVoiceOptions): js.Promise[
        DirectThreadRepositoryBroadcastResponseRootObject | DirectThreadRepositoryBroadcastResponsePayload
      ] = js.native
    
    def deleteItem(itemId: String): js.Promise[StatusResponse] = js.native
    def deleteItem(itemId: Double): js.Promise[StatusResponse] = js.native
    
    def hide(): js.Promise[StatusResponse] = js.native
    
    def leave(): js.Promise[StatusResponse] = js.native
    
    def markItemSeen(threadItemId: String): js.Promise[StatusResponse] = js.native
    
    def mute(): js.Promise[StatusResponse] = js.native
    
    var threadId: String = js.native
    
    def unmute(): js.Promise[StatusResponse] = js.native
    
    def updateTitle(title: String): js.Promise[DirectThreadRepositoryUpdateTitleResponseRootObject] = js.native
    
    var userIds: js.Array[String] = js.native
  }
}
