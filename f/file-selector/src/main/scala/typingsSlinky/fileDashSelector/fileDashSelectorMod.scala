package typingsSlinky.fileDashSelector

import org.scalajs.dom.raw.Event
import typingsSlinky.fileDashSelector.distFileMod.FileWithPath
import typingsSlinky.std.DataTransferItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("file-selector", JSImport.Namespace)
@js.native
object fileDashSelectorMod extends js.Object {
  def fromEvent(evt: Event): js.Promise[js.Array[FileWithPath | DataTransferItem]] = js.native
}

