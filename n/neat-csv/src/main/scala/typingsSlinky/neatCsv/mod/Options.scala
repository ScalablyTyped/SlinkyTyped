package typingsSlinky.neatCsv.mod

import typingsSlinky.neatCsv.anon.Header
import typingsSlinky.neatCsv.anon.Index
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A configuration object to be passed to csv-parser. */
@js.native
trait Options extends js.Object {
  var escape: js.UndefOr[String] = js.native
  var headers: js.UndefOr[js.Array[String] | Boolean] = js.native
  var mapHeaders: js.UndefOr[js.Function1[/* args */ Header, String | Null]] = js.native
  var mapValues: js.UndefOr[js.Function1[/* args */ Index, _]] = js.native
  var maxRowBytes: js.UndefOr[Double] = js.native
  var newline: js.UndefOr[String] = js.native
  var quote: js.UndefOr[String] = js.native
  var raw: js.UndefOr[Boolean] = js.native
  var separator: js.UndefOr[String] = js.native
  var skipLines: js.UndefOr[Double] = js.native
  var strict: js.UndefOr[Boolean] = js.native
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
    def withEscape(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEscape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escape")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: js.Array[String] | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
    @scala.inline
    def withMapHeaders(value: /* args */ Header => String | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapHeaders")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMapHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withMapValues(value: /* args */ Index => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapValues")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMapValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapValues")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxRowBytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRowBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxRowBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRowBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withNewline(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newline")(js.undefined)
        ret
    }
    @scala.inline
    def withQuote(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quote")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuote: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quote")(js.undefined)
        ret
    }
    @scala.inline
    def withRaw(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRaw: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(js.undefined)
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
    def withSkipLines(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipLines")(js.undefined)
        ret
    }
    @scala.inline
    def withStrict(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrict: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strict")(js.undefined)
        ret
    }
  }
  
}

