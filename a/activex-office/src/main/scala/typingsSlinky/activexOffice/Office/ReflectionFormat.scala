package typingsSlinky.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReflectionFormat extends StObject {
  
  val Application: js.Any = js.native
  
  var Blur: Double = js.native
  
  val Creator: Double = js.native
  
  @JSName("Office.ReflectionFormat_typekey")
  var OfficeDotReflectionFormat_typekey: ReflectionFormat = js.native
  
  var Offset: Double = js.native
  
  var Size: Double = js.native
  
  var Transparency: Double = js.native
  
  var Type: MsoReflectionType = js.native
}
object ReflectionFormat {
  
  @scala.inline
  def apply(
    Application: js.Any,
    Blur: Double,
    Creator: Double,
    OfficeDotReflectionFormat_typekey: ReflectionFormat,
    Offset: Double,
    Size: Double,
    Transparency: Double,
    Type: MsoReflectionType
  ): ReflectionFormat = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Blur = Blur.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Offset = Offset.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], Transparency = Transparency.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.ReflectionFormat_typekey")(OfficeDotReflectionFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReflectionFormat]
  }
  
  @scala.inline
  implicit class ReflectionFormatMutableBuilder[Self <: ReflectionFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: js.Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlur(value: Double): Self = StObject.set(x, "Blur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfficeDotReflectionFormat_typekey(value: ReflectionFormat): Self = StObject.set(x, "Office.ReflectionFormat_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "Offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransparency(value: Double): Self = StObject.set(x, "Transparency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: MsoReflectionType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
