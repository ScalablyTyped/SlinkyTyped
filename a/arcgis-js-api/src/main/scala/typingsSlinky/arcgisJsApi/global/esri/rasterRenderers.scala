package typingsSlinky.arcgisJsApi.global.esri

import typingsSlinky.arcgisJsApi.esri.ClassBreaksRendererConstructor
import typingsSlinky.arcgisJsApi.esri.ClassBreaksRendererProperties
import typingsSlinky.arcgisJsApi.esri.RasterColormapRendererConstructor
import typingsSlinky.arcgisJsApi.esri.RasterColormapRendererProperties
import typingsSlinky.arcgisJsApi.esri.RasterShadedReliefRendererConstructor
import typingsSlinky.arcgisJsApi.esri.RasterShadedReliefRendererProperties
import typingsSlinky.arcgisJsApi.esri.RasterStretchRendererConstructor
import typingsSlinky.arcgisJsApi.esri.RasterStretchRendererProperties
import typingsSlinky.arcgisJsApi.esri.UniqueValueRendererConstructor
import typingsSlinky.arcgisJsApi.esri.UniqueValueRendererProperties
import typingsSlinky.arcgisJsApi.esri.VectorFieldRendererConstructor
import typingsSlinky.arcgisJsApi.esri.VectorFieldRendererProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A convenience module for importing renderer classes that can be used to render [ImageryLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html) when developing with [TypeScript](https://developers.arcgis.com/javascript/latest/guide/typescript-setup/index.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rasterRenderers.html)
  */
object rasterRenderers {
  
  @JSGlobal("__esri.rasterRenderers.ClassBreaksRenderer")
  @js.native
  val ClassBreaksRenderer: ClassBreaksRendererConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("__esri.rasterRenderers.ClassBreaksRenderer")
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
  
  @JSGlobal("__esri.rasterRenderers.RasterColormapRenderer")
  @js.native
  val RasterColormapRenderer: RasterColormapRendererConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("__esri.rasterRenderers.RasterColormapRenderer")
  @js.native
  /**
    * The RasterColormapRenderer defines the symbology to display raster data based on specific colors, aiding in visual analysis of the data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterColormapRenderer.html)
    */
  class RasterColormapRendererCls ()
    extends typingsSlinky.arcgisJsApi.esri.RasterColormapRenderer {
    def this(properties: RasterColormapRendererProperties) = this()
  }
  
  @JSGlobal("__esri.rasterRenderers.RasterShadedReliefRenderer")
  @js.native
  val RasterShadedReliefRenderer: RasterShadedReliefRendererConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("__esri.rasterRenderers.RasterShadedReliefRenderer")
  @js.native
  /**
    * RasterShadedReliefRenderer produces a grayscale or colored 3D representation of the surface on an [ImageryLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html) or [ImageryTileLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryTileLayer.html), with the sun's relative position taken into account for shading the image.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterShadedReliefRenderer.html)
    */
  class RasterShadedReliefRendererCls ()
    extends typingsSlinky.arcgisJsApi.esri.RasterShadedReliefRenderer {
    def this(properties: RasterShadedReliefRendererProperties) = this()
  }
  
  @JSGlobal("__esri.rasterRenderers.RasterStretchRenderer")
  @js.native
  val RasterStretchRenderer: RasterStretchRendererConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("__esri.rasterRenderers.RasterStretchRenderer")
  @js.native
  /**
    * RasterStretchRenderer defines the symbology with a gradual ramp of colors for each pixel in a [ImageryLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html) based on the pixel value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html)
    */
  class RasterStretchRendererCls ()
    extends typingsSlinky.arcgisJsApi.esri.RasterStretchRenderer {
    def this(properties: RasterStretchRendererProperties) = this()
  }
  
  @JSGlobal("__esri.rasterRenderers.UniqueValueRenderer")
  @js.native
  val UniqueValueRenderer: UniqueValueRendererConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("__esri.rasterRenderers.UniqueValueRenderer")
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
  
  @JSGlobal("__esri.rasterRenderers.VectorFieldRenderer")
  @js.native
  val VectorFieldRenderer: VectorFieldRendererConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("__esri.rasterRenderers.VectorFieldRenderer")
  @js.native
  /**
    * The VectorFieldRenderer allows you to display your raster data with vector symbols.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-VectorFieldRenderer.html)
    */
  class VectorFieldRendererCls ()
    extends typingsSlinky.arcgisJsApi.esri.VectorFieldRenderer {
    def this(properties: VectorFieldRendererProperties) = this()
  }
}
