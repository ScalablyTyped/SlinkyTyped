package typingsSlinky.antvPathUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait ArcFlag extends StObject {
    
    var arcFlag: js.Any = js.native
    
    var cx: Double = js.native
    
    var cy: Double = js.native
    
    var endAngle: Double = js.native
    
    var rx: js.Any = js.native
    
    var ry: js.Any = js.native
    
    var startAngle: Double = js.native
    
    var sweepFlag: js.Any = js.native
    
    var xRotation: Double = js.native
  }
  object ArcFlag {
    
    @scala.inline
    def apply(
      arcFlag: js.Any,
      cx: Double,
      cy: Double,
      endAngle: Double,
      rx: js.Any,
      ry: js.Any,
      startAngle: Double,
      sweepFlag: js.Any,
      xRotation: Double
    ): ArcFlag = {
      val __obj = js.Dynamic.literal(arcFlag = arcFlag.asInstanceOf[js.Any], cx = cx.asInstanceOf[js.Any], cy = cy.asInstanceOf[js.Any], endAngle = endAngle.asInstanceOf[js.Any], rx = rx.asInstanceOf[js.Any], ry = ry.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any], sweepFlag = sweepFlag.asInstanceOf[js.Any], xRotation = xRotation.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArcFlag]
    }
    
    @scala.inline
    implicit class ArcFlagMutableBuilder[Self <: ArcFlag] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArcFlag(value: js.Any): Self = StObject.set(x, "arcFlag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCx(value: Double): Self = StObject.set(x, "cx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCy(value: Double): Self = StObject.set(x, "cy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndAngle(value: Double): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRx(value: js.Any): Self = StObject.set(x, "rx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRy(value: js.Any): Self = StObject.set(x, "ry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSweepFlag(value: js.Any): Self = StObject.set(x, "sweepFlag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXRotation(value: Double): Self = StObject.set(x, "xRotation", value.asInstanceOf[js.Any])
    }
  }
}
