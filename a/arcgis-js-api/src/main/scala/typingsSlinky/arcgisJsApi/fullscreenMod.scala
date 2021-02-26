package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.Fullscreen
import typingsSlinky.arcgisJsApi.esri.FullscreenConstructor
import typingsSlinky.arcgisJsApi.esri.FullscreenProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fullscreenMod extends Shortcut {
  
  @JSImport("esri/widgets/Fullscreen", JSImport.Namespace)
  @js.native
  val ^ : FullscreenConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Fullscreen", JSImport.Namespace)
  @js.native
  /**
    * Provides a simple widget to present the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html) or a user-defined [HTMLElement](https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement) using the entire screen.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Fullscreen.html)
    */
  class Class () extends Fullscreen {
    def this(properties: FullscreenProperties) = this()
  }
  
  type _To = FullscreenConstructor
  
  /* This means you don't have to write `^`, but can instead just say `fullscreenMod.foo` */
  override def _to: FullscreenConstructor = ^
}
