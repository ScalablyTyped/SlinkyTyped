package typingsSlinky.reactWidgets.components

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.KeyboardEvent
import slinky.core.ReactComponentClass
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.ReactType
import typingsSlinky.reactWidgets.mod.SelectList.^
import typingsSlinky.reactWidgets.selectListMod.SelectListMessages
import typingsSlinky.reactWidgets.selectListMod.SelectListProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SelectList {
  
  object SelectList {
    
    @JSImport("react-widgets", "SelectList")
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
      def data(value: js.Array[_]): this.type = set("data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def dataVarargs(value: js.Any*): this.type = set("data", js.Array(value :_*))
      
      @scala.inline
      def defaultValue(value: js.Any | js.Array[_]): this.type = set("defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def defaultValueVarargs(value: js.Any*): this.type = set("defaultValue", js.Array(value :_*))
      
      @scala.inline
      def delay(value: Double): this.type = set("delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def disabled(value: Boolean | js.Array[_]): this.type = set("disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def disabledVarargs(value: js.Any*): this.type = set("disabled", js.Array(value :_*))
      
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
      def messages(value: SelectListMessages): this.type = set("messages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def multiple(value: Boolean): this.type = set("multiple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onChange(value: /* values */ js.Any | js.Array[_] => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def onKeyDown(value: /* event */ KeyboardEvent => Unit): this.type = set("onKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def onKeyPress(value: /* event */ KeyboardEvent => Unit): this.type = set("onKeyPress", js.Any.fromFunction1(value))
      
      @scala.inline
      def onMove(value: (/* list */ HTMLElement, /* focusedNode */ HTMLElement, /* focusedItem */ js.Any) => Unit): this.type = set("onMove", js.Any.fromFunction3(value))
      
      @scala.inline
      def readOnly(value: Boolean | js.Array[_]): this.type = set("readOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def readOnlyVarargs(value: js.Any*): this.type = set("readOnly", js.Array(value :_*))
      
      @scala.inline
      def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def textField(value: String | (js.Function1[/* dataItem */ js.Any, String])): this.type = set("textField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def textFieldFunction1(value: /* dataItem */ js.Any => String): this.type = set("textField", js.Any.fromFunction1(value))
      
      @scala.inline
      def value(value: js.Any | js.Array[_]): this.type = set("value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def valueField(value: String): this.type = set("valueField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def valueVarargs(value: js.Any*): this.type = set("value", js.Array(value :_*))
    }
    
    implicit def make(companion: SelectList.type): typingsSlinky.reactWidgets.components.SelectList.SelectList.Builder = new typingsSlinky.reactWidgets.components.SelectList.SelectList.Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: SelectListProps): typingsSlinky.reactWidgets.components.SelectList.SelectList.Builder = new typingsSlinky.reactWidgets.components.SelectList.SelectList.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  @JSImport("react-widgets", "SelectList")
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
    def data(value: js.Array[_]): this.type = set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dataVarargs(value: js.Any*): this.type = set("data", js.Array(value :_*))
    
    @scala.inline
    def defaultValue(value: js.Any | js.Array[_]): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultValueVarargs(value: js.Any*): this.type = set("defaultValue", js.Array(value :_*))
    
    @scala.inline
    def delay(value: Double): this.type = set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean | js.Array[_]): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabledVarargs(value: js.Any*): this.type = set("disabled", js.Array(value :_*))
    
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
    def messages(value: SelectListMessages): this.type = set("messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def multiple(value: Boolean): this.type = set("multiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChange(value: /* values */ js.Any | js.Array[_] => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onKeyDown(value: /* event */ KeyboardEvent => Unit): this.type = set("onKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def onKeyPress(value: /* event */ KeyboardEvent => Unit): this.type = set("onKeyPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMove(value: (/* list */ HTMLElement, /* focusedNode */ HTMLElement, /* focusedItem */ js.Any) => Unit): this.type = set("onMove", js.Any.fromFunction3(value))
    
    @scala.inline
    def readOnly(value: Boolean | js.Array[_]): this.type = set("readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def readOnlyVarargs(value: js.Any*): this.type = set("readOnly", js.Array(value :_*))
    
    @scala.inline
    def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def textField(value: String | (js.Function1[/* dataItem */ js.Any, String])): this.type = set("textField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def textFieldFunction1(value: /* dataItem */ js.Any => String): this.type = set("textField", js.Any.fromFunction1(value))
    
    @scala.inline
    def value(value: js.Any | js.Array[_]): this.type = set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def valueField(value: String): this.type = set("valueField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def valueVarargs(value: js.Any*): this.type = set("value", js.Array(value :_*))
  }
  
  implicit def make(companion: SelectList.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SelectListProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
