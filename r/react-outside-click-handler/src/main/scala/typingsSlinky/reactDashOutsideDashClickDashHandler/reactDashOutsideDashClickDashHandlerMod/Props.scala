package typingsSlinky.reactDashOutsideDashClickDashHandler.reactDashOutsideDashClickDashHandlerMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.TagMod
import slinky.web.SyntheticMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof react-outside-click-handler.react-outside-click-handler.DefaultProps ]:? react-outside-click-handler.react-outside-click-handler.DefaultProps[P]} */ trait Props extends js.Object {
  var children: TagMod[Any]
  def onOutsideClick(e: SyntheticMouseEvent[HTMLElement]): Unit
}

object Props {
  @scala.inline
  def apply(children: TagMod[Any], onOutsideClick: SyntheticMouseEvent[HTMLElement] => Unit): Props = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], onOutsideClick = js.Any.fromFunction1(onOutsideClick))
  
    __obj.asInstanceOf[Props]
  }
}

