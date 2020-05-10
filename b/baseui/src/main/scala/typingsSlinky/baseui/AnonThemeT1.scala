package typingsSlinky.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonThemeT1[T1] extends js.Object {
  @JSName("$theme")
  var $theme: T1 = js.native
}

object AnonThemeT1 {
  @scala.inline
  def apply[T1]($theme: T1): AnonThemeT1[T1] = {
    val __obj = js.Dynamic.literal($theme = $theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonThemeT1[T1]]
  }
  @scala.inline
  implicit class AnonThemeT1Ops[Self[t1] <: AnonThemeT1[t1], T1] (val x: Self[T1]) extends AnyVal {
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

