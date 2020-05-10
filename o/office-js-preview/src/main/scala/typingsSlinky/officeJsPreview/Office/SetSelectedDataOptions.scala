package typingsSlinky.officeJsPreview.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides options for how to insert data to the selection.
  */
@js.native
trait SetSelectedDataOptions extends js.Object {
  /**
    * A user-defined item of any type that is returned, unchanged, in the asyncContext property of the AsyncResult object that is passed to a callback.
    */
  var asyncContext: js.UndefOr[js.Any] = js.native
  /**
    * Use only with binding type table and when a TableData object is passed for the data parameter. An array of objects that specify a range of 
    * columns, rows, or cells and specify, as key-value pairs, the cell formatting to apply to that range. 
    * 
    * Example: `[{cells: Office.Table.Data, format: {fontColor: "yellow"}}, {cells: {row: 3, column: 4}, format: {borderColor: "white", fontStyle: "bold"}}]`
    */
  var cellFormat: js.UndefOr[js.Array[RangeFormatConfiguration]] = js.native
  /**
    * Explicitly sets the shape of the data object. If not supplied is inferred from the data type.
    */
  var coercionType: js.UndefOr[CoercionType | String] = js.native
  /**
    * This option is applicable for inserting images. Indicates the image height. If this option is provided without the imageWidth, the image 
    * will scale to match the value of the image height. If both image width and image height are provided, the image will be resized accordingly. 
    * If neither the image height or width is provided, the default image size and aspect ratio will be used. This value is in points.
    */
  var imageHeight: js.UndefOr[Double] = js.native
  /**
    * This option is applicable for inserting images. Indicates the insert location in relation to the left side of the slide for PowerPoint, and 
    * its relation to the currently selected cell in Excel. This value is ignored for Word. This value is in points.
    */
  var imageLeft: js.UndefOr[Double] = js.native
  /**
    * This option is applicable for inserting images. Indicates the insert location in relation to the top of the slide for PowerPoint, and its 
    * relation to the currently selected cell in Excel. This value is ignored for Word. This value is in points.
    */
  var imageTop: js.UndefOr[Double] = js.native
  /**
    * This option is applicable for inserting images. Indicates the image width. If this option is provided without the imageHeight, the image 
    * will scale to match the value of the image width. If both image width and image height are provided, the image will be resized accordingly. 
    * If neither the image height or width is provided, the default image size and aspect ratio will be used. This value is in points.
    */
  var imageWidth: js.UndefOr[Double] = js.native
  /**
    * For an inserted table, a list of key-value pairs that specify table formatting options, such as header row, total row, and banded rows. 
    * Example: `{bandedRows: true,  filterButton: false}`
    */
  var tableOptions: js.UndefOr[js.Object] = js.native
}

object SetSelectedDataOptions {
  @scala.inline
  def apply(): SetSelectedDataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetSelectedDataOptions]
  }
  @scala.inline
  implicit class SetSelectedDataOptionsOps[Self <: SetSelectedDataOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAsyncContext(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsyncContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncContext")(js.undefined)
        ret
    }
    @scala.inline
    def withCellFormat(value: js.Array[RangeFormatConfiguration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withCoercionType(value: CoercionType | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coercionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoercionType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coercionType")(js.undefined)
        ret
    }
    @scala.inline
    def withImageHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withImageLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withImageTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageTop")(js.undefined)
        ret
    }
    @scala.inline
    def withImageWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withTableOptions(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableOptions")(js.undefined)
        ret
    }
  }
  
}

