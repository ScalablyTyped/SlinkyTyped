package typingsSlinky.atMaterialDrawer

import org.scalajs.dom.raw.Element
import typingsSlinky.atMaterialBase.componentMod.default
import typingsSlinky.atMaterialDrawer.adapterMod.MDCDrawerAdapter
import typingsSlinky.atMaterialDrawer.atMaterialDrawerMod.MDCDrawer
import typingsSlinky.atMaterialDrawer.focusDashTrapMod.FocusTrap
import typingsSlinky.atMaterialList.atMaterialListMod.MDCList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/drawer", JSImport.Namespace)
@js.native
object atMaterialDrawerMod extends js.Object {
  @js.native
  class MDCDismissibleDrawerFoundation protected ()
    extends typingsSlinky.atMaterialDrawer.dismissibleFoundationMod.MDCDismissibleDrawerFoundation {
    def this(adapter: MDCDrawerAdapter) = this()
  }
  
  @js.native
  class MDCDrawer protected ()
    extends default[
          MDCDrawer, 
          typingsSlinky.atMaterialDrawer.dismissibleFoundationMod.MDCDismissibleDrawerFoundation | typingsSlinky.atMaterialDrawer.modalFoundationMod.MDCModalDrawerFoundation
        ] {
    def this(args: js.Any*) = this()
    /**
      * Returns true if drawer is in the open position.
      */
    var open: Boolean = js.native
    def initialize(focusTrapFactory: FocusTrap, listFactory: MDCList): Unit = js.native
  }
  
  @js.native
  class MDCModalDrawerFoundation ()
    extends typingsSlinky.atMaterialDrawer.modalFoundationMod.MDCModalDrawerFoundation
  
  /* static members */
  @js.native
  object MDCDismissibleDrawerFoundation extends js.Object {
    val cssClasses: typingsSlinky.atMaterialDrawer.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCDrawerAdapter = js.native
    val strings: typingsSlinky.atMaterialDrawer.constantsMod.strings = js.native
  }
  
  /* static members */
  @js.native
  object MDCDrawer extends js.Object {
    def attachTo(root: Element): MDCDrawer = js.native
  }
  
  @js.native
  object util extends js.Object {
    def createFocusTrapInstance(surfaceEl: Element, focusTrapFactory: js.Function0[FocusTrap]): FocusTrap = js.native
  }
  
}

