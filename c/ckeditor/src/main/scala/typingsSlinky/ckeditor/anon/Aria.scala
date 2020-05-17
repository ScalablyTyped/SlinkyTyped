package typingsSlinky.ckeditor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Aria extends js.Object {
  var aria: js.Array[String] = js.native
  var display: js.Array[String] = js.native
}

object Aria {
  @scala.inline
  def apply(aria: js.Array[String], display: js.Array[String]): Aria = {
    val __obj = js.Dynamic.literal(aria = aria.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any])
    __obj.asInstanceOf[Aria]
  }
  @scala.inline
  implicit class AriaOps[Self <: Aria] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAria(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplay(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

