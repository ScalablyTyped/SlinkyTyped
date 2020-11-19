package typingsSlinky.ds18b20

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type SensorsCallback = js.Function2[/* err */ js.Error | scala.Null, /* ids */ js.Array[java.lang.String], scala.Unit]
  
  type TemperatureCallback = js.Function2[/* err */ js.Error | scala.Null, /* value */ scala.Double, scala.Unit]
}
