package typingsSlinky.pinoDashHttp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pinoDashHttpMod {
  import typingsSlinky.node.httpMod.IncomingMessage
  import typingsSlinky.node.httpMod.ServerResponse

  type GenReqId = js.Function1[/* req */ IncomingMessage, ReqId]
  type HttpLogger = js.Function2[/* req */ IncomingMessage, /* res */ ServerResponse, Unit]
  type ReqId = Double | String | js.Object
}
