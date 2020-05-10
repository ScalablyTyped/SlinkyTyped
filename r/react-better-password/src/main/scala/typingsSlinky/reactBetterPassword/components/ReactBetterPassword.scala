package typingsSlinky.reactBetterPassword.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactBetterPassword.mod.PasswordProps
import typingsSlinky.reactBetterPassword.mod.default
import typingsSlinky.reactBetterPassword.reactBetterPasswordStrings.Bullet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactBetterPassword {
  @JSImport("react-better-password", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def mask(value: Bullet | String): this.type = set("mask", value.asInstanceOf[js.Any])
    @scala.inline
    def onChange(value: /* value */ String => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def show(value: Boolean): this.type = set("show", value.asInstanceOf[js.Any])
    @scala.inline
    def timeout(value: Double): this.type = set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def value(value: String): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PasswordProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ReactBetterPassword.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

