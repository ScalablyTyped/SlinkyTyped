package typingsSlinky.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Down extends js.Object {
  var down: js.UndefOr[js.Any] = js.native
}

object Down {
  @scala.inline
  def apply(): Down = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Down]
  }
  @scala.inline
  implicit class DownOps[Self <: Down] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDown(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("down")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("down")(js.undefined)
        ret
    }
  }
  
}

