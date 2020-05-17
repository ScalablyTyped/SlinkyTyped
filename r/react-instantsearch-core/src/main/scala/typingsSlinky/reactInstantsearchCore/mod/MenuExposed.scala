package typingsSlinky.reactInstantsearchCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MenuExposed extends js.Object {
  var attribute: String = js.native
  var defaultRefinement: js.UndefOr[String] = js.native
  var limit: js.UndefOr[Double] = js.native
  var searchable: js.UndefOr[Boolean] = js.native
  var showMore: js.UndefOr[Boolean] = js.native
  var showMoreLimit: js.UndefOr[Double] = js.native
  var transformItems: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
}

object MenuExposed {
  @scala.inline
  def apply(attribute: String): MenuExposed = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuExposed]
  }
  @scala.inline
  implicit class MenuExposedOps[Self <: MenuExposed] (val x: Self) extends AnyVal {
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
    def withDefaultRefinement(value: String): Self = {
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

