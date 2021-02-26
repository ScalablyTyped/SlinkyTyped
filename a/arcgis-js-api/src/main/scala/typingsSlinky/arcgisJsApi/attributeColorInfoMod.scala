package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.AttributeColorInfo
import typingsSlinky.arcgisJsApi.esri.AttributeColorInfoConstructor
import typingsSlinky.arcgisJsApi.esri.AttributeColorInfoProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object attributeColorInfoMod extends Shortcut {
  
  @JSImport("esri/renderers/support/AttributeColorInfo", JSImport.Namespace)
  @js.native
  val ^ : AttributeColorInfoConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/renderers/support/AttributeColorInfo", JSImport.Namespace)
  @js.native
  /**
    * Defines the symbology for a [DotDensityRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html) in the renderer's [attributes](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html#attributes) property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AttributeColorInfo.html)
    */
  class Class () extends AttributeColorInfo {
    def this(properties: AttributeColorInfoProperties) = this()
  }
  
  type _To = AttributeColorInfoConstructor
  
  /* This means you don't have to write `^`, but can instead just say `attributeColorInfoMod.foo` */
  override def _to: AttributeColorInfoConstructor = ^
}
