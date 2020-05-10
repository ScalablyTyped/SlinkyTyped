package typingsSlinky.jquerySlugify.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{preSlug (source : string): string, postSlug (source : string): string, slugFunc (input : string, options : jquery-slugify.jquery-slugify.Options): string,   separator  :string,   lang  :string | boolean,   symbols  :boolean,   maintainCase  :boolean,   titleCase  :std.Array<string> | boolean,   truncate  :number,   uric  :boolean,   uricNoSlash  :boolean,   mark  :boolean,   custom  :std.Array<string>}> */
@js.native
trait Options extends js.Object {
  var custom: js.UndefOr[js.Array[String]] = js.native
  var lang: js.UndefOr[String | Boolean] = js.native
  var maintainCase: js.UndefOr[Boolean] = js.native
  var mark: js.UndefOr[Boolean] = js.native
  var postSlug: js.UndefOr[js.Function1[/* source */ String, String]] = js.native
  var preSlug: js.UndefOr[js.Function1[/* source */ String, String]] = js.native
  var separator: js.UndefOr[String] = js.native
  var slugFunc: js.UndefOr[js.Function2[/* input */ String, /* options */ this.type, String]] = js.native
  var symbols: js.UndefOr[Boolean] = js.native
  var titleCase: js.UndefOr[js.Array[String] | Boolean] = js.native
  var truncate: js.UndefOr[Double] = js.native
  var uric: js.UndefOr[Boolean] = js.native
  var uricNoSlash: js.UndefOr[Boolean] = js.native
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
    def withCustom(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom")(js.undefined)
        ret
    }
    @scala.inline
    def withLang(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lang")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLang: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lang")(js.undefined)
        ret
    }
    @scala.inline
    def withMaintainCase(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maintainCase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaintainCase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maintainCase")(js.undefined)
        ret
    }
    @scala.inline
    def withMark(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMark: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mark")(js.undefined)
        ret
    }
    @scala.inline
    def withPostSlug(value: /* source */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postSlug")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPostSlug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postSlug")(js.undefined)
        ret
    }
    @scala.inline
    def withPreSlug(value: /* source */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preSlug")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPreSlug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preSlug")(js.undefined)
        ret
    }
    @scala.inline
    def withSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separator")(js.undefined)
        ret
    }
    @scala.inline
    def withSlugFunc(value: (/* input */ String, Options) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slugFunc")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSlugFunc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slugFunc")(js.undefined)
        ret
    }
    @scala.inline
    def withSymbols(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSymbols: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbols")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleCase(value: js.Array[String] | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleCase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleCase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleCase")(js.undefined)
        ret
    }
    @scala.inline
    def withTruncate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("truncate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTruncate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("truncate")(js.undefined)
        ret
    }
    @scala.inline
    def withUric(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uric")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUric: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uric")(js.undefined)
        ret
    }
    @scala.inline
    def withUricNoSlash(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uricNoSlash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUricNoSlash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uricNoSlash")(js.undefined)
        ret
    }
  }
  
}

