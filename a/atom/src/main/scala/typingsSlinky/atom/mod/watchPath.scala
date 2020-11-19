package typingsSlinky.atom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("atom", "watchPath")
@js.native
object watchPath extends js.Object {
  
  def apply(
    rootPath: String,
    options: js.Object,
    eventCallback: js.Function1[/* events */ FilesystemChangeEvent, Unit]
  ): js.Promise[PathWatcher] = js.native
}
