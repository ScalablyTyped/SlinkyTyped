package typingsSlinky.rcTreeSelect.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.SyntheticUIEvent
import slinky.web.html.div.tag
import typingsSlinky.rcTreeSelect.AnonSelected
import typingsSlinky.rcTreeSelect.interfaceMod.DataNode
import typingsSlinky.rcTreeSelect.interfaceMod.FlattenDataNode
import typingsSlinky.rcTreeSelect.interfaceMod.RawValueType
import typingsSlinky.rcTreeSelect.optionListMod.OptionListProps
import typingsSlinky.react.mod.Ref
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object OptionList
  extends ExternalComponentWithAttributesWithRefType[tag.type, Ref[js.Any] with js.Object] {
  @JSImport("rc-tree-select/lib/OptionList", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    childrenAsData: Boolean,
    flattenOptions: js.Array[FlattenDataNode],
    height: Double,
    id: String,
    itemHeight: Double,
    multiple: Boolean,
    onActiveValue: (RawValueType, Double) => Unit,
    onScroll: SyntheticUIEvent[HTMLDivElement] => Unit,
    onSelect: (RawValueType, AnonSelected) => Unit,
    onToggleOpen: js.UndefOr[Boolean] => Unit,
    open: Boolean,
    options: js.Array[DataNode],
    prefixCls: String,
    searchValue: String,
    values: Set[RawValueType],
    defaultActiveFirstOption: js.UndefOr[Boolean] = js.undefined,
    menuItemSelectedIcon: js.Any = null,
    notFoundContent: TagMod[Any] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, Ref[js.Any] with js.Object] = {
    val __obj = js.Dynamic.literal(childrenAsData = childrenAsData.asInstanceOf[js.Any], flattenOptions = flattenOptions.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], itemHeight = itemHeight.asInstanceOf[js.Any], multiple = multiple.asInstanceOf[js.Any], onActiveValue = js.Any.fromFunction2(onActiveValue), onScroll = js.Any.fromFunction1(onScroll), onSelect = js.Any.fromFunction2(onSelect), onToggleOpen = js.Any.fromFunction1(onToggleOpen), open = open.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], searchValue = searchValue.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultActiveFirstOption)) __obj.updateDynamic("defaultActiveFirstOption")(defaultActiveFirstOption.asInstanceOf[js.Any])
    if (menuItemSelectedIcon != null) __obj.updateDynamic("menuItemSelectedIcon")(menuItemSelectedIcon.asInstanceOf[js.Any])
    if (notFoundContent != null) __obj.updateDynamic("notFoundContent")(notFoundContent.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = OptionListProps[js.Array[DataNode]] with RefAttributes[js.Any]
}

