package typingsSlinky.reactIntl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait State extends js.Object {
  /**
    * Explicit intl cache to prevent memory leaks
    */
  var cache: IntlCache = js.native
  /**
    * Intl object we created
    */
  var intl: js.UndefOr[IntlShape] = js.native
  /**
    * list of memoized config we care about.
    * This is important since creating intl is
    * very expensive
    */
  var prevConfig: OptionalIntlConfig = js.native
}

object State {
  @scala.inline
  def apply(cache: IntlCache, prevConfig: OptionalIntlConfig): State = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], prevConfig = prevConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
  @scala.inline
  implicit class StateOps[Self <: State] (val x: Self) extends AnyVal {
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
    def withPrevConfig(value: OptionalIntlConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevConfig")(value.asInstanceOf[js.Any])
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
  }
  
}

