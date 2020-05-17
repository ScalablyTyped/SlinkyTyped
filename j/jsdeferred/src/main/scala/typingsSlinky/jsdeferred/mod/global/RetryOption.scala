package typingsSlinky.jsdeferred.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RetryOption extends js.Object {
  @JSName("wait")
  var wait_FRetryOption: Double = js.native
}

object RetryOption {
  @scala.inline
  def apply(wait: Double): RetryOption = {
    val __obj = js.Dynamic.literal(wait = wait.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetryOption]
  }
  @scala.inline
  implicit class RetryOptionOps[Self <: RetryOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWait(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wait")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

