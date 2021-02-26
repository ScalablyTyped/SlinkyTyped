package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.GeolocationPositioning
import typingsSlinky.arcgisJsApi.esri.GeolocationPositioningConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geolocationPositioningMod extends Shortcut {
  
  @JSImport("esri/widgets/support/GeolocationPositioning", JSImport.Namespace)
  @js.native
  val ^ : GeolocationPositioningConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/support/GeolocationPositioning", JSImport.Namespace)
  @js.native
  class Class () extends GeolocationPositioning
  
  type _To = GeolocationPositioningConstructor
  
  /* This means you don't have to write `^`, but can instead just say `geolocationPositioningMod.foo` */
  override def _to: GeolocationPositioningConstructor = ^
}
