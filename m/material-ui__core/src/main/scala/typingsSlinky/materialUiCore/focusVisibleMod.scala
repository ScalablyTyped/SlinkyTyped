package typingsSlinky.materialUiCore

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Window
import typingsSlinky.materialUiCore.anon.FocusVisibleCheckTime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material-ui/core/ButtonBase/focusVisible", JSImport.Namespace)
@js.native
object focusVisibleMod extends js.Object {
  
  def detectFocusVisible(instance: FocusVisibleCheckTime, element: Element, cb: js.Function0[Unit], attempt: Double): Unit = js.native
  
  def focusKeyPressed(pressed: Boolean): Boolean = js.native
  
  def listenForFocusKeys(window: Window): Unit = js.native
}
