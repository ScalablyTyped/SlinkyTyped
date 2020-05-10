package typingsSlinky.pretty.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrettyOptions extends js.Object {
  var ocd: Boolean = js.native
}

object PrettyOptions {
  @scala.inline
  def apply(ocd: Boolean): PrettyOptions = {
    val __obj = js.Dynamic.literal(ocd = ocd.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrettyOptions]
  }
  @scala.inline
  implicit class PrettyOptionsOps[Self <: PrettyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOcd(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ocd")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

