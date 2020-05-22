package typingsSlinky.cypress.anon

import typingsSlinky.cypress.JQuery._ValHook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `4`[TElement] extends _ValHook[TElement] {
  def set(elem: TElement, value: js.Any): js.Any
}

object `4` {
  @scala.inline
  def apply[TElement](set: (TElement, js.Any) => js.Any): `4`[TElement] = {
    val __obj = js.Dynamic.literal(set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[`4`[TElement]]
  }
}

