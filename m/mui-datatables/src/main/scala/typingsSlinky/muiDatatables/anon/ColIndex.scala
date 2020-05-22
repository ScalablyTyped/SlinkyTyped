package typingsSlinky.muiDatatables.anon

import org.scalajs.dom.raw.Element
import slinky.web.SyntheticMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColIndex extends js.Object {
  var colIndex: Double
  var dataIndex: Double
  var event: SyntheticMouseEvent[Element]
  var rowIndex: Double
}

object ColIndex {
  @scala.inline
  def apply(colIndex: Double, dataIndex: Double, event: SyntheticMouseEvent[Element], rowIndex: Double): ColIndex = {
    val __obj = js.Dynamic.literal(colIndex = colIndex.asInstanceOf[js.Any], dataIndex = dataIndex.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColIndex]
  }
}

