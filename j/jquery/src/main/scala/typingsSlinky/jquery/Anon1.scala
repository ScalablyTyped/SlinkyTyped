package typingsSlinky.jquery

import typingsSlinky.jquery.JQuery_._ValHook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon1[TElement] extends _ValHook[TElement] {
  def set(elem: TElement, value: js.Any): js.Any = js.native
}

object Anon1 {
  @scala.inline
  def apply[TElement](set: (TElement, js.Any) => js.Any): Anon1[TElement] = {
    val __obj = js.Dynamic.literal(set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[Anon1[TElement]]
  }
  @scala.inline
  implicit class Anon1Ops[Self[telement] <: Anon1[telement], TElement] (val x: Self[TElement]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TElement] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TElement]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TElement] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TElement] with Other]
    @scala.inline
    def withSet(value: (TElement, js.Any) => js.Any): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

