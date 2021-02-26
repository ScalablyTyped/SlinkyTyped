package typingsSlinky.azureSb.mod.Azure.ServiceBus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<azure-sb.azure-sb.Azure.ServiceBus.PaginationOptions> */
@js.native
trait ListSubscriptionsOptions extends StObject {
  
  var skip: js.UndefOr[Double] = js.native
  
  var top: js.UndefOr[Double] = js.native
}
object ListSubscriptionsOptions {
  
  @scala.inline
  def apply(): ListSubscriptionsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSubscriptionsOptions]
  }
  
  @scala.inline
  implicit class ListSubscriptionsOptionsMutableBuilder[Self <: ListSubscriptionsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSkip(value: Double): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
    
    @scala.inline
    def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
  }
}
