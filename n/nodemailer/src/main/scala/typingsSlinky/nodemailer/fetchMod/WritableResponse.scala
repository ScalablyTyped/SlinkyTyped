package typingsSlinky.nodemailer.fetchMod

import typingsSlinky.node.httpMod.IncomingHttpHeaders
import typingsSlinky.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WritableResponse extends Writable {
  
  var headers: IncomingHttpHeaders = js.native
  
  var statusCode: Double = js.native
}
