package typingsSlinky.expressHandlebars

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PartialTemplateOptions extends js.Object {
  var cache: js.UndefOr[Boolean] = js.native
  var precompiled: js.UndefOr[Boolean] = js.native
}

object PartialTemplateOptions {
  @scala.inline
  def apply(): PartialTemplateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTemplateOptions]
  }
  @scala.inline
  implicit class PartialTemplateOptionsOps[Self <: PartialTemplateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCache(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(js.undefined)
        ret
    }
    @scala.inline
    def withPrecompiled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precompiled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrecompiled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precompiled")(js.undefined)
        ret
    }
  }
  
}

