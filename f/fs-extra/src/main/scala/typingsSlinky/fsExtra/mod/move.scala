package typingsSlinky.fsExtra.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs-extra", "move")
@js.native
object move extends js.Object {
  
  def apply(src: String, dest: String): js.Promise[Unit] = js.native
  def apply(src: String, dest: String, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def apply(src: String, dest: String, options: MoveOptions): js.Promise[Unit] = js.native
  def apply(src: String, dest: String, options: MoveOptions, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
}
