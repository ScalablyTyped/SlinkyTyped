package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains the table style settings that modify the table appearance.
  */
@js.native
trait TableLookSettings extends js.Object {
  /**
    * Specifies whether special formatting is applied to the first column of the table.
    */
  var applyFirstColumn: Boolean = js.native
  /**
    * Specifies whether special formatting is applied to the first row of the table.
    */
  var applyFirstRow: Boolean = js.native
  /**
    * Specifies whether special formatting is applied to the last column of the table.
    */
  var applyLastColumn: Boolean = js.native
  /**
    * Specifies whether special formatting is applied to the last row of the table.
    */
  var applyLastRow: Boolean = js.native
  /**
    * Specifies whether column banding formatting is not applied to the table.
    */
  var doNotApplyColumnBanding: Boolean = js.native
  /**
    * Specifies whether row banding formatting is not applied to the table.
    */
  var doNotApplyRowBanding: Boolean = js.native
}

object TableLookSettings {
  @scala.inline
  def apply(
    applyFirstColumn: Boolean,
    applyFirstRow: Boolean,
    applyLastColumn: Boolean,
    applyLastRow: Boolean,
    doNotApplyColumnBanding: Boolean,
    doNotApplyRowBanding: Boolean
  ): TableLookSettings = {
    val __obj = js.Dynamic.literal(applyFirstColumn = applyFirstColumn.asInstanceOf[js.Any], applyFirstRow = applyFirstRow.asInstanceOf[js.Any], applyLastColumn = applyLastColumn.asInstanceOf[js.Any], applyLastRow = applyLastRow.asInstanceOf[js.Any], doNotApplyColumnBanding = doNotApplyColumnBanding.asInstanceOf[js.Any], doNotApplyRowBanding = doNotApplyRowBanding.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableLookSettings]
  }
  @scala.inline
  implicit class TableLookSettingsOps[Self <: TableLookSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplyFirstColumn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyFirstColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplyFirstRow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyFirstRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplyLastColumn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyLastColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplyLastRow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyLastRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDoNotApplyColumnBanding(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doNotApplyColumnBanding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDoNotApplyRowBanding(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doNotApplyRowBanding")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

