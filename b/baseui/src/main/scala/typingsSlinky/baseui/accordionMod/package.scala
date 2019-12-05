package typingsSlinky.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object accordionMod {
  import typingsSlinky.baseui.Anon_Children
  import typingsSlinky.baseui.Anon_ExpandedBooleanOptional
  import typingsSlinky.baseui.baseuiStrings.expand

  type PanelProps = SharedPanelProps with Anon_ExpandedBooleanOptional
  type StateReducer[T] = js.Function3[expand, /* nextState */ T, /* currentState */ T, T]
  type StatefulPanelContainerProps = SharedStatefulPanelContainerProps with Anon_Children
  type StatefulPanelProps = SharedPanelProps with SharedStatefulPanelContainerProps
}
