package typingsSlinky.cypress.sinonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimplifiedSet extends js.Object {
  def has(el: js.Any): Boolean
}

object SimplifiedSet {
  @scala.inline
  def apply(has: js.Any => Boolean): SimplifiedSet = {
    val __obj = js.Dynamic.literal(has = js.Any.fromFunction1(has))
    __obj.asInstanceOf[SimplifiedSet]
  }
}

