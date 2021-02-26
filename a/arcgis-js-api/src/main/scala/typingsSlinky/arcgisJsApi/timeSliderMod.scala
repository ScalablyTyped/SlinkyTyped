package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.TimeSlider
import typingsSlinky.arcgisJsApi.esri.TimeSliderConstructor
import typingsSlinky.arcgisJsApi.esri.TimeSliderProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timeSliderMod extends Shortcut {
  
  @JSImport("esri/widgets/TimeSlider", JSImport.Namespace)
  @js.native
  val ^ : TimeSliderConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/TimeSlider", JSImport.Namespace)
  @js.native
  /**
    * The TimeSlider widget simplifies visualization of temporal data in your application.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html)
    */
  class Class () extends TimeSlider {
    def this(properties: TimeSliderProperties) = this()
  }
  
  type _To = TimeSliderConstructor
  
  /* This means you don't have to write `^`, but can instead just say `timeSliderMod.foo` */
  override def _to: TimeSliderConstructor = ^
}
