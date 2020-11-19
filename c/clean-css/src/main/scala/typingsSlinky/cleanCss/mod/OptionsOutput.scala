package typingsSlinky.cleanCss.mod

import typingsSlinky.cleanCss.cleanCssBooleans.`false`
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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options when returning an output
  */
/* Inlined clean-css.clean-css.OptionsBase & {  returnPromise :false | undefined} */
@js.native
trait OptionsOutput extends Options {
  
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
  var returnPromise: js.UndefOr[`false`] = js.native
  
  /**
    *  Controls whether an output source map is built; defaults to `false`
    */
  var sourceMap: js.UndefOr[Boolean] = js.native
  
  /**
    *  Controls embedding sources inside a source map's `sourcesContent` field; defaults to `false`
    */
  var sourceMapInlineSources: js.UndefOr[Boolean] = js.native
}
object OptionsOutput {
  
  @scala.inline
  def apply(): OptionsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsOutput]
  }
  
  @scala.inline
  implicit class OptionsOutputOps[Self <: OptionsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCompatibility(value: Asterisk | ie9 | ie8 | ie7 | CompatibilityOptions): Self = this.set("compatibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompatibility: Self = this.set("compatibility", js.undefined)
    
    @scala.inline
    def setFetch(
      value: (/* uri */ String, /* inlineRequest */ RequestOptions | typingsSlinky.node.httpsMod.RequestOptions, /* inlineTimeout */ Double, /* done */ js.Function2[/* message */ String | Double, /* body */ String, Unit]) => Unit
    ): Self = this.set("fetch", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteFetch: Self = this.set("fetch", js.undefined)
    
    @scala.inline
    def setFormat(value: beautify | `keep-breaks` | FormatOptions | `false`): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setInlineVarargs(value: String*): Self = this.set("inline", js.Array(value :_*))
    
    @scala.inline
    def setInline(value: js.Array[String] | `false`): Self = this.set("inline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInline: Self = this.set("inline", js.undefined)
    
    @scala.inline
    def setInlineRequest(value: RequestOptions | typingsSlinky.node.httpsMod.RequestOptions): Self = this.set("inlineRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInlineRequest: Self = this.set("inlineRequest", js.undefined)
    
    @scala.inline
    def setInlineTimeout(value: Double): Self = this.set("inlineTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInlineTimeout: Self = this.set("inlineTimeout", js.undefined)
    
    @scala.inline
    def setLevel(value: `0` | `1` | `2` | OptimizationsOptions): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    
    @scala.inline
    def setRebase(value: Boolean): Self = this.set("rebase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRebase: Self = this.set("rebase", js.undefined)
    
    @scala.inline
    def setRebaseTo(value: String): Self = this.set("rebaseTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRebaseTo: Self = this.set("rebaseTo", js.undefined)
    
    @scala.inline
    def setReturnPromise(value: `false`): Self = this.set("returnPromise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnPromise: Self = this.set("returnPromise", js.undefined)
    
    @scala.inline
    def setSourceMap(value: Boolean): Self = this.set("sourceMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceMap: Self = this.set("sourceMap", js.undefined)
    
    @scala.inline
    def setSourceMapInlineSources(value: Boolean): Self = this.set("sourceMapInlineSources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceMapInlineSources: Self = this.set("sourceMapInlineSources", js.undefined)
  }
}
