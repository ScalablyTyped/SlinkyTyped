package typingsSlinky.cleanCss.mod

import typingsSlinky.cleanCss.cleanCssBooleans.`false`
import typingsSlinky.cleanCss.cleanCssBooleans.`true`
import typingsSlinky.cleanCss.cleanCssNumbers.`0`
import typingsSlinky.cleanCss.cleanCssNumbers.`1`
import typingsSlinky.cleanCss.cleanCssNumbers.`2`
import typingsSlinky.cleanCss.cleanCssStrings.Asterisk
import typingsSlinky.cleanCss.cleanCssStrings.`keep-breaks`
import typingsSlinky.cleanCss.cleanCssStrings.beautify
import typingsSlinky.cleanCss.cleanCssStrings.ie7
import typingsSlinky.cleanCss.cleanCssStrings.ie8
import typingsSlinky.cleanCss.cleanCssStrings.ie9
import typingsSlinky.node.httpMod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options when returning a promise
  */
/* Inlined clean-css.clean-css.OptionsBase & {  returnPromise  :true} */
@js.native
trait OptionsPromise extends Options {
  /**
    * Controls compatibility mode used; defaults to ie10+ using `'*'`.
    *  Compatibility hash exposes the following properties: `colors`, `properties`, `selectors`, and `units`
    */
  var compatibility: js.UndefOr[Asterisk | ie9 | ie8 | ie7 | CompatibilityOptions] = js.native
  /**
    * Controls a function for handling remote requests; Defaults to the build in `loadRemoteResource` function
    */
  var fetch: js.UndefOr[
    js.Function4[
      /* uri */ String, 
      /* inlineRequest */ RequestOptions | typingsSlinky.node.httpsMod.RequestOptions, 
      /* inlineTimeout */ Double, 
      /* done */ js.Function2[/* message */ String | Double, /* body */ String, Unit], 
      Unit
    ]
  ] = js.native
  /**
    * Controls output CSS formatting; defaults to `false`.
    *  Format hash exposes the following properties: `breaks`, `breakWith`, `indentBy`, `indentWith`, `spaces`, and `wrapAt`.
    */
  var format: js.UndefOr[beautify | `keep-breaks` | FormatOptions | `false`] = js.native
  /**
    * inline option whitelists which @import rules will be processed.  Defaults to `'local'`
    * Accepts the following values:
    *  'local': enables local inlining;
    *  'remote': enables remote inlining;
    *  'none': disables all inlining;
    *  'all': enables all inlining, same as ['local', 'remote'];
    *  '[uri]': enables remote inlining from the specified uri;
    *  '![url]': disables remote inlining from the specified uri;
    */
  var `inline`: js.UndefOr[js.Array[String] | `false`] = js.native
  /**
    * Controls extra options for inlining remote @import rules
    */
  var inlineRequest: js.UndefOr[RequestOptions | typingsSlinky.node.httpsMod.RequestOptions] = js.native
  /**
    * Controls number of milliseconds after which inlining a remote @import fails; defaults to `5000`;
    */
  var inlineTimeout: js.UndefOr[Double] = js.native
  /**
    * Controls optimization level used; defaults to `1`.
    * Level hash exposes `1`, and `2`.
    */
  var level: js.UndefOr[`0` | `1` | `2` | OptimizationsOptions] = js.native
  /**
    * Controls URL rebasing; defaults to `true`;
    */
  var rebase: js.UndefOr[Boolean] = js.native
  /**
    * controls a directory to which all URLs are rebased, most likely the directory under which the output file
    * will live; defaults to the current directory;
    */
  var rebaseTo: js.UndefOr[String] = js.native
  /**
    * If you prefer clean-css to return a Promise object then you need to explicitly ask for it; defaults to `false`
    */
  var returnPromise: `true` = js.native
  /**
    *  Controls whether an output source map is built; defaults to `false`
    */
  var sourceMap: js.UndefOr[Boolean] = js.native
  /**
    *  Controls embedding sources inside a source map's `sourcesContent` field; defaults to `false`
    */
  var sourceMapInlineSources: js.UndefOr[Boolean] = js.native
}

object OptionsPromise {
  @scala.inline
  def apply(returnPromise: `true`): OptionsPromise = {
    val __obj = js.Dynamic.literal(returnPromise = returnPromise.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsPromise]
  }
  @scala.inline
  implicit class OptionsPromiseOps[Self <: OptionsPromise] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReturnPromise(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnPromise")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompatibility(value: Asterisk | ie9 | ie8 | ie7 | CompatibilityOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compatibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompatibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compatibility")(js.undefined)
        ret
    }
    @scala.inline
    def withFetch(
      value: (/* uri */ String, /* inlineRequest */ RequestOptions | typingsSlinky.node.httpsMod.RequestOptions, /* inlineTimeout */ Double, /* done */ js.Function2[/* message */ String | Double, /* body */ String, Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetch")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutFetch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetch")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: beautify | `keep-breaks` | FormatOptions | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withInline(value: js.Array[String] | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inline")(js.undefined)
        ret
    }
    @scala.inline
    def withInlineRequest(value: RequestOptions | typingsSlinky.node.httpsMod.RequestOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInlineRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineRequest")(js.undefined)
        ret
    }
    @scala.inline
    def withInlineTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInlineTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withLevel(value: `0` | `1` | `2` | OptimizationsOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(js.undefined)
        ret
    }
    @scala.inline
    def withRebase(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rebase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRebase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rebase")(js.undefined)
        ret
    }
    @scala.inline
    def withRebaseTo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rebaseTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRebaseTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rebaseTo")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceMap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceMap")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceMapInlineSources(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceMapInlineSources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceMapInlineSources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceMapInlineSources")(js.undefined)
        ret
    }
  }
  
}

