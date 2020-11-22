package typingsSlinky.lightMyRequest.mod

import typingsSlinky.node.httpMod.IncomingHttpHeaders
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Request extends Readable {
  
  // @deprecated
  var connection: js.Object = js.native
  
  var headers: IncomingHttpHeaders = js.native
  
  var httpVersion: String = js.native
  
  var method: HTTPMethods = js.native
  
  def prepare(next: js.Function0[Unit]): Unit = js.native
  
  var url: String = js.native
}
