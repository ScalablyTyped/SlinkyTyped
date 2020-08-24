package typingsSlinky.cathoQuantum.components

import org.scalajs.dom.raw.HTMLButtonElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.button.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.cathoQuantum.anon.Breakpoints
import typingsSlinky.cathoQuantum.anon.Spacing
import typingsSlinky.cathoQuantum.buttonMod.ButtonProps
import typingsSlinky.cathoQuantum.buttonMod.default
import typingsSlinky.cathoQuantum.cathoQuantumStrings.button
import typingsSlinky.cathoQuantum.cathoQuantumStrings.error
import typingsSlinky.cathoQuantum.cathoQuantumStrings.large
import typingsSlinky.cathoQuantum.cathoQuantumStrings.medium
import typingsSlinky.cathoQuantum.cathoQuantumStrings.neutral
import typingsSlinky.cathoQuantum.cathoQuantumStrings.primary
import typingsSlinky.cathoQuantum.cathoQuantumStrings.reset
import typingsSlinky.cathoQuantum.cathoQuantumStrings.secondary
import typingsSlinky.cathoQuantum.cathoQuantumStrings.small
import typingsSlinky.cathoQuantum.cathoQuantumStrings.submit
import typingsSlinky.cathoQuantum.cathoQuantumStrings.success
import typingsSlinky.cathoQuantum.cathoQuantumStrings.warning
import typingsSlinky.cathoQuantum.cathoQuantumStrings.xlarge
import typingsSlinky.cathoQuantum.cathoQuantumStrings.xsmall
import typingsSlinky.cathoQuantum.iconButtonMod.IconButtonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Button {
  @JSImport("@catho/quantum/Button", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def $asReactElement(value: ReactElement): this.type = set("$as", value.asInstanceOf[js.Any])
    @scala.inline
    def $as(value: ReactElement | String): this.type = set("$as", value.asInstanceOf[js.Any])
    @scala.inline
    def center(value: Boolean): this.type = set("center", value.asInstanceOf[js.Any])
    @scala.inline
    def childrenReactElement(value: ReactElement): this.type = set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def childrenVarargs(value: ReactElement*): this.type = set("children", js.Array(value :_*))
    @scala.inline
    def children(value: js.Array[ReactElement] | ReactElement): this.type = set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def full(value: Boolean): this.type = set("full", value.asInstanceOf[js.Any])
    @scala.inline
    def icon(value: String): this.type = set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def onClick(value: SyntheticMouseEvent[HTMLButtonElement] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def size(value: xsmall | small | medium | large | xlarge): this.type = set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def skin(value: neutral | primary | secondary | success | warning | error): this.type = set("skin", value.asInstanceOf[js.Any])
    @scala.inline
    def stroked(value: Boolean): this.type = set("stroked", value.asInstanceOf[js.Any])
    @scala.inline
    def theme(value: Breakpoints): this.type = set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def `type`(value: button | reset | submit): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ButtonProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Button.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  object Icon {
    @JSImport("@catho/quantum/Button", "default.Icon")
    @js.native
    object component extends js.Object
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[slinky.web.html.`*`.tag.type, js.Object] {
      @scala.inline
      def size(value: xsmall | small | medium | large | xlarge): this.type = set("size", value.asInstanceOf[js.Any])
      @scala.inline
      def skin(value: neutral | primary | secondary | success | warning | error): this.type = set("skin", value.asInstanceOf[js.Any])
      @scala.inline
      def theme(value: Spacing): this.type = set("theme", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: IconButtonProps): typingsSlinky.cathoQuantum.components.Button.Icon.Builder = new typingsSlinky.cathoQuantum.components.Button.Icon.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
    implicit def make(companion: Icon.type): typingsSlinky.cathoQuantum.components.Button.Icon.Builder = new typingsSlinky.cathoQuantum.components.Button.Icon.Builder(js.Array(this.component, js.Dictionary.empty))()
  }
  
}

