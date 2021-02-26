package typingsSlinky.maximMazurokGapiClientBooks.gapi.client.books

import typingsSlinky.maximMazurokGapiClientBooks.anon.FolderName
import typingsSlinky.maximMazurokGapiClientBooks.anon.MatchMyInterests
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Usersettings extends StObject {
  
  /** Resource type. */
  var kind: js.UndefOr[String] = js.native
  
  /** User settings in sub-objects, each for different purposes. */
  var notesExport: js.UndefOr[FolderName] = js.native
  
  var notification: js.UndefOr[MatchMyInterests] = js.native
}
object Usersettings {
  
  @scala.inline
  def apply(): Usersettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Usersettings]
  }
  
  @scala.inline
  implicit class UsersettingsMutableBuilder[Self <: Usersettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNotesExport(value: FolderName): Self = StObject.set(x, "notesExport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotesExportUndefined: Self = StObject.set(x, "notesExport", js.undefined)
    
    @scala.inline
    def setNotification(value: MatchMyInterests): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationUndefined: Self = StObject.set(x, "notification", js.undefined)
  }
}
