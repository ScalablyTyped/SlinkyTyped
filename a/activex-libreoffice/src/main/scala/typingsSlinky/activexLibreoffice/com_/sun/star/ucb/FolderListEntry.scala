package typingsSlinky.activexLibreoffice.com_.sun.star.ucb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Information about a single folder in a {@link FolderList} . */
@js.native
trait FolderListEntry extends StObject {
  
  /**
    * A (unique) identifier for the folder (used by IMAP, where different folders with equal human-readable titles may exist; otherwise, it may be left
    * empty).
    */
  var ID: String = js.native
  
  /** The folder is new. */
  var New: Boolean = js.native
  
  /** The folder shall be purged (only used in conjunction with the FolderListCommand::SET). */
  var Purge: Boolean = js.native
  
  /** The folder has been removed. */
  var Removed: Boolean = js.native
  
  /** The folder is subscribed. */
  var Subscribed: Boolean = js.native
  
  /** The title of the folder. */
  var Title: String = js.native
}
object FolderListEntry {
  
  @scala.inline
  def apply(ID: String, New: Boolean, Purge: Boolean, Removed: Boolean, Subscribed: Boolean, Title: String): FolderListEntry = {
    val __obj = js.Dynamic.literal(ID = ID.asInstanceOf[js.Any], New = New.asInstanceOf[js.Any], Purge = Purge.asInstanceOf[js.Any], Removed = Removed.asInstanceOf[js.Any], Subscribed = Subscribed.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any])
    __obj.asInstanceOf[FolderListEntry]
  }
  
  @scala.inline
  implicit class FolderListEntryMutableBuilder[Self <: FolderListEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setID(value: String): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNew(value: Boolean): Self = StObject.set(x, "New", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPurge(value: Boolean): Self = StObject.set(x, "Purge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoved(value: Boolean): Self = StObject.set(x, "Removed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscribed(value: Boolean): Self = StObject.set(x, "Subscribed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
  }
}
