package typingsSlinky.reactNativeDrawerLayout.anon

import typingsSlinky.reactNativeDrawerLayout.reactNativeDrawerLayoutStrings.left
import typingsSlinky.reactNativeDrawerLayout.reactNativeDrawerLayoutStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Left extends js.Object {
  var Left: left = js.native
  var Right: right = js.native
}

object Left {
  @scala.inline
  def apply(Left: left, Right: right): Left = {
    val __obj = js.Dynamic.literal(Left = Left.asInstanceOf[js.Any], Right = Right.asInstanceOf[js.Any])
    __obj.asInstanceOf[Left]
  }
  @scala.inline
  implicit class LeftOps[Self <: Left] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLeft(value: left): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRight(value: right): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Right")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

