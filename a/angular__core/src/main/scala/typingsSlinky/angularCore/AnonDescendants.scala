package typingsSlinky.angularCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDescendants extends js.Object {
  var descendants: js.UndefOr[Boolean] = js.native
  var read: js.UndefOr[js.Any] = js.native
}

object AnonDescendants {
  @scala.inline
  def apply(): AnonDescendants = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonDescendants]
  }
  @scala.inline
  implicit class AnonDescendantsOps[Self <: AnonDescendants] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescendants(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descendants")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescendants: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descendants")(js.undefined)
        ret
    }
    @scala.inline
    def withRead(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRead: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(js.undefined)
        ret
    }
  }
  
}

