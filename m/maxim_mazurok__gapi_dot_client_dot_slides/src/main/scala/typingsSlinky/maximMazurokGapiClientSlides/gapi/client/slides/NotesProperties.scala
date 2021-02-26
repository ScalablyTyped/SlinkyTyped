package typingsSlinky.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotesProperties extends StObject {
  
  /**
    * The object ID of the shape on this notes page that contains the speaker notes for the corresponding slide. The actual shape may not always exist on the notes page. Inserting text
    * using this object ID will automatically create the shape. In this case, the actual shape may have different object ID. The `GetPresentation` or `GetPage` action will always return
    * the latest object ID.
    */
  var speakerNotesObjectId: js.UndefOr[String] = js.native
}
object NotesProperties {
  
  @scala.inline
  def apply(): NotesProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotesProperties]
  }
  
  @scala.inline
  implicit class NotesPropertiesMutableBuilder[Self <: NotesProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSpeakerNotesObjectId(value: String): Self = StObject.set(x, "speakerNotesObjectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeakerNotesObjectIdUndefined: Self = StObject.set(x, "speakerNotesObjectId", js.undefined)
  }
}
