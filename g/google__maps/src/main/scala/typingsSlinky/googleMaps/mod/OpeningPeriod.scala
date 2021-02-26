package typingsSlinky.googleMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpeningPeriod extends StObject {
  
  /**
    * may contain a pair of day and time objects describing when the place closes.
    * **Note:** If a place is **always open**, the `close` section will be missing from the response.
    * Clients can rely on always-open being represented as an `open` period containing `day` with value 0
    * and `time` with value 0000, and no `close`.
    */
  var close: js.UndefOr[OpeningHoursTime] = js.native
  
  /** contains a pair of day and time objects describing when the place opens. */
  var open: OpeningHoursTime = js.native
}
object OpeningPeriod {
  
  @scala.inline
  def apply(open: OpeningHoursTime): OpeningPeriod = {
    val __obj = js.Dynamic.literal(open = open.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpeningPeriod]
  }
  
  @scala.inline
  implicit class OpeningPeriodMutableBuilder[Self <: OpeningPeriod] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: OpeningHoursTime): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    @scala.inline
    def setOpen(value: OpeningHoursTime): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
  }
}
