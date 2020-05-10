package typingsSlinky.reachRouter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPushState extends js.Object {
  val state: js.Any = js.native
  def pushState(state: js.Any, title: String, uri: String): Unit = js.native
  def replaceState(state: js.Any, title: String, uri: String): Unit = js.native
}

object AnonPushState {
  @scala.inline
  def apply(
    pushState: (js.Any, String, String) => Unit,
    replaceState: (js.Any, String, String) => Unit,
    state: js.Any
  ): AnonPushState = {
    val __obj = js.Dynamic.literal(pushState = js.Any.fromFunction3(pushState), replaceState = js.Any.fromFunction3(replaceState), state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPushState]
  }
  @scala.inline
  implicit class AnonPushStateOps[Self <: AnonPushState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPushState(value: (js.Any, String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pushState")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withReplaceState(value: (js.Any, String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceState")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withState(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

