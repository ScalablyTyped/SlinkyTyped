package typingsSlinky.egjsAxes

import typingsSlinky.egjsAxes.anon.DestPos
import typingsSlinky.egjsAxes.axesMod.AxesOption
import typingsSlinky.egjsAxes.axisManagerMod.Axis
import typingsSlinky.egjsAxes.axisManagerMod.AxisManager
import typingsSlinky.egjsAxes.eventManagerMod.EventManager
import typingsSlinky.egjsAxes.interruptManagerMod.InterruptManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object animationManagerMod {
  
  @JSImport("@egjs/axes/AnimationManager", "AnimationManager")
  @js.native
  class AnimationManager protected () extends StObject {
    def this(options: AxesOption, itm: InterruptManager, em: EventManager, axm: AxisManager) = this()
    
    var _animateParam: js.Any = js.native
    
    var _raf: js.Any = js.native
    
    /* private */ def animateLoop(param: js.Any, complete: js.Any): js.Any = js.native
    
    def animateTo(destPos: Axis, duration: Double): Unit = js.native
    def animateTo(destPos: Axis, duration: Double, inputEvent: js.Any): Unit = js.native
    
    def animationEnd(): Unit = js.native
    
    var axm: js.Any = js.native
    
    /* private */ def createAnimationParam(pos: js.Any, duration: js.Any, inputEvent: js.Any): js.Any = js.native
    
    def easing(p: js.Any): Double = js.native
    
    var em: js.Any = js.native
    
    /* private */ def frame(param: js.Any): js.Any = js.native
    
    def getDuration(depaPos: Axis, destPos: Axis): Double = js.native
    def getDuration(depaPos: Axis, destPos: Axis, wishDuration: Double): Double = js.native
    
    def getUserControll(param: AnimationParam): DestPos = js.native
    
    def grab(axes: js.Array[String]): Unit = js.native
    def grab(axes: js.Array[String], event: js.Any): Unit = js.native
    
    var itm: js.Any = js.native
    
    var options: js.Any = js.native
    
    def restore(): Unit = js.native
    def restore(inputEvent: js.Any): Unit = js.native
    
    def setBy(pos: Axis): this.type = js.native
    def setBy(pos: Axis, duration: Double): this.type = js.native
    
    def setTo(pos: Axis): this.type = js.native
    def setTo(pos: Axis, duration: Double): this.type = js.native
  }
  /* static members */
  object AnimationManager {
    
    @JSImport("@egjs/axes/AnimationManager", "AnimationManager.getDuration")
    @js.native
    def getDuration(duration: Double, min: Double, max: Double): Double = js.native
  }
  
  @js.native
  trait AnimationParam extends StObject {
    
    var delta: Axis = js.native
    
    var depaPos: Axis = js.native
    
    var destPos: Axis = js.native
    
    var done: js.UndefOr[js.Function0[Unit]] = js.native
    
    var duration: Double = js.native
    
    var inputEvent: js.UndefOr[js.Any] = js.native
    
    var setTo: js.UndefOr[
        js.Function2[/* destPos */ js.UndefOr[Axis], /* duration */ js.UndefOr[Double], DestPos]
      ] = js.native
    
    var startTime: js.UndefOr[Double] = js.native
  }
  object AnimationParam {
    
    @scala.inline
    def apply(delta: Axis, depaPos: Axis, destPos: Axis, duration: Double): AnimationParam = {
      val __obj = js.Dynamic.literal(delta = delta.asInstanceOf[js.Any], depaPos = depaPos.asInstanceOf[js.Any], destPos = destPos.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnimationParam]
    }
    
    @scala.inline
    implicit class AnimationParamMutableBuilder[Self <: AnimationParam] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelta(value: Axis): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDepaPos(value: Axis): Self = StObject.set(x, "depaPos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestPos(value: Axis): Self = StObject.set(x, "destPos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDone(value: () => Unit): Self = StObject.set(x, "done", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputEvent(value: js.Any): Self = StObject.set(x, "inputEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputEventUndefined: Self = StObject.set(x, "inputEvent", js.undefined)
      
      @scala.inline
      def setSetTo(value: (/* destPos */ js.UndefOr[Axis], /* duration */ js.UndefOr[Double]) => DestPos): Self = StObject.set(x, "setTo", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetToUndefined: Self = StObject.set(x, "setTo", js.undefined)
      
      @scala.inline
      def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    }
  }
}
