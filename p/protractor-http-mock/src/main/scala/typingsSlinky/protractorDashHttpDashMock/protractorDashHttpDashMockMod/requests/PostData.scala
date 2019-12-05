package typingsSlinky.protractorDashHttpDashMock.protractorDashHttpDashMockMod.requests

import typingsSlinky.protractorDashHttpDashMock.Anon_Data
import typingsSlinky.protractorDashHttpDashMock.Anon_DataMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * POST request mock with payload.
  */
trait PostData[TResponse, TPayload] extends js.Object {
  var request: Anon_DataMethod[TPayload]
  var response: Anon_Data[TResponse]
}

object PostData {
  @scala.inline
  def apply[TResponse, TPayload](request: Anon_DataMethod[TPayload], response: Anon_Data[TResponse]): PostData[TResponse, TPayload] = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PostData[TResponse, TPayload]]
  }
}

