package typingsSlinky.reactWidgets.components

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.ReactType
import typingsSlinky.reactWidgets.comboboxMod.ComboboxMessages
import typingsSlinky.reactWidgets.comboboxMod.ComboboxProps
import typingsSlinky.reactWidgets.mod.Combobox.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Combobox {
  
  object Combobox {
    
    @JSImport("react-widgets", "Combobox")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, ^] {
      
      @scala.inline
      def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def busy(value: Boolean): this.type = set("busy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def busySpinner(value: ReactElement): this.type = set("busySpinner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def busySpinnerReactElement(value: ReactElement): this.type = set("busySpinner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def caseSensitive(value: Boolean): this.type = set("caseSensitive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def data(value: js.Array[_]): this.type = set("data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def dataVarargs(value: js.Any*): this.type = set("data", js.Array(value :_*))
      
      @scala.inline
      def defaultValue(value: js.Any): this.type = set("defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def delay(value: Double): this.type = set("delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def disabled(value: Boolean | js.Array[_]): this.type = set("disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def disabledVarargs(value: js.Any*): this.type = set("disabled", js.Array(value :_*))
      
      @scala.inline
      def dropUp(value: Boolean): this.type = set("dropUp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def duration(value: Double): this.type = set("duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def filter(value: Boolean | String | (js.Function2[/* dataItem */ js.Any, /* searchItem */ js.Any, Boolean])): this.type = set("filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def filterFunction2(value: (/* dataItem */ js.Any, /* searchItem */ js.Any) => Boolean): this.type = set("filter", js.Any.fromFunction2(value))
      
      @scala.inline
      def groupBy(value: String | (js.Function1[/* dataItem */ js.Any, _])): this.type = set("groupBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def groupByFunction1(value: /* dataItem */ js.Any => _): this.type = set("groupBy", js.Any.fromFunction1(value))
      
      @scala.inline
      def groupComponent(value: ReactType[_]): this.type = set("groupComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def groupComponentComponentClass(value: ReactComponentClass[_]): this.type = set("groupComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def groupComponentFunctionComponent(value: ReactComponentClass[_]): this.type = set("groupComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def inputProps(value: js.Object): this.type = set("inputProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def isRtl(value: Boolean): this.type = set("isRtl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def itemComponent(value: ReactType[_]): this.type = set("itemComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def itemComponentComponentClass(value: ReactComponentClass[_]): this.type = set("itemComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def itemComponentFunctionComponent(value: ReactComponentClass[_]): this.type = set("itemComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def listComponent(value: ReactType[_] | String): this.type = set("listComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def listComponentComponentClass(value: ReactComponentClass[_]): this.type = set("listComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def listComponentFunctionComponent(value: ReactComponentClass[_]): this.type = set("listComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def listProps(value: js.Object): this.type = set("listProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def messages(value: ComboboxMessages): this.type = set("messages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def minLength(value: Double): this.type = set("minLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onChange(value: /* value */ js.Any => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def onSelect(value: /* value */ js.Any => Unit): this.type = set("onSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def onToggle(value: /* isOpen */ Boolean => Unit): this.type = set("onToggle", js.Any.fromFunction1(value))
      
      @scala.inline
      def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def popupTransition(value: ReactType[_] | String): this.type = set("popupTransition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def popupTransitionComponentClass(value: ReactComponentClass[_]): this.type = set("popupTransition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def popupTransitionFunctionComponent(value: ReactComponentClass[_]): this.type = set("popupTransition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def readOnly(value: Boolean | js.Array[_]): this.type = set("readOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def readOnlyVarargs(value: js.Any*): this.type = set("readOnly", js.Array(value :_*))
      
      @scala.inline
      def suggest(value: Boolean): this.type = set("suggest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def textField(value: String | (js.Function1[/* dataItem */ js.Any, String])): this.type = set("textField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def textFieldFunction1(value: /* dataItem */ js.Any => String): this.type = set("textField", js.Any.fromFunction1(value))
      
      @scala.inline
      def value(value: js.Any): this.type = set("value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def valueField(value: String): this.type = set("valueField", value.asInstanceOf[js.Any])
    }
    
    implicit def make(companion: Combobox.type): typingsSlinky.reactWidgets.components.Combobox.Combobox.Builder = new typingsSlinky.reactWidgets.components.Combobox.Combobox.Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: ComboboxProps): typingsSlinky.reactWidgets.components.Combobox.Combobox.Builder = new typingsSlinky.reactWidgets.components.Combobox.Combobox.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  @JSImport("react-widgets", "Combobox")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def busy(value: Boolean): this.type = set("busy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def busySpinner(value: ReactElement): this.type = set("busySpinner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def busySpinnerReactElement(value: ReactElement): this.type = set("busySpinner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def caseSensitive(value: Boolean): this.type = set("caseSensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def data(value: js.Array[_]): this.type = set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dataVarargs(value: js.Any*): this.type = set("data", js.Array(value :_*))
    
    @scala.inline
    def defaultValue(value: js.Any): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delay(value: Double): this.type = set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean | js.Array[_]): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabledVarargs(value: js.Any*): this.type = set("disabled", js.Array(value :_*))
    
    @scala.inline
    def dropUp(value: Boolean): this.type = set("dropUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def duration(value: Double): this.type = set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def filter(value: Boolean | String | (js.Function2[/* dataItem */ js.Any, /* searchItem */ js.Any, Boolean])): this.type = set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def filterFunction2(value: (/* dataItem */ js.Any, /* searchItem */ js.Any) => Boolean): this.type = set("filter", js.Any.fromFunction2(value))
    
    @scala.inline
    def groupBy(value: String | (js.Function1[/* dataItem */ js.Any, _])): this.type = set("groupBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def groupByFunction1(value: /* dataItem */ js.Any => _): this.type = set("groupBy", js.Any.fromFunction1(value))
    
    @scala.inline
    def groupComponent(value: ReactType[_]): this.type = set("groupComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def groupComponentComponentClass(value: ReactComponentClass[_]): this.type = set("groupComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def groupComponentFunctionComponent(value: ReactComponentClass[_]): this.type = set("groupComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inputProps(value: js.Object): this.type = set("inputProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isRtl(value: Boolean): this.type = set("isRtl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def itemComponent(value: ReactType[_]): this.type = set("itemComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def itemComponentComponentClass(value: ReactComponentClass[_]): this.type = set("itemComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def itemComponentFunctionComponent(value: ReactComponentClass[_]): this.type = set("itemComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def listComponent(value: ReactType[_] | String): this.type = set("listComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def listComponentComponentClass(value: ReactComponentClass[_]): this.type = set("listComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def listComponentFunctionComponent(value: ReactComponentClass[_]): this.type = set("listComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def listProps(value: js.Object): this.type = set("listProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def messages(value: ComboboxMessages): this.type = set("messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minLength(value: Double): this.type = set("minLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChange(value: /* value */ js.Any => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSelect(value: /* value */ js.Any => Unit): this.type = set("onSelect", js.Any.fromFunction1(value))
    
    @scala.inline
    def onToggle(value: /* isOpen */ Boolean => Unit): this.type = set("onToggle", js.Any.fromFunction1(value))
    
    @scala.inline
    def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def popupTransition(value: ReactType[_] | String): this.type = set("popupTransition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def popupTransitionComponentClass(value: ReactComponentClass[_]): this.type = set("popupTransition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def popupTransitionFunctionComponent(value: ReactComponentClass[_]): this.type = set("popupTransition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def readOnly(value: Boolean | js.Array[_]): this.type = set("readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def readOnlyVarargs(value: js.Any*): this.type = set("readOnly", js.Array(value :_*))
    
    @scala.inline
    def suggest(value: Boolean): this.type = set("suggest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def textField(value: String | (js.Function1[/* dataItem */ js.Any, String])): this.type = set("textField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def textFieldFunction1(value: /* dataItem */ js.Any => String): this.type = set("textField", js.Any.fromFunction1(value))
    
    @scala.inline
    def value(value: js.Any): this.type = set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def valueField(value: String): this.type = set("valueField", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Combobox.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ComboboxProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
