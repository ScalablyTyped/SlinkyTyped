package typingsSlinky.handsontable.mod.Handsontable.ganttChart

import typingsSlinky.handsontable.AnonQuantity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataObject extends js.Object {
  var additionalData: AnonQuantity
  var endDate: String | Double | js.Date
  var startDate: String | Double | js.Date
}

object DataObject {
  @scala.inline
  def apply(
    additionalData: AnonQuantity,
    endDate: String | Double | js.Date,
    startDate: String | Double | js.Date
  ): DataObject = {
    val __obj = js.Dynamic.literal(additionalData = additionalData.asInstanceOf[js.Any], endDate = endDate.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DataObject]
  }
}

