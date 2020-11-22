package typingsSlinky.c3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ArrayOrSingle[T /* <: js.Any */] = T | js.Array[T]
  
  type ArrayOrString = typingsSlinky.c3.mod.ArrayOrSingle[java.lang.String]
  
  type AxisName = typingsSlinky.c3.mod.XAxisName | typingsSlinky.c3.mod.YAxisName
  
  type Domain = js.Tuple2[scala.Double, scala.Double]
  
  type ExpandOptions = scala.Boolean | typingsSlinky.c3.anon.`0`
  
  type FormatFunction = js.Function4[
    /* v */ scala.Double | typingsSlinky.c3.anon.ValueOf, 
    /* id */ java.lang.String, 
    /* i */ scala.Double, 
    /* j */ scala.Double, 
    java.lang.String
  ]
  
  type Primitive = java.lang.String | scala.Boolean | scala.Double | js.Date | scala.Null
  
  type PrimitiveArray = js.Array[typingsSlinky.c3.mod.Primitive]
  
  type RedrawOptions = org.scalablytyped.runtime.StringDictionary[scala.Boolean]
  
  type UpdateAndRedrawOptions = org.scalablytyped.runtime.StringDictionary[scala.Boolean]
  
  type XAxisName = typingsSlinky.c3.c3Strings.x
}
