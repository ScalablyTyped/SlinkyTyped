package typingsSlinky.muiDatatables.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MUIDataTableTextLabelsSelectedRows extends StObject {
  
  var delete: String = js.native
  
  var deleteAria: String = js.native
  
  var text: String = js.native
}
object MUIDataTableTextLabelsSelectedRows {
  
  @scala.inline
  def apply(delete: String, deleteAria: String, text: String): MUIDataTableTextLabelsSelectedRows = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], deleteAria = deleteAria.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableTextLabelsSelectedRows]
  }
  
  @scala.inline
  implicit class MUIDataTableTextLabelsSelectedRowsMutableBuilder[Self <: MUIDataTableTextLabelsSelectedRows] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelete(value: String): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteAria(value: String): Self = StObject.set(x, "deleteAria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
