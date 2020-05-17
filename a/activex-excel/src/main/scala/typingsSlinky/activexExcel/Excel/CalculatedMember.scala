package typingsSlinky.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CalculatedMember extends js.Object {
  val Application: typingsSlinky.activexExcel.Excel.Application = js.native
  val Creator: XlCreator = js.native
  val DisplayFolder: String = js.native
  val Dynamic: Boolean = js.native
  @JSName("Excel.CalculatedMember_typekey")
  var ExcelDotCalculatedMember_typekey: CalculatedMember = js.native
  var FlattenHierarchies: Boolean = js.native
  val Formula: String = js.native
  var HierarchizeDistinct: Boolean = js.native
  val IsValid: Boolean = js.native
  val Name: String = js.native
  val Parent: js.Any = js.native
  val SolveOrder: Double = js.native
  val SourceName: String = js.native
  val Type: XlCalculatedMemberType = js.native
  val _Default: String = js.native
  def Delete(): Unit = js.native
}

object CalculatedMember {
  @scala.inline
  def apply(
    Application: Application,
    Creator: XlCreator,
    Delete: () => Unit,
    DisplayFolder: String,
    Dynamic: Boolean,
    ExcelDotCalculatedMember_typekey: CalculatedMember,
    FlattenHierarchies: Boolean,
    Formula: String,
    HierarchizeDistinct: Boolean,
    IsValid: Boolean,
    Name: String,
    Parent: js.Any,
    SolveOrder: Double,
    SourceName: String,
    Type: XlCalculatedMemberType,
    _Default: String
  ): CalculatedMember = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), DisplayFolder = DisplayFolder.asInstanceOf[js.Any], Dynamic = Dynamic.asInstanceOf[js.Any], FlattenHierarchies = FlattenHierarchies.asInstanceOf[js.Any], Formula = Formula.asInstanceOf[js.Any], HierarchizeDistinct = HierarchizeDistinct.asInstanceOf[js.Any], IsValid = IsValid.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], SolveOrder = SolveOrder.asInstanceOf[js.Any], SourceName = SourceName.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], _Default = _Default.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.CalculatedMember_typekey")(ExcelDotCalculatedMember_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalculatedMember]
  }
  @scala.inline
  implicit class CalculatedMemberOps[Self <: CalculatedMember] (val x: Self) extends AnyVal {
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
    def withCreator(value: XlCreator): Self = {
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
    def withDisplayFolder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisplayFolder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDynamic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Dynamic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExcelDotCalculatedMember_typekey(value: CalculatedMember): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Excel.CalculatedMember_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlattenHierarchies(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FlattenHierarchies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormula(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Formula")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHierarchizeDistinct(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HierarchizeDistinct")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsValid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsValid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSolveOrder(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SolveOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: XlCalculatedMemberType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_Default(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_Default")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

