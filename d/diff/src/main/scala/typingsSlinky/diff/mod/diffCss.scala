package typingsSlinky.diff.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("diff", "diffCss")
@js.native
object diffCss extends js.Object {
  
  def apply(oldStr: String, newStr: String): js.Array[Change] = js.native
  def apply(oldStr: String, newStr: String, options: BaseOptions with CallbackOptions): Unit = js.native
  def apply(oldStr: String, newStr: String, options: Callback): Unit = js.native
}
