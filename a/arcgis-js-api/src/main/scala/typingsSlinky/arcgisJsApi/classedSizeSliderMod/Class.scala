package typingsSlinky.arcgisJsApi.classedSizeSliderMod

import typingsSlinky.arcgisJsApi.esri.ClassedSizeSlider
import typingsSlinky.arcgisJsApi.esri.ClassedSizeSliderProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("esri/widgets/smartMapping/ClassedSizeSlider", JSImport.Namespace)
@js.native
/**
  * The ClassedSizeSlider widget is designed for authoring and exploring data-driven visualizations in any layer that can be rendered with size in a [ClassBreaksRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html). At a minimum you must set the [breaks](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedSizeSlider.html#breaks) property of the widget. The breaks are used to set the slider's thumbs.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedSizeSlider.html)
  */
class Class () extends ClassedSizeSlider {
  def this(properties: ClassedSizeSliderProperties) = this()
}
