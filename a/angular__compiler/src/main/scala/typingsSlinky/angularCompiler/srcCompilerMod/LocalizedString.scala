package typingsSlinky.angularCompiler.srcCompilerMod

import typingsSlinky.angularCompiler.metaMod.I18nMeta
import typingsSlinky.angularCompiler.outputAstMod.LiteralPiece
import typingsSlinky.angularCompiler.outputAstMod.LocalizedString_
import typingsSlinky.angularCompiler.outputAstMod.PlaceholderPiece
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/compiler", "LocalizedString")
@js.native
class LocalizedString protected () extends LocalizedString_ {
  def this(
    metaBlock: I18nMeta,
    messageParts: js.Array[LiteralPiece],
    placeHolderNames: js.Array[PlaceholderPiece],
    expressions: js.Array[typingsSlinky.angularCompiler.outputAstMod.Expression]
  ) = this()
  def this(
    metaBlock: I18nMeta,
    messageParts: js.Array[LiteralPiece],
    placeHolderNames: js.Array[PlaceholderPiece],
    expressions: js.Array[typingsSlinky.angularCompiler.outputAstMod.Expression],
    sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
}
