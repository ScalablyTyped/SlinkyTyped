package typingsSlinky.exceljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableStyleProperties extends js.Object {
  /**
  	  * Alternate rows shown with background colour
  	  * @default false
  	  */
  var showColumnStripes: js.UndefOr[Boolean] = js.native
  /**
  	  * Highlight the first column (bold)
  	  * @default false
  	  */
  var showFirstColumn: js.UndefOr[Boolean] = js.native
  /**
  	  * Highlight the last column (bold)
  	  * @default false
  	  */
  var showLastColumn: js.UndefOr[Boolean] = js.native
  /**
  	  * Alternate rows shown with background colour
  	  * @default false
  	  */
  var showRowStripes: js.UndefOr[Boolean] = js.native
  /**
  	 * The colour theme of the table
  	 * @default 'TableStyleMedium2'
  	 */
  var theme: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 61 */ js.Any
  ] = js.native
}

object TableStyleProperties {
  @scala.inline
  def apply(): TableStyleProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableStyleProperties]
  }
  @scala.inline
  implicit class TableStylePropertiesOps[Self <: TableStyleProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withShowColumnStripes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showColumnStripes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowColumnStripes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showColumnStripes")(js.undefined)
        ret
    }
    @scala.inline
    def withShowFirstColumn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFirstColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowFirstColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFirstColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withShowLastColumn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLastColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowLastColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLastColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withShowRowStripes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRowStripes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowRowStripes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRowStripes")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 61 */ js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
  }
  
}

