package typingsSlinky.rcSelect.components

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rcSelect.selectTriggerMod.RefTriggerProps
import typingsSlinky.rcSelect.selectTriggerMod.SelectTriggerProps
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SelectTrigger {
  
  @JSImport("rc-select/lib/SelectTrigger", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, RefTriggerProps] {
    
    @scala.inline
    def animation(value: String): this.type = set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dropdownMatchSelectWidth(value: Boolean | Double): this.type = set("dropdownMatchSelectWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dropdownRender(value: /* menu */ ReactElement => ReactElement): this.type = set("dropdownRender", js.Any.fromFunction1(value))
    
    @scala.inline
    def getPopupContainer(value: /* props */ js.Any => HTMLElement): this.type = set("getPopupContainer", js.Any.fromFunction1(value))
    
    @scala.inline
    def transitionName(value: String): this.type = set("transitionName", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SelectTriggerProps with RefAttributes[RefTriggerProps]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(
    containerWidth: Double,
    direction: String,
    disabled: Boolean,
    dropdownAlign: js.Object,
    dropdownClassName: String,
    dropdownStyle: CSSProperties,
    empty: Boolean,
    getTriggerDOMNode: () => HTMLElement,
    popupElement: ReactElement,
    prefixCls: String,
    visible: Boolean
  ): Builder = {
    val __props = js.Dynamic.literal(containerWidth = containerWidth.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], dropdownAlign = dropdownAlign.asInstanceOf[js.Any], dropdownClassName = dropdownClassName.asInstanceOf[js.Any], dropdownStyle = dropdownStyle.asInstanceOf[js.Any], empty = empty.asInstanceOf[js.Any], getTriggerDOMNode = js.Any.fromFunction0(getTriggerDOMNode), popupElement = popupElement.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[SelectTriggerProps with RefAttributes[RefTriggerProps]]))
  }
}
