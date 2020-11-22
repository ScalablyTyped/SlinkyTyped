package typingsSlinky.ecmarkup

import typingsSlinky.ecmarkup.anon.Alg
import typingsSlinky.ecmarkup.anon.Grammar
import typingsSlinky.ecmarkup.anon.OneOffGrammars
import typingsSlinky.ecmarkup.anon.Source
import typingsSlinky.ecmarkup.specMod.Spec
import typingsSlinky.ecmarkup.specMod.Warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ecmarkup/lib/lint/collect-grammar-diagnostics", JSImport.Namespace)
@js.native
object collectGrammarDiagnosticsMod extends js.Object {
  
  def collectGrammarDiagnostics(
    report: js.Function1[/* e */ Warning, Unit],
    spec: Spec,
    mainSource: String,
    mainGrammar: js.Array[Source],
    sdos: js.Array[Alg],
    earlyErrors: js.Array[Grammar]
  ): OneOffGrammars = js.native
}
