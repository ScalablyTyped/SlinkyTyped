package typingsSlinky.minimistOptions.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[key: string] : minimist-options.minimist-options.Type | minimist-options.minimist-options.Option} & {[ K in 'stopEarly' | 'unknown' | '--' ]:? minimist.minimist.Opts[K]} */
@js.native
trait Options extends /* key */ StringDictionary[Type | Option] {
  var `--`: js.UndefOr[Boolean] = js.native
  var stopEarly: js.UndefOr[Boolean] = js.native
  var unknown: js.UndefOr[js.Function1[/* arg */ String, Boolean]] = js.native
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
    def `with--`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("--")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `without--`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("--")(js.undefined)
        ret
    }
    @scala.inline
    def withStopEarly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopEarly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStopEarly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopEarly")(js.undefined)
        ret
    }
    @scala.inline
    def withUnknown(value: /* arg */ String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unknown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutUnknown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unknown")(js.undefined)
        ret
    }
  }
  
}

