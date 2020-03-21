package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`label-3d`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`line-3d`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`mesh-3d`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`picture-fill`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`picture-marker`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`point-3d`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`polygon-3d`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`shield-label-symbol`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`simple-fill`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`simple-line`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`simple-marker`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`web-style`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.cim
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Symbol
  extends Accessor
     with JSONSupport {
  /**
    * The color of the symbol. This can be autocast with an array of rgb(a) values, named string, hex string or an hsl(a) string, an object with `r`, `g`, `b`, and `a` properties, or a [Color](https://developers.arcgis.com/javascript/latest/api-reference/esri-Color.html) object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol.html#color)
    *
    * @default black
    */
  var color: Color_ = js.native
  /**
    * The symbol type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol.html#type)
    */
  val `type`: `simple-marker` | `picture-marker` | `simple-line` | `simple-fill` | `picture-fill` | text | `shield-label-symbol` | `point-3d` | `line-3d` | `polygon-3d` | `web-style` | `mesh-3d` | `label-3d` | cim = js.native
}

@JSGlobal("__esri.Symbol")
@js.native
object Symbol extends SymbolConstructor

