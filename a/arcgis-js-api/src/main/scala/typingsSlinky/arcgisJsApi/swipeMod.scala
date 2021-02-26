package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.Swipe
import typingsSlinky.arcgisJsApi.esri.SwipeConstructor
import typingsSlinky.arcgisJsApi.esri.SwipeProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object swipeMod extends Shortcut {
  
  @JSImport("esri/widgets/Swipe", JSImport.Namespace)
  @js.native
  val ^ : SwipeConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Swipe", JSImport.Namespace)
  @js.native
  /**
    * The Swipe widget provides a tool to show a portion of a layer or layers on top of a map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Swipe.html)
    */
  class Class () extends Swipe {
    def this(properties: SwipeProperties) = this()
  }
  
  type _To = SwipeConstructor
  
  /* This means you don't have to write `^`, but can instead just say `swipeMod.foo` */
  override def _to: SwipeConstructor = ^
}
