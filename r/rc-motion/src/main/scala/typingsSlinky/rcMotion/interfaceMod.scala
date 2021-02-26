package typingsSlinky.rcMotion

import org.scalajs.dom.raw.AnimationEvent
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.TransitionEvent
import typingsSlinky.rcMotion.anon.Deadline
import typingsSlinky.rcMotion.rcMotionStrings.active
import typingsSlinky.rcMotion.rcMotionStrings.appear
import typingsSlinky.rcMotion.rcMotionStrings.end
import typingsSlinky.rcMotion.rcMotionStrings.enter
import typingsSlinky.rcMotion.rcMotionStrings.leave
import typingsSlinky.rcMotion.rcMotionStrings.none
import typingsSlinky.rcMotion.rcMotionStrings.prepare
import typingsSlinky.rcMotion.rcMotionStrings.start
import typingsSlinky.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfaceMod {
  
  @JSImport("rc-motion/es/interface", "STATUS_APPEAR")
  @js.native
  val STATUS_APPEAR: appear = js.native
  
  @JSImport("rc-motion/es/interface", "STATUS_ENTER")
  @js.native
  val STATUS_ENTER: enter = js.native
  
  @JSImport("rc-motion/es/interface", "STATUS_LEAVE")
  @js.native
  val STATUS_LEAVE: leave = js.native
  
  @JSImport("rc-motion/es/interface", "STATUS_NONE")
  @js.native
  val STATUS_NONE: none = js.native
  
  @JSImport("rc-motion/es/interface", "STEP_ACTIVATED")
  @js.native
  val STEP_ACTIVATED: end = js.native
  
  @JSImport("rc-motion/es/interface", "STEP_ACTIVE")
  @js.native
  val STEP_ACTIVE: active = js.native
  
  @JSImport("rc-motion/es/interface", "STEP_NONE")
  @js.native
  val STEP_NONE: none = js.native
  
  @JSImport("rc-motion/es/interface", "STEP_PREPARE")
  @js.native
  val STEP_PREPARE: prepare = js.native
  
  @JSImport("rc-motion/es/interface", "STEP_START")
  @js.native
  val STEP_START: start = js.native
  
  type MotionEndEventHandler = js.Function2[/* element */ HTMLElement, /* event */ MotionEvent, Boolean | Unit]
  
  type MotionEvent = (TransitionEvent | AnimationEvent) with Deadline
  
  type MotionEventHandler = js.Function2[/* element */ HTMLElement, /* event */ MotionEvent, CSSProperties | Unit]
  
  type MotionPrepareEventHandler = js.Function1[/* element */ HTMLElement, js.Promise[js.Any] | Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.rcMotion.rcMotionStrings.none
    - typingsSlinky.rcMotion.rcMotionStrings.appear
    - typingsSlinky.rcMotion.rcMotionStrings.enter
    - typingsSlinky.rcMotion.rcMotionStrings.leave
  */
  trait MotionStatus extends StObject
  object MotionStatus {
    
    @scala.inline
    def appear: typingsSlinky.rcMotion.rcMotionStrings.appear = "appear".asInstanceOf[typingsSlinky.rcMotion.rcMotionStrings.appear]
    
    @scala.inline
    def enter: typingsSlinky.rcMotion.rcMotionStrings.enter = "enter".asInstanceOf[typingsSlinky.rcMotion.rcMotionStrings.enter]
    
    @scala.inline
    def leave: typingsSlinky.rcMotion.rcMotionStrings.leave = "leave".asInstanceOf[typingsSlinky.rcMotion.rcMotionStrings.leave]
    
    @scala.inline
    def none: typingsSlinky.rcMotion.rcMotionStrings.none = "none".asInstanceOf[typingsSlinky.rcMotion.rcMotionStrings.none]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.rcMotion.rcMotionStrings.none
    - typingsSlinky.rcMotion.rcMotionStrings.prepare
    - typingsSlinky.rcMotion.rcMotionStrings.start
    - typingsSlinky.rcMotion.rcMotionStrings.active
    - typingsSlinky.rcMotion.rcMotionStrings.end
  */
  trait StepStatus extends StObject
  object StepStatus {
    
    @scala.inline
    def active: typingsSlinky.rcMotion.rcMotionStrings.active = "active".asInstanceOf[typingsSlinky.rcMotion.rcMotionStrings.active]
    
    @scala.inline
    def end: typingsSlinky.rcMotion.rcMotionStrings.end = "end".asInstanceOf[typingsSlinky.rcMotion.rcMotionStrings.end]
    
    @scala.inline
    def none: typingsSlinky.rcMotion.rcMotionStrings.none = "none".asInstanceOf[typingsSlinky.rcMotion.rcMotionStrings.none]
    
    @scala.inline
    def prepare: typingsSlinky.rcMotion.rcMotionStrings.prepare = "prepare".asInstanceOf[typingsSlinky.rcMotion.rcMotionStrings.prepare]
    
    @scala.inline
    def start: typingsSlinky.rcMotion.rcMotionStrings.start = "start".asInstanceOf[typingsSlinky.rcMotion.rcMotionStrings.start]
  }
}
