package typingsSlinky.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the Workbook object, for use in `workbook.set({ ... })`. */
@js.native
trait WorkbookUpdateData extends js.Object {
  /**
    *
    * True if all charts in the workbook are tracking the actual data points to which they are attached.
    False if the charts track the index of the data points.
    *
    * [Api set: ExcelApi 1.9]
    */
  var chartDataPointTrack: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies whether or not changes have been made since the workbook was last saved.
    You can set this property to true if you want to close a modified workbook without either saving it or being prompted to save it.
    *
    * [Api set: ExcelApi 1.9]
    */
  var isDirty: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets the workbook properties.
    *
    * [Api set: ExcelApi 1.7]
    */
  var properties: js.UndefOr[DocumentPropertiesUpdateData] = js.native
  /**
    *
    * True if the workbook uses the 1904 date system.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var use1904DateSystem: js.UndefOr[Boolean] = js.native
  /**
    *
    * True if calculations in this workbook will be done using only the precision of the numbers as they're displayed.
    Data will permanently lose accuracy when switching this property from false to true.
    *
    * [Api set: ExcelApi 1.9]
    */
  var usePrecisionAsDisplayed: js.UndefOr[Boolean] = js.native
}

object WorkbookUpdateData {
  @scala.inline
  def apply(): WorkbookUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookUpdateData]
  }
  @scala.inline
  implicit class WorkbookUpdateDataOps[Self <: WorkbookUpdateData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChartDataPointTrack(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chartDataPointTrack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChartDataPointTrack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chartDataPointTrack")(js.undefined)
        ret
    }
    @scala.inline
    def withIsDirty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDirty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsDirty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDirty")(js.undefined)
        ret
    }
    @scala.inline
    def withProperties(value: DocumentPropertiesUpdateData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(js.undefined)
        ret
    }
    @scala.inline
    def withUse1904DateSystem(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("use1904DateSystem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUse1904DateSystem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("use1904DateSystem")(js.undefined)
        ret
    }
    @scala.inline
    def withUsePrecisionAsDisplayed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usePrecisionAsDisplayed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsePrecisionAsDisplayed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usePrecisionAsDisplayed")(js.undefined)
        ret
    }
  }
  
}

