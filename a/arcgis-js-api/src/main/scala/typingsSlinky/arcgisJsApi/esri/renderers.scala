package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A convenience module for importing [Renderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-Renderer.html) classes when developing with [TypeScript](https://developers.arcgis.com/javascript/latest/guide/typescript-setup/index.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers.html)
  */
@JSGlobal("__esri.renderers")
@js.native
object renderers extends js.Object {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.arcgisJsApi.esri.HeatmapRenderer
    - typingsSlinky.arcgisJsApi.esri.RendererWithVisualVariables
  */
  trait Renderer extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.arcgisJsApi.esri.SimpleRenderer
    - typingsSlinky.arcgisJsApi.esri.ClassBreaksRenderer
    - typingsSlinky.arcgisJsApi.esri.UniqueValueRenderer
    - typingsSlinky.arcgisJsApi.esri.DotDensityRenderer
  */
  trait RendererWithVisualVariables extends js.Object
  
  type ClassBreaksRenderer = typingsSlinky.arcgisJsApi.esri.ClassBreaksRenderer
  
  type DotDensityRenderer = typingsSlinky.arcgisJsApi.esri.DotDensityRenderer
  
  type HeatmapRenderer = typingsSlinky.arcgisJsApi.esri.HeatmapRenderer
  
  type SimpleRenderer = typingsSlinky.arcgisJsApi.esri.SimpleRenderer
  
  type UniqueValueRenderer = typingsSlinky.arcgisJsApi.esri.UniqueValueRenderer
}
