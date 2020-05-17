package typingsSlinky.antd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Gutter extends js.Object {
  var gutter: Double = js.native
}

object Gutter {
  @scala.inline
  def apply(gutter: Double): Gutter = {
    val __obj = js.Dynamic.literal(gutter = gutter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Gutter]
  }
  @scala.inline
  implicit class GutterOps[Self <: Gutter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGutter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gutter")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

