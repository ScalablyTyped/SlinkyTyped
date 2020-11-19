package typingsSlinky.pulumiCloud

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object httpServerMod {
  
  type RequestListenerFactory = js.Function0[
    js.Function2[
      /* req */ typingsSlinky.node.httpMod.IncomingMessage, 
      /* res */ typingsSlinky.node.httpMod.ServerResponse, 
      scala.Unit
    ]
  ]
}
