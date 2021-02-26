package typingsSlinky.reactSortableTree.components

import typingsSlinky.reactSortableTree.mod.ReactSortableTreeProps
import typingsSlinky.reactSortableTree.mod.TreeItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SortableTreeWithoutDndContext {
  
  @scala.inline
  def apply(onChange: js.Array[TreeItem] => Unit, treeData: js.Array[TreeItem]): SharedBuilder_ReactSortableTreeProps_1822274003 = {
    val __props = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange), treeData = treeData.asInstanceOf[js.Any])
    new SharedBuilder_ReactSortableTreeProps_1822274003(js.Array(this.component, __props.asInstanceOf[ReactSortableTreeProps]))
  }
  
  @JSImport("react-sortable-tree", "SortableTreeWithoutDndContext")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ReactSortableTreeProps): SharedBuilder_ReactSortableTreeProps_1822274003 = new SharedBuilder_ReactSortableTreeProps_1822274003(js.Array(this.component, p.asInstanceOf[js.Any]))
}
