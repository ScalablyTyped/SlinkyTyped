package typingsSlinky.angularCompiler.outputAstMod

import typingsSlinky.angularCompiler.metaMod.I18nMeta
import typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/output/output_ast", "localizedString")
@js.native
object localizedString extends js.Object {
  
  def apply(
    metaBlock: I18nMeta,
    messageParts: js.Array[String],
    placeholderNames: js.Array[String],
    expressions: js.Array[Expression]
  ): LocalizedString_ = js.native
  def apply(
    metaBlock: I18nMeta,
    messageParts: js.Array[String],
    placeholderNames: js.Array[String],
    expressions: js.Array[Expression],
    sourceSpan: ParseSourceSpan
  ): LocalizedString_ = js.native
}
