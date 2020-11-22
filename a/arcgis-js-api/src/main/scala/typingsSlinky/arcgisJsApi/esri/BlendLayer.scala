package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`color-burn`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`color-dodge`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`destination-atop`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`destination-in`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`destination-out`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`destination-over`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`hard-light`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`soft-light`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`source-atop`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`source-in`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`source-out`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`vivid-light`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.average
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.darken
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.difference
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.exclusion
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.hue
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.invert
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.lighten
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.lighter
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.luminosity
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.minus
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.multiply
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.normal
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.overlay
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.plus
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.reflect
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.saturation
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.screen
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.xor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlendLayer extends js.Object {
  
  /**
    * Blend modes are used to blend layers together to create an interesting effect in a layer, or even to produce what seems like a new layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-BlendLayer.html#blendMode)
    */
  var blendMode: average | `color-burn` | `color-dodge` | typingsSlinky.arcgisJsApi.arcgisJsApiStrings.color | darken | `destination-atop` | `destination-in` | `destination-out` | `destination-over` | difference | exclusion | `hard-light` | hue | invert | lighten | lighter | luminosity | minus | multiply | normal | overlay | plus | reflect | saturation | screen | `soft-light` | `source-atop` | `source-in` | `source-out` | `vivid-light` | xor = js.native
}
object BlendLayer {
  
  @scala.inline
  def apply(
    blendMode: average | `color-burn` | `color-dodge` | typingsSlinky.arcgisJsApi.arcgisJsApiStrings.color | darken | `destination-atop` | `destination-in` | `destination-out` | `destination-over` | difference | exclusion | `hard-light` | hue | invert | lighten | lighter | luminosity | minus | multiply | normal | overlay | plus | reflect | saturation | screen | `soft-light` | `source-atop` | `source-in` | `source-out` | `vivid-light` | xor
  ): BlendLayer = {
    val __obj = js.Dynamic.literal(blendMode = blendMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlendLayer]
  }
  
  @scala.inline
  implicit class BlendLayerOps[Self <: BlendLayer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBlendMode(
      value: average | `color-burn` | `color-dodge` | typingsSlinky.arcgisJsApi.arcgisJsApiStrings.color | darken | `destination-atop` | `destination-in` | `destination-out` | `destination-over` | difference | exclusion | `hard-light` | hue | invert | lighten | lighter | luminosity | minus | multiply | normal | overlay | plus | reflect | saturation | screen | `soft-light` | `source-atop` | `source-in` | `source-out` | `vivid-light` | xor
    ): Self = this.set("blendMode", value.asInstanceOf[js.Any])
  }
}
