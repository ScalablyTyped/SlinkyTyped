package typingsSlinky.pinoStdSerializers.mod

import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.pinoStdSerializers.anon.Req
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pino-std-serializers", "mapHttpRequest")
@js.native
object mapHttpRequest extends js.Object {
  def apply(req: IncomingMessage): Req = js.native
}

