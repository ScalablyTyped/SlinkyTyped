package typingsSlinky.protractorDashHttpDashMock.protractorDashHttpDashMockMod.requests

import typingsSlinky.protractorDashHttpDashMock.Anon_Data
import typingsSlinky.protractorDashHttpDashMock.Anon_MethodPUT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PUT request mock.
  */
trait Put[TResponse] extends js.Object {
  var request: Anon_MethodPUT
  var response: Anon_Data[TResponse]
}

object Put {
  @scala.inline
  def apply[TResponse](request: Anon_MethodPUT, response: Anon_Data[TResponse]): Put[TResponse] = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Put[TResponse]]
  }
}

