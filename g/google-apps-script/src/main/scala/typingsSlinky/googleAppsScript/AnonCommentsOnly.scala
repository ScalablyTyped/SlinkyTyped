package typingsSlinky.googleAppsScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCommentsOnly extends js.Object {
  var commentsOnly: js.UndefOr[Boolean] = js.native
  var contentsOnly: js.UndefOr[Boolean] = js.native
  var formatOnly: js.UndefOr[Boolean] = js.native
  var skipFilteredRows: js.UndefOr[Boolean] = js.native
  var validationsOnly: js.UndefOr[Boolean] = js.native
}

object AnonCommentsOnly {
  @scala.inline
  def apply(): AnonCommentsOnly = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonCommentsOnly]
  }
  @scala.inline
  implicit class AnonCommentsOnlyOps[Self <: AnonCommentsOnly] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommentsOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commentsOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommentsOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commentsOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withContentsOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentsOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentsOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentsOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormatOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipFilteredRows(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipFilteredRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipFilteredRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipFilteredRows")(js.undefined)
        ret
    }
    @scala.inline
    def withValidationsOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationsOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidationsOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationsOnly")(js.undefined)
        ret
    }
  }
  
}

