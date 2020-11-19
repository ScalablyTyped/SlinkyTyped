package typingsSlinky.colorRgba

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typingsSlinky.colorRgba.mod.RGBTuple
    - typingsSlinky.colorRgba.mod.RGBColor
    - typingsSlinky.colorRgba.mod.RGBKeyedColor
    - typingsSlinky.colorRgba.mod.HSL
  */
  type ColorValue = typingsSlinky.colorRgba.mod._ColorValue | java.lang.String | typingsSlinky.colorRgba.mod.RGBTuple
  
  type RGBTuple = js.Tuple3[scala.Double, scala.Double, scala.Double]
}
