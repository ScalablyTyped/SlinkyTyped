package typingsSlinky.reachTooltip.mod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import slinky.core.SyntheticEvent
import typingsSlinky.react.mod.ReactEventHandler
import typingsSlinky.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TriggerParams extends js.Object {
  var `aria-describedby`: String
  var `data-reach-tooltip-trigger`: String
  var onBlur: ReactEventHandler[Element]
  var onFocus: ReactEventHandler[Element]
  var onKeyDown: ReactEventHandler[Element]
  var onMouseDown: ReactEventHandler[Element]
  var onMouseEnter: ReactEventHandler[Element]
  var onMouseLeave: ReactEventHandler[Element]
  var onMouseMove: ReactEventHandler[Element]
  var ref: Ref[_]
}

object TriggerParams {
  @scala.inline
  def apply(
    `aria-describedby`: String,
    `data-reach-tooltip-trigger`: String,
    onBlur: SyntheticEvent[Event, Element] => Unit,
    onFocus: SyntheticEvent[Event, Element] => Unit,
    onKeyDown: SyntheticEvent[Event, Element] => Unit,
    onMouseDown: SyntheticEvent[Event, Element] => Unit,
    onMouseEnter: SyntheticEvent[Event, Element] => Unit,
    onMouseLeave: SyntheticEvent[Event, Element] => Unit,
    onMouseMove: SyntheticEvent[Event, Element] => Unit,
    ref: Ref[_] = null
  ): TriggerParams = {
    val __obj = js.Dynamic.literal(onBlur = js.Any.fromFunction1(onBlur), onFocus = js.Any.fromFunction1(onFocus), onKeyDown = js.Any.fromFunction1(onKeyDown), onMouseDown = js.Any.fromFunction1(onMouseDown), onMouseEnter = js.Any.fromFunction1(onMouseEnter), onMouseLeave = js.Any.fromFunction1(onMouseLeave), onMouseMove = js.Any.fromFunction1(onMouseMove), ref = ref.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-describedby")(`aria-describedby`.asInstanceOf[js.Any])
    __obj.updateDynamic("data-reach-tooltip-trigger")(`data-reach-tooltip-trigger`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggerParams]
  }
}

