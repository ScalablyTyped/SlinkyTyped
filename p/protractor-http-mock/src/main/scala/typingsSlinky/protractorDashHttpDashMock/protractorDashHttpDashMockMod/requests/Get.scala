package typingsSlinky.protractorDashHttpDashMock.protractorDashHttpDashMockMod.requests

import typingsSlinky.protractorDashHttpDashMock.Anon_Data
import typingsSlinky.protractorDashHttpDashMock.Anon_GET
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * GET request mock.
  */
trait Get[TResponse] extends js.Object {
  var request: Anon_GET
  var response: Anon_Data[TResponse]
}

object Get {
  @scala.inline
  def apply[TResponse](request: Anon_GET, response: Anon_Data[TResponse]): Get[TResponse] = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Get[TResponse]]
  }
}

