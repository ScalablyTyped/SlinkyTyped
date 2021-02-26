package typingsSlinky.googleapis.booksV1Mod.booksV1

import typingsSlinky.googleapis.anon.FolderName
import typingsSlinky.googleapis.anon.MatchMyInterests
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaUsersettings extends StObject {
  
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * User settings in sub-objects, each for different purposes.
    */
  var notesExport: js.UndefOr[FolderName] = js.native
  
  var notification: js.UndefOr[MatchMyInterests] = js.native
}
object SchemaUsersettings {
  
  @scala.inline
  def apply(): SchemaUsersettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUsersettings]
  }
  
  @scala.inline
  implicit class SchemaUsersettingsMutableBuilder[Self <: SchemaUsersettings] (val x: Self) extends AnyVal {
    
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
