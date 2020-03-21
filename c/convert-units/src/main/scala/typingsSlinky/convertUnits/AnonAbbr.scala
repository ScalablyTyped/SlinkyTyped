package typingsSlinky.convertUnits

import typingsSlinky.convertUnits.mod.measure
import typingsSlinky.convertUnits.mod.system
import typingsSlinky.convertUnits.mod.unit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAbbr[T /* <: unit */] extends js.Object {
  var abbr: T
  var measure: typingsSlinky.convertUnits.mod.measure
  var system: typingsSlinky.convertUnits.mod.system
  var unit: AnonName
}

object AnonAbbr {
  @scala.inline
  def apply[T /* <: unit */](abbr: T, measure: measure, system: system, unit: AnonName): AnonAbbr[T] = {
    val __obj = js.Dynamic.literal(abbr = abbr.asInstanceOf[js.Any], measure = measure.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAbbr[T]]
  }
}

