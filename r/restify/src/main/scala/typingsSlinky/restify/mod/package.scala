package typingsSlinky.restify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type FindRouteCallback = js.Function3[
    /* err */ js.Error, 
    /* route */ js.UndefOr[typingsSlinky.restify.mod.Route], 
    /* params */ js.UndefOr[js.Any], 
    scala.Unit
  ]
  type Formatter = js.Function3[
    /* req */ typingsSlinky.restify.mod.Request, 
    /* res */ typingsSlinky.restify.mod.Response, 
    /* body */ js.Any, 
    java.lang.String | typingsSlinky.node.Buffer | scala.Null
  ]
  type Formatters_ = org.scalablytyped.runtime.StringDictionary[typingsSlinky.restify.mod.Formatter]
  type Next = js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit]
  type RequestHandler = js.Function3[
    /* req */ typingsSlinky.restify.mod.Request, 
    /* res */ typingsSlinky.restify.mod.Response, 
    /* next */ typingsSlinky.restify.mod.Next, 
    js.Any
  ]
  type RequestHandlerType = typingsSlinky.restify.mod.RequestHandler | js.Array[typingsSlinky.restify.mod.RequestHandler]
}
