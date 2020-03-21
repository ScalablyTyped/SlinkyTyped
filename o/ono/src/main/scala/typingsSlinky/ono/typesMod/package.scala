package typingsSlinky.ono

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type ErrorLike = js.Error | typingsSlinky.ono.typesMod.ErrorPOJO
  type MessageFormatter = js.Function2[/* message */ java.lang.String, /* repeated */ js.Any, java.lang.String]
}
