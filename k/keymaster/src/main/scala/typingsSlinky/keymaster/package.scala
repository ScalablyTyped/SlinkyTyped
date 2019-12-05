package typingsSlinky

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object keymaster {
  import org.scalajs.dom.raw.KeyboardEvent

  type KeyHandler = js.Function2[/* keyboardEvent */ KeyboardEvent, /* keymasterEvent */ KeymasterEvent, Unit]
}
