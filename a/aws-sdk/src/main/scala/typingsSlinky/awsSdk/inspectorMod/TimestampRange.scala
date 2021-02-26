package typingsSlinky.awsSdk.inspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimestampRange extends StObject {
  
  /**
    * The minimum value of the timestamp range.
    */
  var beginDate: js.UndefOr[js.Date] = js.native
  
  /**
    * The maximum value of the timestamp range.
    */
  var endDate: js.UndefOr[js.Date] = js.native
}
object TimestampRange {
  
  @scala.inline
  def apply(): TimestampRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimestampRange]
  }
  
  @scala.inline
  implicit class TimestampRangeMutableBuilder[Self <: TimestampRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBeginDate(value: js.Date): Self = StObject.set(x, "beginDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeginDateUndefined: Self = StObject.set(x, "beginDate", js.undefined)
    
    @scala.inline
    def setEndDate(value: js.Date): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
  }
}
