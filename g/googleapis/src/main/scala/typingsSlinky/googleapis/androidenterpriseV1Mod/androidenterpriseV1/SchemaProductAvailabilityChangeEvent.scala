package typingsSlinky.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An event generated whenever a product&#39;s availability changes.
  */
@js.native
trait SchemaProductAvailabilityChangeEvent extends StObject {
  
  /**
    * The new state of the product. This field will always be present.
    */
  var availabilityStatus: js.UndefOr[String] = js.native
  
  /**
    * The id of the product (e.g. &quot;app:com.google.android.gm&quot;) for
    * which the product availability changed. This field will always be
    * present.
    */
  var productId: js.UndefOr[String] = js.native
}
object SchemaProductAvailabilityChangeEvent {
  
  @scala.inline
  def apply(): SchemaProductAvailabilityChangeEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProductAvailabilityChangeEvent]
  }
  
  @scala.inline
  implicit class SchemaProductAvailabilityChangeEventMutableBuilder[Self <: SchemaProductAvailabilityChangeEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailabilityStatus(value: String): Self = StObject.set(x, "availabilityStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityStatusUndefined: Self = StObject.set(x, "availabilityStatus", js.undefined)
    
    @scala.inline
    def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
  }
}
