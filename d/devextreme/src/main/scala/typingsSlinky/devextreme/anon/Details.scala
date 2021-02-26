package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.devextremeStrings.details
import typingsSlinky.devextreme.devextremeStrings.thumbnails
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Details extends StObject {
  
  var details: js.UndefOr[`3`] = js.native
  
  var mode: js.UndefOr[details | thumbnails] = js.native
  
  var showFolders: js.UndefOr[Boolean] = js.native
  
  var showParentFolder: js.UndefOr[Boolean] = js.native
}
object Details {
  
  @scala.inline
  def apply(): Details = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Details]
  }
  
  @scala.inline
  implicit class DetailsMutableBuilder[Self <: Details] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetails(value: `3`): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    @scala.inline
    def setMode(value: details | thumbnails): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setShowFolders(value: Boolean): Self = StObject.set(x, "showFolders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowFoldersUndefined: Self = StObject.set(x, "showFolders", js.undefined)
    
    @scala.inline
    def setShowParentFolder(value: Boolean): Self = StObject.set(x, "showParentFolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowParentFolderUndefined: Self = StObject.set(x, "showParentFolder", js.undefined)
  }
}
