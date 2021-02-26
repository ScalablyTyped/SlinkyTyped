package typingsSlinky.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddOrderNotesRequest extends StObject {
  
  /** The list of notes to add. */
  var notes: js.UndefOr[js.Array[MarketplaceNote]] = js.native
}
object AddOrderNotesRequest {
  
  @scala.inline
  def apply(): AddOrderNotesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddOrderNotesRequest]
  }
  
  @scala.inline
  implicit class AddOrderNotesRequestMutableBuilder[Self <: AddOrderNotesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNotes(value: js.Array[MarketplaceNote]): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    @scala.inline
    def setNotesVarargs(value: MarketplaceNote*): Self = StObject.set(x, "notes", js.Array(value :_*))
  }
}
