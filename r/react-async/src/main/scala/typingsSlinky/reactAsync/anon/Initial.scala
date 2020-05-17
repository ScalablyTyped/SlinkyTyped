package typingsSlinky.reactAsync.anon

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.reactAsync.mod.AsyncPending
import typingsSlinky.reactAsync.mod.PendingChildren
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Initial[T] extends js.Object {
  var children: js.UndefOr[PendingChildren[T]] = js.native
  var initial: js.UndefOr[Boolean] = js.native
}

object Initial {
  @scala.inline
  def apply[T](): Initial[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Initial[T]]
  }
  @scala.inline
  implicit class InitialOps[Self[t] <: Initial[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withChildrenReactElement(value: ReactElement): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildrenFunction1(value: /* state */ AsyncPending[T] => TagMod[Any]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withChildren(value: PendingChildren[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withInitial(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitial: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initial")(js.undefined)
        ret
    }
  }
  
}

