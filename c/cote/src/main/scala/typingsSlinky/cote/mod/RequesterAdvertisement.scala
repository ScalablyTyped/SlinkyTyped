package typingsSlinky.cote.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequesterAdvertisement extends Advertisement {
  
  /**
    * Request types that a Requester can send.
    */
  var requests: js.UndefOr[js.Array[String]] = js.native
}
object RequesterAdvertisement {
  
  @scala.inline
  def apply(name: String): RequesterAdvertisement = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequesterAdvertisement]
  }
  
  @scala.inline
  implicit class RequesterAdvertisementMutableBuilder[Self <: RequesterAdvertisement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequests(value: js.Array[String]): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestsUndefined: Self = StObject.set(x, "requests", js.undefined)
    
    @scala.inline
    def setRequestsVarargs(value: String*): Self = StObject.set(x, "requests", js.Array(value :_*))
  }
}
