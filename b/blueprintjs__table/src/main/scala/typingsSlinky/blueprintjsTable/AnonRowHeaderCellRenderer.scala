package typingsSlinky.blueprintjsTable

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRowHeaderCellRenderer extends js.Object {
  var rowHeaderCellRenderer: js.Function1[/* rowIndex */ Double, ReactElement]
}

object AnonRowHeaderCellRenderer {
  @scala.inline
  def apply(rowHeaderCellRenderer: /* rowIndex */ Double => ReactElement): AnonRowHeaderCellRenderer = {
    val __obj = js.Dynamic.literal(rowHeaderCellRenderer = js.Any.fromFunction1(rowHeaderCellRenderer))
  
    __obj.asInstanceOf[AnonRowHeaderCellRenderer]
  }
}

