package typingsSlinky.nodemailer.libFetchMod

import typingsSlinky.node.httpMod.IncomingHttpHeaders
import typingsSlinky.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WritableResponse extends Writable {
  var headers: IncomingHttpHeaders = js.native
  var statusCode: Double = js.native
}

