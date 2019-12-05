package typingsSlinky.convertDashUnits

import typingsSlinky.convertDashUnits.convertDashUnitsMod.measure
import typingsSlinky.convertDashUnits.convertDashUnitsMod.system
import typingsSlinky.convertDashUnits.convertDashUnitsMod.unit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AbbrMeasure[T /* <: unit */] extends js.Object {
  var abbr: T
  var measure: typingsSlinky.convertDashUnits.convertDashUnitsMod.measure
  var plural: String
  var singular: String
  var system: typingsSlinky.convertDashUnits.convertDashUnitsMod.system
}

object Anon_AbbrMeasure {
  @scala.inline
  def apply[T /* <: unit */](abbr: T, measure: measure, plural: String, singular: String, system: system): Anon_AbbrMeasure[T] = {
    val __obj = js.Dynamic.literal(abbr = abbr.asInstanceOf[js.Any], measure = measure.asInstanceOf[js.Any], plural = plural.asInstanceOf[js.Any], singular = singular.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AbbrMeasure[T]]
  }
}

