package typingsSlinky.arcgisJsApi.global.esri

import typingsSlinky.arcgisJsApi.esri.ClassBreaksRendererConstructor
import typingsSlinky.arcgisJsApi.esri.ClassBreaksRendererProperties
import typingsSlinky.arcgisJsApi.esri.DotDensityRendererConstructor
import typingsSlinky.arcgisJsApi.esri.DotDensityRendererProperties
import typingsSlinky.arcgisJsApi.esri.HeatmapRendererConstructor
import typingsSlinky.arcgisJsApi.esri.HeatmapRendererProperties
import typingsSlinky.arcgisJsApi.esri.SimpleRendererConstructor
import typingsSlinky.arcgisJsApi.esri.SimpleRendererProperties
import typingsSlinky.arcgisJsApi.esri.UniqueValueRendererConstructor
import typingsSlinky.arcgisJsApi.esri.UniqueValueRendererProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A convenience module for importing [Renderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-Renderer.html) classes when developing with [TypeScript](https://developers.arcgis.com/javascript/latest/guide/typescript-setup/index.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers.html)
  */
object renderers {
  
  @JSGlobal("__esri.renderers.ClassBreaksRenderer")
  @js.native
  val ClassBreaksRenderer: ClassBreaksRendererConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("__esri.renderers.ClassBreaksRenderer")
  @js.native
  /**
    * ClassBreaksRenderer defines the symbol of each feature in a [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html) based on the value of a numeric attribute.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html)
    */
  class ClassBreaksRendererCls ()
    extends typingsSlinky.arcgisJsApi.esri.ClassBreaksRenderer {
    def this(properties: ClassBreaksRendererProperties) = this()
  }
  
  @JSGlobal("__esri.renderers.DotDensityRenderer")
  @js.native
  val DotDensityRenderer: DotDensityRendererConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("__esri.renderers.DotDensityRenderer")
  @js.native
  /**
    * DotDensityRenderer allows you to create dot density visualizations for polygon layers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html)
    */
  class DotDensityRendererCls ()
    extends typingsSlinky.arcgisJsApi.esri.DotDensityRenderer {
    def this(properties: DotDensityRendererProperties) = this()
  }
  
  @JSGlobal("__esri.renderers.HeatmapRenderer")
  @js.native
  val HeatmapRenderer: HeatmapRendererConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("__esri.renderers.HeatmapRenderer")
  @js.native
  /**
    * The HeatmapRenderer renders point [FeatureLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html), [CSVLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html), [GeoJSONLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html) and [OGCFeatureLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-OGCFeatureLayer.html) as a raster surface, emphasizing areas with a high density of points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html)
    */
  class HeatmapRendererCls ()
    extends typingsSlinky.arcgisJsApi.esri.HeatmapRenderer {
    def this(properties: HeatmapRendererProperties) = this()
  }
  
  @JSGlobal("__esri.renderers.SimpleRenderer")
  @js.native
  val SimpleRenderer: SimpleRendererConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("__esri.renderers.SimpleRenderer")
  @js.native
  /**
    * SimpleRenderer renders all features in a [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html) with one [Symbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-SimpleRenderer.html)
    */
  class SimpleRendererCls ()
    extends typingsSlinky.arcgisJsApi.esri.SimpleRenderer {
    def this(properties: SimpleRendererProperties) = this()
  }
  
  @JSGlobal("__esri.renderers.UniqueValueRenderer")
  @js.native
  val UniqueValueRenderer: UniqueValueRendererConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("__esri.renderers.UniqueValueRenderer")
  @js.native
  /**
    * UniqueValueRenderer allows you to symbolize features in a [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html) based on one or more matching string attributes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html)
    */
  class UniqueValueRendererCls ()
    extends typingsSlinky.arcgisJsApi.esri.UniqueValueRenderer {
    def this(properties: UniqueValueRendererProperties) = this()
  }
}
