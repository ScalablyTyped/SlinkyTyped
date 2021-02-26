package typingsSlinky.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllowedMethods extends StObject {
  
  var CachedMethods: js.UndefOr[typingsSlinky.awsSdk.cloudfrontMod.CachedMethods] = js.native
  
  /**
    * A complex type that contains the HTTP methods that you want CloudFront to process and forward to your origin.
    */
  var Items: MethodsList = js.native
  
  /**
    * The number of HTTP methods that you want CloudFront to forward to your origin. Valid values are 2 (for GET and HEAD requests), 3 (for GET, HEAD, and OPTIONS requests) and 7 (for GET, HEAD, OPTIONS, PUT, PATCH, POST, and DELETE requests).
    */
  var Quantity: integer = js.native
}
object AllowedMethods {
  
  @scala.inline
  def apply(Items: MethodsList, Quantity: integer): AllowedMethods = {
    val __obj = js.Dynamic.literal(Items = Items.asInstanceOf[js.Any], Quantity = Quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowedMethods]
  }
  
  @scala.inline
  implicit class AllowedMethodsMutableBuilder[Self <: AllowedMethods] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCachedMethods(value: CachedMethods): Self = StObject.set(x, "CachedMethods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCachedMethodsUndefined: Self = StObject.set(x, "CachedMethods", js.undefined)
    
    @scala.inline
    def setItems(value: MethodsList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: Method*): Self = StObject.set(x, "Items", js.Array(value :_*))
    
    @scala.inline
    def setQuantity(value: integer): Self = StObject.set(x, "Quantity", value.asInstanceOf[js.Any])
  }
}
