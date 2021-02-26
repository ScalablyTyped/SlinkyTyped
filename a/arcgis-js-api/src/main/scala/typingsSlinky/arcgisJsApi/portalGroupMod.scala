package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.PortalGroup
import typingsSlinky.arcgisJsApi.esri.PortalGroupConstructor
import typingsSlinky.arcgisJsApi.esri.PortalGroupProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object portalGroupMod extends Shortcut {
  
  @JSImport("esri/portal/PortalGroup", JSImport.Namespace)
  @js.native
  val ^ : PortalGroupConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/portal/PortalGroup", JSImport.Namespace)
  @js.native
  class Class () extends PortalGroup {
    def this(properties: PortalGroupProperties) = this()
  }
  
  type _To = PortalGroupConstructor
  
  /* This means you don't have to write `^`, but can instead just say `portalGroupMod.foo` */
  override def _to: PortalGroupConstructor = ^
}
