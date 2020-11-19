package typingsSlinky.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object httpMod {
  
  // outgoing headers allows numbers (as they are converted internally to strings)
  type OutgoingHttpHeaders = typingsSlinky.node.NodeJS.Dict[scala.Double | java.lang.String | js.Array[java.lang.String]]
  
  type RequestListener = js.Function2[
    /* req */ typingsSlinky.node.httpMod.IncomingMessage, 
    /* res */ typingsSlinky.node.httpMod.ServerResponse, 
    scala.Unit
  ]
  
  // although RequestOptions are passed as ClientRequestArgs to ClientRequest directly,
  // create interface RequestOptions would make the naming more clear to developers
  type RequestOptions = typingsSlinky.node.httpMod.ClientRequestArgs
}
