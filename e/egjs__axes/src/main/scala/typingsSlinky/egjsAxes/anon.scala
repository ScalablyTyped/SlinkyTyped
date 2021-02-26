package typingsSlinky.egjsAxes

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.egjsAxes.axisManagerMod.Axis
import typingsSlinky.egjsAxes.constMod.DIRECTION
import typingsSlinky.egjsAxes.panInputMod.PanInput
import typingsSlinky.egjsAxes.panInputMod.PanInputOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait DestPos extends StObject {
    
    var destPos: Axis = js.native
    
    var duration: Double = js.native
  }
  object DestPos {
    
    @scala.inline
    def apply(destPos: Axis, duration: Double): DestPos = {
      val __obj = js.Dynamic.literal(destPos = destPos.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any])
      __obj.asInstanceOf[DestPos]
    }
    
    @scala.inline
    implicit class DestPosMutableBuilder[Self <: DestPos] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestPos(value: Axis): Self = StObject.set(x, "destPos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofPanInput
    extends Instantiable1[(/* el */ HTMLElement) | (/* el */ String), PanInput]
       with Instantiable2[(/* el */ HTMLElement) | (/* el */ String), /* options */ PanInputOption, PanInput] {
    
    def getDirectionByAngle(angle: Double, thresholdAngle: Double): DIRECTION = js.native
    
    def getNextOffset(speeds: js.Array[Double], deceleration: Double): js.Array[Double] = js.native
    
    def useDirection(checkType: DIRECTION, direction: DIRECTION): Boolean = js.native
    def useDirection(checkType: DIRECTION, direction: DIRECTION, userDirection: DIRECTION): Boolean = js.native
  }
}
