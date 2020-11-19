package typingsSlinky.babylonjs

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.babylonjs.mathVectorMod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Maths/math.axis", JSImport.Namespace)
@js.native
object mathAxisMod extends js.Object {
  
  @js.native
  class Axis () extends js.Object
  /* static members */
  @js.native
  object Axis extends js.Object {
    
    /** X axis */
    var X: Vector3 = js.native
    
    /** Y axis */
    var Y: Vector3 = js.native
    
    /** Z axis */
    var Z: Vector3 = js.native
  }
  
  @js.native
  sealed trait Space extends js.Object
  @js.native
  object Space extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Space with Double] = js.native
    
    /** Bone space */
    @js.native
    sealed trait BONE extends Space
    /* 2 */ @js.native
    object BONE extends TopLevel[BONE with Double]
    
    /** Local (object) space */
    @js.native
    sealed trait LOCAL extends Space
    /* 0 */ @js.native
    object LOCAL extends TopLevel[LOCAL with Double]
    
    /** World space */
    @js.native
    sealed trait WORLD extends Space
    /* 1 */ @js.native
    object WORLD extends TopLevel[WORLD with Double]
  }
}
