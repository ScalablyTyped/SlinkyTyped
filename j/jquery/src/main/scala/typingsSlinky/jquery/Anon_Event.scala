package typingsSlinky.jquery

import typingsSlinky.jquery.JQuery.Event
import typingsSlinky.jquery.JQuery._SpecialEventHook
import typingsSlinky.jquery.jqueryNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Event[TTarget]
  extends _SpecialEventHook[TTarget, js.Any] {
  def preDispatch(`this`: TTarget, event: Event): `false` | Unit
}

object Anon_Event {
  @scala.inline
  def apply[TTarget](preDispatch: (TTarget, Event) => `false` | Unit): Anon_Event[TTarget] = {
    val __obj = js.Dynamic.literal(preDispatch = js.Any.fromFunction2(preDispatch))
  
    __obj.asInstanceOf[Anon_Event[TTarget]]
  }
}

