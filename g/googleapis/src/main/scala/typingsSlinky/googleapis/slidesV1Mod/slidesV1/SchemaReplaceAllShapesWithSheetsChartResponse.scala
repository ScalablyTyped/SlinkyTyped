package typingsSlinky.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of replacing shapes with a Google Sheets chart.
  */
@js.native
trait SchemaReplaceAllShapesWithSheetsChartResponse extends js.Object {
  /**
    * The number of shapes replaced with charts.
    */
  var occurrencesChanged: js.UndefOr[Double] = js.native
}

object SchemaReplaceAllShapesWithSheetsChartResponse {
  @scala.inline
  def apply(): SchemaReplaceAllShapesWithSheetsChartResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReplaceAllShapesWithSheetsChartResponse]
  }
  @scala.inline
  implicit class SchemaReplaceAllShapesWithSheetsChartResponseOps[Self <: SchemaReplaceAllShapesWithSheetsChartResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOccurrencesChanged(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("occurrencesChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOccurrencesChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("occurrencesChanged")(js.undefined)
        ret
    }
  }
  
}

