package typingsSlinky.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object datepickerMod {
  import typingsSlinky.baseui.Anon_Args
  import typingsSlinky.baseui.Anon_Ariadescribedby
  import typingsSlinky.baseui.Anon_Date
  import typingsSlinky.baseui.baseuiStrings.change_
  import typingsSlinky.baseui.baseuiStrings.mouseLeave
  import typingsSlinky.baseui.baseuiStrings.mouseOver
  import typingsSlinky.baseui.baseuiStrings.moveDown
  import typingsSlinky.baseui.baseuiStrings.moveLeft
  import typingsSlinky.baseui.baseuiStrings.moveRight
  import typingsSlinky.baseui.baseuiStrings.moveUp

  type DatepickerProps = CalendarProps with Anon_Ariadescribedby
  type StateReducer = js.Function3[
    /* stateType */ moveUp | mouseOver | moveLeft | moveRight | change_ | mouseLeave | moveDown, 
    /* nextState */ ContainerState, 
    /* currentState */ ContainerState, 
    ContainerState
  ]
  type StatefulDatepickerProps[T] = T with StatefulContainerProps[T] with Anon_Args[T]
  type onChange = js.Function1[/* args */ Anon_Date, js.Any]
}
