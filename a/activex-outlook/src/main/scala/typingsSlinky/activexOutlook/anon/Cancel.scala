package typingsSlinky.activexOutlook.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cancel extends StObject {
  
  var Cancel: Boolean = js.native
  
  val FolderToShare: typingsSlinky.activexOutlook.Outlook.Folder = js.native
}
object Cancel {
  
  @scala.inline
  def apply(Cancel: Boolean, FolderToShare: typingsSlinky.activexOutlook.Outlook.Folder): Cancel = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], FolderToShare = FolderToShare.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cancel]
  }
  
  @scala.inline
  implicit class CancelMutableBuilder[Self <: Cancel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: Boolean): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFolderToShare(value: typingsSlinky.activexOutlook.Outlook.Folder): Self = StObject.set(x, "FolderToShare", value.asInstanceOf[js.Any])
  }
}
