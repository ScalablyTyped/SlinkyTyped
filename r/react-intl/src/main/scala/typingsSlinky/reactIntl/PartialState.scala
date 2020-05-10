package typingsSlinky.reactIntl

import typingsSlinky.reactIntl.providerMod.OptionalIntlConfig
import typingsSlinky.reactIntl.typesMod.IntlCache
import typingsSlinky.reactIntl.typesMod.IntlShape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-intl.react-intl/lib/components/provider.State> */
@js.native
trait PartialState extends js.Object {
  var cache: js.UndefOr[IntlCache] = js.native
  var intl: js.UndefOr[IntlShape] = js.native
  var prevConfig: js.UndefOr[OptionalIntlConfig] = js.native
}

object PartialState {
  @scala.inline
  def apply(): PartialState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialState]
  }
  @scala.inline
  implicit class PartialStateOps[Self <: PartialState] (val x: Self) extends AnyVal {
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

