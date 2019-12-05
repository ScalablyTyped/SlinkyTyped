package typingsSlinky.intercomDashClient.intercomDashClientMod

import typingsSlinky.intercomDashClient.Anon_IdNumber
import typingsSlinky.intercomDashClient.Anon_Segmentid
import typingsSlinky.intercomDashClient.scrollMod.Scroll
import typingsSlinky.intercomDashClient.userMod.CreateUpdateUser
import typingsSlinky.intercomDashClient.userMod.List
import typingsSlinky.intercomDashClient.userMod.User
import typingsSlinky.intercomDashClient.userMod.UserIdentifier
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("intercom-client", "Users")
@js.native
class Users () extends js.Object {
  var scroll: Scroll[User] = js.native
  def archive(identifier: UserIdentifier): js.Promise[ApiResponse[User]] = js.native
  def archive(identifier: UserIdentifier, cb: callback[ApiResponse[User]]): Unit = js.native
  def create(user: Partial[CreateUpdateUser]): js.Promise[ApiResponse[User]] = js.native
  def create(user: Partial[CreateUpdateUser], cb: callback[ApiResponse[User]]): Unit = js.native
  def find(identifier: UserIdentifier): js.Promise[ApiResponse[User]] = js.native
  def find(identifier: UserIdentifier, cb: callback[ApiResponse[User]]): Unit = js.native
  def list(): js.Promise[ApiResponse[List]] = js.native
  def list(cb: callback[ApiResponse[List]]): Unit = js.native
  def listBy(params: Anon_Segmentid): js.Promise[ApiResponse[List]] = js.native
  def listBy(params: Anon_Segmentid, cb: callback[ApiResponse[List]]): Unit = js.native
  def requestPermanentDeletion(id: String): js.Promise[Anon_IdNumber] = js.native
  def requestPermanentDeletion(id: String, cb: callback[Anon_IdNumber]): Unit = js.native
  def requestPermanentDeletionByParams(identifier: UserIdentifier): js.Promise[Anon_IdNumber] = js.native
  def requestPermanentDeletionByParams(identifier: UserIdentifier, cb: callback[Anon_IdNumber]): Unit = js.native
  def update(user: UserIdentifier with Partial[CreateUpdateUser]): js.Promise[ApiResponse[User]] = js.native
  def update(user: UserIdentifier with Partial[CreateUpdateUser], cb: callback[ApiResponse[User]]): Unit = js.native
}

