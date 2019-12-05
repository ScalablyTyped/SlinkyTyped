package typingsSlinky.ono

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object esmTypesMod {
  type ErrorLike = js.Error | ErrorPOJO
  type MessageFormatter = js.Function2[/* message */ String, /* repeated */ js.Any, String]
}
