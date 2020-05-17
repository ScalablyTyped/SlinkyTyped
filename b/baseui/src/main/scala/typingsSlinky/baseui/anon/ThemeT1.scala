package typingsSlinky.baseui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThemeT1[T1] extends js.Object {
  @JSName("$theme")
  var $theme: T1 = js.native
}

object ThemeT1 {
  @scala.inline
  def apply[T1]($theme: T1): ThemeT1[T1] = {
    val __obj = js.Dynamic.literal($theme = $theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeT1[T1]]
  }
  @scala.inline
  implicit class ThemeT1Ops[Self[t1] <: ThemeT1[t1], T1] (val x: Self[T1]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T1] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T1]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T1] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T1] with Other]
    @scala.inline
    def with$theme(value: T1): Self[T1] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$theme")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

