package typingsSlinky.domInputevent

import typingsSlinky.std.UIEventInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputEventInit extends UIEventInit {
  var data: js.UndefOr[String | Null] = js.native
  var isComposing: js.UndefOr[Boolean] = js.native
}

object InputEventInit {
  @scala.inline
  def apply(): InputEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputEventInit]
  }
  @scala.inline
  implicit class InputEventInitOps[Self <: InputEventInit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withDataNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(null)
        ret
    }
    @scala.inline
    def withIsComposing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isComposing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsComposing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isComposing")(js.undefined)
        ret
    }
  }
  
}

