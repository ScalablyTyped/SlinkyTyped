package typingsSlinky.msDashRest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object msDashRestMod {
  type ServiceCallback[TResult] = js.Function4[
    /* err */ js.Error | ServiceError, 
    /* result */ js.UndefOr[TResult], 
    /* request */ js.UndefOr[WebResource], 
    /* response */ js.UndefOr[typingsSlinky.node.httpMod.IncomingMessage], 
    Unit
  ]
}
