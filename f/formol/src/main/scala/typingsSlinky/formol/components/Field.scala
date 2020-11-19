package typingsSlinky.formol.components

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.formol.mod.FieldProps
import typingsSlinky.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Field {
  
  @JSImport("formol", "Field")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def TypeFieldFunctionComponent(value: ReactComponentClass[js.Object]): this.type = set("TypeField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def TypeFieldComponentClass(value: ReactComponentClass[js.Object]): this.type = set("TypeField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def TypeField(value: ReactComponentClass[js.Object]): this.type = set("TypeField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def children(value: js.Any): this.type = set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def choicesVarargs(value: js.Any*): this.type = set("choices", js.Array(value :_*))
    
    @scala.inline
    def choices(value: js.Array[_]): this.type = set("choices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def classNameModifiers(value: js.Any): this.type = set("classNameModifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dangerousRawHTMLLabels(value: Boolean): this.type = set("dangerousRawHTMLLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def errorReactElement(value: ReactElement): this.type = set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def error(value: ReactElement): this.type = set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def extrasReactElement(value: ReactElement): this.type = set("extras", value.asInstanceOf[js.Any])
    
    @scala.inline
    def extras(value: ReactElement): this.type = set("extras", value.asInstanceOf[js.Any])
    
    @scala.inline
    def formatter(value: js.Any => js.Any): this.type = set("formatter", js.Any.fromFunction1(value))
    
    @scala.inline
    def handleChange(value: (/* name */ String, js.Any) => Unit): this.type = set("handleChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def handleEntered(value: (/* name */ String, js.Any) => Unit): this.type = set("handleEntered", js.Any.fromFunction2(value))
    
    @scala.inline
    def i18n(value: js.Any): this.type = set("i18n", value.asInstanceOf[js.Any])
    
    @scala.inline
    def max(value: Double): this.type = set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minLength(value: Double): this.type = set("minLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def modified(value: Boolean): this.type = set("modified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def normalizer(value: js.Any => js.Any): this.type = set("normalizer", js.Any.fromFunction1(value))
    
    @scala.inline
    def readOnly(value: Boolean): this.type = set("readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def register(
      value: (/* name */ String, /* element */ Ref[_], /* validator */ js.Any, /* validityErrors */ js.Any) => Unit
    ): this.type = set("register", js.Any.fromFunction4(value))
    
    @scala.inline
    def required(value: Boolean): this.type = set("required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def size(value: Double): this.type = set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `type`(value: String): this.type = set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def unformatter(value: js.Any => js.Any): this.type = set("unformatter", js.Any.fromFunction1(value))
    
    @scala.inline
    def unitReactElement(value: ReactElement): this.type = set("unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def unit(value: ReactElement): this.type = set("unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def unregister(value: /* name */ String => Unit): this.type = set("unregister", js.Any.fromFunction1(value))
    
    @scala.inline
    def validator(value: js.Any => String): this.type = set("validator", js.Any.fromFunction1(value))
    
    @scala.inline
    def validityErrors(value: js.Any): this.type = set("validityErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def value(value: js.Any): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: FieldProps[js.Any]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Field.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
