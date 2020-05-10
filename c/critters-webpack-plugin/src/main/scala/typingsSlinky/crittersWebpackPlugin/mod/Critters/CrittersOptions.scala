package typingsSlinky.crittersWebpackPlugin.mod.Critters

import typingsSlinky.crittersWebpackPlugin.crittersWebpackPluginStrings.`js-lazy`
import typingsSlinky.crittersWebpackPlugin.crittersWebpackPluginStrings.all
import typingsSlinky.crittersWebpackPlugin.crittersWebpackPluginStrings.body
import typingsSlinky.crittersWebpackPlugin.crittersWebpackPluginStrings.critical
import typingsSlinky.crittersWebpackPlugin.crittersWebpackPluginStrings.js_
import typingsSlinky.crittersWebpackPlugin.crittersWebpackPluginStrings.media
import typingsSlinky.crittersWebpackPlugin.crittersWebpackPluginStrings.none
import typingsSlinky.crittersWebpackPlugin.crittersWebpackPluginStrings.swap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CrittersOptions extends js.Object {
  /**
    * Compress resulting critical CSS.
    * @default true
    */
  var compress: js.UndefOr[Boolean] = js.native
  /**
    * Inline styles from external stylesheets.
    * @default true
    */
  var external: js.UndefOr[Boolean] = js.native
  /**
    * Shorthand for setting inlineFonts+preloadFonts - Values:
    * - true to inline critical font-face rules and preload the fonts.
    * - false to don"t inline any font-face rules and don"t preload fonts.
    */
  var fonts: js.UndefOr[Boolean] = js.native
  /**
    * Inline critical font-face rules.
    * @default false
    */
  var inlineFonts: js.UndefOr[Boolean] = js.native
  /**
    * Inline external stylesheets smaller than a given size.
    * @default 0
    */
  var inlineThreshold: js.UndefOr[Double] = js.native
  /**
    * Controls which keyframes rules are inlined. - Values:
    * - "critical": Inline keyframes rules used by the critical CSS.
    * - "all" Inline all keyframes rules.
    * - "none" Remove all keyframes rules
    * @default "critical"
    */
  var keyframes: js.UndefOr[critical | all | none] = js.native
  /**
    * Merged inlined stylesheets into a single <style> tag.
    * @default true
    */
  var mergeStylesheets: js.UndefOr[Boolean] = js.native
  /**
    * If the non-critical external stylesheet would be below this size, just inline it.
    * @default 0
    */
  var minimumExternalSize: js.UndefOr[Double] = js.native
  /**
    * Add <noscript> fallback to JS-based strategies
    */
  var noscriptFallback: js.UndefOr[Boolean] = js.native
  /**
    * The mechanism to use for lazy-loading stylesheets. [JS] indicates that a strategy requires JavaScript (falls back to <noscript>).
    * - default: Move stylesheet links to the end of the document and insert preload meta tags in their place.
    * - "body": Move all external stylesheet links to the end of the document.
    * - "media": Load stylesheets asynchronously by adding media="not x" and removing once loaded. [JS]
    * - "swap": Convert stylesheet links to preloads that swap to rel="stylesheet" once loaded. [JS]
    * - "js": Inject an asynchronous CSS loader similar to LoadCSS and use it to load stylesheets. [JS]
    * - "js-lazy": Like "js", but the stylesheet is disabled until fully loaded.
    */
  var preload: js.UndefOr[body | media | swap | js_ | `js-lazy`] = js.native
  /**
    * Preloads critical fonts.
    * @default true
    */
  var preloadFonts: js.UndefOr[Boolean] = js.native
  /**
    * Remove inlined rules from the external stylesheet.
    * @default true
    */
  var pruneSource: js.UndefOr[Boolean] = js.native
}

object CrittersOptions {
  @scala.inline
  def apply(): CrittersOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CrittersOptions]
  }
  @scala.inline
  implicit class CrittersOptionsOps[Self <: CrittersOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompress(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compress")(js.undefined)
        ret
    }
    @scala.inline
    def withExternal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("external")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("external")(js.undefined)
        ret
    }
    @scala.inline
    def withFonts(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fonts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFonts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fonts")(js.undefined)
        ret
    }
    @scala.inline
    def withInlineFonts(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineFonts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInlineFonts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineFonts")(js.undefined)
        ret
    }
    @scala.inline
    def withInlineThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInlineThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyframes(value: critical | all | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyframes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyframes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyframes")(js.undefined)
        ret
    }
    @scala.inline
    def withMergeStylesheets(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeStylesheets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMergeStylesheets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeStylesheets")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumExternalSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumExternalSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumExternalSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumExternalSize")(js.undefined)
        ret
    }
    @scala.inline
    def withNoscriptFallback(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noscriptFallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoscriptFallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noscriptFallback")(js.undefined)
        ret
    }
    @scala.inline
    def withPreload(value: body | media | swap | js_ | `js-lazy`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preload")(js.undefined)
        ret
    }
    @scala.inline
    def withPreloadFonts(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preloadFonts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreloadFonts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preloadFonts")(js.undefined)
        ret
    }
    @scala.inline
    def withPruneSource(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pruneSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPruneSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pruneSource")(js.undefined)
        ret
    }
  }
  
}

