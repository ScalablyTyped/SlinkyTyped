package typingsSlinky.nodePolyglot.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolyglotOptions extends js.Object {
  var allowMissing: js.UndefOr[Boolean] = js.native
  var interpolation: js.UndefOr[InterpolationTokenOptions] = js.native
  var locale: js.UndefOr[String] = js.native
  var onMissingKey: js.UndefOr[
    js.Function3[
      /* key */ String, 
      /* options */ js.UndefOr[InterpolationOptions], 
      /* locale */ js.UndefOr[String], 
      String
    ]
  ] = js.native
  var phrases: js.UndefOr[js.Any] = js.native
  var warn: js.UndefOr[js.Function1[/* message */ String, Unit]] = js.native
}

object PolyglotOptions {
  @scala.inline
  def apply(): PolyglotOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolyglotOptions]
  }
  @scala.inline
  implicit class PolyglotOptionsOps[Self <: PolyglotOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowMissing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowMissing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowMissing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowMissing")(js.undefined)
        ret
    }
    @scala.inline
    def withInterpolation(value: InterpolationTokenOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interpolation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterpolation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interpolation")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMissingKey(
      value: (/* key */ String, /* options */ js.UndefOr[InterpolationOptions], /* locale */ js.UndefOr[String]) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMissingKey")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnMissingKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMissingKey")(js.undefined)
        ret
    }
    @scala.inline
    def withPhrases(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phrases")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhrases: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phrases")(js.undefined)
        ret
    }
    @scala.inline
    def withWarn(value: /* message */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutWarn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warn")(js.undefined)
        ret
    }
  }
  
}

