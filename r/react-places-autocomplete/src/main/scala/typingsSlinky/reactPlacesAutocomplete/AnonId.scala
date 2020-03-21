package typingsSlinky.reactPlacesAutocomplete

import org.scalajs.dom.raw.Element
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticTouchEvent
import typingsSlinky.react.mod.MouseEventHandler
import typingsSlinky.react.mod.TouchEventHandler
import typingsSlinky.reactPlacesAutocomplete.reactPlacesAutocompleteStrings.option
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonId extends js.Object {
  var id: js.UndefOr[String] = js.undefined
  var key: Double
  var onClick: MouseEventHandler[Element]
  var onMouseDown: MouseEventHandler[Element]
  var onMouseEnter: MouseEventHandler[Element]
  var onMouseLeave: MouseEventHandler[Element]
  var onMouseUp: MouseEventHandler[Element]
  var onTouchEnd: TouchEventHandler[Element]
  var onTouchStart: TouchEventHandler[Element]
  var role: option
}

object AnonId {
  @scala.inline
  def apply(
    key: Double,
    onClick: SyntheticMouseEvent[Element] => Unit,
    onMouseDown: SyntheticMouseEvent[Element] => Unit,
    onMouseEnter: SyntheticMouseEvent[Element] => Unit,
    onMouseLeave: SyntheticMouseEvent[Element] => Unit,
    onMouseUp: SyntheticMouseEvent[Element] => Unit,
    onTouchEnd: SyntheticTouchEvent[Element] => Unit,
    onTouchStart: SyntheticTouchEvent[Element] => Unit,
    role: option,
    id: String = null
  ): AnonId = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick), onMouseDown = js.Any.fromFunction1(onMouseDown), onMouseEnter = js.Any.fromFunction1(onMouseEnter), onMouseLeave = js.Any.fromFunction1(onMouseLeave), onMouseUp = js.Any.fromFunction1(onMouseUp), onTouchEnd = js.Any.fromFunction1(onTouchEnd), onTouchStart = js.Any.fromFunction1(onTouchStart), role = role.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonId]
  }
}

