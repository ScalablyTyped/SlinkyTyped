package typingsSlinky.jju.mod

import typingsSlinky.jju.jjuStrings.Apostrophe
import typingsSlinky.jju.jjuStrings.Quotationmark
import typingsSlinky.jju.jjuStrings.cjson
import typingsSlinky.jju.jjuStrings.json
import typingsSlinky.jju.jjuStrings.json5
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StringifyOptions extends js.Object {
  /**
    * Output ascii only (default false).
    * If this option is enabled, output will not have any characters except 0x20-0x7f.
    */
  var ascii: js.UndefOr[Boolean] = js.native
  /**
    * This option follows JSON specification.
    * @default '\t'
    */
  var indent: js.UndefOr[String | Double | Boolean] = js.native
  /**
    * Operation mode. Set it to 'json' if you want correct json in the output.
    * If it is 'json', following options are implied:
    * - options.quote = '"'
    * - options.no_trailing_comma = true
    * - options.quote_keys = true
    * - '\x' literals are not used
    */
  var mode: js.UndefOr[json | json5 | cjson] = js.native
  /**
    * Don't output trailing comma. If this option is set, arrays like `[1,2,3,]` will never be generated.
    * Otherwise they may be generated for pretty printing.
    * - If `mode` is JSON, default is true
    * - Otherwise, default is false
    */
  var no_trailing_comma: js.UndefOr[Boolean] = js.native
  /**
    * Enquoting char.
    * - If `mode` is 'json', default is "
    * - Otherwise, default is '
    */
  var quote: js.UndefOr[Quotationmark | Apostrophe] = js.native
  /**
    * Whether keys quoting in objects is required or not.
    * If you want `{"q": 1}` instead of `{q: 1}`, set it to true.
    * - If `mode` is 'json', default is true
    * - Otherwise, default is false
    */
  var quote_keys: js.UndefOr[Boolean] = js.native
  /**
    * Replacer function or array. This option follows JSON specification.
    * If a function, used to transform the results.
    * If an array, acts as a approved list for selecting the object properties that will be stringified.
    */
  var replacer: js.UndefOr[
    (js.Function2[/* key */ String, /* value */ js.Any, _]) | (js.Array[Double | String])
  ] = js.native
  /**
    * Sort all keys while stringifying.
    * By default sort order will depend on implementation--with v8 it's insertion order.
    * If set to true, all keys (but not arrays) will be sorted alphabetically.
    * You can provide your own sorting function as well.
    * @default false
    */
  var sort_keys: js.UndefOr[Boolean | (js.Function2[/* a */ js.Any, /* b */ js.Any, Double])] = js.native
}

object StringifyOptions {
  @scala.inline
  def apply(): StringifyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StringifyOptions]
  }
  @scala.inline
  implicit class StringifyOptionsOps[Self <: StringifyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAscii(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ascii")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAscii: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ascii")(js.undefined)
        ret
    }
    @scala.inline
    def withIndent(value: String | Double | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indent")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: json | json5 | cjson): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withNo_trailing_comma(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("no_trailing_comma")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNo_trailing_comma: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("no_trailing_comma")(js.undefined)
        ret
    }
    @scala.inline
    def withQuote(value: Quotationmark | Apostrophe): Self = {
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
    def withQuote_keys(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quote_keys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuote_keys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quote_keys")(js.undefined)
        ret
    }
    @scala.inline
    def withReplacerFunction2(value: (/* key */ String, /* value */ js.Any) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replacer")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withReplacer(value: (js.Function2[/* key */ String, /* value */ js.Any, _]) | (js.Array[Double | String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replacer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplacer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replacer")(js.undefined)
        ret
    }
    @scala.inline
    def withSort_keysFunction2(value: (/* a */ js.Any, /* b */ js.Any) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort_keys")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSort_keys(value: Boolean | (js.Function2[/* a */ js.Any, /* b */ js.Any, Double])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort_keys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSort_keys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort_keys")(js.undefined)
        ret
    }
  }
  
}

