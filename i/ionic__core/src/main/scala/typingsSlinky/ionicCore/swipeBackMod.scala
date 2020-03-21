package typingsSlinky.ionicCore

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.ionicCore.gestureMod.Gesture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/utils/gesture/swipe-back", JSImport.Namespace)
@js.native
object swipeBackMod extends js.Object {
  def createSwipeBackGesture(
    el: HTMLElement,
    canStartHandler: js.Function0[Boolean],
    onStartHandler: js.Function0[Unit],
    onMoveHandler: js.Function1[/* step */ Double, Unit],
    onEndHandler: js.Function3[/* shouldComplete */ Boolean, /* step */ Double, /* dur */ Double, Unit]
  ): Gesture = js.native
}

