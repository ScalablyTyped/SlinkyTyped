package typingsSlinky.katex.mod

import typingsSlinky.katex.katexStrings.html
import typingsSlinky.katex.katexStrings.htmlAndMathml
import typingsSlinky.katex.katexStrings.mathml
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KatexOptions extends js.Object {
  /**
    * If `true`, `\color` will work like LaTeX's `\textcolor`
    * and takes 2 arguments
    *
    * If `false`, `\color` will work like LaTeX's `\color`
    * and takes 1 argument
    *
    * In both cases, `\textcolor` works as in LaTeX
    *
    * @default false
    */
  var colorIsTextColor: js.UndefOr[Boolean] = js.native
  /**
    * If `true`, math will be rendered in display mode
    * (math in display style and center math on page)
    *
    * If `false`, math will be rendered in inline mode
    * @default false
    */
  var displayMode: js.UndefOr[Boolean] = js.native
  /**
    * A Color string given in format `#XXX` or `#XXXXXX`
    */
  var errorColor: js.UndefOr[String] = js.native
  /**
    * If `true`, display math renders flush left with a 2em left margin,
    * like \documentclass[fleqn] in LaTeX with the amsmath package.
    *
    * @default false
    */
  var fleqn: js.UndefOr[Boolean] = js.native
  /**
    * Place KaTeX code in the global group.
    *
    * @default false
    */
  var globalGroup: js.UndefOr[Boolean] = js.native
  /**
    * If `true`, display math has \tags rendered on the left
    * instead of the right, like \\usepackage[leqno]{amsmath} in LaTeX.
    *
    * @default false
    */
  var leqno: js.UndefOr[Boolean] = js.native
  /**
    * A collection of custom macros.
    *
    * See `src/macros.js` for its usage
    */
  var macros: js.UndefOr[js.Any] = js.native
  /**
    * Limit the number of macro expansions to specified number
    *
    * If set to `Infinity`, marco expander will try to fully expand
    * as in LaTex
    *
    * @default 1000
    */
  var maxExpand: js.UndefOr[Double] = js.native
  /**
    * All user-specified sizes will be caped to `maxSize` ems
    *
    * If set to Infinity, users can make elements and space
    * arbitrarily large
    *
    * @default Infinity
    */
  var maxSize: js.UndefOr[Double] = js.native
  /**
    * Specifies a minimum thickness, in ems, for fraction lines,
    * \sqrt top lines, {array} vertical lines, \hline, \hdashline,
    * \\underline, \overline, and the borders of \fbox, \boxed, and
    * \fcolorbox.
    */
  var minRuleThickness: js.UndefOr[Double] = js.native
  /**
    * Determines the markup language of the output. The valid choices are:
    * - `html`: Outputs KaTeX in HTML only.
    * - `mathml`: Outputs KaTeX in MathML only.
    * - `htmlAndMathml`: Outputs HTML for visual rendering
    *   and includes MathML for accessibility.
    *
    * @default 'htmlAndMathml'
    */
  var output: js.UndefOr[html | mathml | htmlAndMathml] = js.native
  /**
    * If `false` or `"ignore"`, allow features that make
    * writing in LaTex convenient but not supported by LaTex
    *
    * If `true` or `"error"`, throw an error for such transgressions
    *
    * If `"warn"`, warn about behavior via `console.warn`
    *
    * @default "warn"
    */
  var strict: js.UndefOr[Boolean | String | js.Function] = js.native
  /**
    * If `true`, KaTeX will throw a `ParseError` when
    * it encounters an unsupported command or invalid LaTex
    *
    * If `false`, KaTeX will render unsupported commands as
    * text, and render invalid LaTeX as its source code with
    * hover text giving the error, in color given by errorColor
    * @default true
    */
  var throwOnError: js.UndefOr[Boolean] = js.native
  /**
    * If `false` (do not trust input), prevent any commands that could enable adverse behavior, rendering them instead in errorColor.
    *
    * If `true` (trust input), allow all such commands.
    *
    * @default false
    */
  var trust: js.UndefOr[Boolean | (js.Function1[/* context */ TrustContext, Boolean])] = js.native
}

object KatexOptions {
  @scala.inline
  def apply(): KatexOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KatexOptions]
  }
  @scala.inline
  implicit class KatexOptionsOps[Self <: KatexOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColorIsTextColor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorIsTextColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorIsTextColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorIsTextColor")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayMode")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorColor")(js.undefined)
        ret
    }
    @scala.inline
    def withFleqn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fleqn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFleqn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fleqn")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobalGroup(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobalGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withLeqno(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leqno")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeqno: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leqno")(js.undefined)
        ret
    }
    @scala.inline
    def withMacros(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("macros")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMacros: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("macros")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxExpand(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxExpand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxExpand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxExpand")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSize")(js.undefined)
        ret
    }
    @scala.inline
    def withMinRuleThickness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minRuleThickness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinRuleThickness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minRuleThickness")(js.undefined)
        ret
    }
    @scala.inline
    def withOutput(value: html | mathml | htmlAndMathml): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(js.undefined)
        ret
    }
    @scala.inline
    def withStrict(value: Boolean | String | js.Function): Self = {
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
    @scala.inline
    def withThrowOnError(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throwOnError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThrowOnError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throwOnError")(js.undefined)
        ret
    }
    @scala.inline
    def withTrustFunction1(value: /* context */ TrustContext => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trust")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTrust(value: Boolean | (js.Function1[/* context */ TrustContext, Boolean])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trust")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrust: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trust")(js.undefined)
        ret
    }
  }
  
}

