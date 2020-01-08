package typingsSlinky.arcgisDashJsDashApi.__esri

import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`label-3d`
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`line-3d`
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`mesh-3d`
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`picture-fill`
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`picture-marker`
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`point-3d`
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`polygon-3d`
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`shield-label-symbol`
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`simple-fill`
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`simple-line`
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`simple-marker`
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`web-style`
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.cim
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.text
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
  var color: Color = js.native
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

