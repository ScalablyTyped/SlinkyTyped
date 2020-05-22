package typingsSlinky.protractorHttpMock.mod.requests

import typingsSlinky.protractorHttpMock.anon.Data
import typingsSlinky.protractorHttpMock.anon.MethodPathRegex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PATCH request mock.
  */
trait Patch[TResponse] extends js.Object {
  var request: MethodPathRegex
  var response: Data[TResponse]
}

object Patch {
  @scala.inline
  def apply[TResponse](request: MethodPathRegex, response: Data[TResponse]): Patch[TResponse] = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[Patch[TResponse]]
  }
}

