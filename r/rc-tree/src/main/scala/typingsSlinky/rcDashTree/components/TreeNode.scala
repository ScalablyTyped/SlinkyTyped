package typingsSlinky.rcDashTree.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.rcDashTree.rcDashTreeMod.InternalTreeNodeProps
import typingsSlinky.rcDashTree.rcDashTreeMod.TreeNodeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TreeNode
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.rcDashTree.rcDashTreeMod.TreeNode] {
  @JSImport("rc-tree", "TreeNode")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, disabled */
  def apply(
    disableCheckbox: js.UndefOr[Boolean] = js.undefined,
    icon: typingsSlinky.react.reactMod._Global_.JSX.Element | (js.Function1[
      /* props */ InternalTreeNodeProps, 
      typingsSlinky.react.reactMod._Global_.JSX.Element
    ]) = null,
    isLeaf: js.UndefOr[Boolean] = js.undefined,
    title: String | typingsSlinky.react.reactMod._Global_.JSX.Element = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.rcDashTree.rcDashTreeMod.TreeNode] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disableCheckbox)) __obj.updateDynamic("disableCheckbox")(disableCheckbox.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(isLeaf)) __obj.updateDynamic("isLeaf")(isLeaf.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.rcDashTree.rcDashTreeMod.TreeNode] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.rcDashTree.rcDashTreeMod.TreeNode](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = TreeNodeProps
}

