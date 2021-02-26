package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.WebMap
import typingsSlinky.arcgisJsApi.esri.WebMapConstructor
import typingsSlinky.arcgisJsApi.esri.WebMapProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webMapMod extends Shortcut {
  
  @JSImport("esri/WebMap", JSImport.Namespace)
  @js.native
  val ^ : WebMapConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/WebMap", JSImport.Namespace)
  @js.native
  /**
    * Loads a [WebMap](https://doc.arcgis.com/en/arcgis-online/create-maps/make-your-first-map.htm) from [ArcGIS Online](https://www.arcgis.com/home/) or [ArcGIS Enterprise portal](https://enterprise.arcgis.com/en/portal/latest/administer/windows/what-is-portal-for-arcgis-.htm) into a [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html)
    */
  class Class () extends WebMap {
    def this(properties: WebMapProperties) = this()
  }
  
  type _To = WebMapConstructor
  
  /* This means you don't have to write `^`, but can instead just say `webMapMod.foo` */
  override def _to: WebMapConstructor = ^
}
