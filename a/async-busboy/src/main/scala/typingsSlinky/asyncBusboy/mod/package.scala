package typingsSlinky.asyncBusboy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AsyncBusboy = js.Function2[
    /* req */ typingsSlinky.node.httpMod.IncomingMessage, 
    /* options */ js.UndefOr[typingsSlinky.asyncBusboy.mod.Options], 
    js.Promise[typingsSlinky.asyncBusboy.anon.Fields]
  ]
}
