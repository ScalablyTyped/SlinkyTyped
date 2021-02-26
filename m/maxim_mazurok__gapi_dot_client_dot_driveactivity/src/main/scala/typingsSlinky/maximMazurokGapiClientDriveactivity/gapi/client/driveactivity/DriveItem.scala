package typingsSlinky.maximMazurokGapiClientDriveactivity.gapi.client.driveactivity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DriveItem extends StObject {
  
  /** The Drive item is a file. */
  var driveFile: js.UndefOr[js.Any] = js.native
  
  /** The Drive item is a folder. Includes information about the type of folder. */
  var driveFolder: js.UndefOr[DriveFolder] = js.native
  
  /** This field is deprecated; please use the `driveFile` field instead. */
  var file: js.UndefOr[js.Any] = js.native
  
  /** This field is deprecated; please use the `driveFolder` field instead. */
  var folder: js.UndefOr[Folder] = js.native
  
  /** The MIME type of the Drive item. See https://developers.google.com/drive/v3/web/mime-types. */
  var mimeType: js.UndefOr[String] = js.native
  
  /** The target Drive item. The format is "items/ITEM_ID". */
  var name: js.UndefOr[String] = js.native
  
  /** Information about the owner of this Drive item. */
  var owner: js.UndefOr[Owner] = js.native
  
  /** The title of the Drive item. */
  var title: js.UndefOr[String] = js.native
}
object DriveItem {
  
  @scala.inline
  def apply(): DriveItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DriveItem]
  }
  
  @scala.inline
  implicit class DriveItemMutableBuilder[Self <: DriveItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDriveFile(value: js.Any): Self = StObject.set(x, "driveFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDriveFileUndefined: Self = StObject.set(x, "driveFile", js.undefined)
    
    @scala.inline
    def setDriveFolder(value: DriveFolder): Self = StObject.set(x, "driveFolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDriveFolderUndefined: Self = StObject.set(x, "driveFolder", js.undefined)
    
    @scala.inline
    def setFile(value: js.Any): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    @scala.inline
    def setFolder(value: Folder): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFolderUndefined: Self = StObject.set(x, "folder", js.undefined)
    
    @scala.inline
    def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOwner(value: Owner): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
