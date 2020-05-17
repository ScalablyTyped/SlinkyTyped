package typingsSlinky.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SlicerItem extends js.Object {
  val Application: typingsSlinky.activexExcel.Excel.Application = js.native
  val Caption: String = js.native
  val Creator: XlCreator = js.native
  @JSName("Excel.SlicerItem_typekey")
  var ExcelDotSlicerItem_typekey: SlicerItem = js.native
  val HasData: Boolean = js.native
  val Name: String = js.native
  val Parent: SlicerCache = js.native
  var Selected: Boolean = js.native
  val SourceName: js.Any = js.native
  val SourceNameStandard: String = js.native
  val Value: String = js.native
}

object SlicerItem {
  @scala.inline
  def apply(
    Application: Application,
    Caption: String,
    Creator: XlCreator,
    ExcelDotSlicerItem_typekey: SlicerItem,
    HasData: Boolean,
    Name: String,
    Parent: SlicerCache,
    Selected: Boolean,
    SourceName: js.Any,
    SourceNameStandard: String,
    Value: String
  ): SlicerItem = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Caption = Caption.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], HasData = HasData.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Selected = Selected.asInstanceOf[js.Any], SourceName = SourceName.asInstanceOf[js.Any], SourceNameStandard = SourceNameStandard.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.SlicerItem_typekey")(ExcelDotSlicerItem_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlicerItem]
  }
  @scala.inline
  implicit class SlicerItemOps[Self <: SlicerItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplication(value: Application): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCaption(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Caption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreator(value: XlCreator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExcelDotSlicerItem_typekey(value: SlicerItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Excel.SlicerItem_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HasData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: SlicerCache): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Selected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceName(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceNameStandard(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceNameStandard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

