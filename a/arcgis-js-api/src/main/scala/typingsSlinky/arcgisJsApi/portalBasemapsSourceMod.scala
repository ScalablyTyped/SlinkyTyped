package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.PortalBasemapsSource
import typingsSlinky.arcgisJsApi.esri.PortalBasemapsSourceConstructor
import typingsSlinky.arcgisJsApi.esri.PortalBasemapsSourceProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object portalBasemapsSourceMod extends Shortcut {
  
  @JSImport("esri/widgets/BasemapGallery/support/PortalBasemapsSource", JSImport.Namespace)
  @js.native
  val ^ : PortalBasemapsSourceConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/BasemapGallery/support/PortalBasemapsSource", JSImport.Namespace)
  @js.native
  class Class () extends PortalBasemapsSource {
    def this(properties: PortalBasemapsSourceProperties) = this()
  }
  
  type _To = PortalBasemapsSourceConstructor
  
  /* This means you don't have to write `^`, but can instead just say `portalBasemapsSourceMod.foo` */
  override def _to: PortalBasemapsSourceConstructor = ^
}
