package typingsSlinky.koaMorgan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type FormatFn = js.Function3[
    /* tokens */ typingsSlinky.koaMorgan.mod.TokenIndexer, 
    /* req */ typingsSlinky.node.httpMod.IncomingMessage, 
    /* res */ typingsSlinky.node.httpMod.ServerResponse, 
    java.lang.String
  ]
  type StreamOptions = typingsSlinky.morgan.mod.StreamOptions
  type TokenCallbackFn = js.Function3[
    /* req */ typingsSlinky.node.httpMod.IncomingMessage, 
    /* res */ typingsSlinky.node.httpMod.ServerResponse, 
    /* arg */ js.UndefOr[java.lang.String | scala.Double | scala.Boolean], 
    java.lang.String
  ]
  type TokenIndexer = typingsSlinky.morgan.mod.TokenIndexer
}
