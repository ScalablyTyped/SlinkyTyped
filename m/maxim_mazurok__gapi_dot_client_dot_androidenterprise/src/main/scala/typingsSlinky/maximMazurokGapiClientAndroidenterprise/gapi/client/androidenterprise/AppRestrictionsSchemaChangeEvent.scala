package typingsSlinky.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppRestrictionsSchemaChangeEvent extends StObject {
  
  /** The id of the product (e.g. "app:com.google.android.gm") for which the app restriction schema changed. This field will always be present. */
  var productId: js.UndefOr[String] = js.native
}
object AppRestrictionsSchemaChangeEvent {
  
  @scala.inline
  def apply(): AppRestrictionsSchemaChangeEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppRestrictionsSchemaChangeEvent]
  }
  
  @scala.inline
  implicit class AppRestrictionsSchemaChangeEventMutableBuilder[Self <: AppRestrictionsSchemaChangeEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
  }
}
