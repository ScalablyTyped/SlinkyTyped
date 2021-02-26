package typingsSlinky.googleapis.gmailV1Mod.gmailV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A draft email in the user&#39;s mailbox.
  */
@js.native
trait SchemaDraft extends StObject {
  
  /**
    * The immutable ID of the draft.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * The message content of the draft.
    */
  var message: js.UndefOr[SchemaMessage] = js.native
}
object SchemaDraft {
  
  @scala.inline
  def apply(): SchemaDraft = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDraft]
  }
  
  @scala.inline
  implicit class SchemaDraftMutableBuilder[Self <: SchemaDraft] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setMessage(value: SchemaMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
