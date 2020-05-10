package typingsSlinky.reactFa.mod

import typingsSlinky.react.mod.AllHTMLAttributes
import typingsSlinky.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// fake intermediate interface to remove typing on size, as the typing
// is overrided by react-fa
@js.native
trait SizeOverrideHTMLProps[T]
  extends AllHTMLAttributes[T]
     with ClassAttributes[T] {
  @JSName("size")
  var size_SizeOverrideHTMLProps: js.UndefOr[js.Any] = js.native
}

object SizeOverrideHTMLProps {
  @scala.inline
  def apply[T](): SizeOverrideHTMLProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SizeOverrideHTMLProps[T]]
  }
  @scala.inline
  implicit class SizeOverrideHTMLPropsOps[Self[t] <: SizeOverrideHTMLProps[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withSize(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
  }
  
}

