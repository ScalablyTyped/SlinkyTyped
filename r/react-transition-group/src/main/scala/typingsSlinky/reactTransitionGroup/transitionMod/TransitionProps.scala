package typingsSlinky.reactTransitionGroup.transitionMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.reactTransitionGroup.anon.Appear
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactTransitionGroup.transitionMod.TimeoutProps[RefElement]
  - typingsSlinky.reactTransitionGroup.transitionMod.EndListenerProps[RefElement]
*/
trait TransitionProps[RefElement /* <: js.UndefOr[HTMLElement] */] extends js.Object

object TransitionProps {
  @scala.inline
  def TimeoutProps[/* <: js.UndefOr[typingsSlinky.std.HTMLElement] */ RefElement](timeout: Double | Appear): TransitionProps[RefElement] = {
    val __obj = js.Dynamic.literal(timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionProps[RefElement]]
  }
  @scala.inline
  def EndListenerProps[/* <: js.UndefOr[typingsSlinky.std.HTMLElement] */ RefElement](addEndListener: EndHandler[RefElement]): TransitionProps[RefElement] = {
    val __obj = js.Dynamic.literal(addEndListener = addEndListener.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionProps[RefElement]]
  }
}

