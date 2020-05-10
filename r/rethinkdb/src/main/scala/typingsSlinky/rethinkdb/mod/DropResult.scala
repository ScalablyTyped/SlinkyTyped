package typingsSlinky.rethinkdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropResult extends js.Object {
  var dropped: Double = js.native
}

object DropResult {
  @scala.inline
  def apply(dropped: Double): DropResult = {
    val __obj = js.Dynamic.literal(dropped = dropped.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropResult]
  }
  @scala.inline
  implicit class DropResultOps[Self <: DropResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDropped(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropped")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

