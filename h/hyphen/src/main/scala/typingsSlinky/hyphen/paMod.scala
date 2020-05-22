package typingsSlinky.hyphen

import typingsSlinky.hyphen.commonMod.HyphenationFunctionAsync
import typingsSlinky.hyphen.commonMod.HyphenationFunctionSync
import typingsSlinky.hyphen.commonMod.PatternsDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hyphen/pa", JSImport.Namespace)
@js.native
object paMod extends js.Object {
  val hyphenate: HyphenationFunctionAsync = js.native
  val hyphenateHTML: HyphenationFunctionAsync = js.native
  val hyphenateHTMLSync: HyphenationFunctionSync = js.native
  val hyphenateSync: HyphenationFunctionSync = js.native
  val patterns: PatternsDefinition = js.native
}

