package typingsSlinky.intercomClient.mod

import typingsSlinky.intercomClient.AnonIdentifier
import typingsSlinky.intercomClient.AnonType
import typingsSlinky.intercomClient.PartialVisitor
import typingsSlinky.intercomClient.leadMod.Lead
import typingsSlinky.intercomClient.userMod.User
import typingsSlinky.intercomClient.visitorMod.Visitor
import typingsSlinky.intercomClient.visitorMod.VisitorIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("intercom-client", "Visitors")
@js.native
class Visitors () extends js.Object {
  def convert(params: AnonIdentifier): js.Promise[ApiResponse[Lead]] = js.native
  def convert(params: AnonIdentifier, cb: callback[ApiResponse[Lead]]): Unit = js.native
  def convert(params: AnonType): js.Promise[ApiResponse[User]] = js.native
  def convert(params: AnonType, cb: callback[ApiResponse[User]]): Unit = js.native
  def delete(id: String): js.Promise[ApiResponse[Visitor]] = js.native
  def delete(id: String, cb: callback[ApiResponse[Visitor]]): Unit = js.native
  def find(identifier: VisitorIdentifier): js.Promise[ApiResponse[Visitor]] = js.native
  def find(identifier: VisitorIdentifier, cb: callback[ApiResponse[Visitor]]): Unit = js.native
  def update(visitor: VisitorIdentifier with PartialVisitor): js.Promise[ApiResponse[Visitor]] = js.native
  def update(visitor: VisitorIdentifier with PartialVisitor, cb: callback[ApiResponse[Visitor]]): Unit = js.native
}

