package typingsSlinky.msRest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ServiceCallback[TResult] = js.Function4[
    /* err */ js.Error | typingsSlinky.msRest.mod.ServiceError, 
    /* result */ js.UndefOr[TResult], 
    /* request */ js.UndefOr[typingsSlinky.msRest.mod.WebResource], 
    /* response */ js.UndefOr[typingsSlinky.node.httpMod.IncomingMessage], 
    scala.Unit
  ]
}
