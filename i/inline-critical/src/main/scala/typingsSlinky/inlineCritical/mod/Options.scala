package typingsSlinky.inlineCritical.mod

import typingsSlinky.inlineCritical.inlineCriticalBooleans.`false`
import typingsSlinky.inlineCritical.inlineCriticalStrings.body
import typingsSlinky.inlineCritical.inlineCriticalStrings.head
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * The path to be used when extracting styles to find the files references by `href` attributes.
    * @default process.cwd
    */
  var basePath: js.UndefOr[String] = js.native
  /**
    * Whether to remove the inlined styles from any stylesheets referenced in the HTML.
    * @default false
    */
  var extract: js.UndefOr[Boolean] = js.native
  /**
    * Stylesheets to ignore when inlining.
    * @default []
    * @example [/bootstrap/]
    */
  var ignore: js.UndefOr[String | js.RegExp | (js.Array[String | js.RegExp])] = js.native
  /**
    * Whether to minify the styles before inlining.
    * @default true
    */
  var minify: js.UndefOr[Boolean] = js.native
  /**
    * The position of the `noscript` fallback.
    * * `body`: end of body
    * * `head`: end of head
    * * `false`: no `noscript`
    * @default 'body'
    */
  var noscript: js.UndefOr[body | head | `false`] = js.native
  /**
    * Whether to add loadCSS if it's not already loaded.
    * @default true
    */
  var polyfill: js.UndefOr[Boolean] = js.native
  /**
    * Paths to use in the `href` tag of the `link` elements.
    * @default false
    */
  var replaceStylesheets: js.UndefOr[js.Array[String] | `false`] = js.native
  /** The selector for the element used by loadCSS as a reference for inlining. */
  var selector: js.UndefOr[String] = js.native
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
    def withBasePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBasePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basePath")(js.undefined)
        ret
    }
    @scala.inline
    def withExtract(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extract")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtract: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extract")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIgnore(value: String | js.RegExp | (js.Array[String | js.RegExp])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore")(js.undefined)
        ret
    }
    @scala.inline
    def withMinify(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minify")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinify: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minify")(js.undefined)
        ret
    }
    @scala.inline
    def withNoscript(value: body | head | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noscript")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoscript: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noscript")(js.undefined)
        ret
    }
    @scala.inline
    def withPolyfill(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polyfill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolyfill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polyfill")(js.undefined)
        ret
    }
    @scala.inline
    def withReplaceStylesheets(value: js.Array[String] | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceStylesheets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplaceStylesheets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceStylesheets")(js.undefined)
        ret
    }
    @scala.inline
    def withSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(js.undefined)
        ret
    }
  }
  
}

