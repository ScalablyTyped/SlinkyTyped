package typingsSlinky.electron.Electron

import typingsSlinky.electron.electronStrings.`background-tab`
import typingsSlinky.electron.electronStrings.`foreground-tab`
import typingsSlinky.electron.electronStrings.`new-window`
import typingsSlinky.electron.electronStrings.`save-to-disk`
import typingsSlinky.electron.electronStrings.default
import typingsSlinky.electron.electronStrings.other
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NewWindowEvent extends Event {
  /**
    * Can be `default`, `foreground-tab`, `background-tab`, `new-window`,
    * `save-to-disk` and `other`.
    */
  var disposition: default | `foreground-tab` | `background-tab` | `new-window` | `save-to-disk` | other = js.native
  var frameName: String = js.native
  /**
    * The options which should be used for creating the new .
    */
  var options: Options = js.native
  var url: String = js.native
}

