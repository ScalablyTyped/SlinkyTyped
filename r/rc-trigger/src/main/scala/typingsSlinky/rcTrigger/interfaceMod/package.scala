package typingsSlinky.rcTrigger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object interfaceMod {
  type ActionType = java.lang.String
  type AlignPoint = java.lang.String
  type AnimationType = java.lang.String
  type BuildInPlacements = org.scalablytyped.runtime.StringDictionary[typingsSlinky.rcTrigger.interfaceMod.AlignType]
  type CSSMotionClass = slinky.core.ReactComponentClass[typingsSlinky.rcTrigger.interfaceMod.MotionProps]
  type MotionEventHandler = js.Function2[
    /* element */ org.scalajs.dom.raw.HTMLElement, 
    /* event */ js.UndefOr[
      slinky.web.SyntheticTransitionEvent[org.scalajs.dom.raw.HTMLElement] | slinky.web.SyntheticAnimationEvent[org.scalajs.dom.raw.HTMLElement]
    ], 
    js.UndefOr[
      typingsSlinky.react.mod.CSSProperties | typingsSlinky.rcTrigger.rcTriggerBooleans.`false` | scala.Null | scala.Unit
    ]
  ]
  type StretchType = java.lang.String
  type TransitionNameType = java.lang.String
}
