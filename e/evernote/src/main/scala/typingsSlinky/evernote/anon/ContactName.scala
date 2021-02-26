package typingsSlinky.evernote.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContactName extends StObject {
  
  var contactName: js.UndefOr[String] = js.native
  
  var guid: js.UndefOr[typingsSlinky.evernote.mod.Types.Guid] = js.native
  
  var hasSharedNotebook: js.UndefOr[Boolean] = js.native
  
  var joinedUserCount: js.UndefOr[Double] = js.native
  
  var notebookDisplayName: js.UndefOr[String] = js.native
}
object ContactName {
  
  @scala.inline
  def apply(): ContactName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContactName]
  }
  
  @scala.inline
  implicit class ContactNameMutableBuilder[Self <: ContactName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContactName(value: String): Self = StObject.set(x, "contactName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactNameUndefined: Self = StObject.set(x, "contactName", js.undefined)
    
    @scala.inline
    def setGuid(value: typingsSlinky.evernote.mod.Types.Guid): Self = StObject.set(x, "guid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuidUndefined: Self = StObject.set(x, "guid", js.undefined)
    
    @scala.inline
    def setHasSharedNotebook(value: Boolean): Self = StObject.set(x, "hasSharedNotebook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasSharedNotebookUndefined: Self = StObject.set(x, "hasSharedNotebook", js.undefined)
    
    @scala.inline
    def setJoinedUserCount(value: Double): Self = StObject.set(x, "joinedUserCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJoinedUserCountUndefined: Self = StObject.set(x, "joinedUserCount", js.undefined)
    
    @scala.inline
    def setNotebookDisplayName(value: String): Self = StObject.set(x, "notebookDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotebookDisplayNameUndefined: Self = StObject.set(x, "notebookDisplayName", js.undefined)
  }
}
