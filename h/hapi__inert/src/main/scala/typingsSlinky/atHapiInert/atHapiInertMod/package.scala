package typingsSlinky.atHapiInert

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atHapiInertMod {
  import typingsSlinky.atHapiHapi.atHapiHapiMod.Request

  type RequestHandler[T] = js.Function1[/* request */ Request, T]
}
