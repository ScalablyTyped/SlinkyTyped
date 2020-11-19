package typingsSlinky.angularCompiler.i18nAstMod

import typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/i18n/i18n_ast", "IcuPlaceholder")
@js.native
class IcuPlaceholder protected () extends Node {
  def this(value: Icu, name: String, sourceSpan: ParseSourceSpan) = this()
  
  var name: String = js.native
  
  /** Used to capture a message computed from a previous processing pass (see `setI18nRefs()`). */
  var previousMessage: js.UndefOr[Message] = js.native
  
  var value: Icu = js.native
}
