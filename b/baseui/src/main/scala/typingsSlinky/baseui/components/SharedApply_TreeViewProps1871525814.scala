package typingsSlinky.baseui.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ExternalPropsWriterProvider
import slinky.web.html.`*`.tag
import typingsSlinky.baseui.treeViewMod.TreeNode
import typingsSlinky.baseui.treeViewMod.TreeViewOverrides
import typingsSlinky.baseui.treeViewMod.TreeViewProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_TreeViewProps1871525814 (implicit pw: ExternalPropsWriterProvider)
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  def apply(
    data: js.Array[TreeNode],
    onToggle: /* node */ TreeNode => Unit = null,
    overrides: TreeViewOverrides = null,
    renderAll: js.UndefOr[Boolean] = js.undefined,
    singleExpanded: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (onToggle != null) __obj.updateDynamic("onToggle")(js.Any.fromFunction1(onToggle))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (!js.isUndefined(renderAll)) __obj.updateDynamic("renderAll")(renderAll.asInstanceOf[js.Any])
    if (!js.isUndefined(singleExpanded)) __obj.updateDynamic("singleExpanded")(singleExpanded.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = TreeViewProps
}

