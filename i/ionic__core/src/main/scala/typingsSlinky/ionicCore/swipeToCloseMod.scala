package typingsSlinky.ionicCore

import typingsSlinky.ionicCore.animationInterfaceMod.Animation
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonModalElement
import typingsSlinky.ionicCore.gestureMod.Gesture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/core/dist/types/components/modal/gestures/swipe-to-close", JSImport.Namespace)
@js.native
object swipeToCloseMod extends js.Object {
  
  def createSwipeToCloseGesture(el: HTMLIonModalElement, animation: Animation, onDismiss: js.Function0[Unit]): Gesture = js.native
  
  @js.native
  object SwipeToCloseDefaults extends js.Object {
    
    var MIN_PRESENTING_SCALE: Double = js.native
  }
}
