package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.HistogramRangeSlider
import typingsSlinky.arcgisJsApi.esri.HistogramRangeSliderConstructor
import typingsSlinky.arcgisJsApi.esri.HistogramRangeSliderProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object histogramRangeSliderMod extends Shortcut {
  
  @JSImport("esri/widgets/HistogramRangeSlider", JSImport.Namespace)
  @js.native
  val ^ : HistogramRangeSliderConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/HistogramRangeSlider", JSImport.Namespace)
  @js.native
  /**
    * A slider widget that can be used for filtering data or gathering numeric input from a user for a range of data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html)
    */
  class Class () extends HistogramRangeSlider {
    def this(properties: HistogramRangeSliderProperties) = this()
  }
  
  type _To = HistogramRangeSliderConstructor
  
  /* This means you don't have to write `^`, but can instead just say `histogramRangeSliderMod.foo` */
  override def _to: HistogramRangeSliderConstructor = ^
}
