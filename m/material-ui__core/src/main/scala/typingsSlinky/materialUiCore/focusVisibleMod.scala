package typingsSlinky.materialUiCore

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Window
import typingsSlinky.materialUiCore.anon.FocusVisibleCheckTime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object focusVisibleMod {
  
  @JSImport("@material-ui/core/ButtonBase/focusVisible", "detectFocusVisible")
  @js.native
  def detectFocusVisible(instance: FocusVisibleCheckTime, element: Element, cb: js.Function0[Unit], attempt: Double): Unit = js.native
  
  @JSImport("@material-ui/core/ButtonBase/focusVisible", "focusKeyPressed")
  @js.native
  def focusKeyPressed(pressed: Boolean): Boolean = js.native
  
  @JSImport("@material-ui/core/ButtonBase/focusVisible", "listenForFocusKeys")
  @js.native
  def listenForFocusKeys(window: Window): Unit = js.native
}
