package typingsSlinky.fundamentalReact

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRowData extends js.Object {
  var rowData: js.Array[String | TagMod[Any]]
}

object AnonRowData {
  @scala.inline
  def apply(rowData: js.Array[String | TagMod[Any]]): AnonRowData = {
    val __obj = js.Dynamic.literal(rowData = rowData.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRowData]
  }
}

