package typingsSlinky.materialUiCore.unstableUseMediaQueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var defaultMatches: js.UndefOr[Boolean] = js.native
  var noSsr: js.UndefOr[Boolean] = js.native
  var ssrMatchMedia: js.UndefOr[js.Function1[/* query */ String, MuiMediaQueryList]] = js.native
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
    def withDefaultMatches(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultMatches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultMatches: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultMatches")(js.undefined)
        ret
    }
    @scala.inline
    def withNoSsr(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noSsr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoSsr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noSsr")(js.undefined)
        ret
    }
    @scala.inline
    def withSsrMatchMedia(value: /* query */ String => MuiMediaQueryList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssrMatchMedia")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSsrMatchMedia: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssrMatchMedia")(js.undefined)
        ret
    }
  }
  
}

