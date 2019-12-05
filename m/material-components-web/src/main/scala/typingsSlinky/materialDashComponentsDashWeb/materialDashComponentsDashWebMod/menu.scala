package typingsSlinky.materialDashComponentsDashWeb.materialDashComponentsDashWebMod

import org.scalajs.dom.raw.Element
import typingsSlinky.atMaterialMenu.adapterMod.MDCMenuAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "menu")
@js.native
object menu extends js.Object {
  @js.native
  class MDCMenu ()
    extends typingsSlinky.atMaterialMenu.atMaterialMenuMod.MDCMenu
  
  @js.native
  class MDCMenuFoundation ()
    extends typingsSlinky.atMaterialMenu.atMaterialMenuMod.MDCMenuFoundation
  
  /* static members */
  @js.native
  object MDCMenu extends js.Object {
    def attachTo(root: Element): typingsSlinky.atMaterialMenu.atMaterialMenuMod.MDCMenu = js.native
  }
  
  /* static members */
  @js.native
  object MDCMenuFoundation extends js.Object {
    val Corner: typingsSlinky.atMaterialMenu.constantsMod.Corner = js.native
    val cssClasses: typingsSlinky.atMaterialMenu.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCMenuAdapter = js.native
    val numbers: typingsSlinky.atMaterialMenu.constantsMod.numbers = js.native
    val strings: typingsSlinky.atMaterialMenu.constantsMod.strings = js.native
  }
  
}

