package typingsSlinky.leveldown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object leveldownMod {
  import typingsSlinky.node.Buffer

  type Bytes = String | Buffer
  type ErrorSizeCallback = js.Function2[/* err */ js.UndefOr[js.Error], /* size */ Double, Unit]
}
