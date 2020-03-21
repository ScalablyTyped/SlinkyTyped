package typingsSlinky.fileSelector

import typingsSlinky.fileSelector.fileMod.FileWithPath
import typingsSlinky.std.DataTransferItem
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("file-selector/dist/file-selector", JSImport.Namespace)
@js.native
object fileSelectorMod extends js.Object {
  def fromEvent(evt: Event_): js.Promise[js.Array[FileWithPath | DataTransferItem]] = js.native
}

