package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * FieldInTableData...
  */
@js.native
trait IFieldInTableData extends js.Object {
  /**
    * Comment related to the field.
    */
  var qComment: String = js.native
  /**
    * List of the derived fields.
    */
  var qDerivedFields: IDerivedFieldsInTableData = js.native
  /**
    * This property is set to true if the field contains some duplicate values.
    */
  var qHasDuplicates: Boolean = js.native
  /**
    * This property is set to true if the field contains some Null values.
    */
  var qHasNull: Boolean = js.native
  /**
    * ...
    */
  var qHasWild: Boolean = js.native
  /**
    * Number of records that have values (i.e. not NULL) in the field as compared to the total number of records in the table.
    */
  var qInformationDensity: Double = js.native
  /**
    * This property is set to true if the field contains a synthetic key.
    */
  var qIsSynthetic: Boolean = js.native
  /**
    * Tells if the field is a key field.
    */
  var qKeyType: TableRecordKeyType = js.native
  /**
    * Name of the field.
    */
  var qName: String = js.native
  /**
    * Is shown for fixed records.
    * qOriginalFieldName and qName are identical if no field names are used in the file.
    * qOriginalFieldName differs from qName if embedded file names are used in the file.
    */
  var qOriginalFields: js.Array[String] = js.native
  /**
    * ...
    */
  var qPresent: Boolean = js.native
  /**
    * Number of distinct values in the field (in the current table) as
    * compared to the total number of distinct values of this field (in all tables).
    */
  var qSubsetRatio: Double = js.native
  /**
    * List of tags related to the field.
    */
  var qTags: js.Array[String] = js.native
  /**
    * Number of values that are non Null.
    */
  var qnNonNulls: Double = js.native
  /**
    * ...
    */
  var qnPresentDistinctValues: Double = js.native
  /**
    * Number of rows in the field
    */
  var qnRows: Double = js.native
  /**
    * Number of distinct values in the field.
    */
  var qnTotalDistinctValues: Double = js.native
}

object IFieldInTableData {
  @scala.inline
  def apply(
    qComment: String,
    qDerivedFields: IDerivedFieldsInTableData,
    qHasDuplicates: Boolean,
    qHasNull: Boolean,
    qHasWild: Boolean,
    qInformationDensity: Double,
    qIsSynthetic: Boolean,
    qKeyType: TableRecordKeyType,
    qName: String,
    qOriginalFields: js.Array[String],
    qPresent: Boolean,
    qSubsetRatio: Double,
    qTags: js.Array[String],
    qnNonNulls: Double,
    qnPresentDistinctValues: Double,
    qnRows: Double,
    qnTotalDistinctValues: Double
  ): IFieldInTableData = {
    val __obj = js.Dynamic.literal(qComment = qComment.asInstanceOf[js.Any], qDerivedFields = qDerivedFields.asInstanceOf[js.Any], qHasDuplicates = qHasDuplicates.asInstanceOf[js.Any], qHasNull = qHasNull.asInstanceOf[js.Any], qHasWild = qHasWild.asInstanceOf[js.Any], qInformationDensity = qInformationDensity.asInstanceOf[js.Any], qIsSynthetic = qIsSynthetic.asInstanceOf[js.Any], qKeyType = qKeyType.asInstanceOf[js.Any], qName = qName.asInstanceOf[js.Any], qOriginalFields = qOriginalFields.asInstanceOf[js.Any], qPresent = qPresent.asInstanceOf[js.Any], qSubsetRatio = qSubsetRatio.asInstanceOf[js.Any], qTags = qTags.asInstanceOf[js.Any], qnNonNulls = qnNonNulls.asInstanceOf[js.Any], qnPresentDistinctValues = qnPresentDistinctValues.asInstanceOf[js.Any], qnRows = qnRows.asInstanceOf[js.Any], qnTotalDistinctValues = qnTotalDistinctValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFieldInTableData]
  }
  @scala.inline
  implicit class IFieldInTableDataOps[Self <: IFieldInTableData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQComment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qComment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQDerivedFields(value: IDerivedFieldsInTableData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qDerivedFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQHasDuplicates(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qHasDuplicates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQHasNull(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qHasNull")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQHasWild(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qHasWild")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQInformationDensity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qInformationDensity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQIsSynthetic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qIsSynthetic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQKeyType(value: TableRecordKeyType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qKeyType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQOriginalFields(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qOriginalFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQPresent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qPresent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQSubsetRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qSubsetRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQTags(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQnNonNulls(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qnNonNulls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQnPresentDistinctValues(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qnPresentDistinctValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQnRows(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qnRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQnTotalDistinctValues(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qnTotalDistinctValues")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

