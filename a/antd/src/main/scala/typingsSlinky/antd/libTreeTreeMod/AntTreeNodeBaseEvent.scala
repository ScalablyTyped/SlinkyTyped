package typingsSlinky.antd.libTreeTreeMod

import org.scalajs.dom.raw.MouseEvent
import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AntTreeNodeBaseEvent extends js.Object {
  var nativeEvent: MouseEvent
  var node: ReactComponentClass[AntTreeNodeProps]
}

object AntTreeNodeBaseEvent {
  @scala.inline
  def apply(nativeEvent: MouseEvent, node: ReactComponentClass[AntTreeNodeProps]): AntTreeNodeBaseEvent = {
    val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AntTreeNodeBaseEvent]
  }
}

