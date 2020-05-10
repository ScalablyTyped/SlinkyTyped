package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PresentationProperties extends js.Object {
  /**
    * A collection of [slides](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html) that bookmark [viewpoints](https://developers.arcgis.com/javascript/latest/api-reference/esri-Viewpoint.html), visible layers, and other settings previously defined in a [WebScene](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Presentation.html#slides)
    */
  var slides: js.UndefOr[CollectionProperties[SlideProperties]] = js.native
}

object PresentationProperties {
  @scala.inline
  def apply(): PresentationProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PresentationProperties]
  }
  @scala.inline
  implicit class PresentationPropertiesOps[Self <: PresentationProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSlides(value: CollectionProperties[SlideProperties]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlides: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slides")(js.undefined)
        ret
    }
  }
  
}

