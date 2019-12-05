package typingsSlinky.reactDashSelect.srcComponentsOptionMod

import org.scalajs.dom.raw.HTMLDivElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.reactMod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InnerProps extends js.Object {
  var id: String
  var key: String
  var onClick: MouseEventHandler[HTMLDivElement]
  var onMouseMove: MouseEventHandler[HTMLDivElement]
  var onMouseOver: MouseEventHandler[HTMLDivElement]
  var tabIndex: Double
}

object InnerProps {
  @scala.inline
  def apply(
    id: String,
    key: String,
    onClick: SyntheticMouseEvent[HTMLDivElement] => Unit,
    onMouseMove: SyntheticMouseEvent[HTMLDivElement] => Unit,
    onMouseOver: SyntheticMouseEvent[HTMLDivElement] => Unit,
    tabIndex: Double
  ): InnerProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick), onMouseMove = js.Any.fromFunction1(onMouseMove), onMouseOver = js.Any.fromFunction1(onMouseOver), tabIndex = tabIndex.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InnerProps]
  }
}

