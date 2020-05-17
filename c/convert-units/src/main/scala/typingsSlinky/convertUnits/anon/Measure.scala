package typingsSlinky.convertUnits.anon

import typingsSlinky.convertUnits.mod.measure
import typingsSlinky.convertUnits.mod.system
import typingsSlinky.convertUnits.mod.unit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Measure[T /* <: unit */] extends js.Object {
  var abbr: T = js.native
  var measure: typingsSlinky.convertUnits.mod.measure = js.native
  var plural: String = js.native
  var singular: String = js.native
  var system: typingsSlinky.convertUnits.mod.system = js.native
}

object Measure {
  @scala.inline
  def apply[T](abbr: T, measure: measure, plural: String, singular: String, system: system): Measure[T] = {
    val __obj = js.Dynamic.literal(abbr = abbr.asInstanceOf[js.Any], measure = measure.asInstanceOf[js.Any], plural = plural.asInstanceOf[js.Any], singular = singular.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any])
    __obj.asInstanceOf[Measure[T]]
  }
  @scala.inline
  implicit class MeasureOps[Self[t] <: Measure[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withAbbr(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abbr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMeasure(value: measure): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlural(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plural")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSingular(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singular")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSystem(value: system): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("system")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

