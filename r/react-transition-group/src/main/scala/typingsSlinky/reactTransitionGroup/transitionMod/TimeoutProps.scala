package typingsSlinky.reactTransitionGroup.transitionMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.reactTransitionGroup.AnonAppear
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeoutProps
  extends BaseTransitionProps
     with TransitionProps {
  /**
    * Add a custom transition end trigger. Called with the transitioning DOM
    * node and a done callback. Allows for more fine grained transition end
    * logic. Note: Timeouts are still used as a fallback if provided.
    */
  var addEndListener: js.UndefOr[EndHandler] = js.native
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
  var timeout: Double | AnonAppear = js.native
}

object TimeoutProps {
  @scala.inline
  def apply(timeout: Double | AnonAppear): TimeoutProps = {
    val __obj = js.Dynamic.literal(timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeoutProps]
  }
  @scala.inline
  implicit class TimeoutPropsOps[Self <: TimeoutProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTimeout(value: Double | AnonAppear): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddEndListener(value: (/* node */ HTMLElement, /* done */ js.Function0[Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addEndListener")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAddEndListener: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addEndListener")(js.undefined)
        ret
    }
  }
  
}

