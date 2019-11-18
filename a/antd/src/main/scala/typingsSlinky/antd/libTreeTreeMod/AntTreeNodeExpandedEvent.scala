package typingsSlinky.antd.libTreeTreeMod

import org.scalajs.dom.raw.MouseEvent
import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AntTreeNodeExpandedEvent extends AntTreeNodeBaseEvent {
  var expanded: js.UndefOr[Boolean] = js.undefined
}

object AntTreeNodeExpandedEvent {
  @scala.inline
  def apply(
    nativeEvent: MouseEvent,
    node: ReactComponentClass[AntTreeNodeProps],
    expanded: js.UndefOr[Boolean] = js.undefined
  ): AntTreeNodeExpandedEvent = {
    val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    if (!js.isUndefined(expanded)) __obj.updateDynamic("expanded")(expanded.asInstanceOf[js.Any])
    __obj.asInstanceOf[AntTreeNodeExpandedEvent]
  }
}

