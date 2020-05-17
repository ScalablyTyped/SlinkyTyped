package typingsSlinky.cathoQuantum.components

import org.scalajs.dom.raw.HTMLButtonElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.button.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.cathoQuantum.anon.BaseFontSizeBreakpoints
import typingsSlinky.cathoQuantum.anon.CallbackFn
import typingsSlinky.cathoQuantum.cathoQuantumStrings.error
import typingsSlinky.cathoQuantum.cathoQuantumStrings.neutral
import typingsSlinky.cathoQuantum.cathoQuantumStrings.primary
import typingsSlinky.cathoQuantum.cathoQuantumStrings.success
import typingsSlinky.cathoQuantum.cathoQuantumStrings.warning
import typingsSlinky.cathoQuantum.snackBarMod.SnackBarProps
import typingsSlinky.cathoQuantum.snackBarMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SnackBar {
  @JSImport("@catho/quantum/SnackBar", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def actionTrigger(value: CallbackFn): this.type = set("actionTrigger", value.asInstanceOf[js.Any])
    @scala.inline
    def closeButtonAriaLabel(value: String): this.type = set("closeButtonAriaLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def inverted(value: Boolean): this.type = set("inverted", value.asInstanceOf[js.Any])
    @scala.inline
    def onClose(value: SyntheticMouseEvent[HTMLButtonElement] => Unit): this.type = set("onClose", js.Any.fromFunction1(value))
    @scala.inline
    def secondsToClose(value: Double): this.type = set("secondsToClose", value.asInstanceOf[js.Any])
    @scala.inline
    def skin(value: primary | success | error | neutral | warning): this.type = set("skin", value.asInstanceOf[js.Any])
    @scala.inline
    def text(value: String): this.type = set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def theme(value: BaseFontSizeBreakpoints): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SnackBarProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: SnackBar.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

