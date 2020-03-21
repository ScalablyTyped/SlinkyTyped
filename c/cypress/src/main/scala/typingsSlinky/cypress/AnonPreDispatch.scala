package typingsSlinky.cypress

import typingsSlinky.cypress.JQuery_._SpecialEventHook
import typingsSlinky.cypress.cypressBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPreDispatch[TTarget]
  extends _SpecialEventHook[TTarget, js.Any] {
  def preDispatch(event: typingsSlinky.cypress.JQuery_.Event): `false` | Unit
}

object AnonPreDispatch {
  @scala.inline
  def apply[TTarget](preDispatch: typingsSlinky.cypress.JQuery_.Event => `false` | Unit): AnonPreDispatch[TTarget] = {
    val __obj = js.Dynamic.literal(preDispatch = js.Any.fromFunction1(preDispatch))
  
    __obj.asInstanceOf[AnonPreDispatch[TTarget]]
  }
}

