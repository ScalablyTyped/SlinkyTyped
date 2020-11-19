package typingsSlinky.arcgisJsApi.featureEffectMod

import typingsSlinky.arcgisJsApi.esri.FeatureEffect
import typingsSlinky.arcgisJsApi.esri.FeatureEffectProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("esri/views/layers/support/FeatureEffect", JSImport.Namespace)
@js.native
/**
  * FeatureEffect allows you to emphasize or deemphasize features that satisfy a [filter](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureEffect.html#filter) in 2D [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html). The [includedEffect](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureEffect.html#includedEffect) and [excludedEffect](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureEffect.html#excludedEffect) properties allow you to apply [CSS filters](https://developer.mozilla.org/en-US/docs/Web/CSS/filter) to features that are either included or excluded from the filter. Typically, you use `includedEffect` to emphasize features that are included in the filter and `excludedEffect` to deemphasize features excluded from the filter.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureEffect.html)
  */
class Class () extends FeatureEffect {
  def this(properties: FeatureEffectProperties) = this()
}
