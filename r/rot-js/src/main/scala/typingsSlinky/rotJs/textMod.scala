package typingsSlinky.rotJs

import typingsSlinky.rotJs.rotJsNumbers.`0`
import typingsSlinky.rotJs.rotJsNumbers.`1`
import typingsSlinky.rotJs.rotJsNumbers.`2`
import typingsSlinky.rotJs.rotJsNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rot-js/lib/text", JSImport.Namespace)
@js.native
object textMod extends js.Object {
  val TYPE_BG: `3` = js.native
  val TYPE_FG: `2` = js.native
  val TYPE_NEWLINE: `1` = js.native
  val TYPE_TEXT: `0` = js.native
  def measure(str: String, maxWidth: Double): AnonHeight = js.native
  def tokenize(str: String, maxWidth: Double): js.Array[_] = js.native
}

