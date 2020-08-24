package typingsSlinky.qixianCsPathToRegexp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type MatchFunction[P /* <: js.Object */] = js.Function1[/* path */ java.lang.String, typingsSlinky.qixianCsPathToRegexp.mod.Match_[P]]
  type Path = java.lang.String | js.RegExp | (js.Array[java.lang.String | js.RegExp])
  type PathFunction[P /* <: js.Object */] = js.Function1[/* data */ js.UndefOr[P], java.lang.String]
  type Token = java.lang.String | typingsSlinky.qixianCsPathToRegexp.mod.Key
}
