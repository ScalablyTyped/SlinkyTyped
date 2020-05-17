package typingsSlinky.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomProperty extends js.Object {
  val Application: typingsSlinky.activexExcel.Excel.Application = js.native
  val Creator: XlCreator = js.native
  @JSName("Excel.CustomProperty_typekey")
  var ExcelDotCustomProperty_typekey: CustomProperty = js.native
  var Name: String = js.native
  val Parent: js.Any = js.native
  var Value: js.Any = js.native
  val _Default: js.Any = js.native
  def Delete(): Unit = js.native
}

object CustomProperty {
  @scala.inline
  def apply(
    Application: Application,
    Creator: XlCreator,
    Delete: () => Unit,
    ExcelDotCustomProperty_typekey: CustomProperty,
    Name: String,
    Parent: js.Any,
    Value: js.Any,
    _Default: js.Any
  ): CustomProperty = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], _Default = _Default.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.CustomProperty_typekey")(ExcelDotCustomProperty_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomProperty]
  }
  @scala.inline
  implicit class CustomPropertyOps[Self <: CustomProperty] (val x: Self) extends AnyVal {
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
    def withExcelDotCustomProperty_typekey(value: CustomProperty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Excel.CustomProperty_typekey")(value.asInstanceOf[js.Any])
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
    def withValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_Default(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_Default")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

