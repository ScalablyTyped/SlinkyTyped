package typingsSlinky.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object accordionMod {
  type StateReducer[T] = js.Function3[typingsSlinky.baseui.baseuiStrings.expand, /* nextState */ T, /* currentState */ T, T]
  type StatefulPanelProps = typingsSlinky.baseui.accordionMod.SharedPanelProps with typingsSlinky.baseui.accordionMod.SharedStatefulPanelContainerProps
}
