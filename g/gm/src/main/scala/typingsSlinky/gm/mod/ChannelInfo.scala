package typingsSlinky.gm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelInfo[T] extends js.Object {
  var Blue: T = js.native
  var Green: T = js.native
  var Red: T = js.native
}

object ChannelInfo {
  @scala.inline
  def apply[T](Blue: T, Green: T, Red: T): ChannelInfo[T] = {
    val __obj = js.Dynamic.literal(Blue = Blue.asInstanceOf[js.Any], Green = Green.asInstanceOf[js.Any], Red = Red.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelInfo[T]]
  }
  @scala.inline
  implicit class ChannelInfoOps[Self[t] <: ChannelInfo[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withBlue(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Blue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGreen(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Green")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRed(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Red")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

