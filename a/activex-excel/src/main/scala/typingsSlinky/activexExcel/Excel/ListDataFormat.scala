package typingsSlinky.activexExcel.Excel

import typingsSlinky.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListDataFormat extends StObject {
  
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
  implicit class ListDataFormatMutableBuilder[Self <: ListDataFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowFillIn(value: Boolean): Self = StObject.set(x, "AllowFillIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChoices(value: SafeArray[String]): Self = StObject.set(x, "Choices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecimalPlaces(value: Double): Self = StObject.set(x, "DecimalPlaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValue(value: js.Any): Self = StObject.set(x, "DefaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcelDotListDataFormat_typekey(value: ListDataFormat): Self = StObject.set(x, "Excel.ListDataFormat_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPercent(value: Boolean): Self = StObject.set(x, "IsPercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLcid(value: Double): Self = StObject.set(x, "lcid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxCharacters(value: Double): Self = StObject.set(x, "MaxCharacters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxNumber(value: Double): Self = StObject.set(x, "MaxNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxNumberNull: Self = StObject.set(x, "MaxNumber", null)
    
    @scala.inline
    def setMinNumber(value: Double): Self = StObject.set(x, "MinNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinNumberNull: Self = StObject.set(x, "MinNumber", null)
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = StObject.set(x, "ReadOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequired(value: Boolean): Self = StObject.set(x, "Required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: XlListDataType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_Default(value: XlListDataType): Self = StObject.set(x, "_Default", value.asInstanceOf[js.Any])
  }
}
