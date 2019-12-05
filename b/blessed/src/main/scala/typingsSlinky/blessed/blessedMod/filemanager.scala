package typingsSlinky.blessed.blessedMod

import typingsSlinky.blessed.blessedMod.Widgets.FileManagerElement
import typingsSlinky.blessed.blessedMod.Widgets.FileManagerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("blessed", "filemanager")
@js.native
object filemanager extends js.Object {
  def apply(): FileManagerElement = js.native
  def apply(options: FileManagerOptions): FileManagerElement = js.native
}

