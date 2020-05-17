package typingsSlinky.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabContents extends js.Object {
  var tabContents: js.UndefOr[String] = js.native
}

object TabContents {
  @scala.inline
  def apply(): TabContents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabContents]
  }
  @scala.inline
  implicit class TabContentsOps[Self <: TabContents] (val x: Self) extends AnyVal {
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

