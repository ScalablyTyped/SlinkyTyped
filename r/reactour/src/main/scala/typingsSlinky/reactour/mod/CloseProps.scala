package typingsSlinky.reactour.mod

import org.scalajs.dom.raw.HTMLButtonElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloseProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var onClick: MouseEventHandler[HTMLButtonElement]
}

object CloseProps {
  @scala.inline
  def apply(onClick: SyntheticMouseEvent[HTMLButtonElement] => Unit, className: String = null): CloseProps = {
    val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction1(onClick))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloseProps]
  }
}

