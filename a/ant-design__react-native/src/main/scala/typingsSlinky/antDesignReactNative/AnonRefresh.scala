package typingsSlinky.antDesignReactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRefresh extends js.Object {
  def refresh(): Unit = js.native
}

object AnonRefresh {
  @scala.inline
  def apply(refresh: () => Unit): AnonRefresh = {
    val __obj = js.Dynamic.literal(refresh = js.Any.fromFunction0(refresh))
    __obj.asInstanceOf[AnonRefresh]
  }
  @scala.inline
  implicit class AnonRefreshOps[Self <: AnonRefresh] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRefresh(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refresh")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

