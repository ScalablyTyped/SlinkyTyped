package typingsSlinky.protractorHttpMock.mod.requests

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * All available request types.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.protractorHttpMock.mod.requests.Get[js.Any]
  - typingsSlinky.protractorHttpMock.mod.requests.PostData[js.Any, js.Any]
  - typingsSlinky.protractorHttpMock.mod.requests.Post[js.Any]
  - typingsSlinky.protractorHttpMock.mod.requests.Head[js.Any]
  - typingsSlinky.protractorHttpMock.mod.requests.Delete[js.Any]
  - typingsSlinky.protractorHttpMock.mod.requests.Put[js.Any]
  - typingsSlinky.protractorHttpMock.mod.requests.Patch[js.Any]
  - typingsSlinky.protractorHttpMock.mod.requests.Jsonp[js.Any]
*/
trait AllRequests extends js.Object

object AllRequests {
  @scala.inline
  implicit def apply(value: Delete[js.Any]): AllRequests = value.asInstanceOf[AllRequests]
  @scala.inline
  implicit def apply(value: Get[js.Any]): AllRequests = value.asInstanceOf[AllRequests]
  @scala.inline
  implicit def apply(value: Head[js.Any]): AllRequests = value.asInstanceOf[AllRequests]
  @scala.inline
  implicit def apply(value: Jsonp[js.Any]): AllRequests = value.asInstanceOf[AllRequests]
  @scala.inline
  implicit def apply(value: Patch[js.Any]): AllRequests = value.asInstanceOf[AllRequests]
  @scala.inline
  implicit def apply(value: Post[js.Any]): AllRequests = value.asInstanceOf[AllRequests]
  @scala.inline
  implicit def apply(value: PostData[js.Any, js.Any]): AllRequests = value.asInstanceOf[AllRequests]
  @scala.inline
  implicit def apply(value: Put[js.Any]): AllRequests = value.asInstanceOf[AllRequests]
}

