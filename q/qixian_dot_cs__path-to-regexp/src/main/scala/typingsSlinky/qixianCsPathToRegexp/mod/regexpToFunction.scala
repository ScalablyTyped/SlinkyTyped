package typingsSlinky.qixianCsPathToRegexp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@qixian.cs/path-to-regexp", "regexpToFunction")
@js.native
object regexpToFunction extends js.Object {
  def apply[P /* <: js.Object */](re: js.RegExp, keys: js.Array[Key]): MatchFunction[P] = js.native
  def apply[P /* <: js.Object */](re: js.RegExp, keys: js.Array[Key], options: RegexpToFunctionOptions): MatchFunction[P] = js.native
}

