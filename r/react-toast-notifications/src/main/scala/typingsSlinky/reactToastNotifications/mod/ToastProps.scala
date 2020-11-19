package typingsSlinky.reactToastNotifications.mod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToastProps extends js.Object {
  
  var appearance: AppearanceTypes = js.native
  
  var autoDismiss: Boolean | Double = js.native
  
   // inherited from ToastProvider
  var autoDismissTimeout: Double = js.native
  
   // inherited from ToastProvider
  var children: ReactElement = js.native
  
  var isRunning: Boolean = js.native
  
  def onDismiss(): Unit = js.native
  def onDismiss(id: String): Unit = js.native
  
  def onMouseEnter(): Unit = js.native
  
  def onMouseLeave(): Unit = js.native
  
  var placement: Placement = js.native
  
  var transitionDuration: Double = js.native
  
   // inherited from ToastProvider
  var transitionState: TransitionState = js.native
}
