package typingsSlinky.gulpShell.mod

import typingsSlinky.node.NodeJS.ReadWriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gulp-shell", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(commands: String): ReadWriteStream = js.native
  def apply(commands: String, options: Options): ReadWriteStream = js.native
  def apply(commands: js.Array[String]): ReadWriteStream = js.native
  def apply(commands: js.Array[String], options: Options): ReadWriteStream = js.native
  
  def task(commands: String): js.Function0[js.Promise[Unit]] = js.native
  def task(commands: String, options: Options): js.Function0[js.Promise[Unit]] = js.native
  def task(commands: js.Array[String]): js.Function0[js.Promise[Unit]] = js.native
  def task(commands: js.Array[String], options: Options): js.Function0[js.Promise[Unit]] = js.native
}
