package typingsSlinky

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pouchdbDashCore {
  import org.scalajs.dom.experimental.Request
  import org.scalajs.dom.experimental.RequestInit
  import org.scalajs.dom.experimental.Response

  type Fetch = js.Function2[/* url */ String | Request, /* opts */ js.UndefOr[RequestInit], js.Promise[Response]]
}
