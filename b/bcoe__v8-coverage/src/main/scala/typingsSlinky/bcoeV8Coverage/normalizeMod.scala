package typingsSlinky.bcoeV8Coverage

import typingsSlinky.bcoeV8Coverage.rangeTreeMod.RangeTree
import typingsSlinky.bcoeV8Coverage.typesMod.FunctionCov
import typingsSlinky.bcoeV8Coverage.typesMod.ProcessCov
import typingsSlinky.bcoeV8Coverage.typesMod.ScriptCov
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@bcoe/v8-coverage/dist/lib/normalize", JSImport.Namespace)
@js.native
object normalizeMod extends js.Object {
  def deepNormalizeProcessCov(processCov: ProcessCov): Unit = js.native
  def deepNormalizeScriptCov(scriptCov: ScriptCov): Unit = js.native
  def normalizeFunctionCov(funcCov: FunctionCov): Unit = js.native
  def normalizeProcessCov(processCov: ProcessCov): Unit = js.native
  def normalizeRangeTree(tree: RangeTree): Unit = js.native
  def normalizeScriptCov(scriptCov: ScriptCov): Unit = js.native
}

