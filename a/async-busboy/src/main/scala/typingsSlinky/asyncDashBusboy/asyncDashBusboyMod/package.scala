package typingsSlinky.asyncDashBusboy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object asyncDashBusboyMod {
  import typingsSlinky.asyncDashBusboy.Anon_Fields
  import typingsSlinky.node.httpMod.IncomingMessage

  type AsyncBusboy = js.Function2[
    /* req */ IncomingMessage, 
    /* options */ js.UndefOr[Options], 
    js.Promise[Anon_Fields]
  ]
}
