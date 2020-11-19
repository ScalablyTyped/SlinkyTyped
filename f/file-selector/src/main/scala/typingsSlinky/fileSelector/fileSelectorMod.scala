package typingsSlinky.fileSelector

import org.scalajs.dom.raw.Event
import typingsSlinky.fileSelector.fileMod.FileWithPath
import typingsSlinky.std.DataTransferItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("file-selector/dist/file-selector", JSImport.Namespace)
@js.native
object fileSelectorMod extends js.Object {
  
  def fromEvent(evt: Event): js.Promise[js.Array[FileWithPath | DataTransferItem]] = js.native
}
