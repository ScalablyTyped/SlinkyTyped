package typingsSlinky.ecmarkup

import typingsSlinky.ecmarkup.anon.Alg
import typingsSlinky.ecmarkup.anon.Grammar
import typingsSlinky.ecmarkup.anon.LintingErrors
import typingsSlinky.ecmarkup.anon.Source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ecmarkup/lib/lint/collect-grammar-diagnostics", JSImport.Namespace)
@js.native
object collectGrammarDiagnosticsMod extends js.Object {
  
  def collectGrammarDiagnostics(
    dom: js.Any,
    sourceText: String,
    mainGrammar: js.Array[Source],
    sdos: js.Array[Alg],
    earlyErrors: js.Array[Grammar]
  ): LintingErrors = js.native
}
