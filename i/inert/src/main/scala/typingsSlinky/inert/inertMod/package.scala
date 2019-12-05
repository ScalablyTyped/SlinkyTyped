package typingsSlinky.inert

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object inertMod {
  import typingsSlinky.hapi.hapiMod.Request

  type RequestHandler[T] = js.Function1[/* request */ Request, T]
}
