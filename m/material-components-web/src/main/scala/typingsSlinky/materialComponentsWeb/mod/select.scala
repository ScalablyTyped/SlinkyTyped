package typingsSlinky.materialComponentsWeb.mod

import org.scalajs.dom.raw.Element
import typingsSlinky.materialSelect.adapterMod.MDCSelectAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "select")
@js.native
object select extends js.Object {
  @js.native
  class MDCSelect ()
    extends typingsSlinky.materialSelect.mod.MDCSelect
  
  @js.native
  class MDCSelectFoundation ()
    extends typingsSlinky.materialSelect.mod.MDCSelectFoundation
  
  /* static members */
  @js.native
  object MDCSelect extends js.Object {
    def attachTo(root: Element): typingsSlinky.materialSelect.mod.MDCSelect = js.native
  }
  
  /* static members */
  @js.native
  object MDCSelectFoundation extends js.Object {
    val cssClasses: typingsSlinky.materialSelect.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCSelectAdapter = js.native
    val strings: typingsSlinky.materialSelect.constantsMod.strings = js.native
  }
  
}

