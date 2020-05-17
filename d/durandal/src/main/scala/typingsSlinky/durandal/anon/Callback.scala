package typingsSlinky.durandal.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Callback extends js.Object {
  var routePattern: js.RegExp = js.native
  def callback(fragment: String): Unit = js.native
}

object Callback {
  @scala.inline
  def apply(callback: String => Unit, routePattern: js.RegExp): Callback = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), routePattern = routePattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[Callback]
  }
  @scala.inline
  implicit class CallbackOps[Self <: Callback] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallback(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRoutePattern(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routePattern")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

