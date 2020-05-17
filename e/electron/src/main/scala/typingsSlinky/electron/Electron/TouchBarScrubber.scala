package typingsSlinky.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TouchBarScrubber extends EventEmitter {
  var continuous: Boolean = js.native
  var items: js.Array[ScrubberItem] = js.native
  var mode: String = js.native
  var overlayStyle: String = js.native
  var selectedStyle: String = js.native
  var showArrowButtons: Boolean = js.native
}

