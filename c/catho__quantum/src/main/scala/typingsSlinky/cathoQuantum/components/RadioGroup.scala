package typingsSlinky.cathoQuantum.components

import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.facade.ReactElement
import slinky.web.html.input.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.cathoQuantum.anon.ColorsComponents
import typingsSlinky.cathoQuantum.anon.ColorsSpacing
import typingsSlinky.cathoQuantum.anon.Disabled
import typingsSlinky.cathoQuantum.cathoQuantumStrings.button
import typingsSlinky.cathoQuantum.cathoQuantumStrings.error
import typingsSlinky.cathoQuantum.cathoQuantumStrings.large
import typingsSlinky.cathoQuantum.cathoQuantumStrings.medium
import typingsSlinky.cathoQuantum.cathoQuantumStrings.neutral
import typingsSlinky.cathoQuantum.cathoQuantumStrings.primary
import typingsSlinky.cathoQuantum.cathoQuantumStrings.radio
import typingsSlinky.cathoQuantum.cathoQuantumStrings.small
import typingsSlinky.cathoQuantum.cathoQuantumStrings.success
import typingsSlinky.cathoQuantum.cathoQuantumStrings.warning
import typingsSlinky.cathoQuantum.cathoQuantumStrings.xlarge
import typingsSlinky.cathoQuantum.cathoQuantumStrings.xsmall
import typingsSlinky.cathoQuantum.radioGroupMod.RadioButtonProps
import typingsSlinky.cathoQuantum.radioGroupMod.RadioGroupProps
import typingsSlinky.cathoQuantum.radioGroupMod.RadioProps
import typingsSlinky.cathoQuantum.radioGroupMod.default
import typingsSlinky.react.mod.ChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RadioGroup {
  @JSImport("@catho/quantum/RadioGroup", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def childrenReactElement(value: ReactElement): this.type = set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def childrenVarargs(value: ReactElement*): this.type = set("children", js.Array(value :_*))
    @scala.inline
    def children(value: js.Array[ReactElement] | ReactElement): this.type = set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def error(value: String): this.type = set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def `inline`(value: Boolean): this.type = set("inline", value.asInstanceOf[js.Any])
    @scala.inline
    def onChange(value: ChangeEvent[HTMLInputElement] => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def optionsVarargs(value: Disabled*): this.type = set("options", js.Array(value :_*))
    @scala.inline
    def options(value: js.Array[Disabled]): this.type = set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def size(value: xsmall | small | medium | large | xlarge): this.type = set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def theme(value: ColorsSpacing): this.type = set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def `type`(value: radio | button): this.type = set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def value(value: String): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: RadioGroupProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(name: String): Builder = {
    val __props = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[RadioGroupProps]))
  }
  object Button {
    @JSImport("@catho/quantum/RadioGroup", "default.Button")
    @js.native
    object component extends js.Object
    
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
      def error(value: Boolean): this.type = set("error", value.asInstanceOf[js.Any])
      @scala.inline
      def icon(value: String): this.type = set("icon", value.asInstanceOf[js.Any])
      @scala.inline
      def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
      @scala.inline
      def `inline`(value: Boolean): this.type = set("inline", value.asInstanceOf[js.Any])
      @scala.inline
      def label(value: String): this.type = set("label", value.asInstanceOf[js.Any])
      @scala.inline
      def onChange(value: ChangeEvent[HTMLInputElement] => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
      @scala.inline
      def size(value: xsmall | small | medium | large | xlarge): this.type = set("size", value.asInstanceOf[js.Any])
      @scala.inline
      def skin(value: neutral | primary | success | warning | error): this.type = set("skin", value.asInstanceOf[js.Any])
      @scala.inline
      def theme(value: ColorsComponents): this.type = set("theme", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: RadioButtonProps): typingsSlinky.cathoQuantum.components.RadioGroup.Button.Builder = new typingsSlinky.cathoQuantum.components.RadioGroup.Button.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
    @scala.inline
    def apply(value: String): typingsSlinky.cathoQuantum.components.RadioGroup.Button.Builder = {
        val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
        new typingsSlinky.cathoQuantum.components.RadioGroup.Button.Builder(js.Array(this.component, __props.asInstanceOf[RadioButtonProps]))
    }
  }
  
  object Radio {
    @JSImport("@catho/quantum/RadioGroup", "default.Radio")
    @js.native
    object component extends js.Object
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, js.Object] {
      @scala.inline
      def childrenReactElement(value: ReactElement): this.type = set("children", value.asInstanceOf[js.Any])
      @scala.inline
      def childrenVarargs(value: ReactElement*): this.type = set("children", js.Array(value :_*))
      @scala.inline
      def children(value: String | js.Array[ReactElement] | ReactElement): this.type = set("children", value.asInstanceOf[js.Any])
      @scala.inline
      def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
      @scala.inline
      def error(value: Boolean): this.type = set("error", value.asInstanceOf[js.Any])
      @scala.inline
      def label(value: String): this.type = set("label", value.asInstanceOf[js.Any])
      @scala.inline
      def onChange(value: ChangeEvent[HTMLInputElement] => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
      @scala.inline
      def theme(value: ColorsSpacing): this.type = set("theme", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: RadioProps): typingsSlinky.cathoQuantum.components.RadioGroup.Radio.Builder = new typingsSlinky.cathoQuantum.components.RadioGroup.Radio.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
    @scala.inline
    def apply(value: String): typingsSlinky.cathoQuantum.components.RadioGroup.Radio.Builder = {
        val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
        new typingsSlinky.cathoQuantum.components.RadioGroup.Radio.Builder(js.Array(this.component, __props.asInstanceOf[RadioProps]))
    }
  }
  
}

