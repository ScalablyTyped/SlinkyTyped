package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.DirectLineMeasurement3D
import typingsSlinky.arcgisJsApi.esri.DirectLineMeasurement3DConstructor
import typingsSlinky.arcgisJsApi.esri.DirectLineMeasurement3DProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object directLineMeasurement3DMod extends Shortcut {
  
  @JSImport("esri/widgets/DirectLineMeasurement3D", JSImport.Namespace)
  @js.native
  val ^ : DirectLineMeasurement3DConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/DirectLineMeasurement3D", JSImport.Namespace)
  @js.native
  /**
    * The DirectLineMeasurement3D widget calculates and displays the 3D distance between two points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DirectLineMeasurement3D.html)
    */
  class Class () extends DirectLineMeasurement3D {
    def this(properties: DirectLineMeasurement3DProperties) = this()
  }
  
  type _To = DirectLineMeasurement3DConstructor
  
  /* This means you don't have to write `^`, but can instead just say `directLineMeasurement3DMod.foo` */
  override def _to: DirectLineMeasurement3DConstructor = ^
}
