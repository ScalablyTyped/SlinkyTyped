package typingsSlinky.cesium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "DataSourceClock")
@js.native
class DataSourceClock () extends js.Object {
  
  var clockRange: ClockRange = js.native
  
  var clockStep: ClockStep = js.native
  
  def clone(result: DataSourceClock): DataSourceClock = js.native
  
  var currentTime: JulianDate = js.native
  
  var definitionChanged: Event[js.Array[_]] = js.native
  
  def equals(other: DataSourceClock): Boolean = js.native
  
  def getValue(): Clock = js.native
  
  def merge(source: DataSourceClock): DataSourceClock = js.native
  
  var multiplier: Double = js.native
  
  var startTime: JulianDate = js.native
  
  var stopTime: JulianDate = js.native
}
