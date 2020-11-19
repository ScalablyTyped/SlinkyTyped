package typingsSlinky.pako.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StrategyValues extends js.Object
@JSImport("pako", "StrategyValues")
@js.native
object StrategyValues extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StrategyValues with Double] = js.native
  
  @js.native
  sealed trait Z_DEFAULT_STRATEGY extends StrategyValues
  /* 0 */ @js.native
  object Z_DEFAULT_STRATEGY extends TopLevel[Z_DEFAULT_STRATEGY with Double]
  
  @js.native
  sealed trait Z_FILTERED extends StrategyValues
  /* 1 */ @js.native
  object Z_FILTERED extends TopLevel[Z_FILTERED with Double]
  
  @js.native
  sealed trait Z_FIXED extends StrategyValues
  /* 4 */ @js.native
  object Z_FIXED extends TopLevel[Z_FIXED with Double]
  
  @js.native
  sealed trait Z_HUFFMAN_ONLY extends StrategyValues
  /* 2 */ @js.native
  object Z_HUFFMAN_ONLY extends TopLevel[Z_HUFFMAN_ONLY with Double]
  
  @js.native
  sealed trait Z_RLE extends StrategyValues
  /* 3 */ @js.native
  object Z_RLE extends TopLevel[Z_RLE with Double]
}
