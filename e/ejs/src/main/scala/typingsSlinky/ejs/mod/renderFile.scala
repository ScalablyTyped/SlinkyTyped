package typingsSlinky.ejs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ejs", "renderFile")
@js.native
object renderFile extends js.Object {
  
  def apply(path: String): js.Promise[String] = js.native
  def apply(path: String, data: js.UndefOr[scala.Nothing], opts: Options): js.Promise[String] = js.native
  def apply(path: String, data: Data): js.Promise[String] = js.native
  def apply(path: String, data: Data, opts: Options): js.Promise[String] = js.native
  def apply[T](path: String, cb: RenderFileCallback[T]): T = js.native
  def apply[T](path: String, data: Data, cb: RenderFileCallback[T]): T = js.native
  def apply[T](path: String, data: Data, opts: Options, cb: RenderFileCallback[T]): T = js.native
}
