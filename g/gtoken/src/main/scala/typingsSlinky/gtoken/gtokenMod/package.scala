package typingsSlinky.gtoken

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object gtokenMod {
  type GetTokenCallback = js.Function2[/* err */ js.Error | Null, /* token */ js.UndefOr[TokenData], Unit]
}
