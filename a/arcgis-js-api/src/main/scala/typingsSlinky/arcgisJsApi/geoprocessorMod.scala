package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.Geoprocessor
import typingsSlinky.arcgisJsApi.esri.GeoprocessorConstructor
import typingsSlinky.arcgisJsApi.esri.GeoprocessorProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geoprocessorMod extends Shortcut {
  
  @JSImport("esri/tasks/Geoprocessor", JSImport.Namespace)
  @js.native
  val ^ : GeoprocessorConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/tasks/Geoprocessor", JSImport.Namespace)
  @js.native
  /**
    * Represents a GP Task resource exposed by the ArcGIS REST API.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Geoprocessor.html)
    */
  class Class () extends Geoprocessor {
    def this(properties: GeoprocessorProperties) = this()
  }
  
  type _To = GeoprocessorConstructor
  
  /* This means you don't have to write `^`, but can instead just say `geoprocessorMod.foo` */
  override def _to: GeoprocessorConstructor = ^
}
