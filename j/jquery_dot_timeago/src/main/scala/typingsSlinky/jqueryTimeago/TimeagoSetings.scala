package typingsSlinky.jqueryTimeago

import typingsSlinky.jqueryTimeago.anon.Day
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeagoSetings extends StObject {
  
  var allowFuture: js.UndefOr[Boolean] = js.native
  
  var refreshMillis: js.UndefOr[Double] = js.native
  
  var strings: js.UndefOr[Day] = js.native
}
object TimeagoSetings {
  
  @scala.inline
  def apply(): TimeagoSetings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeagoSetings]
  }
  
  @scala.inline
  implicit class TimeagoSetingsMutableBuilder[Self <: TimeagoSetings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowFuture(value: Boolean): Self = StObject.set(x, "allowFuture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowFutureUndefined: Self = StObject.set(x, "allowFuture", js.undefined)
    
    @scala.inline
    def setRefreshMillis(value: Double): Self = StObject.set(x, "refreshMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshMillisUndefined: Self = StObject.set(x, "refreshMillis", js.undefined)
    
    @scala.inline
    def setStrings(value: Day): Self = StObject.set(x, "strings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringsUndefined: Self = StObject.set(x, "strings", js.undefined)
  }
}
