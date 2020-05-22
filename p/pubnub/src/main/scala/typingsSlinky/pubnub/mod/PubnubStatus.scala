package typingsSlinky.pubnub.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PubnubStatus extends js.Object {
  var category: js.UndefOr[String] = js.undefined
  var error: Boolean
  var errorData: js.UndefOr[js.Error] = js.undefined
   // see Pubnub.Categories
  var operation: String
   // see Pubnub.Operations
  var statusCode: Double
}

object PubnubStatus {
  @scala.inline
  def apply(
    error: Boolean,
    operation: String,
    statusCode: Double,
    category: String = null,
    errorData: js.Error = null
  ): PubnubStatus = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (errorData != null) __obj.updateDynamic("errorData")(errorData.asInstanceOf[js.Any])
    __obj.asInstanceOf[PubnubStatus]
  }
}

