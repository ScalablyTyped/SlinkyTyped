package typingsSlinky.intercomClient.mod

import typingsSlinky.intercomClient.anon.PartialEvent
import typingsSlinky.intercomClient.companyMod.List
import typingsSlinky.intercomClient.eventMod.ListParam
import typingsSlinky.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("intercom-client", "Events")
@js.native
class Events () extends js.Object {
  
  def create(event: PartialEvent): js.Promise[IncomingMessage] = js.native
  def create(event: PartialEvent, cb: callback[IncomingMessage]): Unit = js.native
  
  def listBy(params: ListParam): js.Promise[ApiResponse[List]] = js.native
  def listBy(params: ListParam, cb: callback[ApiResponse[List]]): Unit = js.native
}
