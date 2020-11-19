package typingsSlinky.mkdirp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mkdirp", "manual")
@js.native
object manual extends js.Object {
  
  /**
    * Use the manual implementation (not the native one). This is the default
    * when the native implementation is not available or the stat/mkdir
    * implementation is overridden.
    */
  def apply(dir: String): js.Promise[js.UndefOr[String]] = js.native
  def apply(dir: String, opts: Mode): js.Promise[js.UndefOr[String]] = js.native
  def apply(dir: String, opts: Options): js.Promise[js.UndefOr[String]] = js.native
}
