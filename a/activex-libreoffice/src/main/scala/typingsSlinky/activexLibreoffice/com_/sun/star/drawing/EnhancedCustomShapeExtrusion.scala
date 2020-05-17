package typingsSlinky.activexLibreoffice.com_.sun.star.drawing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This service may be represented by a {@link com.sun.star.beans.PropertyValue} []. */
@js.native
trait EnhancedCustomShapeExtrusion extends js.Object {
  /** This attribute specifies the brightness of a scene in percent. */
  var Brightness: Double = js.native
  /**
    * The first value of {@link EnhancedCustomShapeParameterPair} specifies the depth of the extrusion in 1/100 mm. The second value (0.0 to 1.0) specifies
    * the fraction of the extrusion that lies before the shape, a value of 0 is default.
    */
  var Depth: EnhancedCustomShapeParameterPair = js.native
  /** This attribute specifies the amount of diffusion reflected by the shape in percent */
  var Diffusion: Double = js.native
  /** This property specifies if extrusion is displayed. The default for this property is "false" */
  var Extrusion: Boolean = js.native
  /** This attribute specifies if the "SecondFillColor" is used as extrusion color */
  var ExtrusionColor: Boolean = js.native
  /** Specifies the direction of the first light. */
  var FirstLightDirection: Direction3D = js.native
  /** Specifies if the primary light is harsh. */
  var FirstLightHarsh: Boolean = js.native
  /** Specifies the intensity for the first light in percent. */
  var FirstLightLevel: Double = js.native
  /** Specifies if the front face of the extrusion responds to lightning changes. */
  var LightFace: Boolean = js.native
  /** Specifies if the surface of the extrusion object looks like metal. */
  var Metal: Boolean = js.native
  /** Specifies the number of line segments that should be used to display curved surfaces. The higher the number the more line segments are used. */
  var NumberOfLineSegments: Double = js.native
  /** This attribute specifies the origin within the bounding box of the shape in terms of the shape size fractions. */
  var Origin: EnhancedCustomShapeParameterPair = js.native
  /** This property defines the projection mode. */
  var ProjectionMode: typingsSlinky.activexLibreoffice.com_.sun.star.drawing.ProjectionMode = js.native
  /**
    * This attributes specifies the rotation angle about the x-axis in grad. The order of rotation is: z-axis, y-axis and then x-axis. The z-axis is
    * specified by the draw:rotate-angle.
    */
  var RotateAngle: EnhancedCustomShapeParameterPair = js.native
  /**
    * This attribute specifies the position of the rotate center in terms of shape size fractions, if the property is omitted, then the geometrical center
    * of the shape is used (this is the default).
    */
  var RotationCenter: Direction3D = js.native
  /** Specifies the direction of the second light. */
  var SecondLightDirection: Direction3D = js.native
  /** Specifies if the secondary light is harsh. */
  var SecondLightHarsh: Boolean = js.native
  /** Specifies the intensity for the second light in percent. */
  var SecondLightLevel: Double = js.native
  /** This property defines the shade mode. */
  var ShadeMode: typingsSlinky.activexLibreoffice.com_.sun.star.drawing.ShadeMode = js.native
  /** The draw:extrusion-shininess specifies the shininess of a mirror in percent. */
  var Shininess: Double = js.native
  /**
    * The first value of the draw:extrusion-skew attribute specifies the skew amount of an extrusion in percent. The second parameter specifies the
    * skew-angle. Skew settings are only applied if the attribute ProjectionMode is ProjectionMode_PARALLEL.
    */
  var Skew: EnhancedCustomShapeParameterPair = js.native
  /** This attribute specifies the specularity of an extrusion object in percent. */
  var Specularity: Double = js.native
  /** This attribute specifies the viewpoint of the observer. */
  var ViewPoint: Position3D = js.native
}

object EnhancedCustomShapeExtrusion {
  @scala.inline
  def apply(
    Brightness: Double,
    Depth: EnhancedCustomShapeParameterPair,
    Diffusion: Double,
    Extrusion: Boolean,
    ExtrusionColor: Boolean,
    FirstLightDirection: Direction3D,
    FirstLightHarsh: Boolean,
    FirstLightLevel: Double,
    LightFace: Boolean,
    Metal: Boolean,
    NumberOfLineSegments: Double,
    Origin: EnhancedCustomShapeParameterPair,
    ProjectionMode: ProjectionMode,
    RotateAngle: EnhancedCustomShapeParameterPair,
    RotationCenter: Direction3D,
    SecondLightDirection: Direction3D,
    SecondLightHarsh: Boolean,
    SecondLightLevel: Double,
    ShadeMode: ShadeMode,
    Shininess: Double,
    Skew: EnhancedCustomShapeParameterPair,
    Specularity: Double,
    ViewPoint: Position3D
  ): EnhancedCustomShapeExtrusion = {
    val __obj = js.Dynamic.literal(Brightness = Brightness.asInstanceOf[js.Any], Depth = Depth.asInstanceOf[js.Any], Diffusion = Diffusion.asInstanceOf[js.Any], Extrusion = Extrusion.asInstanceOf[js.Any], ExtrusionColor = ExtrusionColor.asInstanceOf[js.Any], FirstLightDirection = FirstLightDirection.asInstanceOf[js.Any], FirstLightHarsh = FirstLightHarsh.asInstanceOf[js.Any], FirstLightLevel = FirstLightLevel.asInstanceOf[js.Any], LightFace = LightFace.asInstanceOf[js.Any], Metal = Metal.asInstanceOf[js.Any], NumberOfLineSegments = NumberOfLineSegments.asInstanceOf[js.Any], Origin = Origin.asInstanceOf[js.Any], ProjectionMode = ProjectionMode.asInstanceOf[js.Any], RotateAngle = RotateAngle.asInstanceOf[js.Any], RotationCenter = RotationCenter.asInstanceOf[js.Any], SecondLightDirection = SecondLightDirection.asInstanceOf[js.Any], SecondLightHarsh = SecondLightHarsh.asInstanceOf[js.Any], SecondLightLevel = SecondLightLevel.asInstanceOf[js.Any], ShadeMode = ShadeMode.asInstanceOf[js.Any], Shininess = Shininess.asInstanceOf[js.Any], Skew = Skew.asInstanceOf[js.Any], Specularity = Specularity.asInstanceOf[js.Any], ViewPoint = ViewPoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnhancedCustomShapeExtrusion]
  }
  @scala.inline
  implicit class EnhancedCustomShapeExtrusionOps[Self <: EnhancedCustomShapeExtrusion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBrightness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Brightness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDepth(value: EnhancedCustomShapeParameterPair): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Depth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDiffusion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Diffusion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtrusion(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Extrusion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtrusionColor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExtrusionColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirstLightDirection(value: Direction3D): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FirstLightDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirstLightHarsh(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FirstLightHarsh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirstLightLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FirstLightLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLightFace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LightFace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Metal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumberOfLineSegments(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberOfLineSegments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrigin(value: EnhancedCustomShapeParameterPair): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Origin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProjectionMode(value: ProjectionMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProjectionMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRotateAngle(value: EnhancedCustomShapeParameterPair): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RotateAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRotationCenter(value: Direction3D): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RotationCenter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecondLightDirection(value: Direction3D): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecondLightDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecondLightHarsh(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecondLightHarsh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecondLightLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecondLightLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShadeMode(value: ShadeMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShadeMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShininess(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Shininess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSkew(value: EnhancedCustomShapeParameterPair): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Skew")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpecularity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Specularity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewPoint(value: Position3D): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ViewPoint")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

