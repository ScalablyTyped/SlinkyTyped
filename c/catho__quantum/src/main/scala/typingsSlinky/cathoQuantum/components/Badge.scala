package typingsSlinky.cathoQuantum.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.cathoQuantum.anon.Components
import typingsSlinky.cathoQuantum.badgeMod.BadgeProps
import typingsSlinky.cathoQuantum.badgeMod.default
import typingsSlinky.cathoQuantum.cathoQuantumStrings.error
import typingsSlinky.cathoQuantum.cathoQuantumStrings.neutral
import typingsSlinky.cathoQuantum.cathoQuantumStrings.primary
import typingsSlinky.cathoQuantum.cathoQuantumStrings.secondary
import typingsSlinky.cathoQuantum.cathoQuantumStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Badge {
  @JSImport("@catho/quantum/Badge", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def inverted(value: Boolean): this.type = set("inverted", value.asInstanceOf[js.Any])
    @scala.inline
    def number(value: Double): this.type = set("number", value.asInstanceOf[js.Any])
    @scala.inline
    def skin(value: primary | secondary | success | error | neutral): this.type = set("skin", value.asInstanceOf[js.Any])
    @scala.inline
    def theme(value: Components): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: BadgeProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Badge.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

