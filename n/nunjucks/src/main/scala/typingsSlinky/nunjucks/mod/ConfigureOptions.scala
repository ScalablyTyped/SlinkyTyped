package typingsSlinky.nunjucks.mod

import typingsSlinky.nunjucks.AnonAsync
import typingsSlinky.nunjucks.AnonBlockEnd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigureOptions extends js.Object {
  var autoescape: js.UndefOr[Boolean] = js.native
  var express: js.UndefOr[js.Object] = js.native
  var lstripBlocks: js.UndefOr[Boolean] = js.native
  var noCache: js.UndefOr[Boolean] = js.native
  var tags: js.UndefOr[AnonBlockEnd] = js.native
  var throwOnUndefined: js.UndefOr[Boolean] = js.native
  var trimBlocks: js.UndefOr[Boolean] = js.native
  var watch: js.UndefOr[Boolean] = js.native
  var web: js.UndefOr[AnonAsync] = js.native
}

object ConfigureOptions {
  @scala.inline
  def apply(): ConfigureOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigureOptions]
  }
  @scala.inline
  implicit class ConfigureOptionsOps[Self <: ConfigureOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoescape(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoescape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoescape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoescape")(js.undefined)
        ret
    }
    @scala.inline
    def withExpress(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("express")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("express")(js.undefined)
        ret
    }
    @scala.inline
    def withLstripBlocks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lstripBlocks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLstripBlocks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lstripBlocks")(js.undefined)
        ret
    }
    @scala.inline
    def withNoCache(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noCache")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: AnonBlockEnd): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
    @scala.inline
    def withThrowOnUndefined(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throwOnUndefined")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThrowOnUndefined: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throwOnUndefined")(js.undefined)
        ret
    }
    @scala.inline
    def withTrimBlocks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trimBlocks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrimBlocks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trimBlocks")(js.undefined)
        ret
    }
    @scala.inline
    def withWatch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watch")(js.undefined)
        ret
    }
    @scala.inline
    def withWeb(value: AnonAsync): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("web")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("web")(js.undefined)
        ret
    }
  }
  
}

