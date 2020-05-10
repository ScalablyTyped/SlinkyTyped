package typingsSlinky.phaser.Phaser.Types.Physics.Matter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MatterDebugConfig extends js.Object {
  /**
    * The color value of constraint anchors.
    */
  var anchorColor: js.UndefOr[Double] = js.native
  /**
    * The size of the circles drawn as the constraint anchors.
    */
  var anchorSize: js.UndefOr[Double] = js.native
  /**
    * The color of the body angle / axes lines.
    */
  var angleColor: js.UndefOr[Boolean] = js.native
  /**
    * The color of the body bounds.
    */
  var boundsColor: js.UndefOr[Boolean] = js.native
  /**
    * The color of the broadphase grid.
    */
  var broadphaseColor: js.UndefOr[Boolean] = js.native
  /**
    * The color of the collision points.
    */
  var collisionColor: js.UndefOr[Boolean] = js.native
  /**
    * The color value of the fill when rendering dynamic bodies.
    */
  var fillColor: js.UndefOr[Double] = js.native
  /**
    * The opacity of the fill when rendering dynamic bodies, a value between 0 and 1.
    */
  var fillOpacity: js.UndefOr[Double] = js.native
  /**
    * The color value of hulls when `showConvexHulls` is set.
    */
  var hullColor: js.UndefOr[Double] = js.native
  /**
    * The color value of joints when `showJoint` is set.
    */
  var jointColor: js.UndefOr[Double] = js.native
  /**
    * The line opacity when rendering joints, a value between 0 and 1.
    */
  var jointLineOpacity: js.UndefOr[Double] = js.native
  /**
    * The line thickness when rendering joints.
    */
  var jointLineThickness: js.UndefOr[Double] = js.native
  /**
    * The color value of the line stroke when rendering dynamic bodies.
    */
  var lineColor: js.UndefOr[Double] = js.native
  /**
    * The opacity of the line when rendering dynamic bodies, a value between 0 and 1.
    */
  var lineOpacity: js.UndefOr[Double] = js.native
  /**
    * If rendering lines, the thickness of the line.
    */
  var lineThickness: js.UndefOr[Double] = js.native
  /**
    * The color value of the circles drawn when rendering pin constraints.
    */
  var pinColor: js.UndefOr[Double] = js.native
  /**
    * The size of the circles drawn when rendering pin constraints.
    */
  var pinSize: js.UndefOr[Double] = js.native
  /**
    * The color value of the rectangle drawn when rendering the body position.
    */
  var positionColor: js.UndefOr[Double] = js.native
  /**
    * The size of the rectangle drawn when rendering the body position.
    */
  var positionSize: js.UndefOr[Double] = js.native
  /**
    * Render the bodies using a fill color.
    */
  var renderFill: js.UndefOr[Boolean] = js.native
  /**
    * Render the bodies using a line stroke.
    */
  var renderLine: js.UndefOr[Boolean] = js.native
  /**
    * The fill color when rendering body sensors.
    */
  var sensorFillColor: js.UndefOr[Double] = js.native
  /**
    * The line color when rendering body sensors.
    */
  var sensorLineColor: js.UndefOr[Double] = js.native
  /**
    * The color of the body separation line.
    */
  var separationColor: js.UndefOr[Boolean] = js.native
  /**
    * Render just a single body axis?
    */
  var showAngleIndicator: js.UndefOr[Boolean] = js.native
  /**
    * Render all of the body axes?
    */
  var showAxes: js.UndefOr[Boolean] = js.native
  /**
    * Render the dynamic bodies in the world to the Graphics object?
    */
  var showBody: js.UndefOr[Boolean] = js.native
  /**
    * Render the bounds of the bodies in the world?
    */
  var showBounds: js.UndefOr[Boolean] = js.native
  /**
    * Render the broadphase grid?
    */
  var showBroadphase: js.UndefOr[Boolean] = js.native
  /**
    * Render the collision points and normals for colliding pairs.
    */
  var showCollisions: js.UndefOr[Boolean] = js.native
  /**
    * When rendering polygon bodies, render the convex hull as well?
    */
  var showConvexHulls: js.UndefOr[Boolean] = js.native
  /**
    * When rendering bodies, render the internal edges as well?
    */
  var showInternalEdges: js.UndefOr[Boolean] = js.native
  /**
    * Render all world constraints to the Graphics object?
    */
  var showJoint: js.UndefOr[Boolean] = js.native
  /**
    * Render the position of non-static bodies?
    */
  var showPositions: js.UndefOr[Boolean] = js.native
  /**
    * Render bodies or body parts that are flagged as being a sensor?
    */
  var showSensors: js.UndefOr[Boolean] = js.native
  /**
    * Render lines showing the separation between bodies.
    */
  var showSeparation: js.UndefOr[Boolean] = js.native
  /**
    * Render any sleeping bodies (dynamic or static) in the world to the Graphics object?
    */
  var showSleeping: js.UndefOr[Boolean] = js.native
  /**
    * Render the static bodies in the world to the Graphics object?
    */
  var showStaticBody: js.UndefOr[Boolean] = js.native
  /**
    * Render the velocity of the bodies in the world?
    */
  var showVelocity: js.UndefOr[Boolean] = js.native
  /**
    * The color value of the fill when rendering sleeping dynamic bodies.
    */
  var sleepFillColor: js.UndefOr[Double] = js.native
  /**
    * The color value of the line stroke when rendering sleeping dynamic bodies.
    */
  var sleepLineColor: js.UndefOr[Double] = js.native
  /**
    * The color value of spring constraints.
    */
  var springColor: js.UndefOr[Double] = js.native
  /**
    * The amount to multiply the opacity of sleeping static bodies by.
    */
  var staticBodySleepOpacity: js.UndefOr[Double] = js.native
  /**
    * The color value of the fill when rendering static bodies.
    */
  var staticFillColor: js.UndefOr[Double] = js.native
  /**
    * The color value of the line stroke when rendering static bodies.
    */
  var staticLineColor: js.UndefOr[Double] = js.native
  /**
    * The color of the body velocity line.
    */
  var velocityColor: js.UndefOr[Boolean] = js.native
}

