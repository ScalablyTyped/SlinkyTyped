package typingsSlinky.emberRouting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOutlet extends js.Object {
  var outlet: js.UndefOr[String] = js.native
  var parentView: js.UndefOr[String] = js.native
}

object AnonOutlet {
  @scala.inline
  def apply(): AnonOutlet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonOutlet]
  }
  @scala.inline
  implicit class AnonOutletOps[Self <: AnonOutlet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOutlet(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outlet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutlet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outlet")(js.undefined)
        ret
    }
    @scala.inline
    def withParentView(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentView")(js.undefined)
        ret
    }
  }
  
}

