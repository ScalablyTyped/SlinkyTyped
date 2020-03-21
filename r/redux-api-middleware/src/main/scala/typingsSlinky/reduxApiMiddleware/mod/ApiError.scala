package typingsSlinky.reduxApiMiddleware.mod

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-api-middleware", "ApiError")
@js.native
class ApiError[T] protected () extends Error {
  def this(status: Double, statusText: String, response: T) = this()
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
  @JSName("name")
  var name_ApiError: typingsSlinky.reduxApiMiddleware.reduxApiMiddlewareStrings.ApiError = js.native
  var response: T = js.native
  var status: Double = js.native
  var statusText: String = js.native
}

