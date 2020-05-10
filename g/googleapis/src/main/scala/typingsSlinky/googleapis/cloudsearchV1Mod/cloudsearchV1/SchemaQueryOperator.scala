package typingsSlinky.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The definition of a operator that can be used in a Search/Suggest request.
  */
@js.native
trait SchemaQueryOperator extends js.Object {
  /**
    * Display name of the operator
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * Potential list of values for the opeatror field. This field is only
    * filled when we can safely enumerate all the possible values of this
    * operator.
    */
  var enumValues: js.UndefOr[js.Array[String]] = js.native
  /**
    * Indicates the operator name that can be used to  isolate the property
    * using the greater-than operator.
    */
  var greaterThanOperatorName: js.UndefOr[String] = js.native
  /**
    * Can this operator be used to get facets.
    */
  var isFacetable: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if multiple values can be set for this property.
    */
  var isRepeatable: js.UndefOr[Boolean] = js.native
  /**
    * Will the property associated with this facet be returned as part of
    * search results.
    */
  var isReturnable: js.UndefOr[Boolean] = js.native
  /**
    * Can this operator be used to sort results.
    */
  var isSortable: js.UndefOr[Boolean] = js.native
  /**
    * Can get suggestions for this field.
    */
  var isSuggestable: js.UndefOr[Boolean] = js.native
  /**
    * Indicates the operator name that can be used to  isolate the property
    * using the less-than operator.
    */
  var lessThanOperatorName: js.UndefOr[String] = js.native
  /**
    * The name of the operator.
    */
  var operatorName: js.UndefOr[String] = js.native
  /**
    * Type of the operator.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaQueryOperator {
  @scala.inline
  def apply(): SchemaQueryOperator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQueryOperator]
  }
  @scala.inline
  implicit class SchemaQueryOperatorOps[Self <: SchemaQueryOperator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withEnumValues(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enumValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnumValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enumValues")(js.undefined)
        ret
    }
    @scala.inline
    def withGreaterThanOperatorName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("greaterThanOperatorName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGreaterThanOperatorName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("greaterThanOperatorName")(js.undefined)
        ret
    }
    @scala.inline
    def withIsFacetable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFacetable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsFacetable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFacetable")(js.undefined)
        ret
    }
    @scala.inline
    def withIsRepeatable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRepeatable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsRepeatable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRepeatable")(js.undefined)
        ret
    }
    @scala.inline
    def withIsReturnable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isReturnable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsReturnable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isReturnable")(js.undefined)
        ret
    }
    @scala.inline
    def withIsSortable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSortable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsSortable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSortable")(js.undefined)
        ret
    }
    @scala.inline
    def withIsSuggestable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSuggestable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsSuggestable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSuggestable")(js.undefined)
        ret
    }
    @scala.inline
    def withLessThanOperatorName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lessThanOperatorName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLessThanOperatorName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lessThanOperatorName")(js.undefined)
        ret
    }
    @scala.inline
    def withOperatorName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operatorName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperatorName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operatorName")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

