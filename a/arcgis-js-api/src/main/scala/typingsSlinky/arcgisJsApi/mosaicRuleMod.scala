package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.MosaicRule
import typingsSlinky.arcgisJsApi.esri.MosaicRuleConstructor
import typingsSlinky.arcgisJsApi.esri.MosaicRuleProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mosaicRuleMod extends Shortcut {
  
  @JSImport("esri/layers/support/MosaicRule", JSImport.Namespace)
  @js.native
  val ^ : MosaicRuleConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/support/MosaicRule", JSImport.Namespace)
  @js.native
  /**
    * Specifies the mosaic rule when defining how individual images should be mosaicked.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html)
    */
  class Class () extends MosaicRule {
    def this(properties: MosaicRuleProperties) = this()
  }
  
  type _To = MosaicRuleConstructor
  
  /* This means you don't have to write `^`, but can instead just say `mosaicRuleMod.foo` */
  override def _to: MosaicRuleConstructor = ^
}
