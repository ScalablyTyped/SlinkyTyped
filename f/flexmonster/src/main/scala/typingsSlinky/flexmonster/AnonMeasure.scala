package typingsSlinky.flexmonster

import typingsSlinky.flexmonster.mod.MeasureObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMeasure extends js.Object {
  var measure: js.UndefOr[MeasureObject] = js.native
  var tuple: js.Array[String] = js.native
}

object AnonMeasure {
  @scala.inline
  def apply(tuple: js.Array[String]): AnonMeasure = {
    val __obj = js.Dynamic.literal(tuple = tuple.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMeasure]
  }
  @scala.inline
  implicit class AnonMeasureOps[Self <: AnonMeasure] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTuple(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tuple")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMeasure(value: MeasureObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeasure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measure")(js.undefined)
        ret
    }
  }
  
}

