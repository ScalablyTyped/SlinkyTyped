package typingsSlinky.materialComponentsWeb.mod

import org.scalajs.dom.raw.Element
import typingsSlinky.materialMenu.adapterMod.MDCMenuAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "menu")
@js.native
object menu extends js.Object {
  @js.native
  class MDCMenu ()
    extends typingsSlinky.materialMenu.mod.MDCMenu
  
  @js.native
  class MDCMenuFoundation ()
    extends typingsSlinky.materialMenu.mod.MDCMenuFoundation
  
  /* static members */
  @js.native
  object MDCMenu extends js.Object {
    def attachTo(root: Element): typingsSlinky.materialMenu.mod.MDCMenu = js.native
  }
  
  /* static members */
  @js.native
  object MDCMenuFoundation extends js.Object {
    val Corner: typingsSlinky.materialMenu.constantsMod.Corner = js.native
    val cssClasses: typingsSlinky.materialMenu.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCMenuAdapter = js.native
    val numbers: typingsSlinky.materialMenu.constantsMod.numbers = js.native
    val strings: typingsSlinky.materialMenu.constantsMod.strings = js.native
  }
  
}

