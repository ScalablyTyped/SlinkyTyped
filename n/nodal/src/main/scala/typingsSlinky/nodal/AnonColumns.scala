package typingsSlinky.nodal

import typingsSlinky.nodal.mod.IColumn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColumns extends js.Object {
  var columns: js.Array[IColumn]
  var table: String
}

object AnonColumns {
  @scala.inline
  def apply(columns: js.Array[IColumn], table: String): AnonColumns = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonColumns]
  }
}

