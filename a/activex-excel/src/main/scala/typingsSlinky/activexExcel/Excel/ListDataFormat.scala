package typingsSlinky.activexExcel.Excel

import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDataFormat extends js.Object {
  val AllowFillIn: Boolean = js.native
  val Application: typingsSlinky.activexExcel.Excel.Application = js.native
  val Choices: SafeArray[String] = js.native
  val Creator: XlCreator = js.native
  val DecimalPlaces: Double = js.native
  val DefaultValue: js.Any = js.native
  @JSName("Excel.ListDataFormat_typekey")
  var ExcelDotListDataFormat_typekey: ListDataFormat = js.native
  val IsPercent: Boolean = js.native
  val MaxCharacters: Double = js.native
  val MaxNumber: Double | Null = js.native
  val MinNumber: Double | Null = js.native
  val Parent: js.Any = js.native
  val ReadOnly: Boolean = js.native
  val Required: Boolean = js.native
  val Type: XlListDataType = js.native
  val _Default: XlListDataType = js.native
  val lcid: Double = js.native
}

object ListDataFormat {
  @scala.inline
  def apply(
    AllowFillIn: Boolean,
    Application: Application,
    Choices: SafeArray[String],
    Creator: XlCreator,
    DecimalPlaces: Double,
    DefaultValue: js.Any,
    ExcelDotListDataFormat_typekey: ListDataFormat,
    IsPercent: Boolean,
    MaxCharacters: Double,
    Parent: js.Any,
    ReadOnly: Boolean,
    Required: Boolean,
    Type: XlListDataType,
    _Default: XlListDataType,
    lcid: Double
  ): ListDataFormat = {
    val __obj = js.Dynamic.literal(AllowFillIn = AllowFillIn.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Choices = Choices.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], DecimalPlaces = DecimalPlaces.asInstanceOf[js.Any], DefaultValue = DefaultValue.asInstanceOf[js.Any], IsPercent = IsPercent.asInstanceOf[js.Any], MaxCharacters = MaxCharacters.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], ReadOnly = ReadOnly.asInstanceOf[js.Any], Required = Required.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], _Default = _Default.asInstanceOf[js.Any], lcid = lcid.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.ListDataFormat_typekey")(ExcelDotListDataFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDataFormat]
  }
  @scala.inline
  implicit class ListDataFormatOps[Self <: ListDataFormat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowFillIn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowFillIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplication(value: Application): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChoices(value: SafeArray[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Choices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreator(value: XlCreator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDecimalPlaces(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DecimalPlaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExcelDotListDataFormat_typekey(value: ListDataFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Excel.ListDataFormat_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsPercent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsPercent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxCharacters(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxCharacters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReadOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReadOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Required")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: XlListDataType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_Default(value: XlListDataType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_Default")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLcid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lcid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxNumberNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxNumber")(null)
        ret
    }
    @scala.inline
    def withMinNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinNumberNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinNumber")(null)
        ret
    }
  }
  
}

