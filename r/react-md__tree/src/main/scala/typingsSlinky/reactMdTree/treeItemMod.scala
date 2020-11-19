package typingsSlinky.reactMdTree

import org.scalajs.dom.raw.HTMLLIElement
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.reactMdTree.typesMod.TreeItemProps
import typingsSlinky.reactMdTree.typesMod.TreeItemWithContentComponentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-md/tree/types/TreeItem", JSImport.Namespace)
@js.native
object treeItemMod extends js.Object {
  
  /**
    * This component renders an item within a tree with optional child items. This
    * should almost always be used from the `itemRenderer` prop from the `Tree`
    * component as it provides a lot of the required a11y props for you.
    */
  val default: ForwardRefExoticComponent[
    (TreeItemProps with RefAttributes[HTMLLIElement]) | (TreeItemWithContentComponentProps with RefAttributes[HTMLLIElement])
  ] = js.native
}
