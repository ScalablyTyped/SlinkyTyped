package typingsSlinky.reduxActions.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reduxActions.mod.Reducer[State, Payload]
  - typingsSlinky.reduxActions.mod.ReducerNextThrow[State, Payload]
  - typingsSlinky.reduxActions.mod.ReducerMap[State, Payload]
*/
trait ReducerMapValue[State, Payload] extends js.Object

object ReducerMapValue {
  @scala.inline
  implicit def apply[State, Payload](value: Reducer[State, Payload]): ReducerMapValue[State, Payload] = value.asInstanceOf[ReducerMapValue[State, Payload]]
  @scala.inline
  implicit def apply[State, Payload](value: ReducerMap[State, Payload]): ReducerMapValue[State, Payload] = value.asInstanceOf[ReducerMapValue[State, Payload]]
  @scala.inline
  implicit def apply[State, Payload](value: ReducerNextThrow[State, Payload]): ReducerMapValue[State, Payload] = value.asInstanceOf[ReducerMapValue[State, Payload]]
}

