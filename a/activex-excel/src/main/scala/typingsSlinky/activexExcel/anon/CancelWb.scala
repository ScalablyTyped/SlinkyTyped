package typingsSlinky.activexExcel.anon

import typingsSlinky.activexExcel.Excel.Workbook
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelWb extends StObject {
  
  var Cancel: Boolean = js.native
  
  val Wb: Workbook = js.native
}
object CancelWb {
  
  @scala.inline
  def apply(Cancel: Boolean, Wb: Workbook): CancelWb = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Wb = Wb.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelWb]
  }
  
  @scala.inline
  implicit class CancelWbMutableBuilder[Self <: CancelWb] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: Boolean): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWb(value: Workbook): Self = StObject.set(x, "Wb", value.asInstanceOf[js.Any])
  }
}
