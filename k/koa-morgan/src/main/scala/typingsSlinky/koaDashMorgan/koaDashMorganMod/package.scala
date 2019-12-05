package typingsSlinky.koaDashMorgan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object koaDashMorganMod {
  import typingsSlinky.node.httpMod.IncomingMessage
  import typingsSlinky.node.httpMod.ServerResponse

  type FormatFn = js.Function3[/* tokens */ TokenIndexer, /* req */ IncomingMessage, /* res */ ServerResponse, String]
  type StreamOptions = typingsSlinky.morgan.morganMod.StreamOptions
  type TokenCallbackFn = js.Function3[
    /* req */ IncomingMessage, 
    /* res */ ServerResponse, 
    /* arg */ js.UndefOr[String | Double | Boolean], 
    String
  ]
  type TokenIndexer = typingsSlinky.morgan.morganMod.TokenIndexer
}
