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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlendLayerProperties extends StObject {
  
  /**
    * Blend modes are used to blend layers together to create an interesting effect in a layer, or even to produce what seems like a new layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-BlendLayer.html#blendMode)
    */
  var blendMode: js.UndefOr[
    average | `color-burn` | `color-dodge` | typingsSlinky.arcgisJsApi.arcgisJsApiStrings.color | darken | `destination-atop` | `destination-in` | `destination-out` | `destination-over` | difference | exclusion | `hard-light` | hue | invert | lighten | lighter | luminosity | minus | multiply | normal | overlay | plus | reflect | saturation | screen | `soft-light` | `source-atop` | `source-in` | `source-out` | `vivid-light` | xor
  ] = js.native
}
object BlendLayerProperties {
  
  @scala.inline
  def apply(): BlendLayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlendLayerProperties]
  }
  
  @scala.inline
  implicit class BlendLayerPropertiesMutableBuilder[Self <: BlendLayerProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlendMode(
      value: average | `color-burn` | `color-dodge` | typingsSlinky.arcgisJsApi.arcgisJsApiStrings.color | darken | `destination-atop` | `destination-in` | `destination-out` | `destination-over` | difference | exclusion | `hard-light` | hue | invert | lighten | lighter | luminosity | minus | multiply | normal | overlay | plus | reflect | saturation | screen | `soft-light` | `source-atop` | `source-in` | `source-out` | `vivid-light` | xor
    ): Self = StObject.set(x, "blendMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlendModeUndefined: Self = StObject.set(x, "blendMode", js.undefined)
  }
}
