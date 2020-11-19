package typingsSlinky.bcoeV8Coverage

import typingsSlinky.bcoeV8Coverage.anon.ReadonlyFunctionCov
import typingsSlinky.bcoeV8Coverage.anon.ReadonlyProcessCov
import typingsSlinky.bcoeV8Coverage.anon.ReadonlyRangeCov
import typingsSlinky.bcoeV8Coverage.anon.ReadonlyScriptCov
import typingsSlinky.bcoeV8Coverage.asciiMod.ReadonlyRangeTree
import typingsSlinky.bcoeV8Coverage.typesMod.FunctionCov
import typingsSlinky.bcoeV8Coverage.typesMod.ProcessCov
import typingsSlinky.bcoeV8Coverage.typesMod.RangeCov
import typingsSlinky.bcoeV8Coverage.typesMod.ScriptCov
import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@bcoe/v8-coverage", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def cloneFunctionCov(functionCov: ReadonlyFunctionCov): FunctionCov = js.native
  
  def cloneProcessCov(processCov: ReadonlyProcessCov): ProcessCov = js.native
  
  def cloneRangeCov(rangeCov: ReadonlyRangeCov): RangeCov = js.native
  
  def cloneScriptCov(scriptCov: ReadonlyScriptCov): ScriptCov = js.native
  
  def compareFunctionCovs(a: ReadonlyFunctionCov, b: ReadonlyFunctionCov): Double = js.native
  
  def compareRangeCovs(a: ReadonlyRangeCov, b: ReadonlyRangeCov): Double = js.native
  
  def compareScriptCovs(a: ReadonlyScriptCov, b: ReadonlyScriptCov): Double = js.native
  
  def emitForest(trees: js.Array[ReadonlyRangeTree]): String = js.native
  
  def emitForestLines(trees: js.Array[ReadonlyRangeTree]): js.Array[String] = js.native
  
  def mergeFunctionCovs(funcCovs: js.Array[FunctionCov]): js.UndefOr[FunctionCov] = js.native
  
  def mergeProcessCovs(processCovs: js.Array[ProcessCov]): ProcessCov = js.native
  
  def mergeScriptCovs(scriptCovs: js.Array[ScriptCov]): js.UndefOr[ScriptCov] = js.native
  
  def parseFunctionRanges(text: String, offsetMap: Map[Double, Double]): js.Array[RangeCov] = js.native
  
  def parseOffsets(text: String): Map[Double, Double] = js.native
  
  @js.native
  class RangeTree protected ()
    extends typingsSlinky.bcoeV8Coverage.rangeTreeMod.RangeTree {
    def this(
      start: Double,
      end: Double,
      delta: Double,
      children: js.Array[typingsSlinky.bcoeV8Coverage.rangeTreeMod.RangeTree]
    ) = this()
  }
  /* static members */
  @js.native
  object RangeTree extends js.Object {
    
    /**
      * @precodition `ranges` are well-formed and pre-order sorted
      */
    def fromSortedRanges(ranges: js.Array[RangeCov]): js.UndefOr[typingsSlinky.bcoeV8Coverage.rangeTreeMod.RangeTree] = js.native
  }
}
