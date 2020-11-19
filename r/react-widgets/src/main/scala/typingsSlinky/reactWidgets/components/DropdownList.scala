package typingsSlinky.reactWidgets.components

import org.scalajs.dom.raw.KeyboardEvent
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.ReactType
import typingsSlinky.reactWidgets.dropdownListMod.DropdownListMessages
import typingsSlinky.reactWidgets.dropdownListMod.DropdownListProps
import typingsSlinky.reactWidgets.mod.DropdownList.^
import typingsSlinky.reactWidgets.reactWidgetsBooleans.`false`
import typingsSlinky.reactWidgets.reactWidgetsStrings.contains
import typingsSlinky.reactWidgets.reactWidgetsStrings.endsWith
import typingsSlinky.reactWidgets.reactWidgetsStrings.onFilter
import typingsSlinky.reactWidgets.reactWidgetsStrings.startsWith
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DropdownList {
  
  @JSImport("react-widgets", "DropdownList")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, ^] {
    
    @scala.inline
    def allowCreate(value: Boolean | onFilter): this.type = set("allowCreate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def busy(value: Boolean): this.type = set("busy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def busySpinnerReactElement(value: ReactElement): this.type = set("busySpinner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def busySpinner(value: ReactElement): this.type = set("busySpinner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def caseSensitive(value: Boolean): this.type = set("caseSensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def containerClassName(value: String): this.type = set("containerClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dataVarargs(value: js.Any*): this.type = set("data", js.Array(value :_*))
    
    @scala.inline
    def data(value: js.Array[_]): this.type = set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultOpen(value: Boolean): this.type = set("defaultOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultValue(value: js.Any): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delay(value: Double): this.type = set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabledVarargs(value: js.Any*): this.type = set("disabled", js.Array(value :_*))
    
    @scala.inline
    def disabled(value: Boolean | js.Array[_]): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dropUp(value: Boolean): this.type = set("dropUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def duration(value: Double): this.type = set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def filterFunction2(value: (/* dataItem */ js.Any, /* str */ String) => Boolean): this.type = set("filter", js.Any.fromFunction2(value))
    
    @scala.inline
    def filter(
      value: `false` | startsWith | endsWith | contains | (js.Function2[/* dataItem */ js.Any, /* str */ String, Boolean])
    ): this.type = set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def groupByFunction1(value: /* dataItem */ js.Any => _): this.type = set("groupBy", js.Any.fromFunction1(value))
    
    @scala.inline
    def groupBy(value: String | (js.Function1[/* dataItem */ js.Any, _])): this.type = set("groupBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def groupComponentFunctionComponent(value: ReactComponentClass[_]): this.type = set("groupComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def groupComponentComponentClass(value: ReactComponentClass[_]): this.type = set("groupComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def groupComponent(value: ReactType[_]): this.type = set("groupComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isRtl(value: Boolean): this.type = set("isRtl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def itemComponentFunctionComponent(value: ReactComponentClass[_]): this.type = set("itemComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def itemComponentComponentClass(value: ReactComponentClass[_]): this.type = set("itemComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def itemComponent(value: ReactType[_] | String): this.type = set("itemComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def listComponentFunctionComponent(value: ReactComponentClass[_]): this.type = set("listComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def listComponentComponentClass(value: ReactComponentClass[_]): this.type = set("listComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def listComponent(value: ReactType[_] | String): this.type = set("listComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def listProps(value: js.Object): this.type = set("listProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def messages(value: DropdownListMessages): this.type = set("messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minLength(value: Double): this.type = set("minLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def multiple(value: Boolean): this.type = set("multiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChange(value: /* value */ js.Any => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onCreate(value: /* value */ js.Any => Unit): this.type = set("onCreate", js.Any.fromFunction1(value))
    
    @scala.inline
    def onKeyDown(value: /* event */ KeyboardEvent => Unit): this.type = set("onKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def onKeyPress(value: /* event */ KeyboardEvent => Unit): this.type = set("onKeyPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSearch(value: /* searchTerm */ String => Unit): this.type = set("onSearch", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSelect(value: /* value */ js.Any => Unit): this.type = set("onSelect", js.Any.fromFunction1(value))
    
    @scala.inline
    def onToggle(value: /* isOpen */ Boolean => Unit): this.type = set("onToggle", js.Any.fromFunction1(value))
    
    @scala.inline
    def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def readOnlyVarargs(value: js.Any*): this.type = set("readOnly", js.Array(value :_*))
    
    @scala.inline
    def readOnly(value: Boolean | js.Array[_]): this.type = set("readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def searchTerm(value: String): this.type = set("searchTerm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def textFieldFunction1(value: /* dataItem */ js.Any => String): this.type = set("textField", js.Any.fromFunction1(value))
    
    @scala.inline
    def textField(value: String | (js.Function1[/* dataItem */ js.Any, String])): this.type = set("textField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def value(value: js.Any): this.type = set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def valueComponentFunctionComponent(value: ReactComponentClass[_]): this.type = set("valueComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def valueComponentComponentClass(value: ReactComponentClass[_]): this.type = set("valueComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def valueComponent(value: ReactType[_]): this.type = set("valueComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def valueField(value: String): this.type = set("valueField", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DropdownListProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: DropdownList.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
