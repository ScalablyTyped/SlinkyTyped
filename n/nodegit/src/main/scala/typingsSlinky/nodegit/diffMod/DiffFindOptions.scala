package typingsSlinky.nodegit.diffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiffFindOptions extends js.Object {
  var breakRewriteThreshold: js.UndefOr[Double] = js.native
  var copyThreshold: js.UndefOr[Double] = js.native
  var flags: js.UndefOr[Double] = js.native
  var renameFromRewriteThreshold: js.UndefOr[Double] = js.native
  var renameLimit: js.UndefOr[Double] = js.native
  var renameThreshold: js.UndefOr[Double] = js.native
  var version: js.UndefOr[Double] = js.native
}

object DiffFindOptions {
  @scala.inline
  def apply(): DiffFindOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiffFindOptions]
  }
  @scala.inline
  implicit class DiffFindOptionsOps[Self <: DiffFindOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBreakRewriteThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakRewriteThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBreakRewriteThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakRewriteThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withCopyThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCopyThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withFlags(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flags")(js.undefined)
        ret
    }
    @scala.inline
    def withRenameFromRewriteThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renameFromRewriteThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenameFromRewriteThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renameFromRewriteThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withRenameLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renameLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenameLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renameLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withRenameThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renameThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenameThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renameThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

