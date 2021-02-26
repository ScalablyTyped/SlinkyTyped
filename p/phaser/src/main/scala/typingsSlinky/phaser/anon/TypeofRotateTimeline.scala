package typingsSlinky.phaser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofRotateTimeline extends StObject {
  
  /* static member */
  var ENTRIES: Double = js.native
  
  /* static member */
  var PREV_ROTATION: Double = js.native
  
  /* static member */
  var PREV_TIME: Double = js.native
  
  /* static member */
  var ROTATION: Double = js.native
}
object TypeofRotateTimeline {
  
  @scala.inline
  def apply(ENTRIES: Double, PREV_ROTATION: Double, PREV_TIME: Double, ROTATION: Double): TypeofRotateTimeline = {
    val __obj = js.Dynamic.literal(ENTRIES = ENTRIES.asInstanceOf[js.Any], PREV_ROTATION = PREV_ROTATION.asInstanceOf[js.Any], PREV_TIME = PREV_TIME.asInstanceOf[js.Any], ROTATION = ROTATION.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofRotateTimeline]
  }
  
  @scala.inline
  implicit class TypeofRotateTimelineMutableBuilder[Self <: TypeofRotateTimeline] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setENTRIES(value: Double): Self = StObject.set(x, "ENTRIES", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPREV_ROTATION(value: Double): Self = StObject.set(x, "PREV_ROTATION", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPREV_TIME(value: Double): Self = StObject.set(x, "PREV_TIME", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setROTATION(value: Double): Self = StObject.set(x, "ROTATION", value.asInstanceOf[js.Any])
  }
}
