package typingsSlinky.pinoStdSerializers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type CustomErrorSerializer = js.Function1[
    /* err */ typingsSlinky.pinoStdSerializers.mod.SerializedError, 
    typingsSlinky.std.Record[java.lang.String, js.Any]
  ]
  
  type CustomRequestSerializer = js.Function1[
    /* req */ typingsSlinky.pinoStdSerializers.mod.SerializedRequest, 
    typingsSlinky.std.Record[java.lang.String, js.Any]
  ]
  
  type CustomResponseSerializer = js.Function1[
    /* res */ typingsSlinky.pinoStdSerializers.mod.SerializedResponse, 
    typingsSlinky.std.Record[java.lang.String, js.Any]
  ]
}
