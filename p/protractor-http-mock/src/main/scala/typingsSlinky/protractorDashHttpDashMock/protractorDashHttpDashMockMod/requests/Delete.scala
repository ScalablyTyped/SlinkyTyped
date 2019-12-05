package typingsSlinky.protractorDashHttpDashMock.protractorDashHttpDashMockMod.requests

import typingsSlinky.protractorDashHttpDashMock.Anon_DELETE
import typingsSlinky.protractorDashHttpDashMock.Anon_Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * HTTP Delete request mock.
  */
trait Delete[TResponse] extends js.Object {
  var request: Anon_DELETE
  var response: Anon_Data[TResponse]
}

object Delete {
  @scala.inline
  def apply[TResponse](request: Anon_DELETE, response: Anon_Data[TResponse]): Delete[TResponse] = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Delete[TResponse]]
  }
}

