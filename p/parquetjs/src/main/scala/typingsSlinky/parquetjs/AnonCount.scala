package typingsSlinky.parquetjs

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCount extends js.Object {
  var count: Double = js.native
  var dlevels: js.Array[Double] = js.native
  var rlevels: js.Array[Double] = js.native
  var values: js.Array[Buffer] = js.native
}

object AnonCount {
  @scala.inline
  def apply(count: Double, dlevels: js.Array[Double], rlevels: js.Array[Double], values: js.Array[Buffer]): AnonCount = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], dlevels = dlevels.asInstanceOf[js.Any], rlevels = rlevels.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCount]
  }
  @scala.inline
  implicit class AnonCountOps[Self <: AnonCount] (val x: Self) extends AnyVal {
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
    def withDlevels(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dlevels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRlevels(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rlevels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValues(value: js.Array[Buffer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

