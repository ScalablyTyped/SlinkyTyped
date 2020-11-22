package typingsSlinky.helmet.mod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.helmet.anon.ReadonlyXDnsPrefetchContr
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("helmet/dist", "dnsPrefetchControl")
@js.native
object dnsPrefetchControl
  extends TopLevel[
      js.Function1[
        /* options */ js.UndefOr[ReadonlyXDnsPrefetchContr], 
        js.Function3[
          /* _req */ IncomingMessage, 
          /* res */ ServerResponse, 
          /* next */ js.Function0[Unit], 
          Unit
        ]
      ]
    ]
