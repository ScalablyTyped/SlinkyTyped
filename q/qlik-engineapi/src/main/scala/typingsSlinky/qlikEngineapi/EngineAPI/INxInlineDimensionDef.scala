package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxInlineDimensionDef...
  */
@js.native
trait INxInlineDimensionDef extends js.Object {
  /**
    * Index of the active field in a cyclic dimension.
    * This parameter is optional. The default value is 0.
    * This parameter is used in case of cyclic dimensions (qGrouping is C).
    */
  var qActiveField: js.UndefOr[Double] = js.native
  /**
    * Array of field names.
    * When creating a grouped dimension, more than one field name is defined.
    * >> This parameter is optional.
    */
  var qFieldDefs: js.UndefOr[js.Array[String]] = js.native
  /**
    * Array of field labels.
    * >> This parameter is optional.
    */
  var qFieldLabels: js.UndefOr[js.Array[String]] = js.native
  /**
    * Used to define a cyclic group or drill-down group.
    * This parameter is optional.
    * Default value is no grouping.
    */
  var qGrouping: js.UndefOr[NxGrpType] = js.native
  /**
    * Defines the format of the value.
    * >> This parameter is optional.
    */
  var qNumberPresentations: js.UndefOr[js.Array[IFieldAttributes]] = js.native
  /**
    * If set to true, it inverts the sort criteria in the field.
    */
  var qReverseSort: js.UndefOr[Boolean] = js.native
  /**
    * Defines the sorting criteria in the field.
    * >>This parameter is optional.
    * Default is to sort by alphabetical order, ascending.
    */
  var qSortCriterias: js.UndefOr[ISortCriteria] = js.native
}

object INxInlineDimensionDef {
  @scala.inline
  def apply(): INxInlineDimensionDef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[INxInlineDimensionDef]
  }
  @scala.inline
  implicit class INxInlineDimensionDefOps[Self <: INxInlineDimensionDef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQActiveField(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qActiveField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQActiveField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qActiveField")(js.undefined)
        ret
    }
    @scala.inline
    def withQFieldDefs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qFieldDefs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQFieldDefs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qFieldDefs")(js.undefined)
        ret
    }
    @scala.inline
    def withQFieldLabels(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qFieldLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQFieldLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qFieldLabels")(js.undefined)
        ret
    }
    @scala.inline
    def withQGrouping(value: NxGrpType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qGrouping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQGrouping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qGrouping")(js.undefined)
        ret
    }
    @scala.inline
    def withQNumberPresentations(value: js.Array[IFieldAttributes]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qNumberPresentations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQNumberPresentations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qNumberPresentations")(js.undefined)
        ret
    }
    @scala.inline
    def withQReverseSort(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qReverseSort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQReverseSort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qReverseSort")(js.undefined)
        ret
    }
    @scala.inline
    def withQSortCriterias(value: ISortCriteria): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qSortCriterias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQSortCriterias: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qSortCriterias")(js.undefined)
        ret
    }
  }
  
}

