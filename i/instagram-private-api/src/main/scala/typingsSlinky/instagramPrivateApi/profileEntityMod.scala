package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.friendshipRepositoryChangeResponseMod.FriendshipRepositoryChangeResponseFriendshipStatus
import typingsSlinky.instagramPrivateApi.repositoryMod.Repository
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/entities/profile.entity", JSImport.Namespace)
@js.native
object profileEntityMod extends js.Object {
  @js.native
  class ProfileEntity () extends Repository {
    var pk: String | Double = js.native
    def checkFollow(): js.Promise[FriendshipRepositoryChangeResponseFriendshipStatus] = js.native
    def checkUnfollow(): js.Promise[FriendshipRepositoryChangeResponseFriendshipStatus] = js.native
  }
  
}

