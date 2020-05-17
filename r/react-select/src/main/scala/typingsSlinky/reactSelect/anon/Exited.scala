package typingsSlinky.reactSelect.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Exited extends js.Object {
  var exited: js.Any = js.native
  var exiting: js.Any = js.native
}

object Exited {
  @scala.inline
  def apply(exited: js.Any, exiting: js.Any): Exited = {
    val __obj = js.Dynamic.literal(exited = exited.asInstanceOf[js.Any], exiting = exiting.asInstanceOf[js.Any])
    __obj.asInstanceOf[Exited]
  }
  @scala.inline
  implicit class ExitedOps[Self <: Exited] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExited(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exited")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExiting(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exiting")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

