package typingsSlinky.rcSelect.components

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticUIEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rcSelect.anon.Selected
import typingsSlinky.rcSelect.anon.Source
import typingsSlinky.rcSelect.generatorMod.FlattenOptionsType
import typingsSlinky.rcSelect.generatorMod.RawValueType
import typingsSlinky.rcSelect.interfaceMod.OptionsType
import typingsSlinky.rcSelect.interfaceMod.RenderNode
import typingsSlinky.rcSelect.optionListMod.OptionListProps
import typingsSlinky.rcSelect.optionListMod.RefOptionListProps
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object OptionList {
  
  @scala.inline
  def apply(
    childrenAsData: Boolean,
    flattenOptions: FlattenOptionsType[OptionsType],
    height: Double,
    id: String,
    itemHeight: Double,
    multiple: Boolean,
    onActiveValue: (/* active */ RawValueType, /* index */ Double, /* info */ js.UndefOr[Source]) => Unit,
    onScroll: SyntheticUIEvent[HTMLDivElement] => Unit,
    onSelect: (RawValueType, Selected) => Unit,
    onToggleOpen: js.UndefOr[Boolean] => Unit,
    open: Boolean,
    options: OptionsType,
    prefixCls: String,
    searchValue: String,
    values: Set[RawValueType],
    virtual: Boolean
  ): Builder = {
    val __props = js.Dynamic.literal(childrenAsData = childrenAsData.asInstanceOf[js.Any], flattenOptions = flattenOptions.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], itemHeight = itemHeight.asInstanceOf[js.Any], multiple = multiple.asInstanceOf[js.Any], onActiveValue = js.Any.fromFunction3(onActiveValue), onScroll = js.Any.fromFunction1(onScroll), onSelect = js.Any.fromFunction2(onSelect), onToggleOpen = js.Any.fromFunction1(onToggleOpen), open = open.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], searchValue = searchValue.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any], virtual = virtual.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[OptionListProps[OptionsType] with RefAttributes[RefOptionListProps]]))
  }
  
  @JSImport("rc-select/lib/OptionList", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, RefOptionListProps] {
    
    @scala.inline
    def defaultActiveFirstOption(value: Boolean): this.type = set("defaultActiveFirstOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def menuItemSelectedIcon(value: RenderNode): this.type = set("menuItemSelectedIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def menuItemSelectedIconFunction1(value: /* props */ js.Any => ReactElement): this.type = set("menuItemSelectedIcon", js.Any.fromFunction1(value))
    
    @scala.inline
    def menuItemSelectedIconReactElement(value: ReactElement): this.type = set("menuItemSelectedIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def notFoundContent(value: ReactElement): this.type = set("notFoundContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def notFoundContentReactElement(value: ReactElement): this.type = set("notFoundContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onMouseEnter(value: SyntheticMouseEvent[Element] => Unit): this.type = set("onMouseEnter", js.Any.fromFunction1(value))
  }
  
  def withProps(p: OptionListProps[OptionsType] with RefAttributes[RefOptionListProps]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
