package typingsSlinky.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StatusIndicator extends StObject
@JSImport("azdata", "StatusIndicator")
@js.native
object StatusIndicator extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StatusIndicator with Double] = js.native
  
  @js.native
  sealed trait Error extends StatusIndicator
  /* 3 */ val Error: typingsSlinky.azdata.mod.StatusIndicator.Error with Double = js.native
  
  @js.native
  sealed trait None extends StatusIndicator
  /* 0 */ val None: typingsSlinky.azdata.mod.StatusIndicator.None with Double = js.native
  
  @js.native
  sealed trait Ok extends StatusIndicator
  /* 1 */ val Ok: typingsSlinky.azdata.mod.StatusIndicator.Ok with Double = js.native
  
  @js.native
  sealed trait Warning extends StatusIndicator
  /* 2 */ val Warning: typingsSlinky.azdata.mod.StatusIndicator.Warning with Double = js.native
}
