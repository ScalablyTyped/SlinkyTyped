package typingsSlinky.angularCompiler.publicApiMod

import typingsSlinky.angularCompiler.i18nAstMod.Message
import typingsSlinky.angularCompiler.i18nAstMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/public_api", "NodeWithI18n")
@js.native
abstract class NodeWithI18n protected ()
  extends typingsSlinky.angularCompiler.srcCompilerMod.NodeWithI18n {
  def this(sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan) = this()
  def this(sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan, i18n: Message) = this()
  def this(sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan, i18n: Node) = this()
}
