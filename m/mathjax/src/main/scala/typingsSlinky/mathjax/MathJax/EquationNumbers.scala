package typingsSlinky.mathjax.MathJax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EquationNumbers extends StObject {
  
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
  implicit class EquationNumbersMutableBuilder[Self <: EquationNumbers] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoNumber(value: String): Self = StObject.set(x, "autoNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoNumberUndefined: Self = StObject.set(x, "autoNumber", js.undefined)
    
    @scala.inline
    def setFormatID(value: () => String): Self = StObject.set(x, "formatID", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFormatIDUndefined: Self = StObject.set(x, "formatID", js.undefined)
    
    @scala.inline
    def setFormatNumber(value: /* n */ Double => String): Self = StObject.set(x, "formatNumber", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFormatNumberUndefined: Self = StObject.set(x, "formatNumber", js.undefined)
    
    @scala.inline
    def setFormatTag(value: /* n */ Double => String): Self = StObject.set(x, "formatTag", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFormatTagUndefined: Self = StObject.set(x, "formatTag", js.undefined)
    
    @scala.inline
    def setFormatURL(value: /* id */ String => String): Self = StObject.set(x, "formatURL", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFormatURLUndefined: Self = StObject.set(x, "formatURL", js.undefined)
    
    @scala.inline
    def setUseLabelIds(value: Boolean): Self = StObject.set(x, "useLabelIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseLabelIdsUndefined: Self = StObject.set(x, "useLabelIds", js.undefined)
  }
}
