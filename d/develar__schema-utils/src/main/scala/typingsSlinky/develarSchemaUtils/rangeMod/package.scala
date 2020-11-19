package typingsSlinky.develarSchemaUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object rangeMod {
  
  type RangeValue = js.Tuple2[scala.Double, scala.Boolean]
  
  type RangeValueCallback = js.Function1[/* rangeValue */ js.Tuple2[scala.Double, scala.Boolean], scala.Boolean]
}
