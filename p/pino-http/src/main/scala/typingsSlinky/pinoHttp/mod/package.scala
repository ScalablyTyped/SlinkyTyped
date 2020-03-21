package typingsSlinky.pinoHttp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type GenReqId = js.Function1[
    /* req */ typingsSlinky.node.httpMod.IncomingMessage, 
    typingsSlinky.pinoHttp.mod.ReqId
  ]
  type HttpLogger = js.Function2[
    /* req */ typingsSlinky.node.httpMod.IncomingMessage, 
    /* res */ typingsSlinky.node.httpMod.ServerResponse, 
    scala.Unit
  ]
  type ReqId = scala.Double | java.lang.String | js.Object
}
