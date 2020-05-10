package typingsSlinky.cassandraDriver.concurrentMod.concurrent

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResultSetGroup extends js.Object {
  var errors: js.Array[js.Error] = js.native
  var resultItems: js.Array[_] = js.native
  var totalExecuted: Double = js.native
}

object ResultSetGroup {
  @scala.inline
  def apply(errors: js.Array[js.Error], resultItems: js.Array[_], totalExecuted: Double): ResultSetGroup = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], resultItems = resultItems.asInstanceOf[js.Any], totalExecuted = totalExecuted.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultSetGroup]
  }
  @scala.inline
  implicit class ResultSetGroupOps[Self <: ResultSetGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrors(value: js.Array[js.Error]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResultItems(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalExecuted(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalExecuted")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

