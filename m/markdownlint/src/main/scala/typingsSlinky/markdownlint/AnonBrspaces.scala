package typingsSlinky.markdownlint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBrspaces extends js.Object {
  var br_spaces: js.UndefOr[Double] = js.native
  var list_item_empty_lines: js.UndefOr[Boolean] = js.native
}

object AnonBrspaces {
  @scala.inline
  def apply(): AnonBrspaces = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonBrspaces]
  }
  @scala.inline
  implicit class AnonBrspacesOps[Self <: AnonBrspaces] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBr_spaces(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("br_spaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBr_spaces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("br_spaces")(js.undefined)
        ret
    }
    @scala.inline
    def withList_item_empty_lines(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list_item_empty_lines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutList_item_empty_lines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list_item_empty_lines")(js.undefined)
        ret
    }
  }
  
}

