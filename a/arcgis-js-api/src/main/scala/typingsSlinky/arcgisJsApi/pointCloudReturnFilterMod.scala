package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.PointCloudReturnFilter
import typingsSlinky.arcgisJsApi.esri.PointCloudReturnFilterConstructor
import typingsSlinky.arcgisJsApi.esri.PointCloudReturnFilterProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pointCloudReturnFilterMod extends Shortcut {
  
  @JSImport("esri/layers/pointCloudFilters/PointCloudReturnFilter", JSImport.Namespace)
  @js.native
  val ^ : PointCloudReturnFilterConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/pointCloudFilters/PointCloudReturnFilter", JSImport.Namespace)
  @js.native
  /**
    * Laser pulses emitted from a lidar system can have several returns depending on the surfaces that they encounter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-pointCloudFilters-PointCloudReturnFilter.html)
    */
  class Class () extends PointCloudReturnFilter {
    def this(properties: PointCloudReturnFilterProperties) = this()
  }
  
  type _To = PointCloudReturnFilterConstructor
  
  /* This means you don't have to write `^`, but can instead just say `pointCloudReturnFilterMod.foo` */
  override def _to: PointCloudReturnFilterConstructor = ^
}
