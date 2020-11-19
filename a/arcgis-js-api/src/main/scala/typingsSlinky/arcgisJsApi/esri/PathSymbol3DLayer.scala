package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.all
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.bevel
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.bottom
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.butt
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.center
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.circle
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.heading
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.miter
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.none
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.path
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.quad
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.round
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.square
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PathSymbol3DLayer
  extends Symbol3DLayer
     with typingsSlinky.arcgisJsApi.esri.symbols.Symbol3DLayer
     with symbolsSymbol3DLayer {
  
  /**
    * Defines offset of the path cross section relative to the [Polyline](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html) geometry.
    *
    * Possible Value | Example
    * ---------------|---------
    * center | ![anchor-center](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/anchor-center.png)
    * bottom | ![anchor-bottom](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/anchor-bottom.png)
    * top | ![anchor-top](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/anchor-top.png)
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html#anchor)
    *
    * @default "center"
    */
  var anchor: center | bottom | top = js.native
  
  /**
    * Controls the shape at the start and end point of the path. `none` will not render the faces that close the path. See the table below for possible values.
    *
    * Possible Value | Example
    * ---------------|---------
    * butt | ![line3d-cap-butt](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/line3d-cap-butt.png)
    * round | ![line3d-cap-round](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/line3d-cap-round.png)
    * square | ![line3d-cap-square](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/line3d-cap-square.png)
    * none | ![line3d-cap-square](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/line3d-cap-none.png)
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html#cap)
    *
    * @default "butt"
    */
  var cap: none | butt | square | round = js.native
  
  /**
    * Indicates whether the symbol layer geometry casts shadows in the scene. Setting this property to `false` will disable shadows for the symbol layer even if direct shadows are enabled in [SceneView.environment](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#environment).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html#castShadows)
    *
    * @default true
    */
  var castShadows: Boolean = js.native
  
  /**
    * The vertical dimension of the cross-section of the path in meters. If only the [width](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html#width) is set, then the height is set to the same value as the width. If neither width nor height are set, then the path is not displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html#height)
    */
  var height: Double = js.native
  
  /**
    * Controls the shape of the connection between two segments of the path. See the table below for possible values.
    *
    * Possible Value | Example
    * ---------------|---------
    * bevel | ![line3d-join-bevel](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/line3d-join-bevel.png)
    * miter | ![line3d-join-miter](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/line3d-join-miter.png)
    * round | ![line3d-join-round](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/line3d-join-round.png)
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html#join)
    *
    * @default "miter"
    */
  var join: miter | bevel | round = js.native
  
  /**
    * The material used to shade the path. This property defines the paths's color.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html#material)
    */
  var material: PathSymbol3DLayerMaterial = js.native
  
  /**
    * Cross-section profile of the path geometry. Setting it to `circle` creates a path with a pipe shape and setting it to `quad` gives the path a rectangular shape.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html#profile)
    *
    * @default "circle"
    */
  var profile: circle | quad = js.native
  
  /**
    * Defines how the [profile](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html#profile) is rotated as it is extruded along the [Polyline](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html) geometry. The rotation axes (heading, tilt, roll) can be limited to constrain the orientation of the profile in the scene. Setting `profileRotation` to `all` minimizes the twist along the line and ensures that the diameter of the resulting visualization corresponds to [width](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html#width) and [height](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html#height). Setting `profileRotation` to `"heading"` ensures that the profile stays upright (no tilt or twist).  Typically, `all` is used for `circle` profiles and `heading` is used for `quad` profiles.  As an example, when setting `heading` on a path with a `quad` profile the path is oriented upright:  ![profileRotation-heading](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/profileRotation-heading.png)  The same path with `profileRotation` set to `all` will rotate in all three degrees of freedom:  ![profileRotation-all](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/profileRotation-all.png)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html#profileRotation)
    *
    * @default "all"
    */
  var profileRotation: heading | all = js.native
  
  /**
    * Sets the width and height of the path in meters.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html#size)
    */
  var size: Double = js.native
  
  /**
    * The symbol type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html#type)
    */
  @JSName("type")
  val type_PathSymbol3DLayer: path = js.native
  
  /**
    * The horizontal dimension of the cross-section of the path in meters. If only the [height](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html#height) is set, then the width is set to the same value as the height. If neither width nor height are set, then the path is not displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html#width)
    */
  var width: Double = js.native
}
