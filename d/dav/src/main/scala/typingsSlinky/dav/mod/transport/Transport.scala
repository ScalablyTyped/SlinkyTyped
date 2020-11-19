package typingsSlinky.dav.mod.transport

import typingsSlinky.dav.mod.Credentials
import typingsSlinky.dav.mod.Request_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dav", "transport.Transport")
@js.native
class Transport protected () extends js.Object {
  /**
    * @param credentials user authorization.
    */
  def this(credentials: Credentials) = this()
  
  def send(request: Request_, url: String): js.Promise[_] = js.native
  def send(request: Request_, url: String, options: TransportOptions): js.Promise[_] = js.native
}
