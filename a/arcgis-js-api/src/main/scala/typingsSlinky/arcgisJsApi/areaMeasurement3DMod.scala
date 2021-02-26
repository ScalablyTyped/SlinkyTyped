package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.AreaMeasurement3D
import typingsSlinky.arcgisJsApi.esri.AreaMeasurement3DConstructor
import typingsSlinky.arcgisJsApi.esri.AreaMeasurement3DProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object areaMeasurement3DMod extends Shortcut {
  
  @JSImport("esri/widgets/AreaMeasurement3D", JSImport.Namespace)
  @js.native
  val ^ : AreaMeasurement3DConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/AreaMeasurement3D", JSImport.Namespace)
  @js.native
  /**
    * The AreaMeasurement3D widget calculates and displays the area and perimeter of a polygon.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement3D.html)
    */
  class Class () extends AreaMeasurement3D {
    def this(properties: AreaMeasurement3DProperties) = this()
  }
  
  type _To = AreaMeasurement3DConstructor
  
  /* This means you don't have to write `^`, but can instead just say `areaMeasurement3DMod.foo` */
  override def _to: AreaMeasurement3DConstructor = ^
}
