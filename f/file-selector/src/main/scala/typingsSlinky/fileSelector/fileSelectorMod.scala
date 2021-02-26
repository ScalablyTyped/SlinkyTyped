package typingsSlinky.fileSelector

import org.scalajs.dom.raw.Event
import typingsSlinky.fileSelector.fileMod.FileWithPath
import typingsSlinky.std.DataTransferItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileSelectorMod {
  
  @JSImport("file-selector/dist/file-selector", "fromEvent")
  @js.native
  def fromEvent(evt: Event): js.Promise[js.Array[FileWithPath | DataTransferItem]] = js.native
}
