package typingsSlinky.arangodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Foxx {
  type Handler = js.Function2[
    /* req */ typingsSlinky.arangodb.Foxx.Request, 
    /* res */ typingsSlinky.arangodb.Foxx.Response, 
    scala.Unit
  ]
  type Middleware = typingsSlinky.arangodb.Foxx.SimpleMiddleware | typingsSlinky.arangodb.Foxx.DelegateMiddleware
  type NextFunction = js.Function0[scala.Unit]
  type SimpleMiddleware = js.Function3[
    /* req */ typingsSlinky.arangodb.Foxx.Request, 
    /* res */ typingsSlinky.arangodb.Foxx.Response, 
    /* next */ typingsSlinky.arangodb.Foxx.NextFunction, 
    scala.Unit
  ]
}
