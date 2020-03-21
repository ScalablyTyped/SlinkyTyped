package typingsSlinky.reactSplitterLayout.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactSplitterLayout.mod.SplitterLayoutProps
import typingsSlinky.reactSplitterLayout.mod.TPrimaryIndex
import typingsSlinky.reactSplitterLayout.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactSplitterLayout
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-splitter-layout", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    customClassName: String = null,
    onDragEnd: () => Unit = null,
    onDragStart: () => Unit = null,
    onSecondaryPaneSizeChange: /* value */ Double => Unit = null,
    percentage: js.UndefOr[Boolean] = js.undefined,
    primaryIndex: TPrimaryIndex = null,
    primaryMinSize: Int | Double = null,
    secondaryInitialSize: Int | Double = null,
    secondaryMinSize: Int | Double = null,
    vertical: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (customClassName != null) __obj.updateDynamic("customClassName")(customClassName.asInstanceOf[js.Any])
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction0(onDragEnd))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction0(onDragStart))
    if (onSecondaryPaneSizeChange != null) __obj.updateDynamic("onSecondaryPaneSizeChange")(js.Any.fromFunction1(onSecondaryPaneSizeChange))
    if (!js.isUndefined(percentage)) __obj.updateDynamic("percentage")(percentage.asInstanceOf[js.Any])
    if (primaryIndex != null) __obj.updateDynamic("primaryIndex")(primaryIndex.asInstanceOf[js.Any])
    if (primaryMinSize != null) __obj.updateDynamic("primaryMinSize")(primaryMinSize.asInstanceOf[js.Any])
    if (secondaryInitialSize != null) __obj.updateDynamic("secondaryInitialSize")(secondaryInitialSize.asInstanceOf[js.Any])
    if (secondaryMinSize != null) __obj.updateDynamic("secondaryMinSize")(secondaryMinSize.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactSplitterLayout.mod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = SplitterLayoutProps
}

