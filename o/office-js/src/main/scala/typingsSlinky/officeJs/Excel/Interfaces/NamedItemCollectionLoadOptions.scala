package typingsSlinky.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * A collection of all the NamedItem objects that are part of the workbook or worksheet, depending on how it was reached.
  *
  * [Api set: ExcelApi 1.1]
  */
@js.native
trait NamedItemCollectionLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Returns an object containing values and types of the named item.
    *
    * [Api set: ExcelApi 1.7]
    */
  var arrayValues: js.UndefOr[NamedItemArrayValuesLoadOptions] = js.native
  /**
    *
    * For EACH ITEM in the collection: Represents the comment associated with this name.
    *
    * [Api set: ExcelApi 1.4]
    */
  var comment: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets or sets the formula of the named item.  Formula always starts with a '=' sign.
    *
    * [Api set: ExcelApi 1.7]
    */
  var formula: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: The name of the object. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var name: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Indicates whether the name is scoped to the workbook or to a specific worksheet. Possible values are: Worksheet, Workbook. Read-only.
    *
    * [Api set: ExcelApi 1.4]
    */
  var scope: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Indicates the type of the value returned by the name's formula. See Excel.NamedItemType for details. Read-only.
    *
    * [Api set: ExcelApi 1.1 for String,Integer,Double,Boolean,Range,Error; 1.7 for Array]
    */
  var `type`: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Represents the value computed by the name's formula. For a named range, will return the range address. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var value: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Specifies whether the object is visible or not.
    *
    * [Api set: ExcelApi 1.1]
    */
  var visible: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Returns the worksheet on which the named item is scoped to. Throws an error if the item is scoped to the workbook instead.
    *
    * [Api set: ExcelApi 1.4]
    */
  var worksheet: js.UndefOr[WorksheetLoadOptions] = js.native
  /**
    *
    * For EACH ITEM in the collection: Returns the worksheet on which the named item is scoped to. Returns a null object if the item is scoped to the workbook instead.
    *
    * [Api set: ExcelApi 1.4]
    */
  var worksheetOrNullObject: js.UndefOr[WorksheetLoadOptions] = js.native
}

object NamedItemCollectionLoadOptions {
  @scala.inline
  def apply(): NamedItemCollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NamedItemCollectionLoadOptions]
  }
  @scala.inline
  implicit class NamedItemCollectionLoadOptionsOps[Self <: NamedItemCollectionLoadOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$all(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$all")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$all: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$all")(js.undefined)
        ret
    }
    @scala.inline
    def withArrayValues(value: NamedItemArrayValuesLoadOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrayValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrayValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrayValues")(js.undefined)
        ret
    }
    @scala.inline
    def withComment(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(js.undefined)
        ret
    }
    @scala.inline
    def withFormula(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formula")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormula: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formula")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withScope(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
    @scala.inline
    def withWorksheet(value: WorksheetLoadOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("worksheet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorksheet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("worksheet")(js.undefined)
        ret
    }
    @scala.inline
    def withWorksheetOrNullObject(value: WorksheetLoadOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("worksheetOrNullObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorksheetOrNullObject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("worksheetOrNullObject")(js.undefined)
        ret
    }
  }
  
}

