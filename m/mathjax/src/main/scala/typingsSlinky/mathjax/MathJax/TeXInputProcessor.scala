package typingsSlinky.mathjax.MathJax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TeXInputProcessor extends js.Object {
  /*Because a definition of the form \def\x{\x aaa} \x would loop infinitely, and at the same time stack up lots
    * of a’s in MathJax’s equation buffer, the MAXBUFFER constant is used to limit the size of the string being
    * processed by MathJax. It is set to 5KB, which should be sufficient for any reasonable equation.
    */
  var MAXBUFFER: js.UndefOr[Double] = js.native
  /*Because a definition of the form \def\x{\x} \x would cause MathJax to loop infinitely, the MAXMACROS constant
    * will limit the number of macro substitutions allowed in any expression processed by MathJax.
    */
  var MAXMACROS: js.UndefOr[Double] = js.native
  /*This lists macros to define before the TeX input processor begins. These are name:value pairs where the name
    * gives the name of the TeX macro to be defined, and value gives the replacement text for the macro. The value
    * can be an array of the form [value,n], where value is the replacement text and n is the number of parameters
    * for the macro. Note that since the value is a javascript string, backslashes in the replacement text must be
    * doubled to prevent them from acting as javascript escape characters.
    */
  var Macros: js.UndefOr[js.Any] = js.native
  /*The width to use for the multline environment that is part of the AMSmath extension. This width gives room for
    * tags at either side of the equation, but if you are displaying mathematics in a small area or a thin column of
    * text, you might need to change the value to leave sufficient margin for tags.
    */
  var MultLineWidth: js.UndefOr[String] = js.native
  /*This is the amount of indentation (from the right or left) for the tags produced by the \tag{} macro.*/
  var TagIndent: js.UndefOr[String] = js.native
  /*This specifies the side on which \tag{} macros will place the tags. Set it to "left" to place the tags on the
    * left-hand side.
    */
  var TagSide: js.UndefOr[String] = js.native
  /*This object controls the automatic equation numbering and the equation referencing.*/
  var equationNumbers: js.UndefOr[EquationNumbers] = js.native
  /*A comma-separated list of extensions to load at startup. The default directory is MathJax/extensions. The
    * tex2jax and mml2jax preprocessors can be listed here, as well as a FontWarnings extension that you can use to
    * inform your user that mathematics fonts are available that they can download to improve their experience of
    * your site.
    */
  var extensions: js.UndefOr[js.Array[String]] = js.native
}

object TeXInputProcessor {
  @scala.inline
  def apply(): TeXInputProcessor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TeXInputProcessor]
  }
  @scala.inline
  implicit class TeXInputProcessorOps[Self <: TeXInputProcessor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMAXBUFFER(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MAXBUFFER")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMAXBUFFER: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MAXBUFFER")(js.undefined)
        ret
    }
    @scala.inline
    def withMAXMACROS(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MAXMACROS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMAXMACROS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MAXMACROS")(js.undefined)
        ret
    }
    @scala.inline
    def withMacros(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Macros")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMacros: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Macros")(js.undefined)
        ret
    }
    @scala.inline
    def withMultLineWidth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MultLineWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultLineWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MultLineWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withTagIndent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TagIndent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagIndent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TagIndent")(js.undefined)
        ret
    }
    @scala.inline
    def withTagSide(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TagSide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagSide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TagSide")(js.undefined)
        ret
    }
    @scala.inline
    def withEquationNumbers(value: EquationNumbers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equationNumbers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEquationNumbers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equationNumbers")(js.undefined)
        ret
    }
    @scala.inline
    def withExtensions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(js.undefined)
        ret
    }
  }
  
}

