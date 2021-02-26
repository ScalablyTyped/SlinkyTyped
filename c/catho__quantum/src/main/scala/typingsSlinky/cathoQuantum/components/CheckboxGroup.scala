package typingsSlinky.cathoQuantum.components

import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.facade.ReactElement
import slinky.web.html.input.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.cathoQuantum.anon.BaseFontSize
import typingsSlinky.cathoQuantum.anon.Checked
import typingsSlinky.cathoQuantum.anon.ColorsSpacing
import typingsSlinky.cathoQuantum.cathoQuantumStrings.button
import typingsSlinky.cathoQuantum.cathoQuantumStrings.checkbox
import typingsSlinky.cathoQuantum.cathoQuantumStrings.error
import typingsSlinky.cathoQuantum.cathoQuantumStrings.large
import typingsSlinky.cathoQuantum.cathoQuantumStrings.medium
import typingsSlinky.cathoQuantum.cathoQuantumStrings.neutral
import typingsSlinky.cathoQuantum.cathoQuantumStrings.primary
import typingsSlinky.cathoQuantum.cathoQuantumStrings.small
import typingsSlinky.cathoQuantum.cathoQuantumStrings.success
import typingsSlinky.cathoQuantum.cathoQuantumStrings.warning
import typingsSlinky.cathoQuantum.cathoQuantumStrings.xlarge
import typingsSlinky.cathoQuantum.cathoQuantumStrings.xsmall
import typingsSlinky.cathoQuantum.checkboxMod.CheckboxButtonProps
import typingsSlinky.cathoQuantum.checkboxMod.CheckboxGroupProps
import typingsSlinky.cathoQuantum.checkboxMod.CheckboxProps
import typingsSlinky.cathoQuantum.checkboxMod.Options
import typingsSlinky.react.mod.ChangeEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CheckboxGroup {
  
  @scala.inline
  def apply(`type`: checkbox | button): Builder = {
    val __props = js.Dynamic.literal()
    __props.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[CheckboxGroupProps]))
  }
  
  object Button {
    
    @scala.inline
    def apply(name: String): typingsSlinky.cathoQuantum.components.CheckboxGroup.Button.Builder = {
      val __props = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      new typingsSlinky.cathoQuantum.components.CheckboxGroup.Button.Builder(js.Array(this.component, __props.asInstanceOf[CheckboxButtonProps]))
    }
    
    @JSImport("@catho/quantum/Checkbox", "CheckboxGroup.Button")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, js.Object] {
      
      @scala.inline
      def checked(value: Boolean): this.type = set("checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def children(value: js.Array[ReactElement] | ReactElement): this.type = set("children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def childrenReactElement(value: ReactElement): this.type = set("children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def childrenVarargs(value: ReactElement*): this.type = set("children", js.Array(value :_*))
      
      @scala.inline
      def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def error(value: String): this.type = set("error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def icon(value: String): this.type = set("icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def label(value: String): this.type = set("label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onChange(value: ChangeEvent[HTMLInputElement] => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def size(value: xsmall | small | medium | large | xlarge): this.type = set("size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def skin(value: neutral | primary | success | warning | error): this.type = set("skin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def value(value: String): this.type = set("value", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: CheckboxButtonProps): typingsSlinky.cathoQuantum.components.CheckboxGroup.Button.Builder = new typingsSlinky.cathoQuantum.components.CheckboxGroup.Button.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Checkbox {
    
    @scala.inline
    def apply(name: String): typingsSlinky.cathoQuantum.components.CheckboxGroup.Checkbox.Builder = {
      val __props = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      new typingsSlinky.cathoQuantum.components.CheckboxGroup.Checkbox.Builder(js.Array(this.component, __props.asInstanceOf[CheckboxProps]))
    }
    
    @JSImport("@catho/quantum/Checkbox", "CheckboxGroup.Checkbox")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, js.Object] {
      
      @scala.inline
      def checked(value: Boolean): this.type = set("checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def children(value: String): this.type = set("children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def error(value: String): this.type = set("error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def label(value: String): this.type = set("label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onChange(value: ChangeEvent[HTMLInputElement] => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def theme(value: BaseFontSize): this.type = set("theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def value(value: String): this.type = set("value", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: CheckboxProps): typingsSlinky.cathoQuantum.components.CheckboxGroup.Checkbox.Builder = new typingsSlinky.cathoQuantum.components.CheckboxGroup.Checkbox.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("@catho/quantum/Checkbox", "CheckboxGroup")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.cathoQuantum.checkboxMod.CheckboxGroup] {
    
    @scala.inline
    def children(value: js.Array[ReactElement] | ReactElement): this.type = set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def childrenReactElement(value: ReactElement): this.type = set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def childrenVarargs(value: ReactElement*): this.type = set("children", js.Array(value :_*))
    
    @scala.inline
    def error(value: String): this.type = set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `inline`(value: Boolean): this.type = set("inline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChange(
      value: (/* items */ js.UndefOr[Options], /* event */ js.UndefOr[ChangeEvent[HTMLInputElement]]) => Unit
    ): this.type = set("onChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def options(value: Options): this.type = set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def optionsVarargs(value: Checked*): this.type = set("options", js.Array(value :_*))
    
    @scala.inline
    def size(value: xsmall | small | medium | large | xlarge): this.type = set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def theme(value: ColorsSpacing): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: CheckboxGroupProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
