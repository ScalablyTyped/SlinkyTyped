package typingsSlinky.minappEnv.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Removed extends js.Object {
  var removed: Double = js.native
}

object Removed {
  @scala.inline
  def apply(removed: Double): Removed = {
    val __obj = js.Dynamic.literal(removed = removed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Removed]
  }
  @scala.inline
  implicit class RemovedOps[Self <: Removed] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRemoved(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removed")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

