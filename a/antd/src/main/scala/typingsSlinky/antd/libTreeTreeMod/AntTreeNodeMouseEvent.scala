package typingsSlinky.antd.libTreeTreeMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import slinky.web.SyntheticMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AntTreeNodeMouseEvent extends js.Object {
  var event: SyntheticMouseEvent[HTMLElement]
  var node: ReactComponentClass[AntTreeNodeProps]
}

object AntTreeNodeMouseEvent {
  @scala.inline
  def apply(event: SyntheticMouseEvent[HTMLElement], node: ReactComponentClass[AntTreeNodeProps]): AntTreeNodeMouseEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AntTreeNodeMouseEvent]
  }
}

