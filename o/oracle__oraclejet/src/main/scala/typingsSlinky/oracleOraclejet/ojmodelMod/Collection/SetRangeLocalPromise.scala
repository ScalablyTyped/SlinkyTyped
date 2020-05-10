package typingsSlinky.oracleOraclejet.ojmodelMod.Collection

import typingsSlinky.oracleOraclejet.ojmodelMod.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
@js.native
trait SetRangeLocalPromise extends js.Object {
  var count: Double = js.native
  var models: js.Array[Model] = js.native
  var start: Double = js.native
}

object SetRangeLocalPromise {
  @scala.inline
  def apply(count: Double, models: js.Array[Model], start: Double): SetRangeLocalPromise = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], models = models.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetRangeLocalPromise]
  }
  @scala.inline
  implicit class SetRangeLocalPromiseOps[Self <: SetRangeLocalPromise] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModels(value: js.Array[Model]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("models")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

