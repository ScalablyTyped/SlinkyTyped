package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomTimeZone extends TimeZoneBase {
  
  /**
    * The time offset of the time zone from Coordinated Universal Time (UTC). This value is in minutes. Time zones that are
    * ahead of UTC have a positive offset; time zones that are behind UTC have a negative offset.
    */
  var bias: js.UndefOr[NullableOption[Double]] = js.native
  
  // Specifies when the time zone switches from standard time to daylight saving time.
  var daylightOffset: js.UndefOr[NullableOption[DaylightTimeZoneOffset]] = js.native
  
  // Specifies when the time zone switches from daylight saving time to standard time.
  var standardOffset: js.UndefOr[NullableOption[StandardTimeZoneOffset]] = js.native
}
object CustomTimeZone {
  
  @scala.inline
  def apply(): CustomTimeZone = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomTimeZone]
  }
  
  @scala.inline
  implicit class CustomTimeZoneOps[Self <: CustomTimeZone] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBias(value: NullableOption[Double]): Self = this.set("bias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBias: Self = this.set("bias", js.undefined)
    
    @scala.inline
    def setBiasNull: Self = this.set("bias", null)
    
    @scala.inline
    def setDaylightOffset(value: NullableOption[DaylightTimeZoneOffset]): Self = this.set("daylightOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDaylightOffset: Self = this.set("daylightOffset", js.undefined)
    
    @scala.inline
    def setDaylightOffsetNull: Self = this.set("daylightOffset", null)
    
    @scala.inline
    def setStandardOffset(value: NullableOption[StandardTimeZoneOffset]): Self = this.set("standardOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStandardOffset: Self = this.set("standardOffset", js.undefined)
    
    @scala.inline
    def setStandardOffsetNull: Self = this.set("standardOffset", null)
  }
}
