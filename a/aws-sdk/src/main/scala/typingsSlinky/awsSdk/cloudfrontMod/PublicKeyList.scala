package typingsSlinky.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublicKeyList extends StObject {
  
  /**
    * A list of public keys.
    */
  var Items: js.UndefOr[PublicKeySummaryList] = js.native
  
  /**
    * The maximum number of public keys you want in the response.
    */
  var MaxItems: integer = js.native
  
  /**
    * If there are more elements to be listed, this element is present and contains the value that you can use for the Marker request parameter to continue listing your public keys where you left off.
    */
  var NextMarker: js.UndefOr[String] = js.native
  
  /**
    * The number of public keys in the list.
    */
  var Quantity: integer = js.native
}
object PublicKeyList {
  
  @scala.inline
  def apply(MaxItems: integer, Quantity: integer): PublicKeyList = {
    val __obj = js.Dynamic.literal(MaxItems = MaxItems.asInstanceOf[js.Any], Quantity = Quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKeyList]
  }
  
  @scala.inline
  implicit class PublicKeyListMutableBuilder[Self <: PublicKeyList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: PublicKeySummaryList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: PublicKeySummary*): Self = StObject.set(x, "Items", js.Array(value :_*))
    
    @scala.inline
    def setMaxItems(value: integer): Self = StObject.set(x, "MaxItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextMarker(value: String): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
    
    @scala.inline
    def setQuantity(value: integer): Self = StObject.set(x, "Quantity", value.asInstanceOf[js.Any])
  }
}
