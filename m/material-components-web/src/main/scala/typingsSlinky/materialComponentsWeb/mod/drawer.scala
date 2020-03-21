package typingsSlinky.materialComponentsWeb.mod

import org.scalajs.dom.raw.Element
import typingsSlinky.materialDrawer.adapterMod.MDCDrawerAdapter
import typingsSlinky.materialDrawer.focusTrapMod.FocusTrap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "drawer")
@js.native
object drawer extends js.Object {
  @js.native
  class MDCDismissibleDrawerFoundation protected ()
    extends typingsSlinky.materialDrawer.mod.MDCDismissibleDrawerFoundation {
    def this(adapter: MDCDrawerAdapter) = this()
  }
  
  @js.native
  class MDCDrawer protected ()
    extends typingsSlinky.materialDrawer.mod.MDCDrawer {
    def this(args: js.Any*) = this()
  }
  
  @js.native
  class MDCModalDrawerFoundation ()
    extends typingsSlinky.materialDrawer.modalFoundationMod.MDCModalDrawerFoundation
  
  /* static members */
  @js.native
  object MDCDismissibleDrawerFoundation extends js.Object {
    val cssClasses: typingsSlinky.materialDrawer.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCDrawerAdapter = js.native
    val strings: typingsSlinky.materialDrawer.constantsMod.strings = js.native
  }
  
  /* static members */
  @js.native
  object MDCDrawer extends js.Object {
    def attachTo(root: Element): typingsSlinky.materialDrawer.mod.MDCDrawer = js.native
  }
  
  @js.native
  object util extends js.Object {
    def createFocusTrapInstance(surfaceEl: Element, focusTrapFactory: js.Function0[FocusTrap]): FocusTrap = js.native
  }
  
}

