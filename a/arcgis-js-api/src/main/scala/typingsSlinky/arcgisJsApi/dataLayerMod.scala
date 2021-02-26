package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.DataLayer
import typingsSlinky.arcgisJsApi.esri.DataLayerConstructor
import typingsSlinky.arcgisJsApi.esri.DataLayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataLayerMod extends Shortcut {
  
  @JSImport("esri/tasks/support/DataLayer", JSImport.Namespace)
  @js.native
  val ^ : DataLayerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/tasks/support/DataLayer", JSImport.Namespace)
  @js.native
  /**
    * Input for properties of ClosestFacilityParameters, RouteParameters or ServiceAreaParameters.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DataLayer.html)
    */
  class Class () extends DataLayer {
    def this(properties: DataLayerProperties) = this()
  }
  
  type _To = DataLayerConstructor
  
  /* This means you don't have to write `^`, but can instead just say `dataLayerMod.foo` */
  override def _to: DataLayerConstructor = ^
}
