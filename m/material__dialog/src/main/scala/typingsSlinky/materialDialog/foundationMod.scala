package typingsSlinky.materialDialog

import org.scalajs.dom.raw.KeyboardEvent
import org.scalajs.dom.raw.MouseEvent
import typingsSlinky.materialBase.foundationMod.MDCFoundation
import typingsSlinky.materialDialog.adapterMod.MDCDialogAdapter
import typingsSlinky.materialDialog.anon.ACTIONATTRIBUTE
import typingsSlinky.materialDialog.anon.CLOSING
import typingsSlinky.materialDialog.anon.DIALOGANIMATIONCLOSETIMEMS
import typingsSlinky.materialDialog.anon.PartialMDCDialogAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/dialog/foundation", JSImport.Namespace)
@js.native
object foundationMod extends js.Object {
  
  @js.native
  class MDCDialogFoundation () extends MDCFoundation[MDCDialogAdapter] {
    def this(adapter: PartialMDCDialogAdapter) = this()
    
    def close(): Unit = js.native
    def close(action: String): Unit = js.native
    
    def getAutoStackButtons(): Boolean = js.native
    
    def getEscapeKeyAction(): String = js.native
    
    def getScrimClickAction(): String = js.native
    
    /** Handles click on the dialog root element. */
    def handleClick(evt: MouseEvent): Unit = js.native
    
    /** Handles keydown on the document. */
    def handleDocumentKeydown(evt: KeyboardEvent): Unit = js.native
    
    /** Handles keydown on the dialog root element. */
    def handleKeydown(evt: KeyboardEvent): Unit = js.native
    
    def isOpen(): Boolean = js.native
    
    def layout(): Unit = js.native
    
    def open(): Unit = js.native
    
    def setAutoStackButtons(autoStack: Boolean): Unit = js.native
    
    def setEscapeKeyAction(action: String): Unit = js.native
    
    def setScrimClickAction(action: String): Unit = js.native
  }
  /* static members */
  @js.native
  object MDCDialogFoundation extends js.Object {
    
    def cssClasses: CLOSING = js.native
    
    def defaultAdapter: MDCDialogAdapter = js.native
    
    def numbers: DIALOGANIMATIONCLOSETIMEMS = js.native
    
    def strings: ACTIONATTRIBUTE = js.native
  }
  
  @js.native
  class default () extends MDCDialogFoundation {
    def this(adapter: PartialMDCDialogAdapter) = this()
  }
  /* static members */
  @js.native
  object default extends js.Object {
    
    def cssClasses: CLOSING = js.native
    
    def defaultAdapter: MDCDialogAdapter = js.native
    
    def numbers: DIALOGANIMATIONCLOSETIMEMS = js.native
    
    def strings: ACTIONATTRIBUTE = js.native
  }
}
