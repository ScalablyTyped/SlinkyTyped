package typingsSlinky.intercomClient.mod

import typingsSlinky.intercomClient.anon.PartialCreateMessage
import typingsSlinky.intercomClient.messageMod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("intercom-client", "Messages")
@js.native
class Messages () extends js.Object {
  
  def create(message: PartialCreateMessage): js.Promise[ApiResponse[Message]] = js.native
  def create(message: PartialCreateMessage, cb: callback[ApiResponse[Message]]): Unit = js.native
}
