package typingsSlinky.angularCompiler.mod

import typingsSlinky.angularCompiler.i18nAstMod.Message
import typingsSlinky.angularCompiler.i18nAstMod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "NodeWithI18n")
@js.native
abstract class NodeWithI18n protected ()
  extends typingsSlinky.angularCompiler.compilerMod.NodeWithI18n {
  def this(sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan) = this()
  def this(sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan, i18n: Message) = this()
  def this(sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan, i18n: Node) = this()
}
