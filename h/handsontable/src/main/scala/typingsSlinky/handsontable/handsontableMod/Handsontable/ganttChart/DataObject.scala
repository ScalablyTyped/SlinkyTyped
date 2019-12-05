package typingsSlinky.handsontable.handsontableMod.Handsontable.ganttChart

import typingsSlinky.handsontable.Anon_LabelQuantity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataObject extends js.Object {
  var additionalData: Anon_LabelQuantity
  var endDate: String | Double | js.Date
  var startDate: String | Double | js.Date
}

object DataObject {
  @scala.inline
  def apply(
    additionalData: Anon_LabelQuantity,
    endDate: String | Double | js.Date,
    startDate: String | Double | js.Date
  ): DataObject = {
    val __obj = js.Dynamic.literal(additionalData = additionalData.asInstanceOf[js.Any], endDate = endDate.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DataObject]
  }
}

