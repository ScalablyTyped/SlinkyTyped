package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RendererProperties extends js.Object {
  /**
    * Authoring metadata only included in renderers generated from one of the Smart Mapping creator methods, such as [sizeRendererCreator.createContinuousRenderer()](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-size.html#createContinuousRenderer) or [colorRendererCreator.createContinuousRenderer()](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-color.html#createContinuousRenderer). This includes information from UI elements such as sliders and selected classification methods and themes. This allows the authoring clients to save specific overridable settings so that next time it is accessed via the UI, their selections can be remembered.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-Renderer.html#authoringInfo)
    */
  var authoringInfo: js.UndefOr[AuthoringInfoProperties] = js.native
}

object RendererProperties {
  @scala.inline
  def apply(): RendererProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RendererProperties]
  }
  @scala.inline
  implicit class RendererPropertiesOps[Self <: RendererProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthoringInfo(value: AuthoringInfoProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authoringInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthoringInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authoringInfo")(js.undefined)
        ret
    }
  }
  
}

