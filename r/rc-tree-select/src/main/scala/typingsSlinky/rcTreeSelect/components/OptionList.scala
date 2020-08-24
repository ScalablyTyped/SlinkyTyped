package typingsSlinky.rcTreeSelect.components

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticUIEvent
import slinky.web.html.div.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rcSelect.optionListMod.RefOptionListProps
import typingsSlinky.rcTreeSelect.anon.Selected
import typingsSlinky.rcTreeSelect.interfaceMod.DataNode
import typingsSlinky.rcTreeSelect.interfaceMod.FlattenDataNode
import typingsSlinky.rcTreeSelect.interfaceMod.RawValueType
import typingsSlinky.rcTreeSelect.optionListMod.OptionListProps
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object OptionList {
  @JSImport("rc-tree-select/es/OptionList", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, RefOptionListProps] {
    @scala.inline
    def defaultActiveFirstOption(value: Boolean): this.type = set("defaultActiveFirstOption", value.asInstanceOf[js.Any])
    @scala.inline
    def menuItemSelectedIcon(value: js.Any): this.type = set("menuItemSelectedIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def notFoundContentReactElement(value: ReactElement): this.type = set("notFoundContent", value.asInstanceOf[js.Any])
    @scala.inline
    def notFoundContent(value: ReactElement): this.type = set("notFoundContent", value.asInstanceOf[js.Any])
    @scala.inline
    def virtual(value: Boolean): this.type = set("virtual", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: OptionListProps[js.Array[DataNode]] with RefAttributes[RefOptionListProps]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(
    childrenAsData: Boolean,
    flattenOptions: js.Array[FlattenDataNode],
    height: Double,
    id: String,
    itemHeight: Double,
    multiple: Boolean,
    onActiveValue: (RawValueType, Double) => Unit,
    onMouseEnter: () => Unit,
    onScroll: SyntheticUIEvent[HTMLDivElement] => Unit,
    onSelect: (RawValueType, Selected) => Unit,
    onToggleOpen: js.UndefOr[Boolean] => Unit,
    open: Boolean,
    options: js.Array[DataNode],
    prefixCls: String,
    searchValue: String,
    values: Set[RawValueType]
  ): Builder = {
    val __props = js.Dynamic.literal(childrenAsData = childrenAsData.asInstanceOf[js.Any], flattenOptions = flattenOptions.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], itemHeight = itemHeight.asInstanceOf[js.Any], multiple = multiple.asInstanceOf[js.Any], onActiveValue = js.Any.fromFunction2(onActiveValue), onMouseEnter = js.Any.fromFunction0(onMouseEnter), onScroll = js.Any.fromFunction1(onScroll), onSelect = js.Any.fromFunction2(onSelect), onToggleOpen = js.Any.fromFunction1(onToggleOpen), open = open.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], searchValue = searchValue.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[OptionListProps[js.Array[DataNode]] with RefAttributes[RefOptionListProps]]))
  }
}

