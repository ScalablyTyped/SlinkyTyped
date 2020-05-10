package typingsSlinky.reduxOptimisticUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOptimistic extends js.Object {
  /**
    * Optimistic information
    */
  var optimistic: AnonId = js.native
}

object AnonOptimistic {
  @scala.inline
  def apply(optimistic: AnonId): AnonOptimistic = {
    val __obj = js.Dynamic.literal(optimistic = optimistic.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOptimistic]
  }
  @scala.inline
  implicit class AnonOptimisticOps[Self <: AnonOptimistic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOptimistic(value: AnonId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimistic")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

