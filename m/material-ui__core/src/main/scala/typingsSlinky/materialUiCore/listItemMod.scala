package typingsSlinky.materialUiCore

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.materialUiCore.listItemListItemMod.ListItemProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listItemMod extends Shortcut {
  
  @JSImport("@material-ui/core/ListItem", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ListItemProps] = js.native
  
  type _To = ReactComponentClass[ListItemProps]
  
  /* This means you don't have to write `default`, but can instead just say `listItemMod.foo` */
  override def _to: ReactComponentClass[ListItemProps] = default
}
