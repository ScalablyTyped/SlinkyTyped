package typingsSlinky.reactFinalFormListeners.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnFocusProps extends js.Object {
  var name: String = js.native
  def children(): Unit = js.native
}

object OnFocusProps {
  @scala.inline
  def apply(children: () => Unit, name: String): OnFocusProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction0(children), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnFocusProps]
  }
  @scala.inline
  implicit class OnFocusPropsOps[Self <: OnFocusProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildren(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

