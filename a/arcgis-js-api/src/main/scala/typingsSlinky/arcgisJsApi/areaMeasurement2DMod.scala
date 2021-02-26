package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.AreaMeasurement2D
import typingsSlinky.arcgisJsApi.esri.AreaMeasurement2DConstructor
import typingsSlinky.arcgisJsApi.esri.AreaMeasurement2DProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object areaMeasurement2DMod extends Shortcut {
  
  @JSImport("esri/widgets/AreaMeasurement2D", JSImport.Namespace)
  @js.native
  val ^ : AreaMeasurement2DConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/AreaMeasurement2D", JSImport.Namespace)
  @js.native
  /**
    * The AreaMeasurement2D widget calculates and displays the area and perimeter of a polygon in a [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D.html)
    */
  class Class () extends AreaMeasurement2D {
    def this(properties: AreaMeasurement2DProperties) = this()
  }
  
  type _To = AreaMeasurement2DConstructor
  
  /* This means you don't have to write `^`, but can instead just say `areaMeasurement2DMod.foo` */
  override def _to: AreaMeasurement2DConstructor = ^
}
