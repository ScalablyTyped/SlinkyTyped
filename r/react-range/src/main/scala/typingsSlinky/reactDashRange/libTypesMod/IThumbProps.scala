package typingsSlinky.reactDashRange.libTypesMod

import org.scalajs.dom.raw.Element
import slinky.web.SyntheticKeyboardEvent
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IThumbProps extends js.Object {
  var `aria-valuemax`: Double
  var `aria-valuemin`: Double
  var `aria-valuenow`: Double
  var draggable: Boolean
  var key: Double
  var role: String
  var style: CSSProperties
  var tabIndex: js.UndefOr[Double] = js.undefined
  def onKeyDown(e: SyntheticKeyboardEvent[Element]): Unit
  def onKeyUp(e: SyntheticKeyboardEvent[Element]): Unit
}

object IThumbProps {
  @scala.inline
  def apply(
    `aria-valuemax`: Double,
    `aria-valuemin`: Double,
    `aria-valuenow`: Double,
    draggable: Boolean,
    key: Double,
    onKeyDown: SyntheticKeyboardEvent[Element] => Unit,
    onKeyUp: SyntheticKeyboardEvent[Element] => Unit,
    role: String,
    style: CSSProperties,
    tabIndex: Int | Double = null
  ): IThumbProps = {
    val __obj = js.Dynamic.literal(draggable = draggable.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], onKeyDown = js.Any.fromFunction1(onKeyDown), onKeyUp = js.Any.fromFunction1(onKeyUp), role = role.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-valuemax")(`aria-valuemax`.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-valuemin")(`aria-valuemin`.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-valuenow")(`aria-valuenow`.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[IThumbProps]
  }
}

