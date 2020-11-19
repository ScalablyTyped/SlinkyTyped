package typingsSlinky.arcgisJsApi.baseElevationLayerMod

import typingsSlinky.arcgisJsApi.esri.BaseElevationLayer
import typingsSlinky.arcgisJsApi.esri.BaseElevationLayerProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("esri/layers/BaseElevationLayer", JSImport.Namespace)
@js.native
/**
  * BaseElevationLayer is intended to be extended for creating custom elevation layers. You create a custom [ElevationLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ElevationLayer.html) by calling [createSubclass()](https://dojotoolkit.org/reference-guide/1.10/dojo/_base/declare.html#createsubclass) on the `BaseElevationLayer`.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseElevationLayer.html)
  */
class Class () extends BaseElevationLayer {
  def this(properties: BaseElevationLayerProperties) = this()
}
