package typingsSlinky.browserSync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Hash[T] = org.scalablytyped.runtime.StringDictionary[T]
  
  type MiddlewareHandler = js.Function3[
    /* req */ typingsSlinky.node.httpMod.IncomingMessage, 
    /* res */ typingsSlinky.node.httpMod.ServerResponse, 
    /* next */ js.Function0[scala.Unit], 
    js.Any
  ]
  
  type ProxyResponseMiddleware = js.Function3[
    /* proxyRes */ typingsSlinky.node.httpMod.ServerResponse | typingsSlinky.node.httpMod.IncomingMessage, 
    /* res */ typingsSlinky.node.httpMod.ServerResponse, 
    /* req */ typingsSlinky.node.httpMod.IncomingMessage, 
    scala.Unit
  ]
}
