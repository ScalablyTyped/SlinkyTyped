package typingsSlinky.bcoeV8Coverage

import typingsSlinky.bcoeV8Coverage.typesMod.FunctionCov
import typingsSlinky.bcoeV8Coverage.typesMod.ProcessCov
import typingsSlinky.bcoeV8Coverage.typesMod.ScriptCov
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@bcoe/v8-coverage/dist/lib/merge", JSImport.Namespace)
@js.native
object mergeMod extends js.Object {
  
  def mergeFunctionCovs(funcCovs: js.Array[FunctionCov]): js.UndefOr[FunctionCov] = js.native
  
  def mergeProcessCovs(processCovs: js.Array[ProcessCov]): ProcessCov = js.native
  
  def mergeScriptCovs(scriptCovs: js.Array[ScriptCov]): js.UndefOr[ScriptCov] = js.native
}
