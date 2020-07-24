package typingsSlinky.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object motionMod {
  type MotionEndFunc = js.Function2[
    /* element */ org.scalajs.dom.raw.HTMLElement, 
    /* event */ org.scalajs.dom.raw.TransitionEvent, 
    scala.Boolean
  ]
  type MotionFunc = js.Function1[
    /* element */ org.scalajs.dom.raw.HTMLElement, 
    typingsSlinky.react.mod.CSSProperties
  ]
}
