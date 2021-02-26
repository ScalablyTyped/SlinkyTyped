package typingsSlinky.azdata.mod.nb

import typingsSlinky.vscode.mod.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotebookCell extends StObject {
  
  var contents: ICellContents = js.native
  
  var uri: js.UndefOr[Uri] = js.native
}
object NotebookCell {
  
  @scala.inline
  def apply(contents: ICellContents): NotebookCell = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotebookCell]
  }
  
  @scala.inline
  implicit class NotebookCellMutableBuilder[Self <: NotebookCell] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContents(value: ICellContents): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUri(value: Uri): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
