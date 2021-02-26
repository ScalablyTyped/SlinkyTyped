package typingsSlinky.activexLibreoffice.com_.sun.star.drawing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A {@link LineDash} defines a non-continuous line. */
@js.native
trait LineDash extends StObject {
  
  /** This is the length of a single dash. */
  var DashLen: Double = js.native
  
  /** This is the number of dashes. */
  var Dashes: Double = js.native
  
  /** This is the distance between the dots. */
  var Distance: Double = js.native
  
  /** This is the length of a dot. */
  var DotLen: Double = js.native
  
  /** This is the number of dots in this {@link LineDash} . */
  var Dots: Double = js.native
  
  /** This sets the style of this {@link LineDash} . */
  var Style: DashStyle = js.native
}
object LineDash {
  
  @scala.inline
  def apply(DashLen: Double, Dashes: Double, Distance: Double, DotLen: Double, Dots: Double, Style: DashStyle): LineDash = {
    val __obj = js.Dynamic.literal(DashLen = DashLen.asInstanceOf[js.Any], Dashes = Dashes.asInstanceOf[js.Any], Distance = Distance.asInstanceOf[js.Any], DotLen = DotLen.asInstanceOf[js.Any], Dots = Dots.asInstanceOf[js.Any], Style = Style.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineDash]
  }
  
  @scala.inline
  implicit class LineDashMutableBuilder[Self <: LineDash] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDashLen(value: Double): Self = StObject.set(x, "DashLen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashes(value: Double): Self = StObject.set(x, "Dashes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistance(value: Double): Self = StObject.set(x, "Distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDotLen(value: Double): Self = StObject.set(x, "DotLen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDots(value: Double): Self = StObject.set(x, "Dots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: DashStyle): Self = StObject.set(x, "Style", value.asInstanceOf[js.Any])
  }
}
