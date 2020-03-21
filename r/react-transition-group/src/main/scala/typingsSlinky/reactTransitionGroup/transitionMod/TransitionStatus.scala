package typingsSlinky.reactTransitionGroup.transitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactTransitionGroup.reactTransitionGroupStrings.entering
  - typingsSlinky.reactTransitionGroup.reactTransitionGroupStrings.entered
  - typingsSlinky.reactTransitionGroup.reactTransitionGroupStrings.exiting
  - typingsSlinky.reactTransitionGroup.reactTransitionGroupStrings.exited
  - typingsSlinky.reactTransitionGroup.reactTransitionGroupStrings.unmounted
*/
trait TransitionStatus extends js.Object

object TransitionStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def entered: typingsSlinky.reactTransitionGroup.reactTransitionGroupStrings.entered = this.cast("entered")
  @scala.inline
  def entering: typingsSlinky.reactTransitionGroup.reactTransitionGroupStrings.entering = this.cast("entering")
  @scala.inline
  def exited: typingsSlinky.reactTransitionGroup.reactTransitionGroupStrings.exited = this.cast("exited")
  @scala.inline
  def exiting: typingsSlinky.reactTransitionGroup.reactTransitionGroupStrings.exiting = this.cast("exiting")
  @scala.inline
  def unmounted: typingsSlinky.reactTransitionGroup.reactTransitionGroupStrings.unmounted = this.cast("unmounted")
}

