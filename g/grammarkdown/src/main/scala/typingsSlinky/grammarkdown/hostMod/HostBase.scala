package typingsSlinky.grammarkdown.hostMod

import typingsSlinky.esfxCancelable.distMod.Cancelable
import typingsSlinky.grammarkdown.nodesMod.SourceFile
import typingsSlinky.grammarkdown.parserMod.Parser
import typingsSlinky.prex.mod.CancellationToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/host", "HostBase")
@js.native
abstract class HostBase () extends js.Object {
  def this(hasIgnoreCaseKnownGrammarsUseBuiltinGrammars: HostBaseOptions) = this()
  
  /* protected */ def createParser(): Parser = js.native
  
  val ignoreCase: Boolean = js.native
  
  var innerParser: js.Any = js.native
  
  var knownGrammars: js.Any = js.native
  
  def normalizeFile(file: String): String = js.native
  
  def parseSourceFile(file: String, text: String): SourceFile = js.native
  def parseSourceFile(file: String, text: String, cancelable: Cancelable): SourceFile = js.native
  def parseSourceFile(file: String, text: String, cancelable: CancellationToken): SourceFile = js.native
  
  /* protected */ def parser: Parser = js.native
  
  def registerKnownGrammar(name: String, file: String): Unit = js.native
  
  /* protected */ def resolveBuiltInGrammar(name: String): js.UndefOr[String] = js.native
  
  def resolveFile(file: String): String = js.native
  def resolveFile(file: String, referer: String): String = js.native
  
  def resolveKnownGrammar(name: String): js.UndefOr[String] = js.native
  
  var useBuiltinGrammars: js.Any = js.native
}
