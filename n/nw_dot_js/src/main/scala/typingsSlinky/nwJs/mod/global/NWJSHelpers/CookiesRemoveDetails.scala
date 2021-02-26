package typingsSlinky.nwJs.mod.global.NWJSHelpers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Coockies.remove() details argument object
  */
@js.native
trait CookiesRemoveDetails extends StObject {
  
  /**
    * The name of the cookie to remove.
    */
  var name: String = js.native
  
  /**
    * The ID of the cookie store to look in for the cookie.
    */
  var storeId: String = js.native
  
  /**
    * The URL associated with the cookie.
    */
  var url: String = js.native
}
object CookiesRemoveDetails {
  
  @scala.inline
  def apply(name: String, storeId: String, url: String): CookiesRemoveDetails = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], storeId = storeId.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[CookiesRemoveDetails]
  }
  
  @scala.inline
  implicit class CookiesRemoveDetailsMutableBuilder[Self <: CookiesRemoveDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoreId(value: String): Self = StObject.set(x, "storeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
