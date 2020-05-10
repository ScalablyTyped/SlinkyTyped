package typingsSlinky.mathjax.MathJax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EquationNumbers extends js.Object {
  /*This controls whether equations are numbered and how. By default it is set to "none" to be compatible with
    * earlier versions of MathJax where auto-numbering was not performed (so pages will not change their
    * appearance). You can change this to "AMS" for equations numbered as the AMSmath package would do, or "all" to
    * get an equation number for every displayed equation.
    */
  var autoNumber: js.UndefOr[String] = js.native
  /*A function that tells MathJax what ID to use as an anchor for the equation (so that it can be used in URL
    * references).
    */
  var formatID: js.UndefOr[js.Function0[String]] = js.native
  /*A function that tells MathJax what tag to use for equation number n. This could be used to have the equations
    * labeled by a sequence of symbols rather than numbers, or to use section and subsection numbers instead.
    */
  var formatNumber: js.UndefOr[js.Function1[/* n */ Double, String]] = js.native
  /*A function that tells MathJax how to format an equation number for displaying as a tag for an equation. This
    * is what appears in the margin of a tagged or numbered equation.*/
  var formatTag: js.UndefOr[js.Function1[/* n */ Double, String]] = js.native
  /*A function that takes an equation ID and returns the URL to link to it.*/
  var formatURL: js.UndefOr[js.Function1[/* id */ String, String]] = js.native
  /*This controls whether element ID’s use the \label name or the equation number. When true, use the label, when
    * false, use the equation number.
    */
  var useLabelIds: js.UndefOr[Boolean] = js.native
}

object EquationNumbers {
  @scala.inline
  def apply(): EquationNumbers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EquationNumbers]
  }
  @scala.inline
  implicit class EquationNumbersOps[Self <: EquationNumbers] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatID(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatID")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutFormatID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatID")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatNumber(value: /* n */ Double => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatNumber")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFormatNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatTag(value: /* n */ Double => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatTag")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFormatTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatTag")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatURL(value: /* id */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatURL")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFormatURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatURL")(js.undefined)
        ret
    }
    @scala.inline
    def withUseLabelIds(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useLabelIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseLabelIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useLabelIds")(js.undefined)
        ret
    }
  }
  
}

