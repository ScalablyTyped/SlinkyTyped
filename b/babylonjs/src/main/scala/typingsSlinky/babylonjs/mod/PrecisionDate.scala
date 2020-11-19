package typingsSlinky.babylonjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "PrecisionDate")
@js.native
class PrecisionDate ()
  extends typingsSlinky.babylonjs.legacyMod.PrecisionDate
/* static members */
@JSImport("babylonjs", "PrecisionDate")
@js.native
object PrecisionDate extends js.Object {
  
  /**
    * Gets either window.performance.now() if supported or Date.now() else
    */
  def Now: Double = js.native
}
