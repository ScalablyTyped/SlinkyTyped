package typingsSlinky.connect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ErrorHandleFunction = js.Function4[
    /* err */ js.Any, 
    /* req */ typingsSlinky.connect.mod.IncomingMessage, 
    /* res */ typingsSlinky.node.httpMod.ServerResponse, 
    /* next */ typingsSlinky.connect.mod.NextFunction, 
    scala.Unit
  ]
  type HandleFunction = typingsSlinky.connect.mod.SimpleHandleFunction | typingsSlinky.connect.mod.NextHandleFunction | typingsSlinky.connect.mod.ErrorHandleFunction
  type NextFunction = js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit]
  type NextHandleFunction = js.Function3[
    /* req */ typingsSlinky.connect.mod.IncomingMessage, 
    /* res */ typingsSlinky.node.httpMod.ServerResponse, 
    /* next */ typingsSlinky.connect.mod.NextFunction, 
    scala.Unit
  ]
  type ServerHandle = typingsSlinky.connect.mod.HandleFunction | typingsSlinky.node.httpMod.Server
  type SimpleHandleFunction = js.Function2[
    /* req */ typingsSlinky.connect.mod.IncomingMessage, 
    /* res */ typingsSlinky.node.httpMod.ServerResponse, 
    scala.Unit
  ]
}
