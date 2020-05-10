package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options defining BigQuery table and row identifiers.
  */
@js.native
trait SchemaGooglePrivacyDlpV2BigQueryOptions extends js.Object {
  /**
    * References to fields excluded from scanning. This allows you to skip
    * inspection of entire columns which you know have no findings.
    */
  var excludedFields: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2FieldId]] = js.native
  /**
    * References to fields uniquely identifying rows within the table. Nested
    * fields in the format, like `person.birthdate.year`, are allowed.
    */
  var identifyingFields: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2FieldId]] = js.native
  /**
    * Max number of rows to scan. If the table has more rows than this value,
    * the rest of the rows are omitted. If not set, or if set to 0, all rows
    * will be scanned. Only one of rows_limit and rows_limit_percent can be
    * specified. Cannot be used in conjunction with TimespanConfig.
    */
  var rowsLimit: js.UndefOr[String] = js.native
  /**
    * Max percentage of rows to scan. The rest are omitted. The number of rows
    * scanned is rounded down. Must be between 0 and 100, inclusively. Both 0
    * and 100 means no limit. Defaults to 0. Only one of rows_limit and
    * rows_limit_percent can be specified. Cannot be used in conjunction with
    * TimespanConfig.
    */
  var rowsLimitPercent: js.UndefOr[Double] = js.native
  var sampleMethod: js.UndefOr[String] = js.native
  /**
    * Complete BigQuery table reference.
    */
  var tableReference: js.UndefOr[SchemaGooglePrivacyDlpV2BigQueryTable] = js.native
}

object SchemaGooglePrivacyDlpV2BigQueryOptions {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2BigQueryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2BigQueryOptions]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2BigQueryOptionsOps[Self <: SchemaGooglePrivacyDlpV2BigQueryOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExcludedFields(value: js.Array[SchemaGooglePrivacyDlpV2FieldId]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludedFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludedFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludedFields")(js.undefined)
        ret
    }
    @scala.inline
    def withIdentifyingFields(value: js.Array[SchemaGooglePrivacyDlpV2FieldId]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifyingFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdentifyingFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifyingFields")(js.undefined)
        ret
    }
    @scala.inline
    def withRowsLimit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowsLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowsLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowsLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withRowsLimitPercent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowsLimitPercent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowsLimitPercent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowsLimitPercent")(js.undefined)
        ret
    }
    @scala.inline
    def withSampleMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sampleMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSampleMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sampleMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withTableReference(value: SchemaGooglePrivacyDlpV2BigQueryTable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableReference")(js.undefined)
        ret
    }
  }
  
}

