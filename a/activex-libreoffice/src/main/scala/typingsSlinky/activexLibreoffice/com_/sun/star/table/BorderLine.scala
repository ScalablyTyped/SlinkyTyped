package typingsSlinky.activexLibreoffice.com_.sun.star.table

import typingsSlinky.activexLibreoffice.com_.sun.star.util.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** describes the line type for a single cell edge. */
@js.native
trait BorderLine extends StObject {
  
  /** contains the color value of the line. */
  var Color: typingsSlinky.activexLibreoffice.com_.sun.star.util.Color = js.native
  
  /**
    * contains the width of the inner part of a double line (in 1/100 mm).
    *
    * If this value is zero, only a single line is drawn.
    */
  var InnerLineWidth: Double = js.native
  
  /** contains the distance between the inner and outer parts of a double line (in 1/100 mm). */
  var LineDistance: Double = js.native
  
  /**
    * contains the width of a single line or the width of outer part of a double line (in 1/100 mm).
    *
    * If this value is zero, no line is drawn.
    */
  var OuterLineWidth: Double = js.native
}
object BorderLine {
  
  @scala.inline
  def apply(Color: Color, InnerLineWidth: Double, LineDistance: Double, OuterLineWidth: Double): BorderLine = {
    val __obj = js.Dynamic.literal(Color = Color.asInstanceOf[js.Any], InnerLineWidth = InnerLineWidth.asInstanceOf[js.Any], LineDistance = LineDistance.asInstanceOf[js.Any], OuterLineWidth = OuterLineWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderLine]
  }
  
  @scala.inline
  implicit class BorderLineMutableBuilder[Self <: BorderLine] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: Color): Self = StObject.set(x, "Color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerLineWidth(value: Double): Self = StObject.set(x, "InnerLineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineDistance(value: Double): Self = StObject.set(x, "LineDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOuterLineWidth(value: Double): Self = StObject.set(x, "OuterLineWidth", value.asInstanceOf[js.Any])
  }
}
