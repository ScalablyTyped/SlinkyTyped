package typingsSlinky.cypress.anon

import typingsSlinky.cypress.JQuery._ValHook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `3`[TElement] extends _ValHook[TElement] {
  def get(elem: TElement): js.Any
}

object `3` {
  @scala.inline
  def apply[TElement](get: TElement => js.Any): `3`[TElement] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[`3`[TElement]]
  }
}

