package typingsSlinky.intercomDashClient.intercomDashClientMod

import typingsSlinky.intercomDashClient.Anon_Identifier
import typingsSlinky.intercomDashClient.Anon_IdentifierType
import typingsSlinky.intercomDashClient.leadMod.Lead
import typingsSlinky.intercomDashClient.userMod.User
import typingsSlinky.intercomDashClient.visitorMod.Visitor
import typingsSlinky.intercomDashClient.visitorMod.VisitorIdentifier
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("intercom-client", "Visitors")
@js.native
class Visitors () extends js.Object {
  def convert(params: Anon_Identifier): js.Promise[ApiResponse[Lead]] = js.native
  def convert(params: Anon_IdentifierType): js.Promise[ApiResponse[User]] = js.native
  def convert(params: Anon_IdentifierType, cb: callback[ApiResponse[User]]): Unit = js.native
  def convert(params: Anon_Identifier, cb: callback[ApiResponse[Lead]]): Unit = js.native
  def delete(id: String): js.Promise[ApiResponse[Visitor]] = js.native
  def delete(id: String, cb: callback[ApiResponse[Visitor]]): Unit = js.native
  def find(identifier: VisitorIdentifier): js.Promise[ApiResponse[Visitor]] = js.native
  def find(identifier: VisitorIdentifier, cb: callback[ApiResponse[Visitor]]): Unit = js.native
  def update(visitor: VisitorIdentifier with Partial[Visitor]): js.Promise[ApiResponse[Visitor]] = js.native
  def update(visitor: VisitorIdentifier with Partial[Visitor], cb: callback[ApiResponse[Visitor]]): Unit = js.native
}

