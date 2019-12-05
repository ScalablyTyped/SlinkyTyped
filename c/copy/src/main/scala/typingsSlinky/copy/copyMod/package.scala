package typingsSlinky.copy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object copyMod {
  import typingsSlinky.vinyl.vinylMod.File

  type Callback = js.Function2[/* error */ js.Error | Null, /* files */ js.UndefOr[js.Array[File]], Unit]
}
