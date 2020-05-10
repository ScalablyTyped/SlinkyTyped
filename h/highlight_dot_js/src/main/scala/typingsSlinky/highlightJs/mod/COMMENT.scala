package typingsSlinky.highlightJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("highlight.js", "COMMENT")
@js.native
object COMMENT extends js.Object {
  def apply(begin: String, end: String, inherits: IModeBase): IMode = js.native
  def apply(begin: String, end: js.RegExp, inherits: IModeBase): IMode = js.native
  def apply(begin: js.RegExp, end: String, inherits: IModeBase): IMode = js.native
  def apply(begin: js.RegExp, end: js.RegExp, inherits: IModeBase): IMode = js.native
}

