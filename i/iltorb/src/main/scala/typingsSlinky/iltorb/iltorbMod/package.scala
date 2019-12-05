package typingsSlinky.iltorb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object iltorbMod {
  import typingsSlinky.node.Buffer

  type IltorbCallback = js.Function2[/* err */ js.UndefOr[js.Error | Null], /* output */ Buffer, Unit]
}
