package typingsSlinky.pathToRegexp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("path-to-regexp", "pathToRegexp")
@js.native
object pathToRegexp extends js.Object {
  def apply(path: Path): js.RegExp = js.native
  def apply(path: Path, keys: js.UndefOr[scala.Nothing], options: TokensToRegexpOptions with ParseOptions): js.RegExp = js.native
  def apply(path: Path, keys: js.Array[Key]): js.RegExp = js.native
  def apply(path: Path, keys: js.Array[Key], options: TokensToRegexpOptions with ParseOptions): js.RegExp = js.native
}

