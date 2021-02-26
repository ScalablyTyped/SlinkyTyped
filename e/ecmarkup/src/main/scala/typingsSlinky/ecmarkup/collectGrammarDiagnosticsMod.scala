package typingsSlinky.ecmarkup

import typingsSlinky.ecmarkup.anon.Alg
import typingsSlinky.ecmarkup.anon.Grammar
import typingsSlinky.ecmarkup.anon.OneOffGrammars
import typingsSlinky.ecmarkup.anon.Source
import typingsSlinky.ecmarkup.specMod.Spec
import typingsSlinky.ecmarkup.specMod.Warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object collectGrammarDiagnosticsMod {
  
  @JSImport("ecmarkup/lib/lint/collect-grammar-diagnostics", "collectGrammarDiagnostics")
  @js.native
  def collectGrammarDiagnostics(
    report: js.Function1[/* e */ Warning, Unit],
    spec: Spec,
    mainSource: String,
    mainGrammar: js.Array[Source],
    sdos: js.Array[Alg],
    earlyErrors: js.Array[Grammar]
  ): OneOffGrammars = js.native
}
