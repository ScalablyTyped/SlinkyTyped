package typingsSlinky.itGlob.mod

import typingsSlinky.minimatch.mod.IOptions
import typingsSlinky.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("it-glob/dist", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(dir: String, pattern: String): AsyncIterable[String] = js.native
  def apply(dir: String, pattern: String, options: OptionsExt with IOptions): AsyncIterable[String] = js.native
}
