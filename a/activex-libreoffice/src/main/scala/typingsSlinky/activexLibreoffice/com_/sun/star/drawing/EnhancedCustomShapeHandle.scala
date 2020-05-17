package typingsSlinky.activexLibreoffice.com_.sun.star.drawing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This service may be represented by a {@link com.sun.star.beans.PropertyValue} []. */
@js.native
trait EnhancedCustomShapeHandle extends js.Object {
  /** Specifies if the x position of the handle is mirrored. */
  var MirroredX: Boolean = js.native
  /** Specifies if the y position of the handle is mirrored. */
  var MirroredY: Boolean = js.native
  /**
    * If this attribute is set, the handle is a polar handle. The property specifies the center position of the handle. If this attribute is set, the
    * attributes RangeX and RangeY are ignored, instead the attribute RadiusRange is used.
    */
  var Polar: EnhancedCustomShapeParameterPair = js.native
  /**
    * If the property Polar is set, then the first value specifies the radius and the second parameter the angle of the handle. Otherwise, if the handle is
    * not polar, the first parameter specifies the horizontal handle position, the vertical handle position is described by the second parameter.
    */
  var Position: EnhancedCustomShapeParameterPair = js.native
  /** If this attribute is set, it specifies the maximum radius range that can be used for a polar handle. */
  var RadiusRangeMaximum: EnhancedCustomShapeParameter = js.native
  /** If this attribute is set, it specifies the minimum radius range that can be used for a polar handle. */
  var RadiusRangeMinimum: EnhancedCustomShapeParameter = js.native
  /** If the attribute RangeXMaximum is set, it specifies the horizontal maximum range of the handle. */
  var RangeXMaximum: EnhancedCustomShapeParameter = js.native
  /** If the attribute RangeXMinimum is set, it specifies the horizontal minimum range of the handle. */
  var RangeXMinimum: EnhancedCustomShapeParameter = js.native
  /** If the attribute RangeYMaximum is set, it specifies the vertical maximum range of the handle. */
  var RangeYMaximum: EnhancedCustomShapeParameter = js.native
  /** If the attribute RangeYMinimum is set, it specifies the vertical minimum range of the handle. */
  var RangeYMinimum: EnhancedCustomShapeParameter = js.native
  /** RefAngle, if this attribute is set, it specifies the index of the adjustment value which is connected to the angle of the handle */
  var RefAngle: Double = js.native
  /** RefR, if this attribute is set, it specifies the index of the adjustment value which is connected to the radius of the handle */
  var RefR: Double = js.native
  /** RefX, if this attribute is set, it specifies the index of the adjustment value which is connected to the horizontal position of the handle */
  var RefX: Double = js.native
  /** RefY, if this attribute is set, it specifies the index of the adjustment value which is connected to the vertical position of the handle */
  var RefY: Double = js.native
  /** Specifies if the handle directions are swapped if the shape is taller than wide. */
  var Switched: Boolean = js.native
}

object EnhancedCustomShapeHandle {
  @scala.inline
  def apply(
    MirroredX: Boolean,
    MirroredY: Boolean,
    Polar: EnhancedCustomShapeParameterPair,
    Position: EnhancedCustomShapeParameterPair,
    RadiusRangeMaximum: EnhancedCustomShapeParameter,
    RadiusRangeMinimum: EnhancedCustomShapeParameter,
    RangeXMaximum: EnhancedCustomShapeParameter,
    RangeXMinimum: EnhancedCustomShapeParameter,
    RangeYMaximum: EnhancedCustomShapeParameter,
    RangeYMinimum: EnhancedCustomShapeParameter,
    RefAngle: Double,
    RefR: Double,
    RefX: Double,
    RefY: Double,
    Switched: Boolean
  ): EnhancedCustomShapeHandle = {
    val __obj = js.Dynamic.literal(MirroredX = MirroredX.asInstanceOf[js.Any], MirroredY = MirroredY.asInstanceOf[js.Any], Polar = Polar.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], RadiusRangeMaximum = RadiusRangeMaximum.asInstanceOf[js.Any], RadiusRangeMinimum = RadiusRangeMinimum.asInstanceOf[js.Any], RangeXMaximum = RangeXMaximum.asInstanceOf[js.Any], RangeXMinimum = RangeXMinimum.asInstanceOf[js.Any], RangeYMaximum = RangeYMaximum.asInstanceOf[js.Any], RangeYMinimum = RangeYMinimum.asInstanceOf[js.Any], RefAngle = RefAngle.asInstanceOf[js.Any], RefR = RefR.asInstanceOf[js.Any], RefX = RefX.asInstanceOf[js.Any], RefY = RefY.asInstanceOf[js.Any], Switched = Switched.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnhancedCustomShapeHandle]
  }
  @scala.inline
  implicit class EnhancedCustomShapeHandleOps[Self <: EnhancedCustomShapeHandle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMirroredX(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MirroredX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMirroredY(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MirroredY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPolar(value: EnhancedCustomShapeParameterPair): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Polar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: EnhancedCustomShapeParameterPair): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRadiusRangeMaximum(value: EnhancedCustomShapeParameter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RadiusRangeMaximum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRadiusRangeMinimum(value: EnhancedCustomShapeParameter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RadiusRangeMinimum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRangeXMaximum(value: EnhancedCustomShapeParameter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RangeXMaximum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRangeXMinimum(value: EnhancedCustomShapeParameter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RangeXMinimum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRangeYMaximum(value: EnhancedCustomShapeParameter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RangeYMaximum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRangeYMinimum(value: EnhancedCustomShapeParameter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RangeYMinimum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RefAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefR(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RefR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RefX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RefY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSwitched(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Switched")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

