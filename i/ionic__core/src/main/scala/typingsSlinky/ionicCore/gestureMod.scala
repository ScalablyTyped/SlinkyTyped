package typingsSlinky.ionicCore

import org.scalajs.dom.raw.Node
import org.scalajs.dom.raw.UIEvent
import typingsSlinky.ionicCore.gestureControllerMod.GestureController
import typingsSlinky.ionicCore.ionicCoreStrings.x
import typingsSlinky.ionicCore.ionicCoreStrings.y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gestureMod {
  
  @JSImport("@ionic/core/dist/types/utils/gesture", "GESTURE_CONTROLLER")
  @js.native
  val GESTURE_CONTROLLER: GestureController = js.native
  
  @JSImport("@ionic/core/dist/types/utils/gesture", "createGesture")
  @js.native
  def createGesture(config: GestureConfig): Gesture = js.native
  
  @js.native
  trait Gesture extends StObject {
    
    def destroy(): Unit = js.native
    
    def enable(): Unit = js.native
    def enable(enable: Boolean): Unit = js.native
  }
  
  type GestureCallback = js.Function1[/* detail */ GestureDetail, Boolean | Unit]
  
  @js.native
  trait GestureConfig extends StObject {
    
    var blurOnStart: js.UndefOr[Boolean] = js.native
    
    var canStart: js.UndefOr[GestureCallback] = js.native
    
    var direction: js.UndefOr[x | y] = js.native
    
    var disableScroll: js.UndefOr[Boolean] = js.native
    
    var el: Node = js.native
    
    var gestureName: String = js.native
    
    var gesturePriority: js.UndefOr[Double] = js.native
    
    var maxAngle: js.UndefOr[Double] = js.native
    
    var notCaptured: js.UndefOr[GestureCallback] = js.native
    
    var onEnd: js.UndefOr[GestureCallback] = js.native
    
    var onMove: js.UndefOr[GestureCallback] = js.native
    
    var onStart: js.UndefOr[GestureCallback] = js.native
    
    var onWillStart: js.UndefOr[js.Function1[/* _ */ GestureDetail, js.Promise[Unit]]] = js.native
    
    var passive: js.UndefOr[Boolean] = js.native
    
    var threshold: js.UndefOr[Double] = js.native
  }
  object GestureConfig {
    
    @scala.inline
    def apply(el: Node, gestureName: String): GestureConfig = {
      val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any], gestureName = gestureName.asInstanceOf[js.Any])
      __obj.asInstanceOf[GestureConfig]
    }
    
    @scala.inline
    implicit class GestureConfigMutableBuilder[Self <: GestureConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlurOnStart(value: Boolean): Self = StObject.set(x, "blurOnStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlurOnStartUndefined: Self = StObject.set(x, "blurOnStart", js.undefined)
      
      @scala.inline
      def setCanStart(value: /* detail */ GestureDetail => Boolean | Unit): Self = StObject.set(x, "canStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCanStartUndefined: Self = StObject.set(x, "canStart", js.undefined)
      
      @scala.inline
      def setDirection(value: typingsSlinky.ionicCore.ionicCoreStrings.x | y): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setDisableScroll(value: Boolean): Self = StObject.set(x, "disableScroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableScrollUndefined: Self = StObject.set(x, "disableScroll", js.undefined)
      
      @scala.inline
      def setEl(value: Node): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGestureName(value: String): Self = StObject.set(x, "gestureName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGesturePriority(value: Double): Self = StObject.set(x, "gesturePriority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGesturePriorityUndefined: Self = StObject.set(x, "gesturePriority", js.undefined)
      
      @scala.inline
      def setMaxAngle(value: Double): Self = StObject.set(x, "maxAngle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAngleUndefined: Self = StObject.set(x, "maxAngle", js.undefined)
      
      @scala.inline
      def setNotCaptured(value: /* detail */ GestureDetail => Boolean | Unit): Self = StObject.set(x, "notCaptured", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNotCapturedUndefined: Self = StObject.set(x, "notCaptured", js.undefined)
      
      @scala.inline
      def setOnEnd(value: /* detail */ GestureDetail => Boolean | Unit): Self = StObject.set(x, "onEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEndUndefined: Self = StObject.set(x, "onEnd", js.undefined)
      
      @scala.inline
      def setOnMove(value: /* detail */ GestureDetail => Boolean | Unit): Self = StObject.set(x, "onMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMoveUndefined: Self = StObject.set(x, "onMove", js.undefined)
      
      @scala.inline
      def setOnStart(value: /* detail */ GestureDetail => Boolean | Unit): Self = StObject.set(x, "onStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
      
      @scala.inline
      def setOnWillStart(value: /* _ */ GestureDetail => js.Promise[Unit]): Self = StObject.set(x, "onWillStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnWillStartUndefined: Self = StObject.set(x, "onWillStart", js.undefined)
      
      @scala.inline
      def setPassive(value: Boolean): Self = StObject.set(x, "passive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassiveUndefined: Self = StObject.set(x, "passive", js.undefined)
      
      @scala.inline
      def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
    }
  }
  
  @js.native
  trait GestureDetail extends StObject {
    
    var currentTime: Double = js.native
    
    var currentX: Double = js.native
    
    var currentY: Double = js.native
    
    var data: js.UndefOr[js.Any] = js.native
    
    var deltaX: Double = js.native
    
    var deltaY: Double = js.native
    
    var event: UIEvent = js.native
    
    var startTime: Double = js.native
    
    var startX: Double = js.native
    
    var startY: Double = js.native
    
    var `type`: String = js.native
    
    var velocityX: Double = js.native
    
    var velocityY: Double = js.native
  }
  object GestureDetail {
    
    @scala.inline
    def apply(
      currentTime: Double,
      currentX: Double,
      currentY: Double,
      deltaX: Double,
      deltaY: Double,
      event: UIEvent,
      startTime: Double,
      startX: Double,
      startY: Double,
      `type`: String,
      velocityX: Double,
      velocityY: Double
    ): GestureDetail = {
      val __obj = js.Dynamic.literal(currentTime = currentTime.asInstanceOf[js.Any], currentX = currentX.asInstanceOf[js.Any], currentY = currentY.asInstanceOf[js.Any], deltaX = deltaX.asInstanceOf[js.Any], deltaY = deltaY.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], startX = startX.asInstanceOf[js.Any], startY = startY.asInstanceOf[js.Any], velocityX = velocityX.asInstanceOf[js.Any], velocityY = velocityY.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[GestureDetail]
    }
    
    @scala.inline
    implicit class GestureDetailMutableBuilder[Self <: GestureDetail] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrentTime(value: Double): Self = StObject.set(x, "currentTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentX(value: Double): Self = StObject.set(x, "currentX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentY(value: Double): Self = StObject.set(x, "currentY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setDeltaX(value: Double): Self = StObject.set(x, "deltaX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeltaY(value: Double): Self = StObject.set(x, "deltaY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEvent(value: UIEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartX(value: Double): Self = StObject.set(x, "startX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartY(value: Double): Self = StObject.set(x, "startY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVelocityX(value: Double): Self = StObject.set(x, "velocityX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVelocityY(value: Double): Self = StObject.set(x, "velocityY", value.asInstanceOf[js.Any])
    }
  }
}
