package typingsSlinky.emberRouting.transitionMod

import typingsSlinky.emberRouting.routeInfoMod.RouteInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transition extends js.Object {
  /**
    * This property is a `RouteInfo` object that represents where transition originated from.
    * It's important to note that a `RouteInfo` is a linked list and this property is simply the head node of the list.
    * In the case of an initial render, `from` will be set to `null`.
    */
  val from: RouteInfo | Null = js.native
  /**
    * This property is a `RouteInfo` object that represents where the router is transitioning to.
    * It's important to note that a `RouteInfo` is a linked list and this property is simply the leafmost route.
    */
  val to: RouteInfo = js.native
  /**
    * Aborts the Transition. Note you can also implicitly abort a transition
    * by initiating another transition while a previous one is underway.
    */
  def abort(): Transition = js.native
  /**
    * Retries a previously-aborted transition (making sure to abort the
    * transition if it's still active). Returns a new transition that
    * represents the new attempt to transition.
    */
  def retry(): Transition = js.native
}

object Transition {
  @scala.inline
  def apply(abort: () => Transition, retry: () => Transition, to: RouteInfo): Transition = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), retry = js.Any.fromFunction0(retry), to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transition]
  }
  @scala.inline
  implicit class TransitionOps[Self <: Transition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbort(value: () => Transition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abort")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRetry(value: () => Transition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retry")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTo(value: RouteInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrom(value: RouteInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFromNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(null)
        ret
    }
  }
  
}

