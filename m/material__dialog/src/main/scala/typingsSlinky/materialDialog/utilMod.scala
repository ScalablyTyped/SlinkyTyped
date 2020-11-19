package typingsSlinky.materialDialog

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.materialDom.focusTrapMod.FocusOptions
import typingsSlinky.materialDom.focusTrapMod.FocusTrap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/dialog/util", JSImport.Namespace)
@js.native
object utilMod extends js.Object {
  
  def areTopsMisaligned(els: js.Array[HTMLElement]): Boolean = js.native
  
  def createFocusTrapInstance(surfaceEl: HTMLElement, focusTrapFactory: MDCDialogFocusTrapFactory): FocusTrap = js.native
  def createFocusTrapInstance(surfaceEl: HTMLElement, focusTrapFactory: MDCDialogFocusTrapFactory, initialFocusEl: HTMLElement): FocusTrap = js.native
  
  def isScrollable(): Boolean = js.native
  def isScrollable(el: HTMLElement): Boolean = js.native
  
  type MDCDialogFocusTrapFactory = js.Function2[/* element */ HTMLElement, /* options */ FocusOptions, FocusTrap]
}
