package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.PortalRating
import typingsSlinky.arcgisJsApi.esri.PortalRatingConstructor
import typingsSlinky.arcgisJsApi.esri.PortalRatingProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object portalRatingMod extends Shortcut {
  
  @JSImport("esri/portal/PortalRating", JSImport.Namespace)
  @js.native
  val ^ : PortalRatingConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/portal/PortalRating", JSImport.Namespace)
  @js.native
  class Class () extends PortalRating {
    def this(properties: PortalRatingProperties) = this()
  }
  
  type _To = PortalRatingConstructor
  
  /* This means you don't have to write `^`, but can instead just say `portalRatingMod.foo` */
  override def _to: PortalRatingConstructor = ^
}
