package typingsSlinky.bcoeV8Coverage

import typingsSlinky.bcoeV8Coverage.anon.ReadonlyFunctionCov
import typingsSlinky.bcoeV8Coverage.anon.ReadonlyProcessCov
import typingsSlinky.bcoeV8Coverage.anon.ReadonlyRangeCov
import typingsSlinky.bcoeV8Coverage.anon.ReadonlyScriptCov
import typingsSlinky.bcoeV8Coverage.typesMod.FunctionCov
import typingsSlinky.bcoeV8Coverage.typesMod.ProcessCov
import typingsSlinky.bcoeV8Coverage.typesMod.RangeCov
import typingsSlinky.bcoeV8Coverage.typesMod.ScriptCov
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cloneMod {
  
  @JSImport("@bcoe/v8-coverage/dist/lib/clone", "cloneFunctionCov")
  @js.native
  def cloneFunctionCov(functionCov: ReadonlyFunctionCov): FunctionCov = js.native
  
  @JSImport("@bcoe/v8-coverage/dist/lib/clone", "cloneProcessCov")
  @js.native
  def cloneProcessCov(processCov: ReadonlyProcessCov): ProcessCov = js.native
  
  @JSImport("@bcoe/v8-coverage/dist/lib/clone", "cloneRangeCov")
  @js.native
  def cloneRangeCov(rangeCov: ReadonlyRangeCov): RangeCov = js.native
  
  @JSImport("@bcoe/v8-coverage/dist/lib/clone", "cloneScriptCov")
  @js.native
  def cloneScriptCov(scriptCov: ReadonlyScriptCov): ScriptCov = js.native
}