object MatterDebugConfig {
  @scala.inline
  def apply(): MatterDebugConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatterDebugConfig]
  }
  @scala.inline
  implicit class MatterDebugConfigOps[Self <: MatterDebugConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnchorColor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnchorColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorColor")(js.undefined)
        ret
    }
    @scala.inline
    def withAnchorSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnchorSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorSize")(js.undefined)
        ret
    }
    @scala.inline
    def withAngleColor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angleColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAngleColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angleColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBoundsColor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundsColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoundsColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundsColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBroadphaseColor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("broadphaseColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBroadphaseColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("broadphaseColor")(js.undefined)
        ret
    }
    @scala.inline
    def withCollisionColor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collisionColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollisionColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collisionColor")(js.undefined)
        ret
    }
    @scala.inline
    def withFillColor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFillColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillColor")(js.undefined)
        ret
    }
    @scala.inline
    def withFillOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFillOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withHullColor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hullColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHullColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hullColor")(js.undefined)
        ret
    }
    @scala.inline
    def withJointColor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jointColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJointColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jointColor")(js.undefined)
        ret
    }
    @scala.inline
    def withJointLineOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jointLineOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJointLineOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jointLineOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withJointLineThickness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jointLineThickness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJointLineThickness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jointLineThickness")(js.undefined)
        ret
    }
    @scala.inline
    def withLineColor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineColor")(js.undefined)
        ret
    }
    @scala.inline
    def withLineOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withLineThickness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineThickness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineThickness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineThickness")(js.undefined)
        ret
    }
    @scala.inline
    def withPinColor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPinColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinColor")(js.undefined)
        ret
    }
    @scala.inline
    def withPinSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPinSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinSize")(js.undefined)
        ret
    }
    @scala.inline
    def withPositionColor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPositionColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionColor")(js.undefined)
        ret
    }
    @scala.inline
    def withPositionSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPositionSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionSize")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderFill(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderFill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderFill")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderLine(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderLine")(js.undefined)
        ret
    }
    @scala.inline
    def withSensorFillColor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sensorFillColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSensorFillColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sensorFillColor")(js.undefined)
        ret
    }
    @scala.inline
    def withSensorLineColor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sensorLineColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSensorLineColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sensorLineColor")(js.undefined)
        ret
    }
    @scala.inline
    def withSeparationColor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separationColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeparationColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separationColor")(js.undefined)
        ret
    }
    @scala.inline
    def withShowAngleIndicator(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAngleIndicator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowAngleIndicator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAngleIndicator")(js.undefined)
        ret
    }
    @scala.inline
    def withShowAxes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAxes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowAxes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAxes")(js.undefined)
        ret
    }
    @scala.inline
    def withShowBody(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showBody")(js.undefined)
        ret
    }
    @scala.inline
    def withShowBounds(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showBounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowBounds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showBounds")(js.undefined)
        ret
    }
    @scala.inline
    def withShowBroadphase(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showBroadphase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowBroadphase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showBroadphase")(js.undefined)
        ret
    }
    @scala.inline
    def withShowCollisions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCollisions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowCollisions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCollisions")(js.undefined)
        ret
    }
    @scala.inline
    def withShowConvexHulls(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showConvexHulls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowConvexHulls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showConvexHulls")(js.undefined)
        ret
    }
    @scala.inline
    def withShowInternalEdges(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showInternalEdges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowInternalEdges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showInternalEdges")(js.undefined)
        ret
    }
    @scala.inline
    def withShowJoint(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showJoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowJoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showJoint")(js.undefined)
        ret
    }
    @scala.inline
    def withShowPositions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPositions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowPositions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPositions")(js.undefined)
        ret
    }
    @scala.inline
    def withShowSensors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSensors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowSensors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSensors")(js.undefined)
        ret
    }
    @scala.inline
    def withShowSeparation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSeparation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowSeparation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSeparation")(js.undefined)
        ret
    }
    @scala.inline
    def withShowSleeping(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSleeping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowSleeping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSleeping")(js.undefined)
        ret
    }
    @scala.inline
    def withShowStaticBody(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showStaticBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowStaticBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showStaticBody")(js.undefined)
        ret
    }
    @scala.inline
    def withShowVelocity(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showVelocity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowVelocity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showVelocity")(js.undefined)
        ret
    }
    @scala.inline
    def withSleepFillColor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sleepFillColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSleepFillColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sleepFillColor")(js.undefined)
        ret
    }
    @scala.inline
    def withSleepLineColor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sleepLineColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSleepLineColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sleepLineColor")(js.undefined)
        ret
    }
    @scala.inline
    def withSpringColor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("springColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpringColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("springColor")(js.undefined)
        ret
    }
    @scala.inline
    def withStaticBodySleepOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staticBodySleepOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStaticBodySleepOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staticBodySleepOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withStaticFillColor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staticFillColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStaticFillColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staticFillColor")(js.undefined)
        ret
    }
    @scala.inline
    def withStaticLineColor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staticLineColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStaticLineColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staticLineColor")(js.undefined)
        ret
    }
    @scala.inline
    def withVelocityColor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("velocityColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVelocityColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("velocityColor")(js.undefined)
        ret
    }
  }
  
}

