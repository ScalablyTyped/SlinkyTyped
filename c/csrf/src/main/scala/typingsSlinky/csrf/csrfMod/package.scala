package typingsSlinky.csrf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object csrfMod {
  type SecretCallback = js.Function2[/* err */ js.Error | Null, /* secret */ String, Unit]
}
