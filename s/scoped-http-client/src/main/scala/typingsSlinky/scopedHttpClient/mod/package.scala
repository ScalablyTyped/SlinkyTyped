package typingsSlinky.scopedHttpClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type RequestCallback = js.Function2[/* err */ js.Any, /* request */ typingsSlinky.node.httpMod.ClientRequest, scala.Unit]
  
  type ResponseCallback = js.Function1[
    /* cb */ js.UndefOr[
      js.Function3[
        /* err */ js.Any, 
        /* response */ typingsSlinky.node.httpMod.IncomingMessage, 
        /* body */ java.lang.String, 
        scala.Unit
      ]
    ], 
    typingsSlinky.scopedHttpClient.mod.ScopedClient
  ]
  
  type ScopeCallback = js.Function1[/* scoped */ typingsSlinky.scopedHttpClient.mod.ScopedClient, scala.Unit]
}
