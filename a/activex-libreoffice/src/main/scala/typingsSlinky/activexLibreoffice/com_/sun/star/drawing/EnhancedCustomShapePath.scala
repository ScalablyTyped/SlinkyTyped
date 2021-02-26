package typingsSlinky.activexLibreoffice.com_.sun.star.drawing

import typingsSlinky.activexLibreoffice.com_.sun.star.awt.Size
import typingsSlinky.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This service may be represented by a {@link com.sun.star.beans.PropertyValue} []. */
@js.native
trait EnhancedCustomShapePath extends StObject {
  
  /** This property specifies if this shape supports concentric gradient fill. The default is false. */
  var ConcentricGradientFillAllowed: Boolean = js.native
  
  /** This property is specifying the points that makes the geometry of the shape */
  var Coordinates: SafeArray[EnhancedCustomShapeParameterPair] = js.native
  
  /** This property specifies if this shape supports the {@link EnhancedCustomShapeExtrusion} properties. The default is true. */
  var ExtrusionAllowed: Boolean = js.native
  
  /** This property specifies {@link GluePoint} leaving directions. */
  var GluePointLeavingDirections: SafeArray[Double] = js.native
  
  /**
    * This property defines the {@link GluePoint} type. The values that can be used are specified in {@link
    * com.sun.star.drawing.EnhancedCustomShapeGluePointType}
    */
  var GluePointType: Double = js.native
  
  /** This property specifies custom glue points */
  var GluePoints: SafeArray[EnhancedCustomShapeParameterPair] = js.native
  
  /** This property specifies the commands and the way the Coordinates have to be interpreted. */
  var Segments: SafeArray[EnhancedCustomShapeSegment] = js.native
  
  /** This property specifies the horizontal StretchPoint that has to be used. No stretching is used if this property is omitted. */
  var StretchX: Double = js.native
  
  /** This property specifies the vertical StretchPoint that has to be used. No stretching is used if this property is omitted. */
  var StretchY: Double = js.native
  
  /** This property specifies view size per sub path */
  var SubViewSize: SafeArray[Size] = js.native
  
  /**
    * This property specifies the text frames that can be used with the shape. In general the first text frame is used, except the shape is containing
    * vertical text, then the object tries to use the second text frame. The default text frame will be as big as the shape.
    */
  var TextFrames: SafeArray[EnhancedCustomShapeTextFrame] = js.native
  
  /** This property specifies if this shape supports concentric gradient fill. The default is false; */
  var TextPathAllowed: Boolean = js.native
}
object EnhancedCustomShapePath {
  
  @scala.inline
  def apply(
    ConcentricGradientFillAllowed: Boolean,
    Coordinates: SafeArray[EnhancedCustomShapeParameterPair],
    ExtrusionAllowed: Boolean,
    GluePointLeavingDirections: SafeArray[Double],
    GluePointType: Double,
    GluePoints: SafeArray[EnhancedCustomShapeParameterPair],
    Segments: SafeArray[EnhancedCustomShapeSegment],
    StretchX: Double,
    StretchY: Double,
    SubViewSize: SafeArray[Size],
    TextFrames: SafeArray[EnhancedCustomShapeTextFrame],
    TextPathAllowed: Boolean
  ): EnhancedCustomShapePath = {
    val __obj = js.Dynamic.literal(ConcentricGradientFillAllowed = ConcentricGradientFillAllowed.asInstanceOf[js.Any], Coordinates = Coordinates.asInstanceOf[js.Any], ExtrusionAllowed = ExtrusionAllowed.asInstanceOf[js.Any], GluePointLeavingDirections = GluePointLeavingDirections.asInstanceOf[js.Any], GluePointType = GluePointType.asInstanceOf[js.Any], GluePoints = GluePoints.asInstanceOf[js.Any], Segments = Segments.asInstanceOf[js.Any], StretchX = StretchX.asInstanceOf[js.Any], StretchY = StretchY.asInstanceOf[js.Any], SubViewSize = SubViewSize.asInstanceOf[js.Any], TextFrames = TextFrames.asInstanceOf[js.Any], TextPathAllowed = TextPathAllowed.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnhancedCustomShapePath]
  }
  
  @scala.inline
  implicit class EnhancedCustomShapePathMutableBuilder[Self <: EnhancedCustomShapePath] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConcentricGradientFillAllowed(value: Boolean): Self = StObject.set(x, "ConcentricGradientFillAllowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoordinates(value: SafeArray[EnhancedCustomShapeParameterPair]): Self = StObject.set(x, "Coordinates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtrusionAllowed(value: Boolean): Self = StObject.set(x, "ExtrusionAllowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGluePointLeavingDirections(value: SafeArray[Double]): Self = StObject.set(x, "GluePointLeavingDirections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGluePointType(value: Double): Self = StObject.set(x, "GluePointType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGluePoints(value: SafeArray[EnhancedCustomShapeParameterPair]): Self = StObject.set(x, "GluePoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegments(value: SafeArray[EnhancedCustomShapeSegment]): Self = StObject.set(x, "Segments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStretchX(value: Double): Self = StObject.set(x, "StretchX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStretchY(value: Double): Self = StObject.set(x, "StretchY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubViewSize(value: SafeArray[Size]): Self = StObject.set(x, "SubViewSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextFrames(value: SafeArray[EnhancedCustomShapeTextFrame]): Self = StObject.set(x, "TextFrames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextPathAllowed(value: Boolean): Self = StObject.set(x, "TextPathAllowed", value.asInstanceOf[js.Any])
  }
}
