package typingsSlinky.nivoPie

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AccessorFunc = js.Function1[/* datum */ typingsSlinky.nivoPie.mod.PieDatum, java.lang.String]
  
  type PieMouseEventHandler[T] = js.Function2[
    /* datum */ typingsSlinky.nivoPie.mod.PieDatum, 
    /* event */ slinky.web.SyntheticMouseEvent[T], 
    scala.Unit
  ]
  
  type ValueFormatter = js.Function1[/* value */ scala.Double, java.lang.String | scala.Double]
}
