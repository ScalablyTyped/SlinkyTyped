package typingsSlinky.atlaskitTree.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
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
import scala.scalajs.js.annotation._

object Tree
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("@atlaskit/tree", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    isDragEnabled: Boolean,
    isNestingEnabled: Boolean,
    offsetPerLevel: Double,
    onCollapse: (ItemId, Path) => Unit,
    onDragEnd: (TreeSourcePosition, js.UndefOr[TreeDestinationPosition]) => Unit,
    onDragStart: ItemId => Unit,
    onExpand: (ItemId, Path) => Unit,
    renderItem: RenderItemParams => TagMod[Any],
    tree: TreeData,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(isDragEnabled = isDragEnabled.asInstanceOf[js.Any], isNestingEnabled = isNestingEnabled.asInstanceOf[js.Any], offsetPerLevel = offsetPerLevel.asInstanceOf[js.Any], onCollapse = js.Any.fromFunction2(onCollapse), onDragEnd = js.Any.fromFunction2(onDragEnd), onDragStart = js.Any.fromFunction1(onDragStart), onExpand = js.Any.fromFunction2(onExpand), renderItem = js.Any.fromFunction1(renderItem), tree = tree.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = TreeProps
}

