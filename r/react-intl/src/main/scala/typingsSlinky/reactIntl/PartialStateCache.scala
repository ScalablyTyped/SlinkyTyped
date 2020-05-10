package typingsSlinky.reactIntl

import typingsSlinky.reactIntl.mod.IntlCache
import typingsSlinky.reactIntl.mod.IntlShape
import typingsSlinky.reactIntl.mod.OptionalIntlConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-intl.react-intl.State> */
@js.native
trait PartialStateCache extends js.Object {
  var cache: js.UndefOr[IntlCache] = js.native
  var intl: js.UndefOr[IntlShape] = js.native
  var prevConfig: js.UndefOr[OptionalIntlConfig] = js.native
}

object PartialStateCache {
  @scala.inline
  def apply(): PartialStateCache = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStateCache]
  }
  @scala.inline
  implicit class PartialStateCacheOps[Self <: PartialStateCache] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCache(value: IntlCache): Self = {
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
    def withIntl(value: IntlShape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intl")(js.undefined)
        ret
    }
    @scala.inline
    def withPrevConfig(value: OptionalIntlConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrevConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevConfig")(js.undefined)
        ret
    }
  }
  
}

