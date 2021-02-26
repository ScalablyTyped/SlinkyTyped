package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.clientMod.IgApiClient
import typingsSlinky.instagramPrivateApi.entityMod.Entity
import typingsSlinky.instagramPrivateApi.friendshipRepositoryChangeResponseMod.FriendshipRepositoryChangeResponseFriendshipStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object profileEntityMod {
  
  @JSImport("instagram-private-api/dist/entities/profile.entity", "ProfileEntity")
  @js.native
  class ProfileEntity protected () extends Entity {
    def this(client: IgApiClient) = this()
    
    def checkFollow(): js.Promise[FriendshipRepositoryChangeResponseFriendshipStatus] = js.native
    
    def checkUnfollow(): js.Promise[FriendshipRepositoryChangeResponseFriendshipStatus] = js.native
    
    var pk: String | Double = js.native
  }
}
