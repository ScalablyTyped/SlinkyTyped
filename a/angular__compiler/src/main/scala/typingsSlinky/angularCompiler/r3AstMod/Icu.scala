package typingsSlinky.angularCompiler.r3AstMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.angularCompiler.i18nAstMod.Message
import typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/render3/r3_ast", "Icu")
@js.native
class Icu protected () extends Node {
  def this(
    vars: StringDictionary[BoundText],
    placeholders: StringDictionary[Text | BoundText],
    sourceSpan: ParseSourceSpan
  ) = this()
  def this(
    vars: StringDictionary[BoundText],
    placeholders: StringDictionary[Text | BoundText],
    sourceSpan: ParseSourceSpan,
    i18n: Message
  ) = this()
  def this(
    vars: StringDictionary[BoundText],
    placeholders: StringDictionary[Text | BoundText],
    sourceSpan: ParseSourceSpan,
    i18n: typingsSlinky.angularCompiler.i18nAstMod.Node
  ) = this()
  var i18n: js.UndefOr[Message | typingsSlinky.angularCompiler.i18nAstMod.Node] = js.native
  var placeholders: StringDictionary[Text | BoundText] = js.native
  var vars: StringDictionary[BoundText] = js.native
}

