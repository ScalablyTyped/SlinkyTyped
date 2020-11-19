package typingsSlinky.hyphen

import typingsSlinky.hyphen.mod.HyphenationFunctionAsync
import typingsSlinky.hyphen.mod.HyphenationFunctionSync
import typingsSlinky.hyphen.mod.PatternsDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hyphen/et", JSImport.Namespace)
@js.native
object etMod extends js.Object {
  
  val hyphenate: HyphenationFunctionAsync = js.native
  
  val hyphenateHTML: HyphenationFunctionAsync = js.native
  
  val hyphenateHTMLSync: HyphenationFunctionSync = js.native
  
  val hyphenateSync: HyphenationFunctionSync = js.native
  
  val patterns: PatternsDefinition = js.native
}
