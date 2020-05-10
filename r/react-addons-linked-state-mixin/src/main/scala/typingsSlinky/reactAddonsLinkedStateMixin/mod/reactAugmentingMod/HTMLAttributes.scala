package typingsSlinky.reactAddonsLinkedStateMixin.mod.reactAugmentingMod

import typingsSlinky.reactAddonsLinkedStateMixin.mod.ReactLink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLAttributes[T] extends js.Object {
  var checkedLink: js.UndefOr[ReactLink[Boolean]] = js.native
  var valueLink: js.UndefOr[ReactLink[Boolean | String | Double]] = js.native
}

object HTMLAttributes {
  @scala.inline
  def apply[T](): HTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HTMLAttributes[T]]
  }
  @scala.inline
  implicit class HTMLAttributesOps[Self[t] <: HTMLAttributes[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withCheckedLink(value: ReactLink[Boolean]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkedLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckedLink: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkedLink")(js.undefined)
        ret
    }
    @scala.inline
    def withValueLink(value: ReactLink[Boolean | String | Double]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueLink: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueLink")(js.undefined)
        ret
    }
  }
  
}

