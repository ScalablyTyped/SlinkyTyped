package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.UI
import typingsSlinky.arcgisJsApi.esri.UIConstructor
import typingsSlinky.arcgisJsApi.esri.UIProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uIMod extends Shortcut {
  
  @JSImport("esri/views/ui/UI", JSImport.Namespace)
  @js.native
  val ^ : UIConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/views/ui/UI", JSImport.Namespace)
  @js.native
  /**
    * This class provides a simple interface for [adding](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ui-UI.html#add), [moving](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ui-UI.html#move) and [removing](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ui-UI.html#remove) components from a view's user interface (UI).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ui-UI.html)
    */
  class Class () extends UI {
    def this(properties: UIProperties) = this()
  }
  
  type _To = UIConstructor
  
  /* This means you don't have to write `^`, but can instead just say `uIMod.foo` */
  override def _to: UIConstructor = ^
}
