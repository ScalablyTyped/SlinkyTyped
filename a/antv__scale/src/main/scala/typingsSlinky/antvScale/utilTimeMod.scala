package typingsSlinky.antvScale

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/scale/lib/util/time", JSImport.Namespace)
@js.native
object utilTimeMod extends js.Object {
  
  val DAY: Double = js.native
  
  val HOUR: Double = js.native
  
  val MINUTE: Double = js.native
  
  val MONTH: Double = js.native
  
  val SECOND: /* 1000 */ Double = js.native
  
  val YEAR: Double = js.native
  
  def getTickInterval(min: Double, max: Double, tickCount: Double): Interval = js.native
  
  def timeFormat(time: js.Any, mask: js.Any): String = js.native
  
  def toTimeStamp(value: js.Any): Double = js.native
  
  type Interval = js.Tuple2[String, Double]
}
