package typingsSlinky.gapiClientYoutubeanalytics.gapi.client.youtubeanalytics

import typingsSlinky.gapiClientYoutubeanalytics.anon.ColumnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResultTable extends js.Object {
  /**
    * This value specifies information about the data returned in the rows fields. Each item in the columnHeaders list identifies a field returned in the
    * rows value, which contains a list of comma-delimited data. The columnHeaders list will begin with the dimensions specified in the API request, which
    * will be followed by the metrics specified in the API request. The order of both dimensions and metrics will match the ordering in the API request. For
    * example, if the API request contains the parameters dimensions=ageGroup,gender&metrics=viewerPercentage, the API response will return columns in this
    * order: ageGroup,gender,viewerPercentage.
    */
  var columnHeaders: js.UndefOr[js.Array[ColumnType]] = js.native
  /** This value specifies the type of data included in the API response. For the query method, the kind property value will be youtubeAnalytics#resultTable. */
  var kind: js.UndefOr[String] = js.native
  /**
    * The list contains all rows of the result table. Each item in the list is an array that contains comma-delimited data corresponding to a single row of
    * data. The order of the comma-delimited data fields will match the order of the columns listed in the columnHeaders field. If no data is available for
    * the given query, the rows element will be omitted from the response. The response for a query with the day dimension will not contain rows for the most
    * recent days.
    */
  var rows: js.UndefOr[js.Array[js.Array[_]]] = js.native
}

object ResultTable {
  @scala.inline
  def apply(): ResultTable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResultTable]
  }
  @scala.inline
  implicit class ResultTableOps[Self <: ResultTable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnHeaders(value: js.Array[ColumnType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnHeaders")(js.undefined)
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
    def withRows(value: js.Array[js.Array[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(js.undefined)
        ret
    }
  }
  
}

