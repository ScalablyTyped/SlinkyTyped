package typingsSlinky.materialDashComponentsDashWeb.materialDashComponentsDashWebMod

import org.scalajs.dom.raw.Element
import typingsSlinky.atMaterialDialog.adapterMod.MDCDialogAdapter
import typingsSlinky.atMaterialDialog.utilMod.MDCFocusTrapFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "dialog")
@js.native
object dialog extends js.Object {
  @js.native
  class MDCDialog ()
    extends typingsSlinky.atMaterialDialog.atMaterialDialogMod.MDCDialog
  
  @js.native
  class MDCDialogFoundation ()
    extends typingsSlinky.atMaterialDialog.atMaterialDialogMod.MDCDialogFoundation
  
  /* static members */
  @js.native
  object MDCDialog extends js.Object {
    def attachTo(root: Element): typingsSlinky.atMaterialDialog.atMaterialDialogMod.MDCDialog = js.native
  }
  
  /* static members */
  @js.native
  object MDCDialogFoundation extends js.Object {
    val cssClasses: typingsSlinky.atMaterialDialog.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCDialogAdapter = js.native
    val strings: typingsSlinky.atMaterialDialog.constantsMod.strings = js.native
  }
  
  @js.native
  object util extends js.Object {
    def createFocusTrapInstance(surfaceEl: Element, acceptButtonEl: Element): js.Any = js.native
    def createFocusTrapInstance(surfaceEl: Element, acceptButtonEl: Element, focusTrapFactory: MDCFocusTrapFactory): js.Any = js.native
  }
  
}

