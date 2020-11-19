package typingsSlinky.reactColor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typingsSlinky.reactColor.mod.HSLColor
    - typingsSlinky.reactColor.mod.RGBColor
  */
  type Color = typingsSlinky.reactColor.mod._Color | java.lang.String
  
  type ColorChangeHandler = js.Function2[
    /* color */ typingsSlinky.reactColor.mod.ColorResult, 
    /* event */ typingsSlinky.react.mod.ChangeEvent[org.scalajs.dom.raw.HTMLInputElement], 
    scala.Unit
  ]
}
