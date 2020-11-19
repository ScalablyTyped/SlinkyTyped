package typingsSlinky.broFs.mod

import typingsSlinky.filesystem.FileSystem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bro-fs", "init")
@js.native
object init extends js.Object {
  
  def apply(): js.Promise[FileSystem] = js.native
  def apply(options: FSOptions): js.Promise[FileSystem] = js.native
}
