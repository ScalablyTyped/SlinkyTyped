package typingsSlinky.awsDashSdk.clientsKendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClickFeedback extends js.Object {
  /**
    * The Unix timestamp of the data and time that the result was clicked.
    */
  var ClickTime: js.Date = js.native
  /**
    * The unique identifier of the search result that was clicked.
    */
  var ResultId: typingsSlinky.awsDashSdk.clientsKendraMod.ResultId = js.native
}

object ClickFeedback {
  @scala.inline
  def apply(ClickTime: js.Date, ResultId: ResultId): ClickFeedback = {
    val __obj = js.Dynamic.literal(ClickTime = ClickTime.asInstanceOf[js.Any], ResultId = ResultId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ClickFeedback]
  }
}

