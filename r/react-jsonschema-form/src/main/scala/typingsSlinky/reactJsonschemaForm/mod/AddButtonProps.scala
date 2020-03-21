package typingsSlinky.reactJsonschemaForm.mod

import org.scalajs.dom.raw.HTMLButtonElement
import slinky.web.SyntheticMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddButtonProps extends js.Object {
  var className: String
  var disabled: Boolean
  def onClick(e: SyntheticMouseEvent[HTMLButtonElement]): Unit
}

object AddButtonProps {
  @scala.inline
  def apply(className: String, disabled: Boolean, onClick: SyntheticMouseEvent[HTMLButtonElement] => Unit): AddButtonProps = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick))
  
    __obj.asInstanceOf[AddButtonProps]
  }
}

