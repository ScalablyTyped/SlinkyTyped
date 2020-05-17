package typingsSlinky.reduxOptimisticUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Optimistic extends js.Object {
  /**
    * Optimistic information
    */
  var optimistic: Id = js.native
}

object Optimistic {
  @scala.inline
  def apply(optimistic: Id): Optimistic = {
    val __obj = js.Dynamic.literal(optimistic = optimistic.asInstanceOf[js.Any])
    __obj.asInstanceOf[Optimistic]
  }
  @scala.inline
  implicit class OptimisticOps[Self <: Optimistic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOptimistic(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimistic")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

