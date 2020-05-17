package typingsSlinky.jquery.anon

import typingsSlinky.jquery.JQuery.Event
import typingsSlinky.jquery.JQuery.SpecialEventHook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PostDispatch[TTarget]
  extends SpecialEventHook[TTarget, js.Any] {
  def postDispatch(event: Event): Unit = js.native
}

object PostDispatch {
  @scala.inline
  def apply[TTarget](postDispatch: Event => Unit): PostDispatch[TTarget] = {
    val __obj = js.Dynamic.literal(postDispatch = js.Any.fromFunction1(postDispatch))
    __obj.asInstanceOf[PostDispatch[TTarget]]
  }
  @scala.inline
  implicit class PostDispatchOps[Self[ttarget] <: PostDispatch[ttarget], TTarget] (val x: Self[TTarget]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TTarget] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TTarget]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TTarget] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TTarget] with Other]
    @scala.inline
    def withPostDispatch(value: Event => Unit): Self[TTarget] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postDispatch")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

