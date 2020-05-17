package typingsSlinky.jupyterlabServices.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Displayid extends js.Object {
  var display_id: js.UndefOr[String] = js.native
}

object Displayid {
  @scala.inline
  def apply(): Displayid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Displayid]
  }
  @scala.inline
  implicit class DisplayidOps[Self <: Displayid] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplay_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplay_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display_id")(js.undefined)
        ret
    }
  }
  
}

