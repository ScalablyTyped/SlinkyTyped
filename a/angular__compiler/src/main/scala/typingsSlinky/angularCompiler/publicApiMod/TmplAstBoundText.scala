package typingsSlinky.angularCompiler.publicApiMod

import typingsSlinky.angularCompiler.i18nAstMod.Message
import typingsSlinky.angularCompiler.i18nAstMod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/public_api", "TmplAstBoundText")
@js.native
class TmplAstBoundText protected ()
  extends typingsSlinky.angularCompiler.srcCompilerMod.TmplAstBoundText {
  def this(
    value: typingsSlinky.angularCompiler.astMod.AST,
    sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    value: typingsSlinky.angularCompiler.astMod.AST,
    sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    i18n: Message
  ) = this()
  def this(
    value: typingsSlinky.angularCompiler.astMod.AST,
    sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    i18n: Node
  ) = this()
}
