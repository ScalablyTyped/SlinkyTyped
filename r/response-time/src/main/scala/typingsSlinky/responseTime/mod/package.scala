package typingsSlinky.responseTime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ResponseTimeFunction = js.Function3[
    /* request */ typingsSlinky.node.httpMod.IncomingMessage, 
    /* response */ typingsSlinky.node.httpMod.ServerResponse, 
    /* time */ scala.Double, 
    js.Any
  ]
}
