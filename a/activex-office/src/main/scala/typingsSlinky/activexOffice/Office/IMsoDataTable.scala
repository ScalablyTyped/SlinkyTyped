package typingsSlinky.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMsoDataTable extends js.Object {
  val Application: js.Any = js.native
  var AutoScaleFont: js.Any = js.native
  val Border: IMsoBorder = js.native
  val Creator: Double = js.native
  val Font: ChartFont = js.native
  val Format: IMsoChartFormat = js.native
  var HasBorderHorizontal: Boolean = js.native
  var HasBorderOutline: Boolean = js.native
  var HasBorderVertical: Boolean = js.native
  @JSName("Office.IMsoDataTable_typekey")
  var OfficeDotIMsoDataTable_typekey: IMsoDataTable = js.native
  val Parent: js.Any = js.native
  var ShowLegendKey: Boolean = js.native
  def Delete(): Unit = js.native
  def Select(): Unit = js.native
}

object IMsoDataTable {
  @scala.inline
  def apply(
    Application: js.Any,
    AutoScaleFont: js.Any,
    Border: IMsoBorder,
    Creator: Double,
    Delete: () => Unit,
    Font: ChartFont,
    Format: IMsoChartFormat,
    HasBorderHorizontal: Boolean,
    HasBorderOutline: Boolean,
    HasBorderVertical: Boolean,
    OfficeDotIMsoDataTable_typekey: IMsoDataTable,
    Parent: js.Any,
    Select: () => Unit,
    ShowLegendKey: Boolean
  ): IMsoDataTable = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], AutoScaleFont = AutoScaleFont.asInstanceOf[js.Any], Border = Border.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Font = Font.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], HasBorderHorizontal = HasBorderHorizontal.asInstanceOf[js.Any], HasBorderOutline = HasBorderOutline.asInstanceOf[js.Any], HasBorderVertical = HasBorderVertical.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select), ShowLegendKey = ShowLegendKey.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.IMsoDataTable_typekey")(OfficeDotIMsoDataTable_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMsoDataTable]
  }
  @scala.inline
  implicit class IMsoDataTableOps[Self <: IMsoDataTable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplication(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoScaleFont(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoScaleFont")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBorder(value: IMsoBorder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Border")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelete(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Delete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFont(value: ChartFont): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Font")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormat(value: IMsoChartFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasBorderHorizontal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HasBorderHorizontal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasBorderOutline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HasBorderOutline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasBorderVertical(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HasBorderVertical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOfficeDotIMsoDataTable_typekey(value: IMsoDataTable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Office.IMsoDataTable_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelect(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Select")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withShowLegendKey(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowLegendKey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

