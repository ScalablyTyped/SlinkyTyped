package typingsSlinky.handsontable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSkipRender extends js.Object {
  var skipRender: js.UndefOr[Boolean] = js.native
}

object AnonSkipRender {
  @scala.inline
  def apply(): AnonSkipRender = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonSkipRender]
  }
  @scala.inline
  implicit class AnonSkipRenderOps[Self <: AnonSkipRender] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSkipRender(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipRender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipRender")(js.undefined)
        ret
    }
  }
  
}

