package typingsSlinky.protractorHttpMock.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object requests {
  /**
    * All available request types.
    */
  type AllRequests = typingsSlinky.protractorHttpMock.mod.requests.Get[js.Any] | (typingsSlinky.protractorHttpMock.mod.requests.PostData[js.Any, js.Any]) | typingsSlinky.protractorHttpMock.mod.requests.Post[js.Any] | typingsSlinky.protractorHttpMock.mod.requests.Head[js.Any] | typingsSlinky.protractorHttpMock.mod.requests.Delete[js.Any] | typingsSlinky.protractorHttpMock.mod.requests.Put[js.Any] | typingsSlinky.protractorHttpMock.mod.requests.Patch[js.Any] | typingsSlinky.protractorHttpMock.mod.requests.Jsonp[js.Any]
}
