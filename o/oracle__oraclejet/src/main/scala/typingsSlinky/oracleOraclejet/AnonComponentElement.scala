package typingsSlinky.oracleOraclejet

import org.scalajs.dom.raw.Element
import typingsSlinky.oracleOraclejet.ojganttMod.ojGantt.Row
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonComponentElement[K2] extends js.Object {
  var componentElement: Element
  var rowData: Row[K2]
}

object AnonComponentElement {
  @scala.inline
  def apply[K2](componentElement: Element, rowData: Row[K2]): AnonComponentElement[K2] = {
    val __obj = js.Dynamic.literal(componentElement = componentElement.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonComponentElement[K2]]
  }
}

