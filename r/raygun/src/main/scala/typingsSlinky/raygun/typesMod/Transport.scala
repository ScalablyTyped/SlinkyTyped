package typingsSlinky.raygun.typesMod

import typingsSlinky.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Transport extends js.Object {
  
  def send(message: String): Unit = js.native
  def send(message: String, callback: Callback[IncomingMessage]): Unit = js.native
}
