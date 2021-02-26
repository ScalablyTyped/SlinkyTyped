package typingsSlinky.materialDialog

import org.scalajs.dom.raw.Element
import typingsSlinky.materialBase.componentMod.MDCComponent
import typingsSlinky.materialDialog.foundationMod.MDCDialogFoundation
import typingsSlinky.materialDialog.utilMod.MDCDialogFocusTrapFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentMod {
  
  @JSImport("@material/dialog/component", "MDCDialog")
  @js.native
  class MDCDialog protected () extends MDCComponent[MDCDialogFoundation] {
    def this(root: Element, foundation: js.UndefOr[scala.Nothing], args: js.Any*) = this()
    def this(root: Element, foundation: MDCDialogFoundation, args: js.Any*) = this()
    
    def autoStackButtons: Boolean = js.native
    def autoStackButtons_=(autoStack: Boolean): Unit = js.native
    
    def close(): Unit = js.native
    def close(action: String): Unit = js.native
    
    def escapeKeyAction: String = js.native
    def escapeKeyAction_=(action: String): Unit = js.native
    
    def initialize(): Unit = js.native
    def initialize(focusTrapFactory: MDCDialogFocusTrapFactory): Unit = js.native
    
    def isOpen: Boolean = js.native
    
    def layout(): Unit = js.native
    
    def open(): Unit = js.native
    
    def scrimClickAction: String = js.native
    def scrimClickAction_=(action: String): Unit = js.native
  }
  /* static members */
  object MDCDialog {
    
    @JSImport("@material/dialog/component", "MDCDialog.attachTo")
    @js.native
    def attachTo(root: Element): MDCDialog = js.native
  }
}
