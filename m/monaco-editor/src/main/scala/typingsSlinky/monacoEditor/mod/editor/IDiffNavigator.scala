package typingsSlinky.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDiffNavigator extends js.Object {
  def canNavigate(): Boolean = js.native
  def dispose(): Unit = js.native
  def next(): Unit = js.native
  def previous(): Unit = js.native
}

object IDiffNavigator {
  @scala.inline
  def apply(canNavigate: () => Boolean, dispose: () => Unit, next: () => Unit, previous: () => Unit): IDiffNavigator = {
    val __obj = js.Dynamic.literal(canNavigate = js.Any.fromFunction0(canNavigate), dispose = js.Any.fromFunction0(dispose), next = js.Any.fromFunction0(next), previous = js.Any.fromFunction0(previous))
    __obj.asInstanceOf[IDiffNavigator]
  }
  @scala.inline
  implicit class IDiffNavigatorOps[Self <: IDiffNavigator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanNavigate(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canNavigate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDispose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNext(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPrevious(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previous")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

