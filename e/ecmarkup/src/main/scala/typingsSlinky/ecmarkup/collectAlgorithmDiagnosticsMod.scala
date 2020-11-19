package typingsSlinky.ecmarkup

import typingsSlinky.ecmarkup.algorithmErrorReporterTypeMod.LintingError
import typingsSlinky.ecmarkup.anon.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ecmarkup/lib/lint/collect-algorithm-diagnostics", JSImport.Namespace)
@js.native
object collectAlgorithmDiagnosticsMod extends js.Object {
  
  def collectAlgorithmDiagnostics(dom: js.Any, sourceText: String, algorithms: js.Array[Element]): js.Array[LintingError] = js.native
}
