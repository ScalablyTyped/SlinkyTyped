package typingsSlinky.activexExcel.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sheet extends StObject {
  
  val Description: String = js.native
  
  val Sheet: String = js.native
  
  val Success: Boolean = js.native
}
object Sheet {
  
  @scala.inline
  def apply(Description: String, Sheet: String, Success: Boolean): Sheet = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], Sheet = Sheet.asInstanceOf[js.Any], Success = Success.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sheet]
  }
  
  @scala.inline
  implicit class SheetMutableBuilder[Self <: Sheet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSheet(value: String): Self = StObject.set(x, "Sheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: Boolean): Self = StObject.set(x, "Success", value.asInstanceOf[js.Any])
  }
}
