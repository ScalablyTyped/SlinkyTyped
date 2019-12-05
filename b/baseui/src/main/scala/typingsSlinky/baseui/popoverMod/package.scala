package typingsSlinky.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object popoverMod {
  import typingsSlinky.baseui.Anon_ArgsChildren
  import typingsSlinky.baseui.Anon_ChildrenContent
  import typingsSlinky.baseui.Anon_ChildrenProps
  import typingsSlinky.baseui.baseuiNumbers.`0`
  import typingsSlinky.baseui.baseuiNumbers.`20`
  import typingsSlinky.baseui.baseuiStrings.close
  import typingsSlinky.baseui.baseuiStrings.open

  type ANIMATE_IN_TIME = `20`
  type ANIMATE_OUT_TIME = `0`
  type PopoverProps = BasePopoverProps with Anon_ChildrenContent
  type StateReducer = js.Function3[
    /* stateChangeType */ open | close, 
    /* nextState */ State, 
    /* currentState */ State, 
    State
  ]
  type StatefulPopoverContainerProps = StatefulPopoverProps with Anon_ChildrenProps
  type StatefulPopoverProps = BasePopoverProps with Anon_ArgsChildren
}
