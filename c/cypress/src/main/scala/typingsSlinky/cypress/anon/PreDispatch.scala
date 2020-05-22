package typingsSlinky.cypress.anon

import typingsSlinky.cypress.JQuery.Event
import typingsSlinky.cypress.JQuery._SpecialEventHook
import typingsSlinky.cypress.cypressBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreDispatch[TTarget]
  extends _SpecialEventHook[TTarget, js.Any] {
  def preDispatch(event: Event): `false` | Unit
}

object PreDispatch {
  @scala.inline
  def apply[TTarget](preDispatch: Event => `false` | Unit): PreDispatch[TTarget] = {
    val __obj = js.Dynamic.literal(preDispatch = js.Any.fromFunction1(preDispatch))
    __obj.asInstanceOf[PreDispatch[TTarget]]
  }
}

