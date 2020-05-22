package typingsSlinky.hyphen

import typingsSlinky.hyphen.commonMod.HyphenationFunctionAsync
import typingsSlinky.hyphen.commonMod.HyphenationFunctionSync
import typingsSlinky.hyphen.commonMod.PatternsDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hyphen/de-ch-1901", JSImport.Namespace)
@js.native
object deCh1901Mod extends js.Object {
  val hyphenate: HyphenationFunctionAsync = js.native
  val hyphenateHTML: HyphenationFunctionAsync = js.native
  val hyphenateHTMLSync: HyphenationFunctionSync = js.native
  val hyphenateSync: HyphenationFunctionSync = js.native
  val patterns: PatternsDefinition = js.native
}

