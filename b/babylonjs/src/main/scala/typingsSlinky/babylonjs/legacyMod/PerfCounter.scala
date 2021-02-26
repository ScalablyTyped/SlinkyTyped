package typingsSlinky.babylonjs.legacyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "PerfCounter")
@js.native
/**
  * Creates a new counter
  */
class PerfCounter ()
  extends typingsSlinky.babylonjs.indexMod.PerfCounter
/* static members */
object PerfCounter {
  
  @JSImport("babylonjs/Legacy/legacy", "PerfCounter")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Gets or sets a global boolean to turn on and off all the counters
    */
  @JSImport("babylonjs/Legacy/legacy", "PerfCounter.Enabled")
  @js.native
  def Enabled: Boolean = js.native
  @scala.inline
  def Enabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Enabled")(x.asInstanceOf[js.Any])
}
