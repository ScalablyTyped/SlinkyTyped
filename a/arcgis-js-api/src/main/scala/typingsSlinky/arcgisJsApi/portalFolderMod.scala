package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.PortalFolder
import typingsSlinky.arcgisJsApi.esri.PortalFolderConstructor
import typingsSlinky.arcgisJsApi.esri.PortalFolderProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object portalFolderMod extends Shortcut {
  
  @JSImport("esri/portal/PortalFolder", JSImport.Namespace)
  @js.native
  val ^ : PortalFolderConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/portal/PortalFolder", JSImport.Namespace)
  @js.native
  class Class () extends PortalFolder {
    def this(properties: PortalFolderProperties) = this()
  }
  
  type _To = PortalFolderConstructor
  
  /* This means you don't have to write `^`, but can instead just say `portalFolderMod.foo` */
  override def _to: PortalFolderConstructor = ^
}
