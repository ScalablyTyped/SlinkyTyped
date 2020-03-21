package typingsSlinky.reduxSagaRoutines.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reduxSagaRoutines.reduxSagaRoutinesStrings.TRIGGER
  - typingsSlinky.reduxSagaRoutines.reduxSagaRoutinesStrings.REQUEST
  - typingsSlinky.reduxSagaRoutines.reduxSagaRoutinesStrings.SUCCESS
  - typingsSlinky.reduxSagaRoutines.reduxSagaRoutinesStrings.FAILURE
  - typingsSlinky.reduxSagaRoutines.reduxSagaRoutinesStrings.FULFILL
*/
trait RoutineStages extends js.Object

object RoutineStages {
  @scala.inline
  def FAILURE: typingsSlinky.reduxSagaRoutines.reduxSagaRoutinesStrings.FAILURE = this.cast("FAILURE")
  @scala.inline
  def FULFILL: typingsSlinky.reduxSagaRoutines.reduxSagaRoutinesStrings.FULFILL = this.cast("FULFILL")
  @scala.inline
  def REQUEST: typingsSlinky.reduxSagaRoutines.reduxSagaRoutinesStrings.REQUEST = this.cast("REQUEST")
  @scala.inline
  def SUCCESS: typingsSlinky.reduxSagaRoutines.reduxSagaRoutinesStrings.SUCCESS = this.cast("SUCCESS")
  @scala.inline
  def TRIGGER: typingsSlinky.reduxSagaRoutines.reduxSagaRoutinesStrings.TRIGGER = this.cast("TRIGGER")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

