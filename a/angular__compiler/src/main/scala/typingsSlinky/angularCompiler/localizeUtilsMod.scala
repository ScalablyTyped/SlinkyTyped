package typingsSlinky.angularCompiler

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.angularCompiler.anon.MessageParts
import typingsSlinky.angularCompiler.i18nAstMod.Message
import typingsSlinky.angularCompiler.outputAstMod.Expression
import typingsSlinky.angularCompiler.outputAstMod.ReadVarExpr
import typingsSlinky.angularCompiler.outputAstMod.Statement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/render3/view/i18n/localize_utils", JSImport.Namespace)
@js.native
object localizeUtilsMod extends js.Object {
  def createLocalizeStatements(variable: ReadVarExpr, message: Message, params: StringDictionary[Expression]): js.Array[Statement] = js.native
  def serializeI18nMessageForLocalize(message: Message): MessageParts = js.native
}

