package typingsSlinky.intercomDashClient.intercomDashClientMod

import typingsSlinky.intercomDashClient.companyMod.List
import typingsSlinky.intercomDashClient.eventMod.Event
import typingsSlinky.intercomDashClient.eventMod.ListParam
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("intercom-client", "Events")
@js.native
class Events () extends js.Object {
  def create(event: Partial[Event]): js.Promise[IncomingMessage] = js.native
  def create(event: Partial[Event], cb: callback[IncomingMessage]): Unit = js.native
  def listBy(params: ListParam): js.Promise[ApiResponse[List]] = js.native
  def listBy(params: ListParam, cb: callback[ApiResponse[List]]): Unit = js.native
}

