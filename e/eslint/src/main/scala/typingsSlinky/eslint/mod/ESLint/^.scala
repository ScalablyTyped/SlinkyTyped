package typingsSlinky.eslint.mod.ESLint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("eslint", "ESLint")
@js.native
object ^ extends js.Object {
  
  def getErrorResults(results: js.Array[LintResult]): js.Array[LintResult] = js.native
  
  def outputFixes(results: js.Array[LintResult]): js.Promise[Unit] = js.native
  
  var version: String = js.native
}
