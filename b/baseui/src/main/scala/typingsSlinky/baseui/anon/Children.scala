package typingsSlinky.baseui.anon

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Children[T] extends js.Object {
  var children: js.UndefOr[js.Function1[/* args */ T, TagMod[Any]]] = js.native
}

object Children {
  @scala.inline
  def apply[T](): Children[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Children[T]]
  }
  @scala.inline
  implicit class ChildrenOps[Self[t] <: Children[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withChildren(value: /* args */ T => TagMod[Any]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutChildren: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
  }
  
}

