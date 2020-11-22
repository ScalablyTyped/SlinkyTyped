package typingsSlinky.rcMotion

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object interfaceMod {
  
  type MotionEndEventHandler = js.Function2[
    /* element */ org.scalajs.dom.raw.HTMLElement, 
    /* event */ typingsSlinky.rcMotion.interfaceMod.MotionEvent, 
    scala.Boolean | scala.Unit
  ]
  
  type MotionEvent = (org.scalajs.dom.raw.TransitionEvent | org.scalajs.dom.raw.AnimationEvent) with typingsSlinky.rcMotion.anon.Deadline
  
  type MotionEventHandler = js.Function2[
    /* element */ org.scalajs.dom.raw.HTMLElement, 
    /* event */ typingsSlinky.rcMotion.interfaceMod.MotionEvent, 
    typingsSlinky.react.mod.CSSProperties | scala.Unit
  ]
  
  type MotionPrepareEventHandler = js.Function1[/* element */ org.scalajs.dom.raw.HTMLElement, js.Promise[js.Any] | scala.Unit]
}
