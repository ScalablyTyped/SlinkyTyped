package typingsSlinky.protractorDashHttpDashMock.protractorDashHttpDashMockMod.requests

import typingsSlinky.protractorDashHttpDashMock.Anon_Data
import typingsSlinky.protractorDashHttpDashMock.Anon_MethodPATCH
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PATCH request mock.
  */
trait Patch[TResponse] extends js.Object {
  var request: Anon_MethodPATCH
  var response: Anon_Data[TResponse]
}

object Patch {
  @scala.inline
  def apply[TResponse](request: Anon_MethodPATCH, response: Anon_Data[TResponse]): Patch[TResponse] = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Patch[TResponse]]
  }
}

