package typingsSlinky.depcheck.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("depcheck", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(rootDir: String, options: Options): js.Promise[Results] = js.native
  def apply[T](rootDir: String, options: Options, callback: js.Function1[/* results */ Results, T]): js.Promise[T] = js.native
}
