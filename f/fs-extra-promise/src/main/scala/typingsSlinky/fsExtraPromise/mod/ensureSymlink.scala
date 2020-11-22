package typingsSlinky.fsExtraPromise.mod

import typingsSlinky.fsExtra.mod.SymlinkType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs-extra-promise", "ensureSymlink")
@js.native
object ensureSymlink extends js.Object {
  
  def apply(src: String, dest: String): js.Promise[Unit] = js.native
  def apply(src: String, dest: String, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def apply(src: String, dest: String, `type`: SymlinkType): js.Promise[Unit] = js.native
  def apply(src: String, dest: String, `type`: SymlinkType, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
}
