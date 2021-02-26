package typingsSlinky.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsertInlineImageResponse extends StObject {
  
  /** The ID of the created InlineObject. */
  var objectId: js.UndefOr[String] = js.native
}
object InsertInlineImageResponse {
  
  @scala.inline
  def apply(): InsertInlineImageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsertInlineImageResponse]
  }
  
  @scala.inline
  implicit class InsertInlineImageResponseMutableBuilder[Self <: InsertInlineImageResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
  }
}
