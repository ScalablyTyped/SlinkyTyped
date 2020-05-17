package typingsSlinky.cleanCss.anon

import typingsSlinky.cleanCss.cleanCssStrings.natural
import typingsSlinky.cleanCss.cleanCssStrings.none
import typingsSlinky.cleanCss.cleanCssStrings.standard
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait All extends js.Object {
  /**
    * Sets all optimizations at this level unless otherwise specified
    */
  var all: js.UndefOr[Boolean] = js.native
  /**
    * Controls `@charset` moving to the front of a stylesheet; defaults to `true`
    */
  var cleanupCharsets: js.UndefOr[Boolean] = js.native
  /**
    * Controls URL normalization; defaults to `true`
    */
  var normalizeUrls: js.UndefOr[Boolean] = js.native
  /**
    * Controls `background` property optimizations; defaults to `true`
    */
  var optimizeBackground: js.UndefOr[Boolean] = js.native
  /**
    * Controls `border-radius` property optimizations; defaults to `true`
    */
  var optimizeBorderRadius: js.UndefOr[Boolean] = js.native
  /**
    * Controls `filter` property optimizations; defaults to `true`
    */
  var optimizeFilter: js.UndefOr[Boolean] = js.native
  /**
    * Controls `font` property optimizations; defaults to `true`
    */
  var optimizeFont: js.UndefOr[Boolean] = js.native
  /**
    * Controls `font-weight` property optimizations; defaults to `true`
    */
  var optimizeFontWeight: js.UndefOr[Boolean] = js.native
  /**
    * Controls `outline` property optimizations; defaults to `true`
    */
  var optimizeOutline: js.UndefOr[Boolean] = js.native
  /**
    * Controls removing empty rules and nested blocks; defaults to `true`
    */
  var removeEmpty: js.UndefOr[Boolean] = js.native
  /**
    * Controls removing negative paddings; defaults to `true`
    */
  var removeNegativePaddings: js.UndefOr[Boolean] = js.native
  /**
    * Controls removing quotes when unnecessary; defaults to `true`
    */
  var removeQuotes: js.UndefOr[Boolean] = js.native
  /**
    * Controls removing unused whitespace; defaults to `true`
    */
  var removeWhitespace: js.UndefOr[Boolean] = js.native
  /**
    * Contols removing redundant zeros; defaults to `true`
    */
  var replaceMultipleZeros: js.UndefOr[Boolean] = js.native
  /**
    * Controls replacing time units with shorter values; defaults to `true`
    */
  var replaceTimeUnits: js.UndefOr[Boolean] = js.native
  /**
    * Controls replacing zero values with units; defaults to `true`
    */
  var replaceZeroUnits: js.UndefOr[Boolean] = js.native
  /**
    * Rounds pixel values to `N` decimal places; `false` disables rounding; defaults to `false`
    */
  var roundingPrecision: js.UndefOr[Boolean] = js.native
  /**
    * denotes selector sorting method; can be `'natural'` or `'standard'`, `'none'`, or false (the last two
    * since 4.1.0); defaults to `'standard'`
    */
  var selectorsSortingMethod: js.UndefOr[standard | natural | none] = js.native
  /**
    * Controls removing trailing semicolons in rule; defaults to `false` - means remove
    */
  var semicolonAfterLastProperty: js.UndefOr[Boolean] = js.native
  /**
    * denotes a number of / *! ... * / comments preserved; defaults to `all`
    */
  var specialComments: js.UndefOr[String] = js.native
  /**
    * Controls at-rules (e.g. `@charset`, `@import`) optimizing; defaults to `true`
    */
  var tidyAtRules: js.UndefOr[Boolean] = js.native
  /**
    * Controls block scopes (e.g. `@media`) optimizing; defaults to `true`
    */
  var tidyBlockScopes: js.UndefOr[Boolean] = js.native
  /**
    * Controls selectors optimizing; defaults to `true`
    */
  var tidySelectors: js.UndefOr[Boolean] = js.native
  /**
    * Defines a callback for fine-grained property optimization; defaults to no-op
    */
  var transform: js.UndefOr[
    js.Function3[
      /* propertyName */ String, 
      /* propertyValue */ String, 
      /* selector */ js.UndefOr[String], 
      String
    ]
  ] = js.native
}

object All {
  @scala.inline
  def apply(): All = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[All]
  }
  @scala.inline
  implicit class AllOps[Self <: All] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all")(js.undefined)
        ret
    }
    @scala.inline
    def withCleanupCharsets(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cleanupCharsets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCleanupCharsets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cleanupCharsets")(js.undefined)
        ret
    }
    @scala.inline
    def withNormalizeUrls(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalizeUrls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNormalizeUrls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalizeUrls")(js.undefined)
        ret
    }
    @scala.inline
    def withOptimizeBackground(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimizeBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptimizeBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimizeBackground")(js.undefined)
        ret
    }
    @scala.inline
    def withOptimizeBorderRadius(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimizeBorderRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptimizeBorderRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimizeBorderRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withOptimizeFilter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimizeFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptimizeFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimizeFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withOptimizeFont(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimizeFont")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptimizeFont: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimizeFont")(js.undefined)
        ret
    }
    @scala.inline
    def withOptimizeFontWeight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimizeFontWeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptimizeFontWeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimizeFontWeight")(js.undefined)
        ret
    }
    @scala.inline
    def withOptimizeOutline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimizeOutline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptimizeOutline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimizeOutline")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveEmpty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeEmpty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveEmpty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeEmpty")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveNegativePaddings(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeNegativePaddings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveNegativePaddings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeNegativePaddings")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveQuotes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeQuotes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveQuotes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeQuotes")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveWhitespace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeWhitespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveWhitespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeWhitespace")(js.undefined)
        ret
    }
    @scala.inline
    def withReplaceMultipleZeros(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceMultipleZeros")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplaceMultipleZeros: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceMultipleZeros")(js.undefined)
        ret
    }
    @scala.inline
    def withReplaceTimeUnits(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceTimeUnits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplaceTimeUnits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceTimeUnits")(js.undefined)
        ret
    }
    @scala.inline
    def withReplaceZeroUnits(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceZeroUnits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplaceZeroUnits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceZeroUnits")(js.undefined)
        ret
    }
    @scala.inline
    def withRoundingPrecision(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roundingPrecision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoundingPrecision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roundingPrecision")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectorsSortingMethod(value: standard | natural | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectorsSortingMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectorsSortingMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectorsSortingMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withSemicolonAfterLastProperty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("semicolonAfterLastProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSemicolonAfterLastProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("semicolonAfterLastProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withSpecialComments(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specialComments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpecialComments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specialComments")(js.undefined)
        ret
    }
    @scala.inline
    def withTidyAtRules(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tidyAtRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTidyAtRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tidyAtRules")(js.undefined)
        ret
    }
    @scala.inline
    def withTidyBlockScopes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tidyBlockScopes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTidyBlockScopes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tidyBlockScopes")(js.undefined)
        ret
    }
    @scala.inline
    def withTidySelectors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tidySelectors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTidySelectors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tidySelectors")(js.undefined)
        ret
    }
    @scala.inline
    def withTransform(
      value: (/* propertyName */ String, /* propertyValue */ String, /* selector */ js.UndefOr[String]) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.undefined)
        ret
    }
  }
  
}

