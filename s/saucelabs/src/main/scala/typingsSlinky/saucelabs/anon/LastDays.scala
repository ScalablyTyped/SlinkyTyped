package typingsSlinky.saucelabs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LastDays extends StObject {
  
  var lastDays: js.UndefOr[Double] = js.native
  
  var limit: js.UndefOr[Double] = js.native
  
  var offset: js.UndefOr[Double] = js.native
  
  var userId: js.UndefOr[String] = js.native
}
object LastDays {
  
  @scala.inline
  def apply(): LastDays = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LastDays]
  }
  
  @scala.inline
  implicit class LastDaysMutableBuilder[Self <: LastDays] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLastDays(value: Double): Self = StObject.set(x, "lastDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastDaysUndefined: Self = StObject.set(x, "lastDays", js.undefined)
    
    @scala.inline
    def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
