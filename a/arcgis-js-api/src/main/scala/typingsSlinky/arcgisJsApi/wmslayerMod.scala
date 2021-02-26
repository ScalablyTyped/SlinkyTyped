package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.WMSLayer
import typingsSlinky.arcgisJsApi.esri.WMSLayerConstructor
import typingsSlinky.arcgisJsApi.esri.WMSLayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wmslayerMod extends Shortcut {
  
  @JSImport("esri/layers/WMSLayer", JSImport.Namespace)
  @js.native
  val ^ : WMSLayerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/WMSLayer", JSImport.Namespace)
  @js.native
  class Class () extends WMSLayer {
    def this(properties: WMSLayerProperties) = this()
  }
  
  type _To = WMSLayerConstructor
  
  /* This means you don't have to write `^`, but can instead just say `wmslayerMod.foo` */
  override def _to: WMSLayerConstructor = ^
}
