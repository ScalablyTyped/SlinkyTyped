package typingsSlinky.cypress.anon

import typingsSlinky.cypress.JQuery.ValHook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `3`[TElement] extends ValHook[TElement] {
  def get(elem: TElement): js.Any = js.native
}

object `3` {
  @scala.inline
  def apply[TElement](get: TElement => js.Any): `3`[TElement] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[`3`[TElement]]
  }
  @scala.inline
  implicit class `3Ops`[Self[telement] <: `3`[telement], TElement] (val x: Self[TElement]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TElement] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TElement]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TElement] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TElement] with Other]
    @scala.inline
    def withGet(value: TElement => js.Any): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

