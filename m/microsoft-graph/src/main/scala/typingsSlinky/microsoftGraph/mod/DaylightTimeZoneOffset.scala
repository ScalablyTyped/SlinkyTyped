package typingsSlinky.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DaylightTimeZoneOffset extends StandardTimeZoneOffset {
  
  // The time offset from Coordinated Universal Time (UTC) for daylight saving time. This value is in minutes.
  var daylightBias: js.UndefOr[NullableOption[Double]] = js.native
}
object DaylightTimeZoneOffset {
  
  @scala.inline
  def apply(): DaylightTimeZoneOffset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DaylightTimeZoneOffset]
  }
  
  @scala.inline
  implicit class DaylightTimeZoneOffsetMutableBuilder[Self <: DaylightTimeZoneOffset] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDaylightBias(value: NullableOption[Double]): Self = StObject.set(x, "daylightBias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDaylightBiasNull: Self = StObject.set(x, "daylightBias", null)
    
    @scala.inline
    def setDaylightBiasUndefined: Self = StObject.set(x, "daylightBias", js.undefined)
  }
}
