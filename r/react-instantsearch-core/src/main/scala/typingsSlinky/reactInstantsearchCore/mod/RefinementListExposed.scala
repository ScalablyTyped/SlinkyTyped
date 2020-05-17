package typingsSlinky.reactInstantsearchCore.mod

import typingsSlinky.reactInstantsearchCore.reactInstantsearchCoreStrings.and
import typingsSlinky.reactInstantsearchCore.reactInstantsearchCoreStrings.or
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RefinementListExposed extends js.Object {
  /** the name of the attribute in the record */
  var attribute: String = js.native
  /**
    * the values of the items selected by default. The searchState of this widget takes the form of a list of strings,
    * which correspond to the values of all selected refinements. However, when there are no refinements selected,
    * the value of the searchState is an empty string.
    */
  var defaultRefinement: js.UndefOr[js.Array[String]] = js.native
  /** the minimum number of displayed items */
  var limit: js.UndefOr[Double] = js.native
  /** How to apply the refinements. Possible values: ‘or’ or ‘and’. */
  var operator: js.UndefOr[or | and] = js.native
  /** allow search inside values */
  var searchable: js.UndefOr[Boolean] = js.native
  /** true if the component should display a button that will expand the number of items */
  var showMore: js.UndefOr[Boolean] = js.native
  /** the maximun number of displayed items. Only used when showMore is set to true */
  var showMoreLimit: js.UndefOr[Double] = js.native
  /** (...args: any[]) => any to modify the items being displayed, e.g. for filtering or sorting them. Takes an items as parameter and expects it back in return. */
  var transformItems: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
}

object RefinementListExposed {
  @scala.inline
  def apply(attribute: String): RefinementListExposed = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefinementListExposed]
  }
  @scala.inline
  implicit class RefinementListExposedOps[Self <: RefinementListExposed] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttribute(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attribute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultRefinement(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultRefinement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultRefinement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultRefinement")(js.undefined)
        ret
    }
    @scala.inline
    def withLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(js.undefined)
        ret
    }
    @scala.inline
    def withOperator(value: or | and): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operator")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchable")(js.undefined)
        ret
    }
    @scala.inline
    def withShowMore(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowMore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMore")(js.undefined)
        ret
    }
    @scala.inline
    def withShowMoreLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMoreLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowMoreLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMoreLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withTransformItems(value: /* repeated */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformItems")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTransformItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformItems")(js.undefined)
        ret
    }
  }
  
}

