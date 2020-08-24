package typingsSlinky.morgan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type FormatFn[Request /* <: typingsSlinky.node.httpMod.IncomingMessage */, Response /* <: typingsSlinky.node.httpMod.ServerResponse */] = js.Function3[
    /* tokens */ typingsSlinky.morgan.mod.TokenIndexer[Request, Response], 
    /* req */ Request, 
    /* res */ Response, 
    js.UndefOr[java.lang.String | scala.Null]
  ]
  type Handler[Request /* <: typingsSlinky.node.httpMod.IncomingMessage */, Response /* <: typingsSlinky.node.httpMod.ServerResponse */] = js.Function3[
    /* req */ Request, 
    /* res */ Response, 
    /* callback */ js.Function1[/* err */ js.UndefOr[js.Error], scala.Unit], 
    scala.Unit
  ]
  type TokenCallbackFn[Request /* <: typingsSlinky.node.httpMod.IncomingMessage */, Response /* <: typingsSlinky.node.httpMod.ServerResponse */] = js.Function3[
    /* req */ Request, 
    /* res */ Response, 
    /* arg */ js.UndefOr[java.lang.String | scala.Double | scala.Boolean], 
    js.UndefOr[java.lang.String]
  ]
  type TokenIndexer[Request /* <: typingsSlinky.node.httpMod.IncomingMessage */, Response /* <: typingsSlinky.node.httpMod.ServerResponse */] = org.scalablytyped.runtime.StringDictionary[typingsSlinky.morgan.mod.TokenCallbackFn[Request, Response]]
}
