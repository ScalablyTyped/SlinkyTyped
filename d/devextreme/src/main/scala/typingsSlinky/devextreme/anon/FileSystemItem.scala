package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.devextremeStrings.itemView
import typingsSlinky.devextreme.devextremeStrings.navPane
import typingsSlinky.devextreme.mod.DevExpress.core.dxElement
import typingsSlinky.devextreme.mod.DevExpress.events.event
import typingsSlinky.devextreme.mod.DevExpress.ui.dxFileManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileSystemItem extends StObject {
  
  var component: js.UndefOr[dxFileManager] = js.native
  
  var element: js.UndefOr[dxElement] = js.native
  
  var event: js.UndefOr[typingsSlinky.devextreme.mod.DevExpress.events.event] = js.native
  
  var fileSystemItem: js.UndefOr[typingsSlinky.devextreme.mod.DevExpress.fileManagement.FileSystemItem] = js.native
  
  var itemData: js.UndefOr[js.Any] = js.native
  
  var itemElement: js.UndefOr[dxElement] = js.native
  
  var itemIndex: js.UndefOr[Double] = js.native
  
  var model: js.UndefOr[js.Any] = js.native
  
  var viewArea: js.UndefOr[navPane | itemView] = js.native
}
object FileSystemItem {
  
  @scala.inline
  def apply(): FileSystemItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileSystemItem]
  }
  
  @scala.inline
  implicit class FileSystemItemMutableBuilder[Self <: FileSystemItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponent(value: dxFileManager): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    @scala.inline
    def setElement(value: dxElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    @scala.inline
    def setEvent(value: event): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    @scala.inline
    def setFileSystemItem(value: typingsSlinky.devextreme.mod.DevExpress.fileManagement.FileSystemItem): Self = StObject.set(x, "fileSystemItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileSystemItemUndefined: Self = StObject.set(x, "fileSystemItem", js.undefined)
    
    @scala.inline
    def setItemData(value: js.Any): Self = StObject.set(x, "itemData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemDataUndefined: Self = StObject.set(x, "itemData", js.undefined)
    
    @scala.inline
    def setItemElement(value: dxElement): Self = StObject.set(x, "itemElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemElementUndefined: Self = StObject.set(x, "itemElement", js.undefined)
    
    @scala.inline
    def setItemIndex(value: Double): Self = StObject.set(x, "itemIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemIndexUndefined: Self = StObject.set(x, "itemIndex", js.undefined)
    
    @scala.inline
    def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    @scala.inline
    def setViewArea(value: navPane | itemView): Self = StObject.set(x, "viewArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewAreaUndefined: Self = StObject.set(x, "viewArea", js.undefined)
  }
}
