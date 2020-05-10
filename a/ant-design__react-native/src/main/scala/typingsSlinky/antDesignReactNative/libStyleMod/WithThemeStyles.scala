package typingsSlinky.antDesignReactNative.libStyleMod

import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WithThemeStyles[T] extends js.Object {
  var styles: js.UndefOr[Partial[T]] = js.native
}

object WithThemeStyles {
  @scala.inline
  def apply[T](): WithThemeStyles[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WithThemeStyles[T]]
  }
  @scala.inline
  implicit class WithThemeStylesOps[Self[t] <: WithThemeStyles[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withStyles(value: Partial[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyles: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.undefined)
        ret
    }
  }
  
}

