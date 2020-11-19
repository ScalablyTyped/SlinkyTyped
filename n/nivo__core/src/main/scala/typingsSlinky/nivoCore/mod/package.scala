package typingsSlinky.nivoCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Colors = js.Array[java.lang.String] | java.lang.String
  
  type DataFormatter = js.Function1[/* value */ typingsSlinky.nivoCore.mod.DatumValue, java.lang.String | scala.Double]
  
  type DatumValue = java.lang.String | scala.Double | js.Date
  
  type GetColor[T] = js.Function1[/* datum */ T, java.lang.String]
  
  type SvgFillMatcher[T] = js.Function1[/* datum */ T, scala.Boolean]
}
