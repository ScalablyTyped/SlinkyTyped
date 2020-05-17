package typingsSlinky.jointjs.mod.mvc

import typingsSlinky.backbone.mod.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewOptions[T /* <: Model */]
  extends typingsSlinky.backbone.mod.ViewOptions[T] {
  var theme: js.UndefOr[String] = js.native
}

object ViewOptions {
  @scala.inline
  def apply[T](): ViewOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewOptions[T]]
  }
  @scala.inline
  implicit class ViewOptionsOps[Self[t] <: ViewOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withTheme(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
  }
  
}

