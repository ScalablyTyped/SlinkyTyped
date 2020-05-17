package typingsSlinky.reactTransitionGroup.transitionMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.reactTransitionGroup.anon.Appear
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndListenerProps
  extends BaseTransitionProps
     with TransitionProps {
  /**
    * Add a custom transition end trigger. Called with the transitioning DOM
    * node and a done callback. Allows for more fine grained transition end
    * logic. Note: Timeouts are still used as a fallback if provided.
    */
  var addEndListener: EndHandler = js.native
  /**
    * The duration of the transition, in milliseconds. Required unless addEndListener is provided.
    *
    * You may specify a single timeout for all transitions:
    * ```js
    *   timeout={500}
    * ```
    * or individually:
    * ```js
    * timeout={{
    *  appear: 500,
    *  enter: 300,
    *  exit: 500,
    * }}
    * ```
    * - appear defaults to the value of `enter`
    * - enter defaults to `0`
    * - exit defaults to `0`
    */
  var timeout: js.UndefOr[Double | Appear] = js.native
}

object EndListenerProps {
  @scala.inline
  def apply(addEndListener: (/* node */ HTMLElement, /* done */ js.Function0[Unit]) => Unit): EndListenerProps = {
    val __obj = js.Dynamic.literal(addEndListener = js.Any.fromFunction2(addEndListener))
    __obj.asInstanceOf[EndListenerProps]
  }
  @scala.inline
  implicit class EndListenerPropsOps[Self <: EndListenerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddEndListener(value: (/* node */ HTMLElement, /* done */ js.Function0[Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addEndListener")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withTimeout(value: Double | Appear): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
  }
  
}

