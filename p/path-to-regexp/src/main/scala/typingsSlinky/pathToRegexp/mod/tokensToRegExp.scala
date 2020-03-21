package typingsSlinky.pathToRegexp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("path-to-regexp", "tokensToRegExp")
@js.native
object tokensToRegExp extends js.Object {
  def apply(tokens: js.Array[Token]): js.RegExp = js.native
  def apply(tokens: js.Array[Token], keys: js.Array[Key]): js.RegExp = js.native
  def apply(tokens: js.Array[Token], keys: js.Array[Key], options: RegExpOptions): js.RegExp = js.native
}

