package typingsSlinky.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttributeFilter extends js.Object {
  /**
    * Performs a logical AND operation on all supplied filters.
    */
  var AndAllFilters: js.UndefOr[AttributeFilterList] = js.native
  /**
    * Returns true when a document contains all of the specified document attributes.
    */
  var ContainsAll: js.UndefOr[DocumentAttribute] = js.native
  /**
    * Returns true when a document contains any of the specified document attributes.
    */
  var ContainsAny: js.UndefOr[DocumentAttribute] = js.native
  /**
    * Performs an equals operation on two document attributes.
    */
  var EqualsTo: js.UndefOr[DocumentAttribute] = js.native
  /**
    * Performs a greater than operation on two document attributes. Use with a document attribute of type Integer or Long.
    */
  var GreaterThan: js.UndefOr[DocumentAttribute] = js.native
  /**
    * Performs a greater or equals than operation on two document attributes. Use with a document attribute of type Integer or Long.
    */
  var GreaterThanOrEquals: js.UndefOr[DocumentAttribute] = js.native
  /**
    * Performs a less than operation on two document attributes. Use with a document attribute of type Integer or Long.
    */
  var LessThan: js.UndefOr[DocumentAttribute] = js.native
  /**
    * Performs a less than or equals operation on two document attributes. Use with a document attribute of type Integer or Long.
    */
  var LessThanOrEquals: js.UndefOr[DocumentAttribute] = js.native
  /**
    * Performs a logical NOT operation on all supplied filters.
    */
  var NotFilter: js.UndefOr[AttributeFilter] = js.native
  /**
    * Performs a logical OR operation on all supplied filters.
    */
  var OrAllFilters: js.UndefOr[AttributeFilterList] = js.native
}

object AttributeFilter {
  @scala.inline
  def apply(): AttributeFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttributeFilter]
  }
  @scala.inline
  implicit class AttributeFilterOps[Self <: AttributeFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAndAllFilters(value: AttributeFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AndAllFilters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAndAllFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AndAllFilters")(js.undefined)
        ret
    }
    @scala.inline
    def withContainsAll(value: DocumentAttribute): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContainsAll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainsAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContainsAll")(js.undefined)
        ret
    }
    @scala.inline
    def withContainsAny(value: DocumentAttribute): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContainsAny")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainsAny: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContainsAny")(js.undefined)
        ret
    }
    @scala.inline
    def withEqualsTo(value: DocumentAttribute): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EqualsTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEqualsTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EqualsTo")(js.undefined)
        ret
    }
    @scala.inline
    def withGreaterThan(value: DocumentAttribute): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GreaterThan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGreaterThan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GreaterThan")(js.undefined)
        ret
    }
    @scala.inline
    def withGreaterThanOrEquals(value: DocumentAttribute): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GreaterThanOrEquals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGreaterThanOrEquals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GreaterThanOrEquals")(js.undefined)
        ret
    }
    @scala.inline
    def withLessThan(value: DocumentAttribute): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LessThan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLessThan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LessThan")(js.undefined)
        ret
    }
    @scala.inline
    def withLessThanOrEquals(value: DocumentAttribute): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LessThanOrEquals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLessThanOrEquals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LessThanOrEquals")(js.undefined)
        ret
    }
    @scala.inline
    def withNotFilter(value: AttributeFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withOrAllFilters(value: AttributeFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OrAllFilters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrAllFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OrAllFilters")(js.undefined)
        ret
    }
  }
  
}

