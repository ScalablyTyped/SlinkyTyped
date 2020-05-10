package typingsSlinky.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTabContents extends js.Object {
  var tabContents: js.UndefOr[String] = js.native
}

object AnonTabContents {
  @scala.inline
  def apply(): AnonTabContents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonTabContents]
  }
  @scala.inline
  implicit class AnonTabContentsOps[Self <: AnonTabContents] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTabContents(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabContents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabContents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabContents")(js.undefined)
        ret
    }
  }
  
}

