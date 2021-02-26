package typingsSlinky.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpenDialogReturnValue extends StObject {
  
  /**
    * An array matching the `filePaths` array of base64 encoded strings which contains
    * security scoped bookmark data. `securityScopedBookmarks` must be enabled for
    * this to be populated. (For return values, see table here.)
    *
    * @platform darwin,mas
    */
  var bookmarks: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * whether or not the dialog was canceled.
    */
  var canceled: Boolean = js.native
  
  /**
    * An array of file paths chosen by the user. If the dialog is cancelled this will
    * be an empty array.
    */
  var filePaths: js.Array[String] = js.native
}
object OpenDialogReturnValue {
  
  @scala.inline
  def apply(canceled: Boolean, filePaths: js.Array[String]): OpenDialogReturnValue = {
    val __obj = js.Dynamic.literal(canceled = canceled.asInstanceOf[js.Any], filePaths = filePaths.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenDialogReturnValue]
  }
  
  @scala.inline
  implicit class OpenDialogReturnValueMutableBuilder[Self <: OpenDialogReturnValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBookmarks(value: js.Array[String]): Self = StObject.set(x, "bookmarks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBookmarksUndefined: Self = StObject.set(x, "bookmarks", js.undefined)
    
    @scala.inline
    def setBookmarksVarargs(value: String*): Self = StObject.set(x, "bookmarks", js.Array(value :_*))
    
    @scala.inline
    def setCanceled(value: Boolean): Self = StObject.set(x, "canceled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilePaths(value: js.Array[String]): Self = StObject.set(x, "filePaths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilePathsVarargs(value: String*): Self = StObject.set(x, "filePaths", js.Array(value :_*))
  }
}
