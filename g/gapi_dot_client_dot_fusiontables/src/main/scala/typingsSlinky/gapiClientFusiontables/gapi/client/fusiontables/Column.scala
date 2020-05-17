package typingsSlinky.gapiClientFusiontables.gapi.client.fusiontables

import typingsSlinky.gapiClientFusiontables.anon.ColumnId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Column extends js.Object {
  /** Identifier of the base column. If present, this column is derived from the specified base column. */
  var baseColumn: js.UndefOr[ColumnId] = js.native
  /** Identifier for the column. */
  var columnId: js.UndefOr[Double] = js.native
  /** JSON schema for interpreting JSON in this column. */
  var columnJsonSchema: js.UndefOr[String] = js.native
  /** JSON object containing custom column properties. */
  var columnPropertiesJson: js.UndefOr[String] = js.native
  /** Column description. */
  var description: js.UndefOr[String] = js.native
  /**
    * Format pattern.
    * Acceptable values are DT_DATE_MEDIUMe.g Dec 24, 2008 DT_DATE_SHORTfor example 12/24/08 DT_DATE_TIME_MEDIUMfor example Dec 24, 2008 8:30:45 PM
    * DT_DATE_TIME_SHORTfor example 12/24/08 8:30 PM DT_DAY_MONTH_2_DIGIT_YEARfor example 24/12/08 DT_DAY_MONTH_2_DIGIT_YEAR_TIMEfor example 24/12/08 20:30
    * DT_DAY_MONTH_2_DIGIT_YEAR_TIME_MERIDIANfor example 24/12/08 8:30 PM DT_DAY_MONTH_4_DIGIT_YEARfor example 24/12/2008 DT_DAY_MONTH_4_DIGIT_YEAR_TIMEfor
    * example 24/12/2008 20:30 DT_DAY_MONTH_4_DIGIT_YEAR_TIME_MERIDIANfor example 24/12/2008 8:30 PM DT_ISO_YEAR_MONTH_DAYfor example 2008-12-24
    * DT_ISO_YEAR_MONTH_DAY_TIMEfor example 2008-12-24 20:30:45 DT_MONTH_DAY_4_DIGIT_YEARfor example 12/24/2008 DT_TIME_LONGfor example 8:30:45 PM UTC-6
    * DT_TIME_MEDIUMfor example 8:30:45 PM DT_TIME_SHORTfor example 8:30 PM DT_YEAR_ONLYfor example 2008 HIGHLIGHT_UNTYPED_CELLSHighlight cell data that does
    * not match the data type NONENo formatting (default) NUMBER_CURRENCYfor example $1234.56 NUMBER_DEFAULTfor example 1,234.56 NUMBER_INTEGERfor example
    * 1235 NUMBER_NO_SEPARATORfor example 1234.56 NUMBER_PERCENTfor example 123,456% NUMBER_SCIENTIFICfor example 1E3 STRING_EIGHT_LINE_IMAGEDisplays
    * thumbnail images as tall as eight lines of text STRING_FOUR_LINE_IMAGEDisplays thumbnail images as tall as four lines of text STRING_JSON_TEXTAllows
    * editing of text as JSON in UI STRING_JSON_LISTAllows editing of text as a JSON list in UI STRING_LINKTreats cell as a link (must start with http:// or
    * https://) STRING_ONE_LINE_IMAGEDisplays thumbnail images as tall as one line of text STRING_VIDEO_OR_MAPDisplay a video or map thumbnail
    */
  var formatPattern: js.UndefOr[String] = js.native
  /**
    * Column graph predicate.
    * Used to map table to graph data model (subject,predicate,object)
    * See W3C Graph-based Data Model.
    */
  var graphPredicate: js.UndefOr[String] = js.native
  /** The kind of item this is. For a column, this is always fusiontables#column. */
  var kind: js.UndefOr[String] = js.native
  /** Name of the column. */
  var name: js.UndefOr[String] = js.native
  /** Type of the column. */
  var `type`: js.UndefOr[String] = js.native
  /** List of valid values used to validate data and supply a drop-down list of values in the web application. */
  var validValues: js.UndefOr[js.Array[String]] = js.native
  /** If true, data entered via the web application is validated. */
  var validateData: js.UndefOr[Boolean] = js.native
}

object Column {
  @scala.inline
  def apply(): Column = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Column]
  }
  @scala.inline
  implicit class ColumnOps[Self <: Column] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseColumn(value: ColumnId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnId")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnJsonSchema(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnJsonSchema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnJsonSchema: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnJsonSchema")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnPropertiesJson(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnPropertiesJson")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnPropertiesJson: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnPropertiesJson")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatPattern(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatPattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormatPattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatPattern")(js.undefined)
        ret
    }
    @scala.inline
    def withGraphPredicate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graphPredicate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGraphPredicate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graphPredicate")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
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
    @scala.inline
    def withValidValues(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validValues")(js.undefined)
        ret
    }
    @scala.inline
    def withValidateData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidateData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateData")(js.undefined)
        ret
    }
  }
  
}

