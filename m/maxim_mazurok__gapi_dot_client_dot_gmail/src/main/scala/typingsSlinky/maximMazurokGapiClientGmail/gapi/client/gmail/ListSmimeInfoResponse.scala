package typingsSlinky.maximMazurokGapiClientGmail.gapi.client.gmail

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListSmimeInfoResponse extends StObject {
  
  /** List of SmimeInfo. */
  var smimeInfo: js.UndefOr[js.Array[SmimeInfo]] = js.native
}
object ListSmimeInfoResponse {
  
  @scala.inline
  def apply(): ListSmimeInfoResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSmimeInfoResponse]
  }
  
  @scala.inline
  implicit class ListSmimeInfoResponseMutableBuilder[Self <: ListSmimeInfoResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSmimeInfo(value: js.Array[SmimeInfo]): Self = StObject.set(x, "smimeInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmimeInfoUndefined: Self = StObject.set(x, "smimeInfo", js.undefined)
    
    @scala.inline
    def setSmimeInfoVarargs(value: SmimeInfo*): Self = StObject.set(x, "smimeInfo", js.Array(value :_*))
  }
}
