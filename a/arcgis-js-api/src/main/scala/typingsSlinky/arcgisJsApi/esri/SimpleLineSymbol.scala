package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`dash-dot`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`long-dash-dot-dot`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`long-dash-dot`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`long-dash`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`short-dash-dot-dot`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`short-dash-dot`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`short-dash`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`short-dot`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.bevel
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.butt
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.dash
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.dot
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.miter
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.none
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.round
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.solid
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.square
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.arcgisJsApi.esri.Symbol2D3D because Already inherited
- typingsSlinky.arcgisJsApi.esri.symbols.Symbol2D3D because Already inherited */ @js.native
trait SimpleLineSymbol
  extends Symbol2D
     with LineSymbol
     with typingsSlinky.arcgisJsApi.esri.symbols.Symbol2D {
  
  /**
    * Specifies the cap style. The cap is the end node of a polyline, or the end of a line segment that does not connect with another segment of the same polyline.  See the table below for possible values.
    *
    * Possible Value | Example
    * ---------------|---------
    * butt | ![sls-cap-butt](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/sls-cap-butt.png)
    * round | ![sls-cap-round](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/sls-cap-round.png)
    * square | ![sls-cap-square](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/sls-cap-square.png)
    *
    * > **Known Limitations**
    *   * This property does not persist when applied to a symbol used in a layer saved to a web map or portal item. See the [web map specification](https://developers.arcgis.com/web-map-specification/objects/esriSLS_symbol/) for more details about properties that persist when a SimpleLineSymbol is saved to an ArcGIS Online or Portal item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleLineSymbol.html#cap)
    *
    * @default round
    */
  var cap: butt | round | square = js.native
  
  /**
    * Specifies the join style. A `join` refers to the joint of a polyline, or the end of a line segment that connects to another segment of the same polyline. See the table below for possible values.
    *
    * Possible Value | Example
    * ---------------|---------
    * bevel | ![sls-join-bevel](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/sls-join-bevel.png)
    * miter | ![sls-join-miter](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/sls-join-miter.png)
    * round | ![sls-join-round](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/sls-join-round.png)
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleLineSymbol.html#join)
    *
    * @default round
    */
  var join: miter | round | bevel = js.native
  
  /**
    * Specifies the color, style, and placement of a symbol marker on the line.
    * > **Known Limitations**
    *   * This is not currently supported within a 3D [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleLineSymbol.html#marker)
    */
  var marker: LineSymbolMarker = js.native
  
  /**
    * Maximum allowed ratio of the width of a miter join to the line width. Miter joins can get very wide at sharp line angles; this can be visually unpleasant or interfere with cartography. In the example below, the width of the miter join is about 3.6 times the width of the line.  ![SimpleLineSymbol.miterLimit](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/sls-miter-limit.png)  A miter limit of `X` means that a miter join can be at most `X` times as wide as the line itself. Beyond that threshold, it is replaced with a bevel join. Referring to the previous example, setting the miter limit to 3.6 or greater has no effect on the generated visuals; setting the miter limit to 3.5 or smaller causes the replacement with a bevel join.  ![Enforcing miterLimit](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/sls-miter-limit-enforcement.png)
    * > **Known Limitations**  This property is currently not supported in 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleLineSymbol.html#miterLimit)
    *
    * @default 2
    */
  var miterLimit: Double = js.native
  
  /**
    * Specifies the line style. Possible values are listed in the table below:
    *
    * Value | Description
    * ------|-------------
    * dash | ![sls-dash](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols-sls-dash.png)
    * dash-dot | ![sls-dash-dot](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols-sls-dash-dot.png)
    * dot | ![sls-dot](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols-sls-dot.png)
    * long-dash | ![sls-long-dash](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols-sls-long-dash.png)
    * long-dash-dot | ![sls-long-dash-dot](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols-sls-long-dash-dot.png)
    * long-dash-dot-dot | ![sls-dash-dot-dot](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols-sls-dash-dot-dot.png)
    * none | The line has no symbol.
    * short-dash | ![sls-short-dash](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols-sls-short-dash.png)
    * short-dash-dot | ![sls-short-dash-dot](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols-sls-short-dash-dot.png)
    * short-dash-dot-dot | ![sls-short-dash-dot-dot](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols-sls-short-dash-dot-dot.png)
    * short-dot | ![sls-short-dot](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols-sls-short-dot.png)
    * solid | ![sls-solid](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols-sls-solid.png)
    *
    * > **Known Limitations**  This property is currently not supported in 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleLineSymbol.html#style)
    *
    * @default solid
    */
  var style: dash | `dash-dot` | dot | `long-dash` | `long-dash-dot` | `long-dash-dot-dot` | none | `short-dash` | `short-dash-dot` | `short-dash-dot-dot` | `short-dot` | solid = js.native
}
