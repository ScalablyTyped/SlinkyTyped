package typingsSlinky.phaser.anon

import typingsSlinky.phaser.spine.Animation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofAnimationState extends StObject {
  
  /* static member */
  var FIRST: Double = js.native
  
  /* static member */
  var HOLD: Double = js.native
  
  /* static member */
  var HOLD_MIX: Double = js.native
  
  /* static member */
  var NOT_LAST: Double = js.native
  
  /* static member */
  var SUBSEQUENT: Double = js.native
  
  /* static member */
  var emptyAnimation: Animation = js.native
}
object TypeofAnimationState {
  
  @scala.inline
  def apply(
    FIRST: Double,
    HOLD: Double,
    HOLD_MIX: Double,
    NOT_LAST: Double,
    SUBSEQUENT: Double,
    emptyAnimation: Animation
  ): TypeofAnimationState = {
    val __obj = js.Dynamic.literal(FIRST = FIRST.asInstanceOf[js.Any], HOLD = HOLD.asInstanceOf[js.Any], HOLD_MIX = HOLD_MIX.asInstanceOf[js.Any], NOT_LAST = NOT_LAST.asInstanceOf[js.Any], SUBSEQUENT = SUBSEQUENT.asInstanceOf[js.Any], emptyAnimation = emptyAnimation.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofAnimationState]
  }
  
  @scala.inline
  implicit class TypeofAnimationStateMutableBuilder[Self <: TypeofAnimationState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmptyAnimation(value: Animation): Self = StObject.set(x, "emptyAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFIRST(value: Double): Self = StObject.set(x, "FIRST", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHOLD(value: Double): Self = StObject.set(x, "HOLD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHOLD_MIX(value: Double): Self = StObject.set(x, "HOLD_MIX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNOT_LAST(value: Double): Self = StObject.set(x, "NOT_LAST", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSUBSEQUENT(value: Double): Self = StObject.set(x, "SUBSEQUENT", value.asInstanceOf[js.Any])
  }
}
