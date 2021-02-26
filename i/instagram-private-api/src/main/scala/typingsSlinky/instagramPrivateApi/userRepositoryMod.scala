package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.clientMod.IgApiClient
import typingsSlinky.instagramPrivateApi.repositoryMod.Repository
import typingsSlinky.instagramPrivateApi.userLookupOptionsMod.UserLookupOptions
import typingsSlinky.instagramPrivateApi.userRepositoryInfoResponseMod.UserRepositoryInfoResponseUser
import typingsSlinky.instagramPrivateApi.userRepositorySearchResponseMod.UserRepositorySearchResponseRootObject
import typingsSlinky.instagramPrivateApi.userRepositorySearchResponseMod.UserRepositorySearchResponseUsersItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object userRepositoryMod {
  
  @JSImport("instagram-private-api/dist/repositories/user.repository", "UserRepository")
  @js.native
  class UserRepository protected () extends Repository {
    def this(client: IgApiClient) = this()
    
    def accountDetails(): js.Promise[_] = js.native
    def accountDetails(id: String): js.Promise[_] = js.native
    def accountDetails(id: Double): js.Promise[_] = js.native
    
    def arlinkDownloadInfo(): js.Promise[_] = js.native
    
    def flagUser(id: String): js.Promise[_] = js.native
    def flagUser(id: Double): js.Promise[_] = js.native
    
    def formerUsernames(): js.Promise[_] = js.native
    def formerUsernames(id: String): js.Promise[_] = js.native
    def formerUsernames(id: Double): js.Promise[_] = js.native
    
    def getIdByUsername(username: String): js.Promise[Double] = js.native
    
    def info(id: String): js.Promise[UserRepositoryInfoResponseUser] = js.native
    def info(id: Double): js.Promise[UserRepositoryInfoResponseUser] = js.native
    
    def lookup(options: UserLookupOptions): js.Promise[_] = js.native
    
    def search(username: String): js.Promise[UserRepositorySearchResponseRootObject] = js.native
    
    def searchExact(username: String): js.Promise[UserRepositorySearchResponseUsersItem] = js.native
    
    def sharedFollowerAccounts(id: String): js.Promise[_] = js.native
    def sharedFollowerAccounts(id: Double): js.Promise[_] = js.native
  }
}
