package typingsSlinky.fetchMock.mod

import org.scalajs.dom.experimental.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response: A Response instance - will be used unaltered
  * number: Creates a response with this status
  * string: Creates a 200 response with the string as the response body
  * object: As long as the object is not a MockResponseObject it is
  *  converted into a json string and returned as the body of a 200 response
  * If MockResponseObject was given then it's used to configure response
  * Function(url, opts): A function that is passed the url and opts fetch()
  *  is called with and that returns any of the responses listed above
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.Response
  - js.Promise[
scala.Double | typingsSlinky.fetchMock.mod.MockResponseObject | js.Object | typingsSlinky.std.Response | java.lang.String]
  - scala.Double
  - java.lang.String
  - js.Object
  - typingsSlinky.fetchMock.mod.MockResponseObject
*/
trait MockResponse extends js.Object

object MockResponse {
  @scala.inline
  implicit def apply(value: Double): MockResponse = value.asInstanceOf[MockResponse]
  @scala.inline
  implicit def apply(value: MockResponseObject): MockResponse = value.asInstanceOf[MockResponse]
  @scala.inline
  implicit def apply(value: js.Object): MockResponse = value.asInstanceOf[MockResponse]
  @scala.inline
  implicit def apply(value: js.Promise[Double | MockResponseObject | js.Object | Response | String]): MockResponse = value.asInstanceOf[MockResponse]
  @scala.inline
  implicit def apply(value: Response): MockResponse = value.asInstanceOf[MockResponse]
  @scala.inline
  implicit def apply(value: String): MockResponse = value.asInstanceOf[MockResponse]
}

