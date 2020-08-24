package typingsSlinky.bcoeV8Coverage

import typingsSlinky.bcoeV8Coverage.anon.ReadonlyFunctionCov
import typingsSlinky.bcoeV8Coverage.anon.ReadonlyProcessCov
import typingsSlinky.bcoeV8Coverage.anon.ReadonlyRangeCov
import typingsSlinky.bcoeV8Coverage.anon.ReadonlyScriptCov
import typingsSlinky.bcoeV8Coverage.typesMod.FunctionCov
import typingsSlinky.bcoeV8Coverage.typesMod.ProcessCov
import typingsSlinky.bcoeV8Coverage.typesMod.RangeCov
import typingsSlinky.bcoeV8Coverage.typesMod.ScriptCov
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@bcoe/v8-coverage/dist/lib/clone", JSImport.Namespace)
@js.native
object cloneMod extends js.Object {
  def cloneFunctionCov(functionCov: ReadonlyFunctionCov): FunctionCov = js.native
  def cloneProcessCov(processCov: ReadonlyProcessCov): ProcessCov = js.native
  def cloneRangeCov(rangeCov: ReadonlyRangeCov): RangeCov = js.native
  def cloneScriptCov(scriptCov: ReadonlyScriptCov): ScriptCov = js.native
}

