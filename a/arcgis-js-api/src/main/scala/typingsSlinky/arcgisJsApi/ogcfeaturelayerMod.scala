package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.OGCFeatureLayer
import typingsSlinky.arcgisJsApi.esri.OGCFeatureLayerConstructor
import typingsSlinky.arcgisJsApi.esri.OGCFeatureLayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ogcfeaturelayerMod extends Shortcut {
  
  @JSImport("esri/layers/OGCFeatureLayer", JSImport.Namespace)
  @js.native
  val ^ : OGCFeatureLayerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/OGCFeatureLayer", JSImport.Namespace)
  @js.native
  /**
    * The OGCFeatureLayer class is used to create a layer based on individual collections from a [OGC API Features](https://www.opengeospatial.org/standards/ogcapi-features) service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-OGCFeatureLayer.html)
    */
  class Class () extends OGCFeatureLayer {
    def this(properties: OGCFeatureLayerProperties) = this()
  }
  
  type _To = OGCFeatureLayerConstructor
  
  /* This means you don't have to write `^`, but can instead just say `ogcfeaturelayerMod.foo` */
  override def _to: OGCFeatureLayerConstructor = ^
}
