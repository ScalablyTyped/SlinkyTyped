package typingsSlinky.aliApp.anon

import typingsSlinky.aliApp.aliAppNumbers.`0`
import typingsSlinky.aliApp.aliAppNumbers.`1`
import typingsSlinky.aliApp.aliAppNumbers.`2`
import typingsSlinky.aliApp.aliAppNumbers.`3`
import typingsSlinky.aliApp.my.LocationData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<ali-app.my.GetLocationOptions> */
@js.native
trait PartialGetLocationOptions extends StObject {
  
  var cacheTimeout: js.UndefOr[Double] = js.native
  
  var complete: js.UndefOr[js.Function1[/* res */ js.Any, Unit]] = js.native
  
  var fail: js.UndefOr[js.Function1[/* res */ js.Any, Unit]] = js.native
  
  var success: js.UndefOr[js.Function1[/* res */ LocationData, Unit]] = js.native
  
  var `type`: js.UndefOr[`0` | `1` | `2` | `3`] = js.native
}
object PartialGetLocationOptions {
  
  @scala.inline
  def apply(): PartialGetLocationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialGetLocationOptions]
  }
  
  @scala.inline
  implicit class PartialGetLocationOptionsMutableBuilder[Self <: PartialGetLocationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCacheTimeout(value: Double): Self = StObject.set(x, "cacheTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheTimeoutUndefined: Self = StObject.set(x, "cacheTimeout", js.undefined)
    
    @scala.inline
    def setComplete(value: /* res */ js.Any => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setFail(value: /* res */ js.Any => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* res */ LocationData => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    @scala.inline
    def setType(value: `0` | `1` | `2` | `3`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
