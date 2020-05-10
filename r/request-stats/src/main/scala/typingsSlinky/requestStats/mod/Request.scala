package typingsSlinky.requestStats.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request extends js.Object {
  /**
    * Returns a progress object if called while a HTTP request is in progress.
    * If called multiple times, the returned progress object will contain the delta of the previous
    * call to `.progress()`.
    */
  def progress(): Progress = js.native
}

object Request {
  @scala.inline
  def apply(progress: () => Progress): Request = {
    val __obj = js.Dynamic.literal(progress = js.Any.fromFunction0(progress))
    __obj.asInstanceOf[Request]
  }
  @scala.inline
  implicit class RequestOps[Self <: Request] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProgress(value: () => Progress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

