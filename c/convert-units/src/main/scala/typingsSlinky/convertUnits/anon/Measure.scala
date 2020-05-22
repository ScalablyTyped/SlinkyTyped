package typingsSlinky.convertUnits.anon

import typingsSlinky.convertUnits.mod.measure
import typingsSlinky.convertUnits.mod.system
import typingsSlinky.convertUnits.mod.unit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Measure[T /* <: unit */] extends js.Object {
  var abbr: T
  var measure: typingsSlinky.convertUnits.mod.measure
  var plural: String
  var singular: String
  var system: typingsSlinky.convertUnits.mod.system
}

object Measure {
  @scala.inline
  def apply[T](abbr: T, measure: measure, plural: String, singular: String, system: system): Measure[T] = {
    val __obj = js.Dynamic.literal(abbr = abbr.asInstanceOf[js.Any], measure = measure.asInstanceOf[js.Any], plural = plural.asInstanceOf[js.Any], singular = singular.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any])
    __obj.asInstanceOf[Measure[T]]
  }
}

