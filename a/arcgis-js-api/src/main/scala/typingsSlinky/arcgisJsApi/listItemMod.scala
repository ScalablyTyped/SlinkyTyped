package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.ListItem
import typingsSlinky.arcgisJsApi.esri.ListItemConstructor
import typingsSlinky.arcgisJsApi.esri.ListItemProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listItemMod extends Shortcut {
  
  @JSImport("esri/widgets/LayerList/ListItem", JSImport.Namespace)
  @js.native
  val ^ : ListItemConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/LayerList/ListItem", JSImport.Namespace)
  @js.native
  /**
    * The ListItem class represents one of the [operationalItems](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-LayerListViewModel.html#operationalItems) in the [LayerListViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-LayerListViewModel.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html)
    */
  class Class () extends ListItem {
    def this(properties: ListItemProperties) = this()
  }
  
  type _To = ListItemConstructor
  
  /* This means you don't have to write `^`, but can instead just say `listItemMod.foo` */
  override def _to: ListItemConstructor = ^
}
