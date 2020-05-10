package typingsSlinky.arcgisJsApi.esri

import org.scalajs.dom.raw.WebGLRenderingContext
import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderContext extends Object {
  /**
    * The camera used to render the current frame.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#RenderContext)
    */
  var camera: RenderCamera = js.native
  /**
    * The WebGL rendering context.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#RenderContext)
    */
  var gl: WebGLRenderingContext = js.native
  /**
    * The lighting used by [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) to render the current frame.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#RenderContext)
    */
  var sunLight: SunLight = js.native
  /**
    * Binds the color and depth buffers an external renderer is supposed to render into.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#RenderContext)
    *
    *
    */
  def bindRenderTarget(): Unit = js.native
  /**
    * A convenience function provided to completely reset the WebGL state after using it.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#RenderContext)
    *
    *
    */
  def resetWebGLState(): Unit = js.native
}

object RenderContext {
  @scala.inline
  def apply(
    bindRenderTarget: () => Unit,
    camera: RenderCamera,
    constructor: js.Function,
    gl: WebGLRenderingContext,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    resetWebGLState: () => Unit,
    sunLight: SunLight
  ): RenderContext = {
    val __obj = js.Dynamic.literal(bindRenderTarget = js.Any.fromFunction0(bindRenderTarget), camera = camera.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], gl = gl.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), resetWebGLState = js.Any.fromFunction0(resetWebGLState), sunLight = sunLight.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderContext]
  }
  @scala.inline
  implicit class RenderContextOps[Self <: RenderContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBindRenderTarget(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindRenderTarget")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCamera(value: RenderCamera): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("camera")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGl(value: WebGLRenderingContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResetWebGLState(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetWebGLState")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSunLight(value: SunLight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sunLight")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

