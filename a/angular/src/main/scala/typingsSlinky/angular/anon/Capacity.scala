package typingsSlinky.angular.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Capacity extends js.Object {
  var capacity: js.UndefOr[Double] = js.native
}

object Capacity {
  @scala.inline
  def apply(): Capacity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Capacity]
  }
  @scala.inline
  implicit class CapacityOps[Self <: Capacity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCapacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capacity")(js.undefined)
        ret
    }
  }
  
}

