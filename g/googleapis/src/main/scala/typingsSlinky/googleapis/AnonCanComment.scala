package typingsSlinky.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCanComment extends js.Object {
  var canComment: js.UndefOr[Boolean] = js.native
  var canPlusone: js.UndefOr[Boolean] = js.native
  var canUpdate: js.UndefOr[Boolean] = js.native
  var isPlusOned: js.UndefOr[Boolean] = js.native
  var resharingDisabled: js.UndefOr[Boolean] = js.native
}

object AnonCanComment {
  @scala.inline
  def apply(): AnonCanComment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonCanComment]
  }
  @scala.inline
  implicit class AnonCanCommentOps[Self <: AnonCanComment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanComment(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canComment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanComment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canComment")(js.undefined)
        ret
    }
    @scala.inline
    def withCanPlusone(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canPlusone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanPlusone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canPlusone")(js.undefined)
        ret
    }
    @scala.inline
    def withCanUpdate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withIsPlusOned(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPlusOned")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsPlusOned: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPlusOned")(js.undefined)
        ret
    }
    @scala.inline
    def withResharingDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resharingDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResharingDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resharingDisabled")(js.undefined)
        ret
    }
  }
  
}

