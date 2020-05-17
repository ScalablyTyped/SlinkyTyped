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
  type NextFunction = js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit]
  type NextHandleFunction = js.Function3[
    /* req */ typingsSlinky.connect.mod.IncomingMessage, 
    /* res */ typingsSlinky.node.httpMod.ServerResponse, 
    /* next */ typingsSlinky.connect.mod.NextFunction, 
    scala.Unit
  ]
  type SimpleHandleFunction = js.Function2[
    /* req */ typingsSlinky.connect.mod.IncomingMessage, 
    /* res */ typingsSlinky.node.httpMod.ServerResponse, 
    scala.Unit
  ]
}
