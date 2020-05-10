package typingsSlinky.reactNativeElements.mod

import typingsSlinky.reactNativeElements.RecursivePartialFullTheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThemeProps[T] extends js.Object {
  var replaceTheme: ReplaceTheme = js.native
  var theme: Theme[T] = js.native
  var updateTheme: UpdateTheme = js.native
}

object ThemeProps {
  @scala.inline
  def apply[T](
    replaceTheme: /* updates */ RecursivePartialFullTheme => Unit,
    theme: Theme[T],
    updateTheme: /* updates */ RecursivePartialFullTheme => Unit
  ): ThemeProps[T] = {
    val __obj = js.Dynamic.literal(replaceTheme = js.Any.fromFunction1(replaceTheme), theme = theme.asInstanceOf[js.Any], updateTheme = js.Any.fromFunction1(updateTheme))
    __obj.asInstanceOf[ThemeProps[T]]
  }
  @scala.inline
  implicit class ThemePropsOps[Self[t] <: ThemeProps[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withReplaceTheme(value: /* updates */ RecursivePartialFullTheme => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceTheme")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTheme(value: Theme[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateTheme(value: /* updates */ RecursivePartialFullTheme => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTheme")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

