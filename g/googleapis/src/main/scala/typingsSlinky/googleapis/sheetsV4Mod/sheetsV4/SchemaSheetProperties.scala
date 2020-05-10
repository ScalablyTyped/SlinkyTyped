package typingsSlinky.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Properties of a sheet.
  */
@js.native
trait SchemaSheetProperties extends js.Object {
  /**
    * Additional properties of the sheet if this sheet is a grid. (If the sheet
    * is an object sheet, containing a chart or image, then this field will be
    * absent.) When writing it is an error to set any grid properties on
    * non-grid sheets.
    */
  var gridProperties: js.UndefOr[SchemaGridProperties] = js.native
  /**
    * True if the sheet is hidden in the UI, false if it&#39;s visible.
    */
  var hidden: js.UndefOr[Boolean] = js.native
  /**
    * The index of the sheet within the spreadsheet. When adding or updating
    * sheet properties, if this field is excluded then the sheet is added or
    * moved to the end of the sheet list. When updating sheet indices or
    * inserting sheets, movement is considered in &quot;before the move&quot;
    * indexes. For example, if there were 3 sheets (S1, S2, S3) in order to
    * move S1 ahead of S2 the index would have to be set to 2. A sheet index
    * update request is ignored if the requested index is identical to the
    * sheets current index or if the requested new index is equal to the
    * current sheet index + 1.
    */
  var index: js.UndefOr[Double] = js.native
  /**
    * True if the sheet is an RTL sheet instead of an LTR sheet.
    */
  var rightToLeft: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the sheet. Must be non-negative. This field cannot be changed
    * once set.
    */
  var sheetId: js.UndefOr[Double] = js.native
  /**
    * The type of sheet. Defaults to GRID. This field cannot be changed once
    * set.
    */
  var sheetType: js.UndefOr[String] = js.native
  /**
    * The color of the tab in the UI.
    */
  var tabColor: js.UndefOr[SchemaColor] = js.native
  /**
    * The name of the sheet.
    */
  var title: js.UndefOr[String] = js.native
}

object SchemaSheetProperties {
  @scala.inline
  def apply(): SchemaSheetProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSheetProperties]
  }
  @scala.inline
  implicit class SchemaSheetPropertiesOps[Self <: SchemaSheetProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGridProperties(value: SchemaGridProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(js.undefined)
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.undefined)
        ret
    }
    @scala.inline
    def withRightToLeft(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightToLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightToLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightToLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withSheetId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSheetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheetId")(js.undefined)
        ret
    }
    @scala.inline
    def withSheetType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheetType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSheetType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheetType")(js.undefined)
        ret
    }
    @scala.inline
    def withTabColor(value: SchemaColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabColor")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

