package typingsSlinky.ecmarkup

import org.scalajs.dom.raw.Element
import typingsSlinky.ecmarkup.algorithmErrorReporterTypeMod.LintingError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ecmarkup/lib/lint/rules/algorithm-step-numbering", JSImport.Namespace)
@js.native
object algorithmStepNumberingMod extends js.Object {
  def default(report: js.Function1[/* e */ LintingError, Unit], node: Element, algorithmSource: String): js.Any = js.native
}

