package typingsSlinky.reactInstantsearchCore.mod

import typingsSlinky.reactInstantsearchCore.anon.IsRefined
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NumericMenuProvided extends js.Object {
  /**
    * the refinement currently applied. follow the shape of a string with a pattern of '{start}:{end}' which corresponds to the current selected item.
    * For instance, when the selected item is {start: 10, end: 20}, the searchState of the widget is '10:20'. When start isn’t defined, the searchState
    * of the widget is ':{end}', and the same way around when end isn’t defined. However, when neither start nor end are defined, the searchState is an empty string.
    */
  var currentRefinement: String = js.native
  /** the list of ranges the NumericMenu can display. */
  var items: js.Array[IsRefined] = js.native
  /** a function to generate a URL for the corresponding search state */
  def createURL(args: js.Any*): js.Any = js.native
  /** a function to select a range. */
  def refine(args: js.Any*): js.Any = js.native
}

object NumericMenuProvided {
  @scala.inline
  def apply(
    createURL: /* repeated */ js.Any => js.Any,
    currentRefinement: String,
    items: js.Array[IsRefined],
    refine: /* repeated */ js.Any => js.Any
  ): NumericMenuProvided = {
    val __obj = js.Dynamic.literal(createURL = js.Any.fromFunction1(createURL), currentRefinement = currentRefinement.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], refine = js.Any.fromFunction1(refine))
    __obj.asInstanceOf[NumericMenuProvided]
  }
  @scala.inline
  implicit class NumericMenuProvidedOps[Self <: NumericMenuProvided] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateURL(value: /* repeated */ js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createURL")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCurrentRefinement(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentRefinement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItems(value: js.Array[IsRefined]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefine(value: /* repeated */ js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refine")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

