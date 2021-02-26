package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.PortalItemResource
import typingsSlinky.arcgisJsApi.esri.PortalItemResourceConstructor
import typingsSlinky.arcgisJsApi.esri.PortalItemResourceProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object portalItemResourceMod extends Shortcut {
  
  @JSImport("esri/portal/PortalItemResource", JSImport.Namespace)
  @js.native
  val ^ : PortalItemResourceConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/portal/PortalItemResource", JSImport.Namespace)
  @js.native
  class Class () extends PortalItemResource {
    def this(properties: PortalItemResourceProperties) = this()
  }
  
  type _To = PortalItemResourceConstructor
  
  /* This means you don't have to write `^`, but can instead just say `portalItemResourceMod.foo` */
  override def _to: PortalItemResourceConstructor = ^
}
