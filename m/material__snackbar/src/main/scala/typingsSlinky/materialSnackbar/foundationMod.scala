package typingsSlinky.materialSnackbar

import org.scalajs.dom.raw.KeyboardEvent
import org.scalajs.dom.raw.MouseEvent
import typingsSlinky.materialBase.foundationMod.MDCFoundation
import typingsSlinky.materialSnackbar.adapterMod.MDCSnackbarAdapter
import typingsSlinky.materialSnackbar.anon.ACTIONSELECTOR
import typingsSlinky.materialSnackbar.anon.ARIALIVEDELAYMS
import typingsSlinky.materialSnackbar.anon.CLOSING
import typingsSlinky.materialSnackbar.anon.PartialMDCSnackbarAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/snackbar/foundation", JSImport.Namespace)
@js.native
object foundationMod extends js.Object {
  
  @js.native
  class MDCSnackbarFoundation () extends MDCFoundation[MDCSnackbarAdapter] {
    def this(adapter: PartialMDCSnackbarAdapter) = this()
    
    /**
      * @param reason Why the snackbar was closed. Value will be passed to CLOSING_EVENT and CLOSED_EVENT via the
      *     `event.detail.reason` property. Standard values are REASON_ACTION and REASON_DISMISS, but custom
      *     client-specific values may also be used if desired.
      */
    def close(): Unit = js.native
    def close(reason: String): Unit = js.native
    
    def getCloseOnEscape(): Boolean = js.native
    
    def getTimeoutMs(): Double = js.native
    
    def handleActionButtonClick(_evt: MouseEvent): Unit = js.native
    
    def handleActionIconClick(_evt: MouseEvent): Unit = js.native
    
    def handleKeyDown(evt: KeyboardEvent): Unit = js.native
    
    def isOpen(): Boolean = js.native
    
    def open(): Unit = js.native
    
    def setCloseOnEscape(closeOnEscape: Boolean): Unit = js.native
    
    def setTimeoutMs(timeoutMs: Double): Unit = js.native
  }
  /* static members */
  @js.native
  object MDCSnackbarFoundation extends js.Object {
    
    def cssClasses: CLOSING = js.native
    
    def defaultAdapter: MDCSnackbarAdapter = js.native
    
    def numbers: ARIALIVEDELAYMS = js.native
    
    def strings: ACTIONSELECTOR = js.native
  }
  
  @js.native
  class default () extends MDCSnackbarFoundation {
    def this(adapter: PartialMDCSnackbarAdapter) = this()
  }
  /* static members */
  @js.native
  object default extends js.Object {
    
    def cssClasses: CLOSING = js.native
    
    def defaultAdapter: MDCSnackbarAdapter = js.native
    
    def numbers: ARIALIVEDELAYMS = js.native
    
    def strings: ACTIONSELECTOR = js.native
  }
}
