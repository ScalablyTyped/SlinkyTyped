package typingsSlinky.reactSortableTree.components

import typingsSlinky.reactSortableTree.mod.ReactSortableTreeProps
import typingsSlinky.reactSortableTree.mod.TreeItem
import typingsSlinky.reactSortableTree.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactSortableTree {
  @JSImport("react-sortable-tree", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: ReactSortableTreeProps): SharedBuilder_ReactSortableTreeProps1293311059[default] = new SharedBuilder_ReactSortableTreeProps1293311059[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(onChange: js.Array[TreeItem] => Unit, treeData: js.Array[TreeItem]): SharedBuilder_ReactSortableTreeProps1293311059[default] = {
    val __props = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange), treeData = treeData.asInstanceOf[js.Any])
    new SharedBuilder_ReactSortableTreeProps1293311059[default](js.Array(this.component, __props.asInstanceOf[ReactSortableTreeProps]))
  }
}

