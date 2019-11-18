package typingsSlinky.antd

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MonthReactNode extends js.Object {
  var monthReactNode: ReactElement | Null
  var yearReactNode: ReactElement
}

object Anon_MonthReactNode {
  @scala.inline
  def apply(yearReactNode: ReactElement, monthReactNode: ReactElement = null): Anon_MonthReactNode = {
    val __obj = js.Dynamic.literal(yearReactNode = yearReactNode.asInstanceOf[js.Any])
    if (monthReactNode != null) __obj.updateDynamic("monthReactNode")(monthReactNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_MonthReactNode]
  }
}

