package typingsSlinky.atBlueprintjsCore.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.atBlueprintjsCore.libEsmComponentsTreeTreeMod.ITreeProps
import typingsSlinky.atBlueprintjsCore.libEsmComponentsTreeTreeNodeMod.ITreeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Tree
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.atBlueprintjsCore.libEsmComponentsMod.Tree[js.Any]] {
  @JSImport("@blueprintjs/core/lib/esm/components", "Tree")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply[T](
    contents: js.Array[ITreeNode[T]],
    onNodeClick: (/* node */ ITreeNode[T], /* nodePath */ js.Array[Double], /* e */ SyntheticMouseEvent[HTMLElement]) => Unit = null,
    onNodeCollapse: (/* node */ ITreeNode[T], /* nodePath */ js.Array[Double], /* e */ SyntheticMouseEvent[HTMLElement]) => Unit = null,
    onNodeContextMenu: (/* node */ ITreeNode[T], /* nodePath */ js.Array[Double], /* e */ SyntheticMouseEvent[HTMLElement]) => Unit = null,
    onNodeDoubleClick: (/* node */ ITreeNode[T], /* nodePath */ js.Array[Double], /* e */ SyntheticMouseEvent[HTMLElement]) => Unit = null,
    onNodeExpand: (/* node */ ITreeNode[T], /* nodePath */ js.Array[Double], /* e */ SyntheticMouseEvent[HTMLElement]) => Unit = null,
    onNodeMouseEnter: (/* node */ ITreeNode[T], /* nodePath */ js.Array[Double], /* e */ SyntheticMouseEvent[HTMLElement]) => Unit = null,
    onNodeMouseLeave: (/* node */ ITreeNode[T], /* nodePath */ js.Array[Double], /* e */ SyntheticMouseEvent[HTMLElement]) => Unit = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.atBlueprintjsCore.libEsmComponentsMod.Tree[js.Any]] = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any])
    if (onNodeClick != null) __obj.updateDynamic("onNodeClick")(js.Any.fromFunction3(onNodeClick))
    if (onNodeCollapse != null) __obj.updateDynamic("onNodeCollapse")(js.Any.fromFunction3(onNodeCollapse))
    if (onNodeContextMenu != null) __obj.updateDynamic("onNodeContextMenu")(js.Any.fromFunction3(onNodeContextMenu))
    if (onNodeDoubleClick != null) __obj.updateDynamic("onNodeDoubleClick")(js.Any.fromFunction3(onNodeDoubleClick))
    if (onNodeExpand != null) __obj.updateDynamic("onNodeExpand")(js.Any.fromFunction3(onNodeExpand))
    if (onNodeMouseEnter != null) __obj.updateDynamic("onNodeMouseEnter")(js.Any.fromFunction3(onNodeMouseEnter))
    if (onNodeMouseLeave != null) __obj.updateDynamic("onNodeMouseLeave")(js.Any.fromFunction3(onNodeMouseLeave))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props]).asInstanceOf[slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.atBlueprintjsCore.libEsmComponentsMod.Tree[js.Any]]]
  }
  type Props = ITreeProps[js.Any]
}

