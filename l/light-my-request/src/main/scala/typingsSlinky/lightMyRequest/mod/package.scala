package typingsSlinky.lightMyRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type CallbackFunc = js.Function2[
    /* err */ js.Error, 
    /* response */ typingsSlinky.lightMyRequest.mod.Response, 
    scala.Unit
  ]
  
  type DispatchFunc = js.Function2[
    /* req */ typingsSlinky.lightMyRequest.mod.Request, 
    /* res */ typingsSlinky.lightMyRequest.mod.Response, 
    scala.Unit
  ]
  
  type InjectPayload = java.lang.String | js.Object | typingsSlinky.node.Buffer | typingsSlinky.node.NodeJS.ReadableStream
}
