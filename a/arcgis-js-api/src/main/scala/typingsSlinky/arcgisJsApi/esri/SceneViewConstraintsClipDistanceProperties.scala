package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.auto
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.manual
import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SceneViewConstraintsClipDistanceProperties extends Object {
  /**
    * The far clip distance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#constraints)
    */
  var far: js.UndefOr[Double] = js.native
  /**
    * Specifies the mode of the constraint which is either `auto` or `manual`. In `auto` mode, the near and far clip distance values are automatically determined. In `manual` mode, the near and far clip distance values are user defined, constant values. Note that the mode automatically changes to `manual` whenever the `near` or `far` property is set.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#constraints)
    *
    * @default auto
    */
  var mode: js.UndefOr[auto | manual] = js.native
  /**
    * The near clip distance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#constraints)
    */
  var near: js.UndefOr[Double] = js.native
}

object SceneViewConstraintsClipDistanceProperties {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): SceneViewConstraintsClipDistanceProperties = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[SceneViewConstraintsClipDistanceProperties]
  }
  @scala.inline
  implicit class SceneViewConstraintsClipDistancePropertiesOps[Self <: SceneViewConstraintsClipDistanceProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFar(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("far")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("far")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: auto | manual): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withNear(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("near")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("near")(js.undefined)
        ret
    }
  }
  
}

