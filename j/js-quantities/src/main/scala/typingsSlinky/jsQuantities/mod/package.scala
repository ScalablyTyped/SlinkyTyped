package typingsSlinky.jsQuantities

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Formatter = js.Function2[/* scalar */ scala.Double, /* unit */ java.lang.String, java.lang.String]
  
  type Source = typingsSlinky.jsQuantities.mod.UnitSource | scala.Double
  
  type UnitSource = typingsSlinky.jsQuantities.mod.Qty | java.lang.String
}
