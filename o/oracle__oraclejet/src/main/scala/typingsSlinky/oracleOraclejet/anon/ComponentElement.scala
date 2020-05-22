package typingsSlinky.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentElement[K2] extends js.Object {
  var componentElement: org.scalajs.dom.raw.Element
  var rowData: typingsSlinky.oracleOraclejet.ojganttMod.ojGantt.Row[K2]
}

object ComponentElement {
  @scala.inline
  def apply[K2](
    componentElement: org.scalajs.dom.raw.Element,
    rowData: typingsSlinky.oracleOraclejet.ojganttMod.ojGantt.Row[K2]
  ): ComponentElement[K2] = {
    val __obj = js.Dynamic.literal(componentElement = componentElement.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentElement[K2]]
  }
}

