package typingsSlinky.helmet.mod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.helmet.anon.ReadonlyStrictTransportSe
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("helmet/dist", "hsts")
@js.native
object hsts
  extends TopLevel[
      js.Function1[
        /* options */ js.UndefOr[ReadonlyStrictTransportSe], 
        js.Function3[
          /* _req */ IncomingMessage, 
          /* res */ ServerResponse, 
          /* next */ js.Function0[Unit], 
          Unit
        ]
      ]
    ]
