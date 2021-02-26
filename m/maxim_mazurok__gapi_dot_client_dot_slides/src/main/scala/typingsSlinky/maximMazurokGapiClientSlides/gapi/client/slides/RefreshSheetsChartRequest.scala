package typingsSlinky.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RefreshSheetsChartRequest extends StObject {
  
  /** The object ID of the chart to refresh. */
  var objectId: js.UndefOr[String] = js.native
}
object RefreshSheetsChartRequest {
  
  @scala.inline
  def apply(): RefreshSheetsChartRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RefreshSheetsChartRequest]
  }
  
  @scala.inline
  implicit class RefreshSheetsChartRequestMutableBuilder[Self <: RefreshSheetsChartRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
  }
}
