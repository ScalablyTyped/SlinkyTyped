package typingsSlinky.diff.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("diff", "diffWords")
@js.native
object diffWords extends js.Object {
  
  def apply(oldStr: String, newStr: String): js.Array[Change] = js.native
  def apply(oldStr: String, newStr: String, options: WordsOptions with CallbackOptions): Unit = js.native
  def apply(oldStr: String, newStr: String, options: Callback): Unit = js.native
}
