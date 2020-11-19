package typingsSlinky.arcgisJsApi.unknownLayerMod

import typingsSlinky.arcgisJsApi.esri.UnknownLayer
import typingsSlinky.arcgisJsApi.esri.UnknownLayerProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("esri/layers/UnknownLayer", JSImport.Namespace)
@js.native
/**
  * Represents a layer whose type could not be determined. For example, when loading a layer from a URL and the layer type cannot be determined, then it is represented as an instance of this class.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-UnknownLayer.html)
  */
class Class () extends UnknownLayer {
  def this(properties: UnknownLayerProperties) = this()
}
