package typingsSlinky.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClickFeedback extends StObject {
  
  /**
    * The Unix timestamp of the date and time that the result was clicked.
    */
  var ClickTime: js.Date = js.native
  
  /**
    * The unique identifier of the search result that was clicked.
    */
  var ResultId: typingsSlinky.awsSdk.kendraMod.ResultId = js.native
}
object ClickFeedback {
  
  @scala.inline
  def apply(ClickTime: js.Date, ResultId: ResultId): ClickFeedback = {
    val __obj = js.Dynamic.literal(ClickTime = ClickTime.asInstanceOf[js.Any], ResultId = ResultId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClickFeedback]
  }
  
  @scala.inline
  implicit class ClickFeedbackMutableBuilder[Self <: ClickFeedback] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClickTime(value: js.Date): Self = StObject.set(x, "ClickTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultId(value: ResultId): Self = StObject.set(x, "ResultId", value.asInstanceOf[js.Any])
  }
}
