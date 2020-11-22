package typingsSlinky.reactDateRange

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AnyDate = java.lang.String | js.Date
  
  type DateFunc = js.Function1[/* now */ js.Date, typingsSlinky.reactDateRange.mod.AnyDate]
  
  type DateInputType = typingsSlinky.reactDateRange.mod.AnyDate | typingsSlinky.reactDateRange.mod.DateFunc
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactDateRange.mod.Range
    - typingsSlinky.reactDateRange.anon.Selection
    - typingsSlinky.std.Date
  */
  type OnChangeProps = typingsSlinky.reactDateRange.mod._OnChangeProps | js.Date
  
  type SizeType = scala.Double
}
