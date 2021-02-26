package typingsSlinky.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Note extends StObject {
  
  /**
    * The text of a note.
    */
  var Text: NonEmptyString = js.native
  
  /**
    * The timestamp of when the note was updated. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var UpdatedAt: NonEmptyString = js.native
  
  /**
    * The principal that created a note.
    */
  var UpdatedBy: NonEmptyString = js.native
}
object Note {
  
  @scala.inline
  def apply(Text: NonEmptyString, UpdatedAt: NonEmptyString, UpdatedBy: NonEmptyString): Note = {
    val __obj = js.Dynamic.literal(Text = Text.asInstanceOf[js.Any], UpdatedAt = UpdatedAt.asInstanceOf[js.Any], UpdatedBy = UpdatedBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Note]
  }
  
  @scala.inline
  implicit class NoteMutableBuilder[Self <: Note] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setText(value: NonEmptyString): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedAt(value: NonEmptyString): Self = StObject.set(x, "UpdatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedBy(value: NonEmptyString): Self = StObject.set(x, "UpdatedBy", value.asInstanceOf[js.Any])
  }
}
