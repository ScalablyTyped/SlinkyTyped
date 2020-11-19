package typingsSlinky.engineIo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AllowRequestFunction = js.Function2[
    /* req */ typingsSlinky.node.httpMod.IncomingMessage, 
    /* fn */ js.Function2[
      /* err */ js.UndefOr[java.lang.String | scala.Null], 
      /* success */ scala.Boolean, 
      scala.Unit
    ], 
    scala.Unit
  ]
  
  type Message = java.lang.String | typingsSlinky.node.Buffer | js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView
}
