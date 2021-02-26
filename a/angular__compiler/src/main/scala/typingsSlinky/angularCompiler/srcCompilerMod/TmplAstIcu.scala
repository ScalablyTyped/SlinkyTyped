package typingsSlinky.angularCompiler.srcCompilerMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.angularCompiler.i18nAstMod.Message
import typingsSlinky.angularCompiler.i18nAstMod.Node
import typingsSlinky.angularCompiler.r3AstMod.BoundText
import typingsSlinky.angularCompiler.r3AstMod.Icu
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/compiler", "TmplAstIcu")
@js.native
class TmplAstIcu protected () extends Icu {
  def this(
    vars: StringDictionary[BoundText],
    placeholders: StringDictionary[typingsSlinky.angularCompiler.r3AstMod.Text | BoundText],
    sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    vars: StringDictionary[BoundText],
    placeholders: StringDictionary[typingsSlinky.angularCompiler.r3AstMod.Text | BoundText],
    sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    i18n: Message
  ) = this()
  def this(
    vars: StringDictionary[BoundText],
    placeholders: StringDictionary[typingsSlinky.angularCompiler.r3AstMod.Text | BoundText],
    sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    i18n: Node
  ) = this()
}
