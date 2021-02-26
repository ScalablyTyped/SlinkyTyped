package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.DistanceMeasurement2D
import typingsSlinky.arcgisJsApi.esri.DistanceMeasurement2DConstructor
import typingsSlinky.arcgisJsApi.esri.DistanceMeasurement2DProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distanceMeasurement2DMod extends Shortcut {
  
  @JSImport("esri/widgets/DistanceMeasurement2D", JSImport.Namespace)
  @js.native
  val ^ : DistanceMeasurement2DConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/DistanceMeasurement2D", JSImport.Namespace)
  @js.native
  /**
    * The DistanceMeasurement2D widget calculates and displays the distance between two or more points in a [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D.html)
    */
  class Class () extends DistanceMeasurement2D {
    def this(properties: DistanceMeasurement2DProperties) = this()
  }
  
  type _To = DistanceMeasurement2DConstructor
  
  /* This means you don't have to write `^`, but can instead just say `distanceMeasurement2DMod.foo` */
  override def _to: DistanceMeasurement2DConstructor = ^
}
