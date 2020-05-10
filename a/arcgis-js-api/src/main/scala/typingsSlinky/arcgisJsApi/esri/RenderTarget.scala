package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderTarget extends Object {
  /**
    * The framebuffer where the [render()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#render) method should direct its output.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#RenderTarget)
    */
  var framebuffer: js.Any = js.native
  /**
    * A viewport that fully covers `framebuffer`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#RenderTarget)
    */
  var viewport: js.Array[Double] = js.native
}

object RenderTarget {
  @scala.inline
  def apply(
    constructor: js.Function,
    framebuffer: js.Any,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    viewport: js.Array[Double]
  ): RenderTarget = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], framebuffer = framebuffer.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), viewport = viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderTarget]
  }
  @scala.inline
  implicit class RenderTargetOps[Self <: RenderTarget] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFramebuffer(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("framebuffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewport(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewport")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

