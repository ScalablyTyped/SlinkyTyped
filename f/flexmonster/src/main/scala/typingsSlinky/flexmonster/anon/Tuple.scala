package typingsSlinky.flexmonster.anon

import typingsSlinky.flexmonster.mod.MeasureObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tuple extends js.Object {
  var measure: MeasureObject = js.native
  var tuple: js.Array[String] = js.native
  var `type`: String = js.native
}

object Tuple {
  @scala.inline
  def apply(measure: MeasureObject, tuple: js.Array[String], `type`: String): Tuple = {
    val __obj = js.Dynamic.literal(measure = measure.asInstanceOf[js.Any], tuple = tuple.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tuple]
  }
  @scala.inline
  implicit class TupleOps[Self <: Tuple] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMeasure(value: MeasureObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTuple(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tuple")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

