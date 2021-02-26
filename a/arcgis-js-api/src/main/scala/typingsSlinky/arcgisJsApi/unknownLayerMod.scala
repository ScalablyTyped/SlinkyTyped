package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.UnknownLayer
import typingsSlinky.arcgisJsApi.esri.UnknownLayerConstructor
import typingsSlinky.arcgisJsApi.esri.UnknownLayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object unknownLayerMod extends Shortcut {
  
  @JSImport("esri/layers/UnknownLayer", JSImport.Namespace)
  @js.native
  val ^ : UnknownLayerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/UnknownLayer", JSImport.Namespace)
  @js.native
  /**
    * Represents a layer whose type could not be determined.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-UnknownLayer.html)
    */
  class Class () extends UnknownLayer {
    def this(properties: UnknownLayerProperties) = this()
  }
  
  type _To = UnknownLayerConstructor
  
  /* This means you don't have to write `^`, but can instead just say `unknownLayerMod.foo` */
  override def _to: UnknownLayerConstructor = ^
}
