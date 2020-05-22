package typingsSlinky.convertUnits.anon

import typingsSlinky.convertUnits.mod.measure
import typingsSlinky.convertUnits.mod.system
import typingsSlinky.convertUnits.mod.unit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Abbr[T /* <: unit */] extends js.Object {
  var abbr: T
  var measure: typingsSlinky.convertUnits.mod.measure
  var system: typingsSlinky.convertUnits.mod.system
  var unit: Name
}

object Abbr {
  @scala.inline
  def apply[T](abbr: T, measure: measure, system: system, unit: Name): Abbr[T] = {
    val __obj = js.Dynamic.literal(abbr = abbr.asInstanceOf[js.Any], measure = measure.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Abbr[T]]
  }
}

