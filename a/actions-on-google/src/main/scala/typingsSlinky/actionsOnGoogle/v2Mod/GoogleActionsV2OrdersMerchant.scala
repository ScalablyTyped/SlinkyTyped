package typingsSlinky.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2OrdersMerchant extends StObject {
  
  /**
    * Id of the merchant.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * User-visible name of the merchant. Required.
    */
  var name: js.UndefOr[String] = js.native
}
object GoogleActionsV2OrdersMerchant {
  
  @scala.inline
  def apply(): GoogleActionsV2OrdersMerchant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2OrdersMerchant]
  }
  
  @scala.inline
  implicit class GoogleActionsV2OrdersMerchantMutableBuilder[Self <: GoogleActionsV2OrdersMerchant] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
