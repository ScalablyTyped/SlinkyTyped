package typingsSlinky.cathoQuantum.components

import org.scalajs.dom.raw.HTMLButtonElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.button.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.cathoQuantum.alertMod.AlertProps
import typingsSlinky.cathoQuantum.alertMod.default
import typingsSlinky.cathoQuantum.anon.Colors
import typingsSlinky.cathoQuantum.cathoQuantumStrings.error
import typingsSlinky.cathoQuantum.cathoQuantumStrings.neutral
import typingsSlinky.cathoQuantum.cathoQuantumStrings.primary
import typingsSlinky.cathoQuantum.cathoQuantumStrings.success
import typingsSlinky.cathoQuantum.cathoQuantumStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Alert {
  @JSImport("@catho/quantum/Alert", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def icon(value: String): this.type = set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def skin(value: primary | success | error | neutral | warning): this.type = set("skin", value.asInstanceOf[js.Any])
    @scala.inline
    def theme(value: Colors): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: AlertProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(onClose: SyntheticMouseEvent[HTMLButtonElement] => Unit): Builder = {
    val __props = js.Dynamic.literal(onClose = js.Any.fromFunction1(onClose))
    new Builder(js.Array(this.component, __props.asInstanceOf[AlertProps]))
  }
}

