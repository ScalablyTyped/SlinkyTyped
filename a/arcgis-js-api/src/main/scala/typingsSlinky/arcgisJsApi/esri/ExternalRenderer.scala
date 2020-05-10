package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExternalRenderer extends Object {
  /**
    * Called when the external renderer is removed from a view, or when the [ready](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#ready) state of the view turns false. Receives a single parameter of type [RenderContext](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#RenderContext).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#ExternalRenderer)
    */
  var dispose: js.UndefOr[RenderContextCallback] = js.native
  /**
    * Called in every frame to execute the state update and draw calls. Receives a single parameter of type [RenderContext](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#RenderContext).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#ExternalRenderer)
    */
  var render: js.UndefOr[RenderContextCallback] = js.native
  /**
    * Typically called once after adding the external renderer to a view, or whenever the [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) becomes [ready](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#ready). It may be called again if the ready state cycles, for example when a different [Map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html) is assigned to the view. Receives a single parameter of type [RenderContext](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#RenderContext).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#ExternalRenderer)
    */
  var setup: js.UndefOr[RenderContextCallback] = js.native
}

object ExternalRenderer {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): ExternalRenderer = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[ExternalRenderer]
  }
  @scala.inline
  implicit class ExternalRendererOps[Self <: ExternalRenderer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDispose(value: /* context */ js.UndefOr[RenderContext] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispose")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDispose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispose")(js.undefined)
        ret
    }
    @scala.inline
    def withRender(value: /* context */ js.UndefOr[RenderContext] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.undefined)
        ret
    }
    @scala.inline
    def withSetup(value: /* context */ js.UndefOr[RenderContext] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setup")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setup")(js.undefined)
        ret
    }
  }
  
}

