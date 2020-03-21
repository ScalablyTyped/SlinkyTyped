package typingsSlinky.reduxAuthWrapper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AuthWrapperDecorator[Props] = js.Function1[
    /* component */ slinky.core.ReactComponentClass[Props], 
    slinky.core.ReactComponentClass[Props]
  ]
  type StateSelector[State, OwnProps, R] = js.Function2[/* state */ State, /* props */ OwnProps, R]
}
