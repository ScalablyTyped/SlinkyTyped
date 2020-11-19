package typingsSlinky.intercomClient.mod

import typingsSlinky.intercomClient.anon.IdNumber
import typingsSlinky.intercomClient.anon.PartialCreateUpdateUser
import typingsSlinky.intercomClient.anon.Segmentid
import typingsSlinky.intercomClient.scrollMod.Scroll
import typingsSlinky.intercomClient.userMod.List
import typingsSlinky.intercomClient.userMod.User
import typingsSlinky.intercomClient.userMod.UserEmailIdentifier
import typingsSlinky.intercomClient.userMod.UserIdIdentifier
import typingsSlinky.intercomClient.userMod.UserIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("intercom-client", "Users")
@js.native
class Users () extends js.Object {
  
  def archive(identifier: UserIdentifier): js.Promise[ApiResponse[User]] = js.native
  def archive(identifier: UserIdentifier, cb: callback[ApiResponse[User]]): Unit = js.native
  
  def create(user: PartialCreateUpdateUser): js.Promise[ApiResponse[User]] = js.native
  def create(user: PartialCreateUpdateUser, cb: callback[ApiResponse[User]]): Unit = js.native
  
  def find(identifier: UserEmailIdentifier): js.Promise[ApiResponse[List]] = js.native
  def find(identifier: UserEmailIdentifier, cb: callback[ApiResponse[List]]): Unit = js.native
  def find(identifier: UserIdIdentifier): js.Promise[ApiResponse[User]] = js.native
  def find(identifier: UserIdIdentifier, cb: callback[ApiResponse[User]]): Unit = js.native
  def find(identifier: UserIdentifier): js.Promise[ApiResponse[User | List]] = js.native
  def find(identifier: UserIdentifier, cb: callback[ApiResponse[User | List]]): Unit = js.native
  
  def list(): js.Promise[ApiResponse[List]] = js.native
  def list(cb: callback[ApiResponse[List]]): Unit = js.native
  
  def listBy(params: Segmentid): js.Promise[ApiResponse[List]] = js.native
  def listBy(params: Segmentid, cb: callback[ApiResponse[List]]): Unit = js.native
  
  def requestPermanentDeletion(id: String): js.Promise[IdNumber] = js.native
  def requestPermanentDeletion(id: String, cb: callback[IdNumber]): Unit = js.native
  
  def requestPermanentDeletionByParams(identifier: UserIdentifier): js.Promise[IdNumber] = js.native
  def requestPermanentDeletionByParams(identifier: UserIdentifier, cb: callback[IdNumber]): Unit = js.native
  
  var scroll: Scroll[User] = js.native
  
  def update(user: UserIdentifier with PartialCreateUpdateUser): js.Promise[ApiResponse[User]] = js.native
  def update(user: UserIdentifier with PartialCreateUpdateUser, cb: callback[ApiResponse[User]]): Unit = js.native
}
