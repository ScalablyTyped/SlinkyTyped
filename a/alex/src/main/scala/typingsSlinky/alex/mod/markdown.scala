package typingsSlinky.alex.mod

import typingsSlinky.vfile.mod.VFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("alex", "markdown")
@js.native
object markdown extends js.Object {
  
  def apply(value: String): VFile = js.native
  def apply(value: String, config: Config): VFile = js.native
  /** Check Markdown (ignoring syntax). */
  def apply(value: VFile): VFile = js.native
  def apply(value: VFile, config: Config): VFile = js.native
}
