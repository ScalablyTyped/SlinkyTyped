package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SceneViewConstraintsProperties extends Object {
  /**
    * Specifies a constraint on the minimum and maximum allowed camera altitude.
    * > **Known Limitations**  The `altitude` constraint is only supported in scenes with `global` [viewingMode](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#viewingMode).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#constraints)
    */
  var altitude: js.UndefOr[SceneViewConstraintsAltitudeProperties] = js.native
  /**
    * Specifies the near and far webgl clip distances.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#constraints)
    */
  var clipDistance: js.UndefOr[SceneViewConstraintsClipDistanceProperties] = js.native
  /**
    * When enabled, prevents the user from navigating below the surface in a local SceneView.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#constraints)
    */
  var collision: js.UndefOr[SceneViewConstraintsCollision] = js.native
  /**
    * Specifies a constraint on the amount of allowed tilting of the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#constraints)
    */
  var tilt: js.UndefOr[SceneViewConstraintsTiltProperties] = js.native
}

object SceneViewConstraintsProperties {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): SceneViewConstraintsProperties = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[SceneViewConstraintsProperties]
  }
  @scala.inline
  implicit class SceneViewConstraintsPropertiesOps[Self <: SceneViewConstraintsProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAltitude(value: SceneViewConstraintsAltitudeProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAltitude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altitude")(js.undefined)
        ret
    }
    @scala.inline
    def withClipDistance(value: SceneViewConstraintsClipDistanceProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClipDistance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipDistance")(js.undefined)
        ret
    }
    @scala.inline
    def withCollision(value: SceneViewConstraintsCollision): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collision")(js.undefined)
        ret
    }
    @scala.inline
    def withTilt(value: SceneViewConstraintsTiltProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tilt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTilt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tilt")(js.undefined)
        ret
    }
  }
  
}

