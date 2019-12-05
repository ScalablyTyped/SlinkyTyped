package typingsSlinky.qDashIo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object QioHTTP {
  import org.scalablytyped.runtime.StringDictionary
  import typingsSlinky.q.qMod.Promise
  import typingsSlinky.qDashIo.Qio.Stream

  type Application = js.Function1[/* req */ Request, Promise[js.Any]]
  type Body = Stream
  type Headers = StringDictionary[js.Any]
}
