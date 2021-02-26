package typingsSlinky.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddNamedRangeResponse extends StObject {
  
  /** The named range to add. */
  var namedRange: js.UndefOr[NamedRange] = js.native
}
object AddNamedRangeResponse {
  
  @scala.inline
  def apply(): AddNamedRangeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddNamedRangeResponse]
  }
  
  @scala.inline
  implicit class AddNamedRangeResponseMutableBuilder[Self <: AddNamedRangeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNamedRange(value: NamedRange): Self = StObject.set(x, "namedRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamedRangeUndefined: Self = StObject.set(x, "namedRange", js.undefined)
  }
}
