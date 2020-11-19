package typingsSlinky.baseui.modalMod

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.KeyboardEvent
import slinky.core.facade.ReactElement
import typingsSlinky.baseui.anon.SharedStylePropsArgchildrAnimate
import typingsSlinky.baseui.baseuiStrings.backdrop
import typingsSlinky.baseui.baseuiStrings.closeButton
import typingsSlinky.baseui.baseuiStrings.escape_
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("baseui/modal", "Modal")
@js.native
class Modal ()
  extends Component[ModalProps, ModalState, js.Any] {
  
  def addDomEvents(): Unit = js.native
  
  def animateOutComplete(): Unit = js.native
  
  def autoFocus(): Unit = js.native
  
  def captureLastFocus(): Unit = js.native
  
  def clearTimers(): Unit = js.native
  
  def didClose(): Unit = js.native
  
  def didOpen(): Unit = js.native
  
  def disableMountNodeScroll(): Unit = js.native
  
  def getChildren(): ReactElement = js.native
  
  def getMountNode(): HTMLElement = js.native
  
  def getRef(component: String): Ref[_] = js.native
  
  def getSharedProps(): SharedStylePropsArgchildrAnimate = js.native
  
  def onBackdropClick(): Unit = js.native
  
  def onCloseClick(): Unit = js.native
  
  def onDocumentKeyPress(event: KeyboardEvent): Unit = js.native
  
  def removeDomEvents(): Unit = js.native
  
  def renderModal(): ReactElement = js.native
  
  def resentMountNodeScroll(): Unit = js.native
  
  def restoreLastFocus(): Unit = js.native
  
  @JSName("triggerClose")
  def triggerClose_backdrop(source: backdrop): Unit = js.native
  @JSName("triggerClose")
  def triggerClose_closeButton(source: closeButton): Unit = js.native
  @JSName("triggerClose")
  def triggerClose_escape(source: escape_): Unit = js.native
}
