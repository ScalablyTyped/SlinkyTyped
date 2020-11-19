package typingsSlinky.atlaskitTree.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.atlaskitTree.mod.ItemId
import typingsSlinky.atlaskitTree.mod.Path
import typingsSlinky.atlaskitTree.mod.RenderItemParams
import typingsSlinky.atlaskitTree.mod.TreeData
import typingsSlinky.atlaskitTree.mod.TreeDestinationPosition
import typingsSlinky.atlaskitTree.mod.TreeProps
import typingsSlinky.atlaskitTree.mod.TreeSourcePosition
import typingsSlinky.atlaskitTree.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tree {
  
  @JSImport("@atlaskit/tree", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: TreeProps): Default[tag.type, default] = new Default[tag.type, default](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(
    isDragEnabled: Boolean,
    isNestingEnabled: Boolean,
    offsetPerLevel: Double,
    onCollapse: (ItemId, Path) => Unit,
    onDragEnd: (TreeSourcePosition, js.UndefOr[TreeDestinationPosition]) => Unit,
    onDragStart: ItemId => Unit,
    onExpand: (ItemId, Path) => Unit,
    renderItem: RenderItemParams => ReactElement,
    tree: TreeData
  ): Default[tag.type, default] = {
    val __props = js.Dynamic.literal(isDragEnabled = isDragEnabled.asInstanceOf[js.Any], isNestingEnabled = isNestingEnabled.asInstanceOf[js.Any], offsetPerLevel = offsetPerLevel.asInstanceOf[js.Any], onCollapse = js.Any.fromFunction2(onCollapse), onDragEnd = js.Any.fromFunction2(onDragEnd), onDragStart = js.Any.fromFunction1(onDragStart), onExpand = js.Any.fromFunction2(onExpand), renderItem = js.Any.fromFunction1(renderItem), tree = tree.asInstanceOf[js.Any])
    new Default[tag.type, default](js.Array(this.component, __props.asInstanceOf[TreeProps]))
  }
}
