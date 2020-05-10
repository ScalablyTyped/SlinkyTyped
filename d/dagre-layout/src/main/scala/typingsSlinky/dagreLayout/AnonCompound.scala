package typingsSlinky.dagreLayout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCompound extends js.Object {
  var compound: js.UndefOr[Boolean] = js.native
  var directed: js.UndefOr[Boolean] = js.native
  var multigraph: js.UndefOr[Boolean] = js.native
}

object AnonCompound {
  @scala.inline
  def apply(): AnonCompound = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonCompound]
  }
  @scala.inline
  implicit class AnonCompoundOps[Self <: AnonCompound] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompound(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compound")(js.undefined)
        ret
    }
    @scala.inline
    def withDirected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directed")(js.undefined)
        ret
    }
    @scala.inline
    def withMultigraph(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multigraph")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultigraph: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multigraph")(js.undefined)
        ret
    }
  }
  
}

