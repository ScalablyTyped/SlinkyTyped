package typingsSlinky.baconjs.retryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RetryContext extends js.Object {
  var error: js.Any = js.native
  var retriesDone: Double = js.native
}

object RetryContext {
  @scala.inline
  def apply(error: js.Any, retriesDone: Double): RetryContext = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], retriesDone = retriesDone.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetryContext]
  }
  @scala.inline
  implicit class RetryContextOps[Self <: RetryContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withError(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRetriesDone(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retriesDone")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

