package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.ActionBase
import typingsSlinky.arcgisJsApi.esri.ActionBaseConstructor
import typingsSlinky.arcgisJsApi.esri.ActionBaseProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object actionBaseMod extends Shortcut {
  
  @JSImport("esri/support/actions/ActionBase", JSImport.Namespace)
  @js.native
  val ^ : ActionBaseConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/support/actions/ActionBase", JSImport.Namespace)
  @js.native
  /**
    * Actions are customizable behavior which can be executed in certain widgets such as [Popups](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html), a [BasemapLayerList](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapLayerList.html), or a [LayerList](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionBase.html)
    */
  class Class () extends ActionBase {
    def this(properties: ActionBaseProperties) = this()
  }
  
  type _To = ActionBaseConstructor
  
  /* This means you don't have to write `^`, but can instead just say `actionBaseMod.foo` */
  override def _to: ActionBaseConstructor = ^
}
