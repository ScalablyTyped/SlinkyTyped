package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Lists values that specify the position relative to the target column in which a moved column should be placed.
  */
@js.native
trait ASPxClientGridColumnMovingTargetPosition extends StObject {
  
  /**
    * A moved column should be placed at the bottom of the target column.
    */
  var Bottom: Double = js.native
  
  /**
    * A moved column should be placed to the left of the target column.
    */
  var Left: Double = js.native
  
  /**
    * A moved column should be placed to the right of the target column.
    */
  var Right: Double = js.native
  
  /**
    * A moved column should be placed at the top of the target column.
    */
  var Top: Double = js.native
}
object ASPxClientGridColumnMovingTargetPosition {
  
  @scala.inline
  def apply(Bottom: Double, Left: Double, Right: Double, Top: Double): ASPxClientGridColumnMovingTargetPosition = {
    val __obj = js.Dynamic.literal(Bottom = Bottom.asInstanceOf[js.Any], Left = Left.asInstanceOf[js.Any], Right = Right.asInstanceOf[js.Any], Top = Top.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGridColumnMovingTargetPosition]
  }
  
  @scala.inline
  implicit class ASPxClientGridColumnMovingTargetPositionMutableBuilder[Self <: ASPxClientGridColumnMovingTargetPosition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBottom(value: Double): Self = StObject.set(x, "Bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeft(value: Double): Self = StObject.set(x, "Left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRight(value: Double): Self = StObject.set(x, "Right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTop(value: Double): Self = StObject.set(x, "Top", value.asInstanceOf[js.Any])
  }
}
