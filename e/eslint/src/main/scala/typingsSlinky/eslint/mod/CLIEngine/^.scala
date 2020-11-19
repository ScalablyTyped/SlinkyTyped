package typingsSlinky.eslint.mod.CLIEngine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("eslint", "CLIEngine")
@js.native
object ^ extends js.Object {
  
  def getErrorResults(results: js.Array[LintResult]): js.Array[LintResult] = js.native
  
  def getFormatter(): Formatter = js.native
  def getFormatter(format: String): Formatter = js.native
  
  def outputFixes(report: LintReport): Unit = js.native
  
  var version: String = js.native
}
