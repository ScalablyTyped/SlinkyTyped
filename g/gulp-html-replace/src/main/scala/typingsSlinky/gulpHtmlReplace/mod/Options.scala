package typingsSlinky.gulpHtmlReplace.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var keepBlockTags: js.UndefOr[Boolean] = js.native
  var keepUnassigned: js.UndefOr[Boolean] = js.native
  var resolvePaths: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKeepBlockTags(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepBlockTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepBlockTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepBlockTags")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepUnassigned(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepUnassigned")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepUnassigned: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepUnassigned")(js.undefined)
        ret
    }
    @scala.inline
    def withResolvePaths(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolvePaths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolvePaths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolvePaths")(js.undefined)
        ret
    }
  }
  
}

