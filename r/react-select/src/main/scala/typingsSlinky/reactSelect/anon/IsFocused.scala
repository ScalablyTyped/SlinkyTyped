package typingsSlinky.reactSelect.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsFocused extends js.Object {
  var isFocused: Boolean = js.native
  var size: Double = js.native
}

object IsFocused {
  @scala.inline
  def apply(isFocused: Boolean, size: Double): IsFocused = {
    val __obj = js.Dynamic.literal(isFocused = isFocused.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsFocused]
  }
  @scala.inline
  implicit class IsFocusedOps[Self <: IsFocused] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsFocused(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFocused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

