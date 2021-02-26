package typingsSlinky.pako.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FlushValues extends StObject
@JSImport("pako", "FlushValues")
@js.native
object FlushValues extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FlushValues with Double] = js.native
  
  @js.native
  sealed trait Z_BLOCK extends FlushValues
  /* 5 */ val Z_BLOCK: typingsSlinky.pako.mod.FlushValues.Z_BLOCK with Double = js.native
  
  @js.native
  sealed trait Z_FINISH extends FlushValues
  /* 4 */ val Z_FINISH: typingsSlinky.pako.mod.FlushValues.Z_FINISH with Double = js.native
  
  @js.native
  sealed trait Z_FULL_FLUSH extends FlushValues
  /* 3 */ val Z_FULL_FLUSH: typingsSlinky.pako.mod.FlushValues.Z_FULL_FLUSH with Double = js.native
  
  @js.native
  sealed trait Z_NO_FLUSH extends FlushValues
  /* 0 */ val Z_NO_FLUSH: typingsSlinky.pako.mod.FlushValues.Z_NO_FLUSH with Double = js.native
  
  @js.native
  sealed trait Z_PARTIAL_FLUSH extends FlushValues
  /* 1 */ val Z_PARTIAL_FLUSH: typingsSlinky.pako.mod.FlushValues.Z_PARTIAL_FLUSH with Double = js.native
  
  @js.native
  sealed trait Z_SYNC_FLUSH extends FlushValues
  /* 2 */ val Z_SYNC_FLUSH: typingsSlinky.pako.mod.FlushValues.Z_SYNC_FLUSH with Double = js.native
  
  @js.native
  sealed trait Z_TREES extends FlushValues
  /* 6 */ val Z_TREES: typingsSlinky.pako.mod.FlushValues.Z_TREES with Double = js.native
}
