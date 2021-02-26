package typingsSlinky.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SmartTagOptions extends StObject {
  
  val Application: typingsSlinky.activexExcel.Excel.Application = js.native
  
  val Creator: XlCreator = js.native
  
  var DisplaySmartTags: XlSmartTagDisplayMode = js.native
  
  var EmbedSmartTags: Boolean = js.native
  
  @JSName("Excel.SmartTagOptions_typekey")
  var ExcelDotSmartTagOptions_typekey: SmartTagOptions = js.native
  
  val Parent: js.Any = js.native
}
object SmartTagOptions {
  
  @scala.inline
  def apply(
    Application: Application,
    Creator: XlCreator,
    DisplaySmartTags: XlSmartTagDisplayMode,
    EmbedSmartTags: Boolean,
    ExcelDotSmartTagOptions_typekey: SmartTagOptions,
    Parent: js.Any
  ): SmartTagOptions = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], DisplaySmartTags = DisplaySmartTags.asInstanceOf[js.Any], EmbedSmartTags = EmbedSmartTags.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.SmartTagOptions_typekey")(ExcelDotSmartTagOptions_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartTagOptions]
  }
  
  @scala.inline
  implicit class SmartTagOptionsMutableBuilder[Self <: SmartTagOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplaySmartTags(value: XlSmartTagDisplayMode): Self = StObject.set(x, "DisplaySmartTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmbedSmartTags(value: Boolean): Self = StObject.set(x, "EmbedSmartTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcelDotSmartTagOptions_typekey(value: SmartTagOptions): Self = StObject.set(x, "Excel.SmartTagOptions_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
  }
}
