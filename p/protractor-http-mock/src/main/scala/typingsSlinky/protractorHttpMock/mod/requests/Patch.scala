package typingsSlinky.protractorHttpMock.mod.requests

import typingsSlinky.protractorHttpMock.AnonData
import typingsSlinky.protractorHttpMock.AnonMethodPathRegex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PATCH request mock.
  */
trait Patch[TResponse] extends js.Object {
  var request: AnonMethodPathRegex
  var response: AnonData[TResponse]
}

object Patch {
  @scala.inline
  def apply[TResponse](request: AnonMethodPathRegex, response: AnonData[TResponse]): Patch[TResponse] = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Patch[TResponse]]
  }
}

