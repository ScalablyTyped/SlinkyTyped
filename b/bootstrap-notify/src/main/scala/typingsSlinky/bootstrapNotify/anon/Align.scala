package typingsSlinky.bootstrapNotify.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Align extends js.Object {
  var align: js.UndefOr[String] = js.native
  var from: js.UndefOr[String] = js.native
}

object Align {
  @scala.inline
  def apply(): Align = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Align]
  }
  @scala.inline
  implicit class AlignOps[Self <: Align] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlign(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(js.undefined)
        ret
    }
    @scala.inline
    def withFrom(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(js.undefined)
        ret
    }
  }
  
}

