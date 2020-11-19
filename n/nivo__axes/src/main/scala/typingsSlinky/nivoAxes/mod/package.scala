package typingsSlinky.nivoAxes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type GridValues[T /* <: scala.Double | java.lang.String | js.Date */] = scala.Double | typingsSlinky.nivoAxes.mod.GridValuesBuilder[T]
  
  type GridValuesBuilder[T] = js.Array[js.Date | scala.Double | java.lang.String]
  
  type TickFormatter = js.Function1[
    /* value */ scala.Double | java.lang.String | js.Date, 
    java.lang.String | scala.Double
  ]
}
