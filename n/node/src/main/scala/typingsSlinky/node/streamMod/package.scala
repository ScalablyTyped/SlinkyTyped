package typingsSlinky.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object streamMod {
  type TransformCallback = js.Function2[/* error */ js.UndefOr[js.Error | Null], /* data */ js.UndefOr[js.Any], Unit]
}
