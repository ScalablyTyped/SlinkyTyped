package typingsSlinky.devextreme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAllowAdding extends js.Object {
  var allowAdding: js.UndefOr[Boolean] = js.native
  var allowDeleting: js.UndefOr[Boolean] = js.native
  var allowDragging: js.UndefOr[Boolean] = js.native
  var allowResizing: js.UndefOr[Boolean] = js.native
  var allowUpdating: js.UndefOr[Boolean] = js.native
}

object AnonAllowAdding {
  @scala.inline
  def apply(): AnonAllowAdding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAllowAdding]
  }
  @scala.inline
  implicit class AnonAllowAddingOps[Self <: AnonAllowAdding] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowAdding(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowAdding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowAdding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowAdding")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowDeleting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDeleting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowDeleting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDeleting")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowDragging(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDragging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowDragging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDragging")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowResizing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowResizing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowResizing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowResizing")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowUpdating(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowUpdating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowUpdating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowUpdating")(js.undefined)
        ret
    }
  }
  
}

