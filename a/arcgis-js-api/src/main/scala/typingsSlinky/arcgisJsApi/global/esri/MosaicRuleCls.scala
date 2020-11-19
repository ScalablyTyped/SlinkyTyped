package typingsSlinky.arcgisJsApi.global.esri

import typingsSlinky.arcgisJsApi.esri.MosaicRuleProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.MosaicRule")
@js.native
/**
  * Specifies the mosaic rule when defining how individual images should be mosaicked. It specifies selection, mosaic method, sort order, overlapping pixel resolution, etc. Mosaic rules are for mosaicking rasters in the mosaic dataset. A mosaic rule is used to define:
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html)
  */
class MosaicRuleCls ()
  extends typingsSlinky.arcgisJsApi.esri.MosaicRule {
  def this(properties: MosaicRuleProperties) = this()
}
