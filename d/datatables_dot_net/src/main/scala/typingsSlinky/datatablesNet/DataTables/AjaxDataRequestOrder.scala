package typingsSlinky.datatablesNet.DataTables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AjaxDataRequestOrder extends StObject {
  
  var column: Double = js.native
  
  var dir: String = js.native
}
object AjaxDataRequestOrder {
  
  @scala.inline
  def apply(column: Double, dir: String): AjaxDataRequestOrder = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any])
    __obj.asInstanceOf[AjaxDataRequestOrder]
  }
  
  @scala.inline
  implicit class AjaxDataRequestOrderMutableBuilder[Self <: AjaxDataRequestOrder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
  }
}
