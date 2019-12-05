package typingsSlinky.atMaterialDialog

import org.scalajs.dom.raw.Element
import typingsSlinky.atMaterialBase.atMaterialBaseMod.MDCComponent
import typingsSlinky.atMaterialDialog.adapterMod.MDCDialogAdapter
import typingsSlinky.atMaterialDialog.atMaterialDialogMod.MDCDialog
import typingsSlinky.atMaterialDialog.foundationMod.default
import typingsSlinky.atMaterialDialog.utilMod.MDCFocusTrapFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/dialog", JSImport.Namespace)
@js.native
object atMaterialDialogMod extends js.Object {
  @js.native
  class MDCDialog () extends MDCComponent[MDCDialogAdapter, default] {
    val open: Boolean = js.native
    def close(): Unit = js.native
    def show(): Unit = js.native
  }
  
  @js.native
  class MDCDialogFoundation () extends default
  
  /* static members */
  @js.native
  object MDCDialog extends js.Object {
    def attachTo(root: Element): MDCDialog = js.native
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

