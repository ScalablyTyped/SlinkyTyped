package typingsSlinky.activexLibreoffice.com_.sun.star.drawing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This service describes a {@link MeasureShape} . */
@js.native
trait MeasureProperties extends StObject {
  
  /** If this property is `TRUE` , the measure is drawn below the reference edge instead of above it. */
  var MeasureBelowReferenceEdge: Boolean = js.native
  
  /**
    * This value is the number of decimal places that is used to format the measure value.
    * @since OOo 1.1.2
    */
  var MeasureDecimalPlaces: Double = js.native
  
  /** This is the length of the first help line. */
  var MeasureHelpLine1Length: Double = js.native
  
  /** This is the length of the second help line. */
  var MeasureHelpLine2Length: Double = js.native
  
  /** This is the distance from the measure line to the start of the help lines. */
  var MeasureHelpLineDistance: Double = js.native
  
  /** This is the overhang of the two help lines. */
  var MeasureHelpLineOverhang: Double = js.native
  
  /** This enumeration specifies the MeasureKind. */
  var MeasureKind: typingsSlinky.activexLibreoffice.com_.sun.star.drawing.MeasureKind = js.native
  
  /** This is the distance from the reference edge to the measure line. */
  var MeasureLineDistance: Double = js.native
  
  /** This is the overhang of the reference line over the help lines. */
  var MeasureOverhang: Double = js.native
  
  /** If this is `TRUE` , the unit of measure is shown in the measure text. */
  var MeasureShowUnit: Boolean = js.native
  
  /** If this is `TRUE` , the angle of the measure is set automatically. */
  var MeasureTextAutoAngle: Boolean = js.native
  
  /** This is the automatic angle. */
  var MeasureTextAutoAngleView: Double = js.native
  
  /** This is the fixed angle. */
  var MeasureTextFixedAngle: Double = js.native
  
  /** This is the horizontal position of the measure text. */
  var MeasureTextHorizontalPosition: MeasureTextHorzPos = js.native
  
  /** If this value is `TRUE` , the measure has a fixed angle. */
  var MeasureTextIsFixedAngle: Boolean = js.native
  
  /** If this value is `TRUE` , the text is rotated 90 degrees. */
  var MeasureTextRotate90: Boolean = js.native
  
  /** If this value is `TRUE` , the text is printed upside down. */
  var MeasureTextUpsideDown: Boolean = js.native
  
  /** This is the vertical position of the text. */
  var MeasureTextVerticalPosition: MeasureTextVertPos = js.native
}
object MeasureProperties {
  
  @scala.inline
  def apply(
    MeasureBelowReferenceEdge: Boolean,
    MeasureDecimalPlaces: Double,
    MeasureHelpLine1Length: Double,
    MeasureHelpLine2Length: Double,
    MeasureHelpLineDistance: Double,
    MeasureHelpLineOverhang: Double,
    MeasureKind: MeasureKind,
    MeasureLineDistance: Double,
    MeasureOverhang: Double,
    MeasureShowUnit: Boolean,
    MeasureTextAutoAngle: Boolean,
    MeasureTextAutoAngleView: Double,
    MeasureTextFixedAngle: Double,
    MeasureTextHorizontalPosition: MeasureTextHorzPos,
    MeasureTextIsFixedAngle: Boolean,
    MeasureTextRotate90: Boolean,
    MeasureTextUpsideDown: Boolean,
    MeasureTextVerticalPosition: MeasureTextVertPos
  ): MeasureProperties = {
    val __obj = js.Dynamic.literal(MeasureBelowReferenceEdge = MeasureBelowReferenceEdge.asInstanceOf[js.Any], MeasureDecimalPlaces = MeasureDecimalPlaces.asInstanceOf[js.Any], MeasureHelpLine1Length = MeasureHelpLine1Length.asInstanceOf[js.Any], MeasureHelpLine2Length = MeasureHelpLine2Length.asInstanceOf[js.Any], MeasureHelpLineDistance = MeasureHelpLineDistance.asInstanceOf[js.Any], MeasureHelpLineOverhang = MeasureHelpLineOverhang.asInstanceOf[js.Any], MeasureKind = MeasureKind.asInstanceOf[js.Any], MeasureLineDistance = MeasureLineDistance.asInstanceOf[js.Any], MeasureOverhang = MeasureOverhang.asInstanceOf[js.Any], MeasureShowUnit = MeasureShowUnit.asInstanceOf[js.Any], MeasureTextAutoAngle = MeasureTextAutoAngle.asInstanceOf[js.Any], MeasureTextAutoAngleView = MeasureTextAutoAngleView.asInstanceOf[js.Any], MeasureTextFixedAngle = MeasureTextFixedAngle.asInstanceOf[js.Any], MeasureTextHorizontalPosition = MeasureTextHorizontalPosition.asInstanceOf[js.Any], MeasureTextIsFixedAngle = MeasureTextIsFixedAngle.asInstanceOf[js.Any], MeasureTextRotate90 = MeasureTextRotate90.asInstanceOf[js.Any], MeasureTextUpsideDown = MeasureTextUpsideDown.asInstanceOf[js.Any], MeasureTextVerticalPosition = MeasureTextVerticalPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeasureProperties]
  }
  
  @scala.inline
  implicit class MeasurePropertiesMutableBuilder[Self <: MeasureProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMeasureBelowReferenceEdge(value: Boolean): Self = StObject.set(x, "MeasureBelowReferenceEdge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeasureDecimalPlaces(value: Double): Self = StObject.set(x, "MeasureDecimalPlaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeasureHelpLine1Length(value: Double): Self = StObject.set(x, "MeasureHelpLine1Length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeasureHelpLine2Length(value: Double): Self = StObject.set(x, "MeasureHelpLine2Length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeasureHelpLineDistance(value: Double): Self = StObject.set(x, "MeasureHelpLineDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeasureHelpLineOverhang(value: Double): Self = StObject.set(x, "MeasureHelpLineOverhang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeasureKind(value: MeasureKind): Self = StObject.set(x, "MeasureKind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeasureLineDistance(value: Double): Self = StObject.set(x, "MeasureLineDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeasureOverhang(value: Double): Self = StObject.set(x, "MeasureOverhang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeasureShowUnit(value: Boolean): Self = StObject.set(x, "MeasureShowUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeasureTextAutoAngle(value: Boolean): Self = StObject.set(x, "MeasureTextAutoAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeasureTextAutoAngleView(value: Double): Self = StObject.set(x, "MeasureTextAutoAngleView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeasureTextFixedAngle(value: Double): Self = StObject.set(x, "MeasureTextFixedAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeasureTextHorizontalPosition(value: MeasureTextHorzPos): Self = StObject.set(x, "MeasureTextHorizontalPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeasureTextIsFixedAngle(value: Boolean): Self = StObject.set(x, "MeasureTextIsFixedAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeasureTextRotate90(value: Boolean): Self = StObject.set(x, "MeasureTextRotate90", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeasureTextUpsideDown(value: Boolean): Self = StObject.set(x, "MeasureTextUpsideDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeasureTextVerticalPosition(value: MeasureTextVertPos): Self = StObject.set(x, "MeasureTextVerticalPosition", value.asInstanceOf[js.Any])
  }
}
