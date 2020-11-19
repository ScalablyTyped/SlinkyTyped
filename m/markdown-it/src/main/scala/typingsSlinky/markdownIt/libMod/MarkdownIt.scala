package typingsSlinky.markdownIt.libMod

import typingsSlinky.linkifyIt.mod.LinkifyIt
import typingsSlinky.markdownIt.helpersMod.Helpers
import typingsSlinky.markdownIt.utilsMod.Utils
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MarkdownIt extends js.Object {
  
  /**
    * Instance of [[ParserBlock]]. You may need it to add new rules when
    * writing plugins. For simple rules control use [[MarkdownIt.disable]] and
    * [[MarkdownIt.enable]].
    */
  val block: typingsSlinky.markdownIt.parserBlockMod.^ = js.native
  
  /**
    * *chainable*, *internal*
    *
    * Batch load of all options and compenent settings. This is internal method,
    * and you probably will not need it. But if you with - see available presets
    * and data structure [here](https://github.com/markdown-it/markdown-it/tree/master/lib/presets)
    *
    * We strongly recommend to use presets instead of direct config loads. That
    * will give better compatibility with next versions.
    */
  def configure(presets: PresetName): this.type = js.native
  
  /**
    * Instance of [[Core]] chain executor. You may need it to add new rules when
    * writing plugins. For simple rules control use [[MarkdownIt.disable]] and
    * [[MarkdownIt.enable]].
    */
  val core: typingsSlinky.markdownIt.parserCoreMod.^ = js.native
  
  /**
    * *chainable*
    *
    * The same as [[MarkdownIt.enable]], but turn specified rules off.
    *
    * @param list rule name or list of rule names to disable.
    * @param ignoreInvalid set `true` to ignore errors when rule not found.
    */
  def disable(list: String): this.type = js.native
  def disable(list: String, ignoreInvalid: Boolean): this.type = js.native
  def disable(list: js.Array[String]): this.type = js.native
  def disable(list: js.Array[String], ignoreInvalid: Boolean): this.type = js.native
  
  /**
    * *chainable*
    *
    * Enable list or rules. It will automatically find appropriate components,
    * containing rules with given names. If rule not found, and `ignoreInvalid`
    * not set - throws exception.
    *
    * ##### Example
    *
    * ```javascript
    * var md = require('markdown-it')()
    *             .enable(['sub', 'sup'])
    *             .disable('smartquotes');
    * ```
    *
    * @param list rule name or list of rule names to enable
    * @param ignoreInvalid set `true` to ignore errors when rule not found.
    */
  def enable(list: String): this.type = js.native
  def enable(list: String, ignoreInvalid: Boolean): this.type = js.native
  def enable(list: js.Array[String]): this.type = js.native
  def enable(list: js.Array[String], ignoreInvalid: Boolean): this.type = js.native
  
  val helpers: Helpers = js.native
  
  /**
    * Instance of [[ParserInline]]. You may need it to add new rules when
    * writing plugins. For simple rules control use [[MarkdownIt.disable]] and
    * [[MarkdownIt.enable]].
    */
  val `inline`: typingsSlinky.markdownIt.parserInlineMod.^ = js.native
  
  /**
    * [linkify-it](https://github.com/markdown-it/linkify-it) instance.
    * Used by [linkify](https://github.com/markdown-it/markdown-it/blob/master/lib/rules_core/linkify.js)
    * rule.
    */
  val linkify: LinkifyIt = js.native
  
  /**
    * Function used to encode link url to a machine-readable format,
    * which includes url-encoding, punycode, etc.
    */
  def normalizeLink(url: String): String = js.native
  
  /**
    * Function used to decode link url to a human-readable format`
    */
  def normalizeLinkText(url: String): String = js.native
  
  val options: Options = js.native
  
  /**
    * *internal*
    *
    * Parse input string and returns list of block tokens (special token type
    * "inline" will contain list of inline tokens). You should not call this
    * method directly, until you write custom renderer (for example, to produce
    * AST).
    *
    * `env` is used to pass data between "distributed" rules and return additional
    * metadata like reference info, needed for the renderer. It also can be used to
    * inject data in specific cases. Usually, you will be ok to pass `{}`,
    * and then pass updated object to renderer.
    *
    * @param src source string
    * @param env environment sandbox
    */
  def parse(src: String, env: js.Any): js.Array[typingsSlinky.markdownIt.tokenMod.^] = js.native
  
  /**
    * *internal*
    *
    * The same as [[MarkdownIt.parse]] but skip all block rules. It returns the
    * block tokens list with the single `inline` element, containing parsed inline
    * tokens in `children` property. Also updates `env` object.
    *
    * @param src source string
    * @param env environment sandbox
    */
  def parseInline(src: String, env: js.Any): js.Array[typingsSlinky.markdownIt.tokenMod.^] = js.native
  
  /**
    * Render markdown string into html. It does all magic for you :).
    *
    * `env` can be used to inject additional metadata (`{}` by default).
    * But you will not need it with high probability. See also comment
    * in [[MarkdownIt.parse]].
    *
    * @param src source string
    * @param env environment sandbox
    */
  def render(src: String): String = js.native
  def render(src: String, env: js.Any): String = js.native
  
  /**
    * Similar to [[MarkdownIt.render]] but for single paragraph content. Result
    * will NOT be wrapped into `<p>` tags.
    *
    * @param src source string
    * @param env environment sandbox
    */
  def renderInline(src: String): String = js.native
  def renderInline(src: String, env: js.Any): String = js.native
  
  /**
    * Instance of [[Renderer]]. Use it to modify output look. Or to add rendering
    * rules for new token types, generated by plugins.
    *
    * ##### Example
    *
    * ```javascript
    * var md = require('markdown-it')();
    *
    * function myToken(tokens, idx, options, env, self) {
    *   //...
    *   return result;
    * };
    *
    * md.renderer.rules['my_token'] = myToken
    * ```
    *
    * See [[Renderer]] docs and [source code](https://github.com/markdown-it/markdown-it/blob/master/lib/renderer.js).
    */
  val renderer: typingsSlinky.markdownIt.rendererMod.^ = js.native
  
  /**
    * *chainable*
    *
    * Set parser options (in the same format as in constructor). Probably, you
    * will never need it, but you can change options after constructor call.
    *
    * ##### Example
    *
    * ```javascript
    * var md = require('markdown-it')()
    *             .set({ html: true, breaks: true })
    *             .set({ typographer: true });
    * ```
    *
    * __Note:__ To achieve the best possible performance, don't modify a
    * `markdown-it` instance options on the fly. If you need multiple configurations
    * it's best to create multiple instances and initialize each with separate
    * config.
    */
  def set(options: Options): this.type = js.native
  
  /**
    * *chainable*
    *
    * Load specified plugin with given params into current parser instance.
    * It's just a sugar to call `plugin(md, params)` with curring.
    *
    * ##### Example
    *
    * ```javascript
    * var iterator = require('markdown-it-for-inline');
    * var md = require('markdown-it')()
    *             .use(iterator, 'foo_replace', 'text', function (tokens, idx) {
    *               tokens[idx].content = tokens[idx].content.replace(/foo/g, 'bar');
    *             });
    * ```
    */
  def use(plugin: PluginSimple): this.type = js.native
  def use(plugin: PluginWithParams, params: js.Any*): this.type = js.native
  def use[T](plugin: PluginWithOptions[T]): this.type = js.native
  def use[T](plugin: PluginWithOptions[T], options: T): this.type = js.native
  
  val utils: Utils = js.native
  
  /**
    * Link validation function. CommonMark allows too much in links. By default
    * we disable `javascript:`, `vbscript:`, `file:` schemas, and almost all `data:...` schemas
    * except some embedded image types.
    *
    * You can change this behaviour:
    *
    * ```javascript
    * var md = require('markdown-it')();
    * // enable everything
    * md.validateLink = function () { return true; }
    * ```
    */
  def validateLink(url: String): Boolean = js.native
}
