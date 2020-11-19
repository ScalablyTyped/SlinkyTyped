package typingsSlinky.httpProxyMiddleware

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Filter = js.Function2[
    /* pathname */ java.lang.String, 
    /* req */ typingsSlinky.node.httpMod.IncomingMessage, 
    scala.Boolean
  ]
  
  type Logger = js.Function1[/* repeated */ js.Any, scala.Unit]
  
  type Proxy = typingsSlinky.connect.mod.NextHandleFunction
}
