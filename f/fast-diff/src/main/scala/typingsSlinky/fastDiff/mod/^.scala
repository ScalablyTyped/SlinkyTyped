package typingsSlinky.fastDiff.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fast-diff", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(text1: String, text2: String): js.Array[Diff] = js.native
  def apply(text1: String, text2: String, cursorPos: Double): js.Array[Diff] = js.native
  def apply(text1: String, text2: String, cursorPos: CursorInfo): js.Array[Diff] = js.native
}
