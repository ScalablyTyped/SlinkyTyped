package typingsSlinky.jquery.JQuery_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait _CSSHook[TElement] extends js.Object {
  def get(elem: TElement, computed: js.Any, extra: js.Any): js.Any = js.native
  def set(elem: TElement, value: js.Any): Unit = js.native
}

object _CSSHook {
  @scala.inline
  def apply[TElement](get: (TElement, js.Any, js.Any) => js.Any, set: (TElement, js.Any) => Unit): _CSSHook[TElement] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction3(get), set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[_CSSHook[TElement]]
  }
  @scala.inline
  implicit class _CSSHookOps[Self[telement] <: _CSSHook[telement], TElement] (val x: Self[TElement]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TElement] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TElement]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TElement] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TElement] with Other]
    @scala.inline
    def withGet(value: (TElement, js.Any, js.Any) => js.Any): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSet(value: (TElement, js.Any) => Unit): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

