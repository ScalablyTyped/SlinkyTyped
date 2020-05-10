package typingsSlinky.reactTransitionGroup.transitionMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.reactTransitionGroup.AnonAppear
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactTransitionGroup.transitionMod.TimeoutProps
  - typingsSlinky.reactTransitionGroup.transitionMod.EndListenerProps
*/
trait TransitionProps extends js.Object

object TransitionProps {
  @scala.inline
  def TimeoutProps(timeout: Double | AnonAppear): TransitionProps = {
    val __obj = js.Dynamic.literal(timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionProps]
  }
  @scala.inline
  def EndListenerProps(addEndListener: (/* node */ HTMLElement, /* done */ js.Function0[Unit]) => Unit): TransitionProps = {
    val __obj = js.Dynamic.literal(addEndListener = js.Any.fromFunction2(addEndListener))
    __obj.asInstanceOf[TransitionProps]
  }
}

