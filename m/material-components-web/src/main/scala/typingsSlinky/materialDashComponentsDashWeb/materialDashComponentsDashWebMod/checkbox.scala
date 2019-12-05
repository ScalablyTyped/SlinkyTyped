package typingsSlinky.materialDashComponentsDashWeb.materialDashComponentsDashWebMod

import org.scalajs.dom.raw.Element
import typingsSlinky.atMaterialCheckbox.adapterMod.MDCCheckboxAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "checkbox")
@js.native
object checkbox extends js.Object {
  @js.native
  class MDCCheckbox ()
    extends typingsSlinky.atMaterialCheckbox.atMaterialCheckboxMod.MDCCheckbox
  
  @js.native
  class MDCCheckboxFoundation ()
    extends typingsSlinky.atMaterialCheckbox.atMaterialCheckboxMod.MDCCheckboxFoundation
  
  /* static members */
  @js.native
  object MDCCheckbox extends js.Object {
    def attachTo(root: Element): typingsSlinky.atMaterialCheckbox.atMaterialCheckboxMod.MDCCheckbox = js.native
  }
  
  /* static members */
  @js.native
  object MDCCheckboxFoundation extends js.Object {
    val cssClasses: typingsSlinky.atMaterialCheckbox.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCCheckboxAdapter = js.native
    val numbers: typingsSlinky.atMaterialCheckbox.constantsMod.numbers = js.native
    val strings: typingsSlinky.atMaterialCheckbox.constantsMod.strings = js.native
  }
  
}

