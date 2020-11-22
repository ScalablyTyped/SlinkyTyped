package typingsSlinky.fastifyCors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type OriginCallback = js.Function2[/* err */ js.Error | scala.Null, /* allow */ scala.Boolean, scala.Unit]
  
  type OriginFunction = js.Function2[
    /* origin */ java.lang.String, 
    /* callback */ typingsSlinky.fastifyCors.mod.OriginCallback, 
    scala.Unit
  ]
  
  type OriginType = java.lang.String | scala.Boolean | js.RegExp
  
  type ValueOrArray[T] = T | typingsSlinky.fastifyCors.mod.ArrayOfValueOrArray[T]
}
