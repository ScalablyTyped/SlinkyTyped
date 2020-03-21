package typingsSlinky.materialComponentsWeb.mod

import org.scalajs.dom.raw.Element
import typingsSlinky.materialCheckbox.adapterMod.MDCCheckboxAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "checkbox")
@js.native
object checkbox extends js.Object {
  @js.native
  class MDCCheckbox ()
    extends typingsSlinky.materialCheckbox.mod.MDCCheckbox
  
  @js.native
  class MDCCheckboxFoundation ()
    extends typingsSlinky.materialCheckbox.mod.MDCCheckboxFoundation
  
  /* static members */
  @js.native
  object MDCCheckbox extends js.Object {
    def attachTo(root: Element): typingsSlinky.materialCheckbox.mod.MDCCheckbox = js.native
  }
  
  /* static members */
  @js.native
  object MDCCheckboxFoundation extends js.Object {
    val cssClasses: typingsSlinky.materialCheckbox.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCCheckboxAdapter = js.native
    val numbers: typingsSlinky.materialCheckbox.constantsMod.numbers = js.native
    val strings: typingsSlinky.materialCheckbox.constantsMod.strings = js.native
  }
  
}

