package typingsSlinky.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonThemeT[T] extends js.Object {
  @JSName("$theme")
  var $theme: T = js.native
}

object AnonThemeT {
  @scala.inline
  def apply[T]($theme: T): AnonThemeT[T] = {
    val __obj = js.Dynamic.literal($theme = $theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonThemeT[T]]
  }
  @scala.inline
  implicit class AnonThemeTOps[Self[t] <: AnonThemeT[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def with$theme(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$theme")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

