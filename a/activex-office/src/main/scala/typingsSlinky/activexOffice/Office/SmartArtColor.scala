package typingsSlinky.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SmartArtColor extends StObject {
  
  val Application: js.Any = js.native
  
  val Category: String = js.native
  
  val Creator: Double = js.native
  
  val Description: String = js.native
  
  val Id: String = js.native
  
  val Name: String = js.native
  
  @JSName("Office.SmartArtColor_typekey")
  var OfficeDotSmartArtColor_typekey: SmartArtColor = js.native
  
  val Parent: js.Any = js.native
}
object SmartArtColor {
  
  @scala.inline
  def apply(
    Application: js.Any,
    Category: String,
    Creator: Double,
    Description: String,
    Id: String,
    Name: String,
    OfficeDotSmartArtColor_typekey: SmartArtColor,
    Parent: js.Any
  ): SmartArtColor = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Category = Category.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.SmartArtColor_typekey")(OfficeDotSmartArtColor_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartArtColor]
  }
  
  @scala.inline
  implicit class SmartArtColorMutableBuilder[Self <: SmartArtColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: js.Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategory(value: String): Self = StObject.set(x, "Category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfficeDotSmartArtColor_typekey(value: SmartArtColor): Self = StObject.set(x, "Office.SmartArtColor_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
  }
}
