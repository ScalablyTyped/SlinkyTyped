package typingsSlinky.reactTransitionGroup.transitionMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.react.mod.ReactNode
  - js.Function1[
/ * status * / typingsSlinky.reactTransitionGroup.transitionMod.TransitionStatus, 
typingsSlinky.react.mod.ReactNode]
*/
trait TransitionChildren extends js.Object

object TransitionChildren {
  @scala.inline
  implicit def apply(value: js.Function1[/* status */ TransitionStatus, TagMod[Any]]): TransitionChildren = value.asInstanceOf[TransitionChildren]
  @scala.inline
  implicit def apply(value: TagMod[Any]): TransitionChildren = value.asInstanceOf[TransitionChildren]
}

