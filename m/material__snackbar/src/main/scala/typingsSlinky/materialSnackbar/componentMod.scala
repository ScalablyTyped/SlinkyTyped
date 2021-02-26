package typingsSlinky.materialSnackbar

import org.scalajs.dom.raw.Element
import typingsSlinky.materialBase.componentMod.MDCComponent
import typingsSlinky.materialSnackbar.foundationMod.MDCSnackbarFoundation
import typingsSlinky.materialSnackbar.typesMod.MDCSnackbarAnnouncerFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentMod {
  
  @JSImport("@material/snackbar/component", "MDCSnackbar")
  @js.native
  class MDCSnackbar protected () extends MDCComponent[MDCSnackbarFoundation] {
    def this(root: Element, foundation: js.UndefOr[scala.Nothing], args: js.Any*) = this()
    def this(root: Element, foundation: MDCSnackbarFoundation, args: js.Any*) = this()
    
    def actionButtonText: String = js.native
    def actionButtonText_=(actionButtonText: String): Unit = js.native
    
    /**
      * @param reason Why the snackbar was closed. Value will be passed to CLOSING_EVENT and CLOSED_EVENT via the
      *     `event.detail.reason` property. Standard values are REASON_ACTION and REASON_DISMISS, but custom
      *     client-specific values may also be used if desired.
      */
    def close(): Unit = js.native
    def close(reason: String): Unit = js.native
    
    def closeOnEscape: Boolean = js.native
    def closeOnEscape_=(closeOnEscape: Boolean): Unit = js.native
    
    def initialize(): Unit = js.native
    def initialize(announcerFactory: MDCSnackbarAnnouncerFactory): Unit = js.native
    
    def isOpen: Boolean = js.native
    
    def labelText: String = js.native
    def labelText_=(labelText: String): Unit = js.native
    
    def open(): Unit = js.native
    
    def timeoutMs: Double = js.native
    def timeoutMs_=(timeoutMs: Double): Unit = js.native
  }
  /* static members */
  object MDCSnackbar {
    
    @JSImport("@material/snackbar/component", "MDCSnackbar.attachTo")
    @js.native
    def attachTo(root: Element): MDCSnackbar = js.native
  }
}
