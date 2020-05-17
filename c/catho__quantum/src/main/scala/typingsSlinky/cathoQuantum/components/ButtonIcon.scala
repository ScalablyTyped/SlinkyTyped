package typingsSlinky.cathoQuantum.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.cathoQuantum.anon.Spacing
import typingsSlinky.cathoQuantum.cathoQuantumStrings.error
import typingsSlinky.cathoQuantum.cathoQuantumStrings.large
import typingsSlinky.cathoQuantum.cathoQuantumStrings.medium
import typingsSlinky.cathoQuantum.cathoQuantumStrings.neutral
import typingsSlinky.cathoQuantum.cathoQuantumStrings.primary
import typingsSlinky.cathoQuantum.cathoQuantumStrings.secondary
import typingsSlinky.cathoQuantum.cathoQuantumStrings.small
import typingsSlinky.cathoQuantum.cathoQuantumStrings.success
import typingsSlinky.cathoQuantum.cathoQuantumStrings.warning
import typingsSlinky.cathoQuantum.cathoQuantumStrings.xlarge
import typingsSlinky.cathoQuantum.cathoQuantumStrings.xsmall
import typingsSlinky.cathoQuantum.iconButtonMod.IconButtonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ButtonIcon {
  @JSImport("@catho/quantum/Button", "default.Icon")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def size(value: xsmall | small | medium | large | xlarge): this.type = set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def skin(value: neutral | primary | secondary | success | warning | error): this.type = set("skin", value.asInstanceOf[js.Any])
    @scala.inline
    def theme(value: Spacing): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IconButtonProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ButtonIcon.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

